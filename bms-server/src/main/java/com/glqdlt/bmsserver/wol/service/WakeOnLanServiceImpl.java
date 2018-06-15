package com.glqdlt.bmsserver.wol.service;

import com.glqdlt.bmscommon.persistence.server.entity.Server;
import com.glqdlt.bmsserver.wol.WakeOnLan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WakeOnLanServiceImpl implements WakeOnLanService {

    @Autowired
    WakeOnLan wakeOnLan;

    @Override
    public void powerOn(Server server) {
        wakeOnLan.wake(server.getMac(),server.getPort(),server.getIp());
    }

    @Override
    public void shutdown(Server server) {

    }

    @Override
    public void reStart(Server server) {

    }
}
