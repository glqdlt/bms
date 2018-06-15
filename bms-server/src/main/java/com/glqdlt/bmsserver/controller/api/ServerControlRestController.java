package com.glqdlt.bmsserver.controller.api;

import com.glqdlt.bmsserver.wol.service.WakeOnLanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping(value = "/server/{server_id}", method = RequestMethod.POST)
@RestController
public class ServerControlRestController {

    @Autowired
    WakeOnLanService wakeOnLanService;


    @PostMapping("/power/on")
    public void powerOn(@PathVariable("server_id") Integer serverId) {
        wakeOnLanService.powerOn(serverId);
    }


    @PostMapping("/power/shutdown")
    public void shutdown(@PathVariable("server_id") Integer serverId) {

    }


    @PostMapping("/power/restart")
    public void reStart(@PathVariable("server_id") Integer serverId) {

    }

    @PostMapping("/status")
    public void statusPreview(@PathVariable("server_id") Integer serverId){

    }

    @PostMapping("/status/detail")
    public void statusDetail(@PathVariable("server_id") Integer serverId){

    }

}
