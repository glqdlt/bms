package com.glqdlt.bmscommon.persistense.person.repo;

import com.glqdlt.bmscommon.persistense.members.entity.Admin;
import com.glqdlt.bmscommon.persistense.members.entity.Member;
import com.glqdlt.bmscommon.persistense.members.entity.User;
import com.glqdlt.bmscommon.persistense.members.repo.MemberRepo;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest()
public class MemberRepoTest {

    @Autowired
    MemberRepo memberRepo;

    @Test
    public void init(){


    }

    @Transactional
    @Test
    public void saveMembers(){

        Member admin = new Admin();
        admin.setName("admin_user");
        admin.setId("admin");
        admin.setPassword("admin1234");

        Member user1 = new User();
        user1.setId("user1");
        user1.setPassword("user1-1234");
        user1.setName("user_user1");


        Member user2 = new User();
        user2.setId("user1");
        user2.setPassword("user1-1234");
        user2.setName("user_user1");

        List<Member> members = new ArrayList<>();
        members.add(user1);
        members.add(user2);
        members.add(admin);

        memberRepo.save(members);
        memberRepo.findAll().forEach(x -> log.info(x.toString()));

    }

}