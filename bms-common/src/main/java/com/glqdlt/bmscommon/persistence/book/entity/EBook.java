package com.glqdlt.bmscommon.persistence.book.entity;

import com.glqdlt.bmscommon.persistence.archive.provider.entity.EpubProvider;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 6:11
 */
@Accessors(chain = true)
@Data
@ToString
public class EBook extends Book {

    @JoinColumn(name = "provider_id")
    @ManyToOne(targetEntity = EpubProvider.class)
    private EpubProvider epubProvider;

}
