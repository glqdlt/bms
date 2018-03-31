package com.glqdlt.bmscommon.persistense.members.repo;

import com.glqdlt.bmscommon.persistense.members.entity.Admin;
import com.glqdlt.bmscommon.persistense.members.entity.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 3:33
 */
public interface RoleRepo extends CrudRepository<Role,Integer> {
    public Admin findByNo(long no);
}
