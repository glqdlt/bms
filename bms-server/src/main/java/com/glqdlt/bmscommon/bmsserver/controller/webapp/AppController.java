package com.glqdlt.bmscommon.bmsserver.controller.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 3:07
 */

@Controller
public class AppController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String appRoot(){
        return "index";
    }


}
