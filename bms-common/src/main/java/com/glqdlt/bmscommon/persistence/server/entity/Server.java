package com.glqdlt.bmscommon.persistence.server.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Server  extends AbstractTimestampEntity {


    @Column(name = "server_id")
    @Id
    @GeneratedValue
    private Integer no;

    private String name;

    private String ip;

    @Column(name = "ssh_port")
    private String port;

    private String mac;

    private ServerType type;

}
