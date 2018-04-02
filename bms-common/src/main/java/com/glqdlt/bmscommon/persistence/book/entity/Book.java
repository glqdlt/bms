package com.glqdlt.bmscommon.persistence.book.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.artist.entity.Author;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 6:02
 */

@Accessors(chain = true)
@ToString
@Data
@Entity
public abstract class Book extends AbstractTimestampEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;

    @Column(nullable = false)
    private String title;

    @JoinColumn(name = "author_id")
    @ManyToOne(targetEntity = Author.class)
    private Author author;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(nullable = false)
    private int status;

}
