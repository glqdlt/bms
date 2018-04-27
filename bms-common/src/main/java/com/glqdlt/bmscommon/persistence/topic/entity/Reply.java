package com.glqdlt.bmscommon.persistence.topic.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-03-30
 */
//@Data
//@Accessors(chain = true)
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Reply  extends AbstractTimestampEntity {

    @Column(name = "reply_id")
    @Id
    @GeneratedValue
    private long no;

    @Column(nullable = false)
    @NonNull
    private String content;

    @NonNull
    @ManyToOne(targetEntity = Board.class)
    @JoinColumn(name = "board_id",nullable = false)
    private Board board;

}
