package com.github.charlemaznable.bunny.plugin.elf;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

import java.util.Map;

public final class VertxElf {

    private VertxElf() {
        throw new UnsupportedOperationException();
    }

    public static <V> void executeBlocking(
            Map<String, Object> contextMap,
            Handler<Promise<V>> blockingCodeHandler,
            Handler<AsyncResult<V>> resultHandler) {
        Vertx.currentContext().executeBlocking(block -> {
            try {
                MtcpElf.preHandle(contextMap);
                blockingCodeHandler.handle(block);
            } catch (Exception e) {
                block.fail(e);
            } finally {
                MtcpElf.afterCompletion();
            }
        }, false, resultHandler);
    }
}
