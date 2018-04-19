package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.members.entity.Member;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */

//    DDD 의 원칙에 따라 domain model 의 상태변화는 자기 자신만 한다를 적용해서 롬복의 setter를 없애기 위한 주석
//    @Data
//    @Accessors(chain = true)
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Getter
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

//  이상하게 <code>@Column(name = "view_count",columnDefinition = "bigint(0)")</code> 이 db에 반영이 안 된다..
//  롬복의 <code>@Builder.Default</code> 로 처리하기로 한다.
    // <code></code> 영역은 java_docs를 위함.
    @Column(name = "view_count")
    @Builder.Default
    private long count = 0;


    public void countUp(){
        this.count++;
    }

    @NonNull
    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name="member_id", nullable = false)
    private Member member;

}
