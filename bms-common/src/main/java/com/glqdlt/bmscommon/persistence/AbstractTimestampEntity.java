package com.glqdlt.bmscommon.persistence;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 5:40
 */
@ToString
@Data
@MappedSuperclass
public abstract class AbstractTimestampEntity {
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;


    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
}
