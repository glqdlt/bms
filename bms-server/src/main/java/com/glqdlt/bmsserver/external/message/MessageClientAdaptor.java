package com.glqdlt.bmsserver.external.message;

import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.Map;

/**
 * Created By iw.jhun
 * On 2018-04-27
 */
@Deprecated
public interface MessageClientAdaptor<T> {
    ListenableFuture<T> push(String message);
}
