package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.sun.istack.internal.NotNull;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 1:44
 */
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Reply  extends AbstractTimestampEntity {

    @Column(name = "reply_id")
    @Id
    @GeneratedValue
    private long no;

    @NotNull
    @NonNull
    private String content;

    @NotNull
    @ManyToOne(targetEntity = Board.class)
    @JoinColumn(name = "board_id")
    private Board board;

}
