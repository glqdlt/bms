package com.glqdlt.bmscommon.persistence.members.repo;

import com.glqdlt.bmscommon.persistence.members.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */
public interface AdminRepo extends JpaRepository<Admin, Integer> {
    Admin findByNo(long no);
}
