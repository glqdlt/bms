package com.glqdlt.bmscommon.bmsserver;

import com.glqdlt.bmscommon.persistence.members.repo.AdminRepo;
import com.glqdlt.bmscommon.persistence.members.repo.MemberRepo;
import com.glqdlt.bmscommon.persistence.members.repo.RoleRepo;
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

    @Override
    public void run(String... args) throws Exception {

    }
}
