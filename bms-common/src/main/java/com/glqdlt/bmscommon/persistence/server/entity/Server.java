package com.glqdlt.bmscommon.persistence.server.entity;

import com.glqdlt.bmscommon.persistence.AbstractTimestampEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Server extends AbstractTimestampEntity {


    @Column(name = "serverId")
    @Id
    @GeneratedValue
    private Integer no;

    @Column(name = "serverName")
    private String serverName;

    @Column(nullable = false)
    private String ip;

    @Column(name = "sshPort", nullable = false)
    private Integer port;

    @Column(nullable = false)
    private String mac;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "serverType")
    private ServerType type;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userPassword;


}
