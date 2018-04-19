package com.glqdlt.bmscommon.bmsserver.common.errors;

import org.springframework.http.HttpStatus;

/**
 * Created By iw.jhun
 * On 2018-04-03
 */
public class ApiException extends  RuntimeException {
    private HttpStatus httpStatus;
    private String errorMessage;

    public ApiException(HttpStatus httpStatus, String errorMessage) {
        super();
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }

    public ApiException(ApiErrorMessage apiErrorMessage) {
        this(apiErrorMessage.getHttpStatus(),apiErrorMessage.getMessage());
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }




}
