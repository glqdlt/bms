package com.glqdlt.bmscommon.bmsserver.controller.webapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */

@Slf4j
@Controller
public class AppController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String appRoot(HttpServletRequest request){

            log.info("Session Get ID {}",request.getSession().getId());

        return "index";
    }


}
