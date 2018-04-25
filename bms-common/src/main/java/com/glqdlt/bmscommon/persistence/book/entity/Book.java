package com.glqdlt.bmscommon.persistence.book.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.artist.entity.Author;
import com.glqdlt.bmscommon.persistence.tag.entity.Tag;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created By iw.jhun
 * On 2018-04-02
 */

@RequiredArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Book extends AbstractTimestampEntity{

    @Column(name = "book_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;

    @NonNull
    @Column(nullable = false)
    private String title;

    public void changeTitle(String title){

        this.title = title;
    }

    @NonNull
    @JoinColumn(name = "author_id")
    @ManyToOne(targetEntity = Author.class)
    private Author author;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(nullable = false)
    private int status;

    private Schedule schedule;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduleDate;

    @NonNull
    @JoinColumn(name="tag_id")
    @ManyToOne(targetEntity = Tag.class)
    private Tag tag;
}
