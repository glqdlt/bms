package com.glqdlt.bmsserver.supports.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created By iw.jhun
 * On 2018-04-24
 */

// TODO 실제 작동하는 resolver 구현 필요. 현재는 껍데기
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AppGrant {
    AppGrantType type() default AppGrantType.GUEST;
}
