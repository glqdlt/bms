package com.glqdlt.bmscommon.persistence.members.repo;

import com.glqdlt.bmscommon.persistence.topic.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 1:41
 */
public interface BoardRepo extends JpaRepository<Board, Integer> {
}