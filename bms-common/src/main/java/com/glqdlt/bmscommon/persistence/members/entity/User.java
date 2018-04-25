package com.glqdlt.bmscommon.persistence.members.entity;

import javax.persistence.Entity;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */
//@DiscriminatorValue("1")
@Entity
public class User extends Member {

    public User() {
    }

    public User(String id, String password, String name) {
        super(id, password, name);
    }
}
