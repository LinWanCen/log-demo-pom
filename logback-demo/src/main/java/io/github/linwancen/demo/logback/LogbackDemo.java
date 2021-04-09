package io.github.linwancen.demo.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

public class LogbackDemo {

    private static final Logger LINK_LOG = LoggerFactory.getLogger("Link");
    private static final Logger LOG = LoggerFactory.getLogger(LogbackDemo.class);
    private static final Logger LOG_OTHER = LoggerFactory.getLogger("other");

    public static void main(String[] args) {
        LINK_LOG.info("IntelliJ IDEA Link");
        String traceId = UUID.randomUUID().toString().replace("-", "");
        MDC.put("traceId", traceId);
        int i = 0;
        do {
            LOG.info("中文正常 生僻字：爨 LOG.info {}", i);
            LOG.warn("中文正常 生僻字：爨 LOG.warn {}", i);
            LOG.error("中文正常 生僻字：爨 LOG.error {}", i);
            LOG_OTHER.info("中文正常 生僻字：爨 LOG_OTHER.info {}", i);
            LOG_OTHER.warn("中文正常 生僻字：爨 LOG_OTHER.warn {}", i);
            LOG_OTHER.error("中文正常 生僻字：爨 LOG_OTHER.error {}", i);
            i++;
        }
        // while (true);
        while (i < 1_000_000);
        // while (i < 1);
    }
}
