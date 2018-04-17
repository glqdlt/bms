package com.glqdlt.bmscommon.helper.valid;

/**
 * Created By iw.jhun
 * On 2018-04-17 , 오후 4:24
 */
@Deprecated
public class ValidUtill {

    public static <T> void validValueNull(T t) {

        if (t instanceof String) {

            if (t.equals("")) {
                throw new RuntimeException();
            }

        } else {

            if (t == null) {

                throw new RuntimeException();
            }
        }
    }

    public static void validValueLength(String value, ValidRule rule){
        if(value.length() > rule.getLength()){
            throw new RuntimeException();
        }
    }
}
