package com.glqdlt.bmscommon.persistence.members.repo;

import com.glqdlt.bmscommon.persistence.topic.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By iw.jhun
 * On 2018-04-02
 */
public interface ReplyRepo extends JpaRepository<Reply,Integer> {
}
