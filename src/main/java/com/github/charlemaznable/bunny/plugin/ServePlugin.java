package com.github.charlemaznable.bunny.plugin;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.Map;

public interface ServePlugin {

    void serve(Map<String, Object> context,
               Map<String, Object> request,
               Handler<AsyncResult<Map<String, Object>>> handler);

    void checkResponse(Map<String, Object> context,
                       Map<String, Object> response,
                       Handler<AsyncResult<Boolean>> handler);
}
