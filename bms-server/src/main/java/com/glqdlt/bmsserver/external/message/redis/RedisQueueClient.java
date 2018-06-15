package com.glqdlt.bmsserver.external.message.redis;

import com.glqdlt.bmsserver.external.message.MessageClientAdaptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.AsyncRestTemplate;

import java.util.Map;

/**
 * Created By iw.jhun
 * On 2018-04-27
 */
@Deprecated
@Slf4j
//@Component
public class RedisQueueClient implements MessageClientAdaptor {

    @Autowired
    @Qualifier("redis-message-setting")
    private RedisQueueSetting redisQueueSetting;
    private AsyncRestTemplate asyncRestTemplate;

    public ListenableFuture<ResponseEntity<Map>> push(String message){
        String clientId = redisQueueSetting.getClientId();
        String messageUrl = redisQueueSetting.getUrl();

        // TODO asyncRestTemplate 을 이용해서 entity 응답 callback을 넘기는로직 구현 필요.

        ListenableFuture<ResponseEntity<Map>> entity = null;

        log.info("Send message '{}' ==> to url '{}'",messageUrl,message);

        return entity;

    }

}
