package com.glqdlt.bmscommon.bmsserver.controller;

import com.glqdlt.bmscommon.bmsserver.common.errors.ApiErrorModel;
import com.glqdlt.bmscommon.bmsserver.common.errors.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created By iw.jhun
 * On 2018-04-03
 */
@Slf4j
@RestControllerAdvice
public class ErrorResponseAdvice {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<?> exceptionHandler(Throwable ex, HttpServletRequest httpServletRequest){

        if(ex instanceof ApiException){
            ApiException e = (ApiException) ex;
            exceptionLogger(e,httpServletRequest);
            return new ResponseEntity<>(new ApiErrorModel(e), e.getHttpStatus());
        }
        log.error(ex.getMessage(),ex);
        return new ResponseEntity<>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private void exceptionLogger(ApiException ex, HttpServletRequest httpServletRequest){

        log.error("ApiException Error : '{}' \n {}",ex.getErrorMessage(), requestToString(httpServletRequest));

    }

    private String requestToString(HttpServletRequest httpServletRequest){
        StringBuilder msg = new StringBuilder(1024);
        msg.append("Remote Address   : ").append(httpServletRequest.getRemoteAddr())
                .append("\nProtocol      : ").append(httpServletRequest.getProtocol())
                .append("\nRequest Method: ").append(httpServletRequest.getMethod())
                .append("\nRequest URI   : ").append(httpServletRequest.getRequestURI())
                .append("\nQuery String  : ").append(httpServletRequest.getQueryString())
                .append("\nParameters    : ");
        for (Enumeration<String> e = httpServletRequest.getParameterNames(); e.hasMoreElements(); ) {
            String key = e.nextElement();
            String[] values = httpServletRequest.getParameterValues(key);
            for (int i=0; i < values.length; i++) {
                msg.append("\n    ").append(key).append('=').append(values[i]);
            }
        }
        msg.append("\n  Headers       : ");
        for (Enumeration<String> e = httpServletRequest.getHeaderNames(); e.hasMoreElements(); ) {
            String key = e.nextElement();
            Enumeration<String> values = httpServletRequest.getHeaders(key);
            while (values.hasMoreElements()) {
                msg.append("\n    ").append(key).append(": ").append(values.nextElement());
            }
        }

        return msg.toString();
    }

}
