package com.glqdlt.bmsserver.common.errors;

import lombok.Getter;
import lombok.ToString;

/**
 * Created By iw.jhun
 * On 2018-04-03
 */
@ToString
public class ApiErrorModel {

    @Getter
    private String messages;
    @Getter
    private Integer status;

    public ApiErrorModel(String messages, Integer status) {
        this.messages = messages;
        this.status = status;
    }

    public ApiErrorModel(ApiException e){
        this(e.getErrorMessage(),e.getHttpStatus().value());
    }
}
