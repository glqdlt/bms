package com.glqdlt.bmscommon.bmsserver;

import com.glqdlt.bmscommon.persistense.members.repo.AdminRepo;
import com.glqdlt.bmscommon.persistense.members.repo.MemberRepo;
import com.glqdlt.bmscommon.persistense.members.repo.RoleRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.transaction.Transactional;

@ComponentScan("com.glqdlt.**")
@Slf4j
@SpringBootApplication
public class BmsServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BmsServerApplication.class, args);
    }
    @Autowired
    MemberRepo memberRepo;

    @Autowired
    RoleRepo roleRepo;

    @Autowired
    AdminRepo adminRepo;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

    }
}
