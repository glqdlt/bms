package com.glqdlt.bmscommon.persistence.server.repo;

import com.glqdlt.bmscommon.persistence.server.entity.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Integer>{
}
