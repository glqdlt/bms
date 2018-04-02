package com.glqdlt.bmscommon.persistence.archive.provider.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 6:27
 */

@Entity
@Accessors(chain = true)
@Data
@ToString
public class EpubProvider {

    @Column(name = "provider_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int no;

    @Column(unique = true)
    private String name;
    private String url;

}
