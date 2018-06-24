package com.glqdlt.bmscommon.persistence.members.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */

//Role은 Enum 객체로 뽑아도 될 거 같은데 JPA 에서 지원하질 않는다고 한다.. 아쉽
//@AllArgsConstructor
//@Data
//@Accessors(chain = true)
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Getter
public class Role {

    @NonNull
    @Id
    @Column(name = "roleId", nullable = false)
    Integer no;

    @NonNull
    @Column(name = "label", unique = true, nullable = false)
    String label;
}
