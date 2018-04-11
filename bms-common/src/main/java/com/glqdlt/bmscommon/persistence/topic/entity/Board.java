package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
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

//  이상하게 <code>@Column(name = "view_count",columnDefinition = "bigint(0)")</code> 이 db에 반영이 안된다..
//  그래서 롬복의 <code>@Builder.Default</code> 로 처리하기로 함.
    @Column(name = "view_count")
    @Builder.Default
    private long count = 0;

    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name="member_id", nullable = false)
    private Member member;

}
