package com.glqdlt.bmscommon.persistence.members.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import lombok.*;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:42
 */

//@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER,name = "role",columnDefinition = "INT(1)")
//@Data
//@Accessors(chain = true)
@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public abstract class Member extends AbstractTimestampEntity {

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

    public void changePassword(String password){
        validValueNull(password);
        validValueLength(password, MemberValidEnum.PASSWORD_LENGTH);
        this.password = password;
    }


    @Column(nullable = false)
    @NonNull
    private String name;

    public void changeName(String name) {
        validValueNull(name);
        validValueLength(name, MemberValidEnum.NAME_LENGTH);
        this.name = name;
    }



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


    public void changeEmail(String email) {
        validValueNull(email);
        this.email = email;
    }

    private <T> void validValueNull(T t) {

        if (t instanceof String) {

            if (t.equals("")) {
                throw new RuntimeException();
            }

        } else {

            if (t == null) {

                throw new RuntimeException();
            }
        }
    }

    private void validValueLength(String value, MemberValidEnum length){
        if(value.length() > length.getLength()){
            throw new RuntimeException();
        }
    }

    // fixmeDone joincolumn 에서는 columnedefinition 속성의 default value가 안 먹힌다.
    // 나는 setRole 이 null 일 경우, 자동으로 1번 role을 member 에 할당시키고 싶었다.
    // 이러면 lombok 이나 Pojo layer에서 직접 getRole == null setRole(1) 이런식으로 처리를 해주어야 하나? 코드 치기 싫은 데
    // 그래서 롬복의 @builder.default 어노테이션으로 role == null 일 경우 role을 setNo1 식으로 하게끔 처리하였다.
    @NonNull
    @ManyToOne(targetEntity = Role.class)
    @JoinColumn(name = "role_id", nullable = false)
    @Builder.Default
    private Role role = new Role(1, "user");
}
