package com.glqdlt.bmscommon.bmsserver.controller.webapp;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created By iw.jhun
 * On 2018-04-24
 */

//@Order(Ordered.LOWEST_PRECEDENCE)
@Slf4j
@Aspect
@Component
public class AppControllerHelper {

    private void printNowTime(JoinPoint joinPoint) {
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof HttpServletRequest) {
                log.info("Call SessionID:'{}', Request Start : {}", ((HttpServletRequest) arg).getSession().getId() , LocalDateTime.now());
            }

        }
    }

    @Before("execution(* com.glqdlt.bmscommon.bmsserver.controller.webapp.AppController.appRoot(..) )")
    public void checkBefore(JoinPoint joinPoint) {
        printNowTime(joinPoint);
    }

    @After("execution(* com.glqdlt.bmscommon.bmsserver.controller.webapp.AppController.appRoot(..) )")
    public void checkAfter(JoinPoint joinPoint) {

        log.debug("What ? : {} {} {} {}", joinPoint.getArgs(), joinPoint.getKind(), joinPoint.getSignature(), joinPoint.getTarget());
        printNowTime(joinPoint);
    }


}
