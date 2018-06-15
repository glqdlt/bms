package com.glqdlt.bmsserver.wol.service;

import com.glqdlt.bmscommon.persistence.server.entity.Server;
import com.glqdlt.bmscommon.persistence.server.repo.ServerRepo;
import com.glqdlt.bmsserver.wol.WakeOnLan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WakeOnLanServiceImpl implements WakeOnLanService {


    private static final Integer BROAD_CAST_PORT = 9;

    @Autowired
    WakeOnLan wakeOnLan;

    @Autowired
    ServerRepo serverRepo;

    @Override
    public void powerOn(Integer serverId) {

        Server server = serverRepo.findOne(serverId);
        wakeOnLan.wake(server.getMac(), BROAD_CAST_PORT, server.getIp());
    }

    @Override
    public void shutdown(Integer serverId) {

    }

    @Override
    public void reStart(Integer serverId) {

    }
}
