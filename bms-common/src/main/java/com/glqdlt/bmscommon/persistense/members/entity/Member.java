package com.glqdlt.bmscommon.persistense.members.entity;

import com.glqdlt.bmscommon.persistense.AbstractTimestampEntity;
import lombok.*;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:42
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@RequiredArgsConstructor
//@DiscriminatorColumn(
//        discriminatorType = DiscriminatorType.INTEGER,
//        name = "role",
//        columnDefinition = "INT(1)"
//)
@ToString
@Data
public abstract class Member extends AbstractTimestampEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private long no;

    @NonNull
    private String id;
    @NonNull
    private String password;
    @NonNull
    private String Name;


//    AbstractTimestampEntity 에서 상속을 받으므로 아래는 주석
//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createTime;
//
//
//    @UpdateTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updateTime;


    private String email;

    @ManyToOne(targetEntity = Role.class)
    @JoinColumn(name="role_id")
    private Role role;
}
