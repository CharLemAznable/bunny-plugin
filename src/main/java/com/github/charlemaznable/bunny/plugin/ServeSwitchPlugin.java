package com.github.charlemaznable.bunny.plugin;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

import java.util.Map;

public interface ServeSwitchPlugin {

    default void switchDeduct(Map<String, Object> context,
                              Map<String, Object> request,
                              Handler<AsyncResult<Boolean>> handler) {
        handler.handle(Future.succeededFuture(true));
    }
}
