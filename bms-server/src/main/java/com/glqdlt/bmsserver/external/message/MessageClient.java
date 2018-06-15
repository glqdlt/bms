package com.glqdlt.bmsserver.external.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * Created By iw.jhun
 * On 2018-04-27
 */
@Deprecated
@Slf4j
public class MessageClient<T> {

    MessageClientAdaptor<T> client;

    public MessageClient(MessageClientAdaptor<T> client) {
        this.client = client;
    }

    public ListenableFuture<T> push(String message){
        return client.push(message);
    }
}
