package com.glqdlt.bmscommon.persistence.tag.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import javax.jws.HandlerChain;
import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:47
 */
@ToString
@Data
@Entity
public class Tag  extends AbstractTimestampEntity {

    @Column(name = "tag_id")
    @Id
    @GeneratedValue
    private long no;

    @Column(nullable = false,name="tag")
    private String tagName;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name="member_id",nullable = false)
    private Member createMember;
}
