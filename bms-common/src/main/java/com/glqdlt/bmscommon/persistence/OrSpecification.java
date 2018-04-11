package com.glqdlt.bmscommon.persistence;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Arrays;
import java.util.List;

/**
 * Created By iw.jhun
 * On 2018-04-11 , 오후 3:45
 */
public class OrSpecification<T> implements Specification<T> {


    private List<Specification<T>> specs;

    public OrSpecification(Specification<T> spec) {
        this.specs = Arrays.asList(spec);
    }

    @Override
    public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder cb) {
        Predicate[] predicates = specs.stream()
                .map(spec -> spec.toPredicate(root, query, cb))
                .toArray(Predicate[]::new);
        return cb.or(predicates);
    }
}
