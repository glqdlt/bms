package com.glqdlt.bmscommon.persistence.artist.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created By iw.jhun
 * On 2018-04-02
 */
@ToString
@Data
@Entity
public class Author {

    @Column(name="authorId")
    @Id
    @GeneratedValue
    private long no;

    @Column(nullable = false)
    private String name;
}
