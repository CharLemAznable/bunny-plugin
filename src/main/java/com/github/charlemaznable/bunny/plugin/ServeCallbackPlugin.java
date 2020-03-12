package com.github.charlemaznable.bunny.plugin;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.Map;

public interface ServeCallbackPlugin {

    void checkRequest(Map<String, Object> context,
                      Map<String, Object> request,
                      Handler<AsyncResult<Boolean>> handler);
}
