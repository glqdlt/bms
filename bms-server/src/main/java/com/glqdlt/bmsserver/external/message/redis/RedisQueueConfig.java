package com.glqdlt.bmsserver.external.message.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By iw.jhun
 * On 2018-04-27
 */
@Configuration
public class RedisQueueConfig {

    @Bean(name= "redis-message-setting")
    @ConfigurationProperties(prefix = "bms.message.redis.connection")
    public RedisQueueSetting configSetUp(){
        return new RedisQueueSetting();
    }


}
