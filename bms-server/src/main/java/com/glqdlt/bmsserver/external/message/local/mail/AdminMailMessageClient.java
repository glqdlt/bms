package com.glqdlt.bmsserver.external.message.local.mail;

import com.glqdlt.bmsserver.external.message.MessageClientAdaptor;
import org.springframework.context.annotation.Bean;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * Created By iw.jhun
 * On 2018-04-27
 */
public class AdminMailMessageClient implements MessageClientAdaptor {

    // TODO admin-setting 정보는 redmine 처럼 처음에는 공란이고, 시스템이 최초 운영 된후 데이터베이스에 기입될 때 가져와야함으로.. 이에 대한 로직 구현 필요.
    // 개인적으로는 퀄리필로 빈을 가져와서 처리하는 형태면 좋겠는 데..
    @Bean(name= "admin-setting")
    public Object configSetUp(){
        return null;
    }

    @Override
    public ListenableFuture push(String message) {
        return null;
    }
}
