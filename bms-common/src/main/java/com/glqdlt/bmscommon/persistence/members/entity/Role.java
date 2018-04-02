package com.glqdlt.bmscommon.persistence.members.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:58
 */

//Role은 Enum 객체로 뽑아도 될 거 같은데 JPA 에서 지원하질 않는다고 한다.. 아쉽
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Accessors(chain = true)
@Entity
public class Role {

    @Id
    @Column(name = "role_id")
    Integer no;

    @Column(unique = true)
    String label;
}
