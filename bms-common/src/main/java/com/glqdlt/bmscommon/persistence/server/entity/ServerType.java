package com.glqdlt.bmscommon.persistence.server.entity;

import lombok.Getter;

public enum ServerType {

    PC(1), PIE(2), LAPTOP(3);

    ServerType(Integer code) {
        this.code = code;
    }

    @Getter
    private Integer code;

}
