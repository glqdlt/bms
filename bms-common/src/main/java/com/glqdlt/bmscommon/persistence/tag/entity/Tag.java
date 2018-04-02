package com.glqdlt.bmscommon.persistence.tag.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import lombok.NonNull;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:47
 */
@Entity
public class Tag  extends AbstractTimestampEntity {

    @Column(name = "tag_id")
    @Id
    @GeneratedValue
    private long no;

    private String tagName;

    @JoinColumn(name="member_id")
    @ManyToOne(targetEntity = Member.class)
    @NonNull
    private Member createMember;
}
