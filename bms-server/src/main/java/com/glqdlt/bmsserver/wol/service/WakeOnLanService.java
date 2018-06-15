package com.glqdlt.bmsserver.wol.service;

import com.glqdlt.bmscommon.persistence.server.entity.Server;

public interface WakeOnLanService {

     void powerOn(Server server);
     void shutdown(Server server);
     void reStart(Server server);

}
