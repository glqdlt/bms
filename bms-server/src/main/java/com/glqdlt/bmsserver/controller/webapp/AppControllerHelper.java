package com.glqdlt.bmsserver.controller.webapp;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created By iw.jhun
 * On 2018-04-24
 */

//@Order(Ordered.LOWEST_PRECEDENCE)
@Slf4j
@Aspect
@Component
public class AppControllerHelper {

    private void printNowTime(JoinPoint joinPoint, StopWatcher watcher) {
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof HttpServletRequest) {
                log.info("[Request Watch " + watcher.getMessage() + "] SessionID :'{}', DateTime : {}", ((HttpServletRequest) arg).getSession().getId(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }
    }

    @Before("execution(* com.glqdlt.bmsserver.controller.webapp.AppController.*(..) )")
    public void checkBefore(JoinPoint joinPoint) {
        printNowTime(joinPoint, StopWatcher.Start);
    }

    @After("execution(* com.glqdlt.bmsserver.controller.webapp.AppController.*(..) )")
    public void checkAfter(JoinPoint joinPoint) {

        log.debug("What ? : {} {} {} {}", joinPoint.getArgs(), joinPoint.getKind(), joinPoint.getSignature(), joinPoint.getTarget());
        printNowTime(joinPoint, StopWatcher.End);
    }

    // @AppGrant 가 선언 된 곳에
    @After("@annotation(com.glqdlt.bmsserver.supports.annotation.AppGrant)")
    public void checkAuthentication(JoinPoint joinPoint) {
        String adminId = "";
        for (Object p : joinPoint.getArgs()) {
            if (p instanceof Principal) {
                adminId = ((Principal) p).getName();
            }
        }
    }

    enum StopWatcher {
        Start("Start"), End("End");

        StopWatcher(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        private String message;
    }
}
