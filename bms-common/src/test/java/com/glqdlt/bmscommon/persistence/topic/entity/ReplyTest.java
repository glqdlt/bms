package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.members.entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By iw.jhun
 * On 2018-04-17 , 오후 3:39
 */
public class ReplyTest {

    @Test
    public void someTest(){
        Reply reply  = new Reply("qweqweq",new NoticeBoard("hello","qwe", new User("qwe","qwe","qwe")));
        System.out.println(reply.toString());
    }


}