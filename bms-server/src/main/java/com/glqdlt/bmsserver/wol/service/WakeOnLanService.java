package com.glqdlt.bmsserver.wol.service;

import com.glqdlt.bmscommon.persistence.server.entity.Server;

public interface WakeOnLanService {

     void powerOn(Integer serverId);
     void shutdown(Integer serverId);
     void reStart(Integer serverId);

}
