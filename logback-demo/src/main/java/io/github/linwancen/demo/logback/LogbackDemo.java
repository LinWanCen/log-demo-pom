package io.github.linwancen.demo.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

public class LogbackDemo {

    private static final Logger LINK_LOGGER = LoggerFactory.getLogger("Link");
    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo.class);
    private static final Logger LOGGER_OTHER = LoggerFactory.getLogger("other");

    public static void main(String[] args) {
        LINK_LOGGER.info("IntelliJ IDEA Link");
        String traceId = UUID.randomUUID().toString().replace("-", "");
        MDC.put("traceId", traceId);
        int i = 0;
        do {
            LOGGER.info("中文正常 生僻字：爨 LOGGER.info {}", i);
            LOGGER.warn("中文正常 生僻字：爨 LOGGER.warn {}", i);
            LOGGER.error("中文正常 生僻字：爨 LOGGER.error {}", i);
            LOGGER_OTHER.info("中文正常 生僻字：爨 LOGGER_OTHER.info {}", i);
            LOGGER_OTHER.warn("中文正常 生僻字：爨 LOGGER_OTHER.warn {}", i);
            LOGGER_OTHER.error("中文正常 生僻字：爨 LOGGER_OTHER.error {}", i);
            i++;
        }
        // while (true);
        while (i < 1_000_000);
        // while (i < 1);
    }
}
