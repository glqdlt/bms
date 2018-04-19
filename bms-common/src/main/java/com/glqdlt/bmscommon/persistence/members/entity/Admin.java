package com.glqdlt.bmscommon.persistence.members.entity;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */


//@DiscriminatorValue("9")
@Entity
public class Admin extends Member {

    public Admin() {
    }

    public Admin(String id, String password, String name) {
        super(id, password, name);
    }
}
