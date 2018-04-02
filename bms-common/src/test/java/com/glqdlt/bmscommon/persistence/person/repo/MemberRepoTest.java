package com.glqdlt.bmscommon.persistence.person.repo;

import com.glqdlt.bmscommon.persistence.members.entity.Admin;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import com.glqdlt.bmscommon.persistence.members.entity.Role;
import com.glqdlt.bmscommon.persistence.members.entity.User;
import com.glqdlt.bmscommon.persistence.members.repo.MemberRepo;
import com.glqdlt.bmscommon.persistence.members.repo.RoleRepo;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.AssertionFailure;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.NonTransientDataAccessException;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 2:05
 */
// ignore 로 빌드 시에 skip 하도록 한다.
//@Ignore
@Transactional
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest()
public class MemberRepoTest {

    @Autowired
    MemberRepo memberRepo;

    @Autowired
    RoleRepo roleRepo;

    @Test
    public void init() {


    }

    @Before
    public void initData() {
        Role userRole = new Role();
        userRole.setNo(1);
        userRole.setLabel("User");

        Role adminRole = new Role();
        adminRole.setNo(9);
        adminRole.setLabel("Admin");

        List<Role> roleList = new ArrayList<>();
        roleList.add(userRole);
        roleList.add(adminRole);

        roleRepo.save(roleList);


        Member admin = new Admin();
        admin.setName("admin_user");
        admin.setId("admin");
        admin.setPassword("admin1234");
        admin.setRole(adminRole);

        Member user1 = new User();
        user1.setId("user1");
        user1.setPassword("user1-1234");
        user1.setName("user_user1");
        user1.setRole(userRole);


        Member user2 = new User();
        user2.setId("user2");
        user2.setPassword("user2-1234");
        user2.setName("user_user2");

        List<Member> members = new ArrayList<>();
        members.add(user1);
        members.add(user2);
        members.add(admin);

        memberRepo.save(members);

    }

    @After
    public void findAllMembers() {

        memberRepo.findAll().forEach(x -> log.info(x.toString()));
    }


    @Test
    public void findByUserId() {

        Member user1 = memberRepo.findById("user1");
        Assert.assertEquals("user1", user1.getId());

    }


    @Test
    public void saveNewMember() {

        Role role = new Role();
        role.setNo(1);

        User user = new User();
        user.setId("user3");
        user.setName("user-name-3");
        user.setPassword("password");
        user.setRole(role);

        memberRepo.save(user);
        User user3 = (User) memberRepo.findById("user3");
        log.info(user3.toString());
        Assert.assertEquals("user3", user3.getId());

//        same의 경우 객체 레퍼런스를 기준으로 비교한다.
//        Assert.assertSame();

    }

    @Test
    public void failSavedUniqueMemberId() {
        User user = new User();
    }
}