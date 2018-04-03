package com.glqdlt.bmscommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 2:09
 */
@SpringBootApplication
public class CommonApplication{
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CommonApplication.class);
//        TODO Junit Test에서는 이 Banner.mode.off 가 동작하질 않는 다. 이게 왜 이런지 이유를 찾자.
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
