package com.glqdlt.bmscommon.persistence.book.entity;

import com.glqdlt.bmscommon.persistence.archive.provider.entity.EpubProvider;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 6:11
 */
@RequiredArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Getter
@ToString
@Entity
public class EBook extends Book {

    @NonNull
    @JoinColumn(name = "provider_id")
    @ManyToOne(targetEntity = EpubProvider.class)
    private EpubProvider epubProvider;

}
