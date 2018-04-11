package com.glqdlt.bmscommon.persistence;

import org.springframework.data.jpa.domain.Specification;

/**
 * Created By iw.jhun
 * On 2018-04-11 , 오후 3:29
 */
public class Specs {
    public static <T> Specification<T> or(Specification<T> spec){
        return new OrSpecification<>(spec);
    }
}
