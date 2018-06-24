package com.glqdlt.bmsserver.common.errors;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Created By iw.jhun
 * On 2018-04-03
 */
public enum ApiErrorMessage {

//    Client

    BAD_REQUEST(HttpStatus.BAD_REQUEST,"잘못 된 요청입니다."),
    FORBIDDEN_ACCESS(HttpStatus.BAD_REQUEST ,"권한이 없습니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED,"인증이 필요합니다."),
    TOO_MANY_REQUEST(HttpStatus.TOO_MANY_REQUESTS,"과도한 요청입니다."),
    NOT_FOUND(HttpStatus.NOT_FOUND,"잘못 된 요청입니다."),

//    SERVER

    SERVICE_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE,"서버에서 응답이 거부되었습니다."),
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"서버에서 응답이 거부되었습니다.");


    @Getter
    private HttpStatus httpStatus;
    @Getter
    private String message;

    ApiErrorMessage(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }


}
