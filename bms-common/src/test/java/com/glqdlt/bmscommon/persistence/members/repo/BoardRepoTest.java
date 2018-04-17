package com.glqdlt.bmscommon.persistence.members.repo;

import com.glqdlt.bmscommon.persistence.members.entity.User;
import com.glqdlt.bmscommon.persistence.topic.entity.Board;
import com.glqdlt.bmscommon.persistence.topic.entity.NoticeBoard;
import com.glqdlt.bmscommon.persistence.topic.entity.Reply;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 1:42
 */
//@Transactional
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest()
public class BoardRepoTest {

    @Autowired
    BoardRepo boardRepo;

    @Autowired
    ReplyRepo replyRepo;

    @Autowired
    MemberRepo memberRepo;

//    @Before
    public void init(){

        // 리팩토링
//        Board noticeBoard = new NoticeBoard()
//                .setTitle("test notice 1")
//                .setContent("Hello Every one~~")
//                .setMember(memberRepo.findById("test-user"));

//        memberRepo.findAll().forEach(x-> log.info(x.toString()));
        Board noticeBoard = new NoticeBoard("test notice 1","Hello",memberRepo.findById("root"));

        boardRepo.save(noticeBoard);

//        Reply noticeReply = new Reply()
//                .setBoard(noticeBoard)
//                .setContent("wow good");

        Reply noticeReply = new Reply("wow good board!!",noticeBoard);

        replyRepo.save(noticeReply);

    }
    @Test
    public void someTest(){

    }

    @After
    public void findAllArticle(){
        boardRepo.findAll().forEach(x -> log.info(x.toString()));
    }

}