package com.glqdlt.bmscommon.persistence.members.entity;

import lombok.Getter;

/**
 * Created By iw.jhun
 * On 2018-04-17 , 오후 4:01
 */
public enum MemberValidEnum {

    ID_LENGTH(10),
    NAME_LENGTH(10),
    PASSWORD_LENGTH(10);

    @Getter
    private Integer length;

    MemberValidEnum(Integer length) {
        this.length = length;
    }


}
