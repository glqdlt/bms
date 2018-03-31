package com.glqdlt.bmscommon.persistense.topic.entity;

import com.glqdlt.bmscommon.persistense.AbstractTimestampEntity;
import lombok.AllArgsConstructor;
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

    @NonNull
    private String content;

    @ManyToOne(targetEntity = Board.class)
    @JoinColumn(name = "board_id")
    private Board board;

}
