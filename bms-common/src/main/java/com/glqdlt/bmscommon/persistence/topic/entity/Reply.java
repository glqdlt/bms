package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
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
@Entity
@ToString
@Data
@Accessors(chain = true)
public class Reply  extends AbstractTimestampEntity {

    @Column(name = "reply_id")
    @Id
    @GeneratedValue
    private long no;

    @Column(nullable = false)
    @NonNull
    private String content;

    @ManyToOne(targetEntity = Board.class)
    @JoinColumn(name = "board_id",nullable = false)
    private Board board;

}
