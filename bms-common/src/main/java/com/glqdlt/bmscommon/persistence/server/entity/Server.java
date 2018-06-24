package com.glqdlt.bmscommon.persistence.server.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Server extends AbstractTimestampEntity {


    @Column(name = "server_id")
    @Id
    @GeneratedValue
    private Integer no;

    @Column(name = "server_name")
    private String serverName;

    @Column(nullable = false)
    private String ip;

    @Column(name = "ssh_port", nullable = false)
    private Integer port;

    @Column(nullable = false)
    private String mac;

    @Column(name = "server_type")
    private ServerType type;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "user_password", nullable = false)
    private String userPw;


}
