package com.glqdlt.bmscommon.bmsserver.supports.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created By iw.jhun
 * On 2018-04-24
 */

@Component
@Slf4j
public class CertificationInterceptor extends HandlerInterceptorAdapter {

    // 컨트롤러 전달 전
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        // TODO 인증 관련 처리 구현 필요. 지금은 그냥 logging 만 구현함.
//        if(){
//
//        }

        log.info("{},{} ",request.getSession().getId(),request.getRemoteUser());


        // pass
        return true;
    }


    // 컨트롤러 전달 후
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }


    // 뷰까지 응답 후
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
