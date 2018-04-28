package com.glqdlt.bmsserver.external.message.redis;

import lombok.*;

/**
 * Created By iw.jhun
 * On 2018-04-27
 */
@ToString
@Data
public class RedisQueueSetting {
    private String url;
    private String clientId;
}
