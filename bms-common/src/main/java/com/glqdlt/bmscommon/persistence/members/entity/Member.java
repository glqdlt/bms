package com.glqdlt.bmscommon.persistence.members.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.sun.istack.internal.NotNull;
import lombok.*;
import lombok.experimental.Accessors;

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
@Accessors(chain = true)
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public abstract class Member extends AbstractTimestampEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private long no;

    @Column(nullable = false)
    @NonNull
    private String id;

    @Column(nullable = false)
    @NonNull
    private String password;

    @Column(nullable = false)
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


// FIXME joincolumn 에서는 columnedefinition 속성의 default value가 안 먹힌다.
    // 나는 setRole 이 null 일 경우, 자동으로 1번 role을 member 에 할당시키고 싶었다.
    // 이러면 lombok 이나 Pojo layer에서 직접 getRole == null setRole(1) 이런식으로 처리를 해주어야 하나?
    @NonNull
    @ManyToOne(targetEntity = Role.class)
    @JoinColumn(name="role_id",columnDefinition = "int(1)",nullable = false)
    private Role role;
}
