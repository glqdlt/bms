package com.glqdlt.bmscommon.persistence.members.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:58
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Role {

    @Id
    @Column(name = "role_id")
    Integer no;

    String label;
}
