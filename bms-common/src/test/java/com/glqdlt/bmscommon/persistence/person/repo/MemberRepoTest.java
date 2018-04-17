package com.glqdlt.bmscommon.persistence.person.repo;

import com.glqdlt.bmscommon.persistence.members.entity.Admin;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import com.glqdlt.bmscommon.persistence.members.entity.Role;
import com.glqdlt.bmscommon.persistence.members.entity.User;
import com.glqdlt.bmscommon.persistence.members.repo.MemberRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

//    @Before
    private void setUp(){
        init();
    }

    @Test
    public void init() {


//        Member admin = new Admin()
//                .setName("admin_user")
//                .setId("admin")
//                .setPassword("admin1234")
//                .setRole(new Role().setNo(9));


        Admin admin = new Admin("admin_user","admin1234","admin");
        User user1 = new User("user1","user1234","user1");
        User user2 = new User("user2","user1234","user2s");


        List<Member> members = new ArrayList<>();
        members.add(user1);
        members.add(user2);
        members.add(admin);

        memberRepo.save(members);
    }

    @After
    public void echoAllMembers() {

        memberRepo.findAll().forEach(x -> log.info(x.toString()));
    }


    @Test
    public void findByUserId() {

        Member user1 = memberRepo.findById("user1");
        Assert.assertEquals("user1", user1.getId());

    }


    @Test
    public void saveNewMember() {

        Member user = new User("user3","user1234","user3");
        memberRepo.save(user);
        User user3 = (User) memberRepo.findById("user3");



//        same의 경우 객체 레퍼런스를 기준으로 비교한다.
//        Assert.assertSame();
        Assert.assertEquals("user3", user3.getId());

    }

    @Test
    public void removeMemberIdAndName() {
        memberRepo.delete(memberRepo.findById("test-admin"));
        memberRepo.delete(memberRepo.findByName("test-user"));
        Assert.assertNull(memberRepo.findById("test-admin"));
        Assert.assertNull(memberRepo.findByName("test-user"));
    }

    @Test
    public void removeMembers() {
        memberRepo.deleteAll();
        Assert.assertEquals(0, memberRepo.findAll().size());
    }

    @Test
    public void findMemberRole(){

//        찍어보면 기대한 것과는 달리 role={no: 1, label : null } 로 찍힌다. 이게 왠 것일까?
//        이유를 찾아보니 ..
//        JPA는 일반적으로 트랜잭션 및 비 트랜잭션으로 분류 할 수있는 캐시에 대해 서로 다른 트랜잭션 격리 수준을 지원합니다.
//        이런 뉘앙스를 발견했다, 아무래도 @Transactional 의 영향인듯 하다
        log.info("qq"+memberRepo.findByName("user_user1").toString());

    }

}