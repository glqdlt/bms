package com.glqdlt.bmscommon.persistence.archive.storage.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import com.glqdlt.bmscommon.persistence.members.entity.Admin;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 6:19
 */

@Accessors(chain = true)
@Entity
@ToString
@Data
public class BookArchiveServer extends AbstractTimestampEntity{

    @Id
    @GeneratedValue
    @Column(name = "server_id")
    private long no;

    private String name;

    private String url;

    private Admin creator;

}
