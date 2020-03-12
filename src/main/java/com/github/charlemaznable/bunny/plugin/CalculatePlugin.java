package com.github.charlemaznable.bunny.plugin;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.Map;

public interface CalculatePlugin {

    void calculate(Map<String, Object> context,
                   Map<String, Object> chargingParameters,
                   Handler<AsyncResult<CalculateResult>> handler);
}
