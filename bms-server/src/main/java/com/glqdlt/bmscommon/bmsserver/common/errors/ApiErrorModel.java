package com.glqdlt.bmscommon.bmsserver.common.errors;

import com.google.gson.Gson;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

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
