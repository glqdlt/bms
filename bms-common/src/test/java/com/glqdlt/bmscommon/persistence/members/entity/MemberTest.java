package com.glqdlt.bmscommon.persistence.members.entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created By iw.jhun
 * On 2018-04-17 , 오후 4:32
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest()
public class MemberTest {

    @Test
    public void someTest(){
        Admin admin = new Admin("","9999999999999999999","");
        admin.changePassword("");
        admin.changeEmail("s");

//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        Validator validator = factory.getValidator();
//        Set<ConstraintViolation<Member>> violations = validator.validate(admin);
//        violations.forEach(x -> x.getMessage());


    }

}