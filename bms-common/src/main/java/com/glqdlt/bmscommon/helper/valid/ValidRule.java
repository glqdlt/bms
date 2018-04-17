package com.glqdlt.bmscommon.helper.valid;

import lombok.Getter;

/**
 * Created By iw.jhun
 * On 2018-04-17 , 오후 4:01
 */
@Deprecated
public enum ValidRule {

//    MEMBER
    MEMBER_ID(10,""),
    MEMBER_NAME(10,""),
    MEMBER_PASSWORD(10,""),
    MEMBER_EMAIL(30,""),

//    BOOK
    BOOK_TITLE(50,""),
    BOOK_AUTHOR(20,"'");

    @Getter
    private Integer length;

    @Getter
    private String regex;


    ValidRule(Integer length, String regex) {
        this.length = length;
        this.regex = regex;
    }


}
