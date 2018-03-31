package com.glqdlt.bmscommon.bmsserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 3:07
 */

@RequestMapping("/user")
@RestController
public class UserRestController {

    @RequestMapping(value = "/join",method = RequestMethod.POST)
    public void createUser(){

    }


}
