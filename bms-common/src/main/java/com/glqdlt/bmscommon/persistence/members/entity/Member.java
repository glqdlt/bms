package com.glqdlt.bmscommon.persistence.members.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotBlank;
//import org.hibernate.validator.constraints.NotEmpty;
//
import javax.persistence.*;
//import javax.validation.Valid;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */

// jpa validation
    // jsr 380 레퍼런스 http://www.baeldung.com/javax-validation
    //https://www.owasp.org/index.php/Bean_Validation_Cheat_Sheet
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
    @Column(name = "memberId")
    private long no;

    @Column(nullable = false)
    @NonNull
    private String id;

    @Column(nullable = false)
    @NonNull
//    @NotEmpty
//    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "Password Validation Wrong")
//    @Size(max = 10)
    private String password;


    public void changePassword(String password) {
        this.password = password;
    }


    @Column(nullable = false)
    @NonNull
    private String name;

    public void changeName(String name) {
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


//    @Email
    private String email;


    public void changeEmail(String email) {
        this.email = email;
    }


    // fixmeDone joincolumn 에서는 columnedefinition 속성의 default value가 안 먹힌다.
    // 나는 setRole 이 null 일 경우, 자동으로 1번 role을 member 에 할당시키고 싶었다.
    // 이러면 lombok 이나 Pojo layer에서 직접 getRole == null setRole(1) 이런식으로 처리를 해주어야 하나? 코드 치기 싫은 데
    // 그래서 롬복의 @builder.default 어노테이션으로 role == null 일 경우 role을 setNo1 식으로 하게끔 처리하였다.
    @NonNull
    @ManyToOne(targetEntity = Role.class)
    @JoinColumn(name = "roleId", nullable = false)
    @Builder.Default
    private Role role = new Role(1, "user");
}
