package com.github.charlemaznable.bunny.plugin.elf;

import org.n3r.eql.mtcp.MtcpContext;

import java.util.Map;

import static com.github.charlemaznable.core.lang.Mapp.getStr;
import static org.n3r.eql.mtcp.MtcpContext.TENANT_CODE;
import static org.n3r.eql.mtcp.MtcpContext.TENANT_ID;

public final class MtcpElf {

    private MtcpElf() {
        throw new UnsupportedOperationException();
    }

    public static void preHandle(Map<String, Object> contextMap) {
        MtcpContext.setTenantId(getStr(contextMap, TENANT_ID));
        MtcpContext.setTenantCode(getStr(contextMap, TENANT_CODE));
    }

    public static void afterCompletion() {
        MtcpContext.clear();
    }
}
