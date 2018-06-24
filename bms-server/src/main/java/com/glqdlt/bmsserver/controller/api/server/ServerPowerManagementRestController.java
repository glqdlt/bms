package com.glqdlt.bmsserver.controller.api.server;

import com.glqdlt.bmsserver.wol.service.WakeOnLanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping(value = "/server/{serverId}", method = RequestMethod.POST)
@RestController
public class ServerPowerManagementRestController {

    @Autowired
    WakeOnLanService wakeOnLanService;


    @PostMapping("/power/on")
    public void powerOn(@PathVariable("serverId") Integer serverId) {
        wakeOnLanService.powerOn(serverId);
    }


    @PostMapping("/power/shutdown")
    public void shutdown(@PathVariable("serverId") Integer serverId) {

    }

    @PostMapping("/power/restart")
    public void reStart(@PathVariable("serverId") Integer serverId) {

    }

    @PostMapping("/status")
    public void statusPreview(@PathVariable("serverId") Integer serverId) {

    }

    @PostMapping("/status/detail")
    public void statusDetail(@PathVariable("serverId") Integer serverId) {

    }

}
