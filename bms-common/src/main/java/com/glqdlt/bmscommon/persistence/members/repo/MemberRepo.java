package com.glqdlt.bmscommon.persistence.members.repo;

import com.glqdlt.bmscommon.persistence.members.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 2:05
 */
public interface MemberRepo extends JpaRepository<Member, Integer> {
    public Member findByNo(long no);
}
