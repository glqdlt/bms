package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import com.sun.istack.internal.NotNull;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:44
 */

@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Accessors(chain = true)
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Board extends AbstractTimestampEntity {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private long no;

    @Column(nullable = false)
    @NonNull
    private String title;

    @Column(nullable = false)
    @NonNull
    private String content;

    @Column(name = "view_count",columnDefinition = "bigint(0)")
    private long count;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name="member_id")
    private Member member;



}
