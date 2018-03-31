package com.glqdlt.bmscommon.persistense.topic.entity;

import com.glqdlt.bmscommon.persistense.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistense.members.entity.Member;
import lombok.*;

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
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Board extends AbstractTimestampEntity {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private long no;

    @NonNull
    private String title;

    @NonNull
    private String content;

    @Column(name = "view_count")
    private long count;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name="member_id")
    private Member member;



}
