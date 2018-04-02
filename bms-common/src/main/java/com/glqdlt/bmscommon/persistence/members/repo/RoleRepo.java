package com.glqdlt.bmscommon.persistence.members.repo;

import com.glqdlt.bmscommon.persistence.members.entity.Admin;
import com.glqdlt.bmscommon.persistence.members.entity.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 3:33
 */
public interface RoleRepo extends CrudRepository<Role,Integer> {
    public Admin findByNo(long no);
}
