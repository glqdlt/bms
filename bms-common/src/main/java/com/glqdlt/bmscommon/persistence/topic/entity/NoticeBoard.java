package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.members.entity.Member;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */

@Entity
public class NoticeBoard extends Board {

    public NoticeBoard() {
        super();
    }

    public NoticeBoard(String title, String content, Member member) {
        super(title, content, member);
    }
}
