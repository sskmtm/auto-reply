package com.sskmtm.autoreply;

import com.sskmtm.autoreply.config.OpenAiConfig;
import com.sskmtm.autoreply.config.ZsxqConfig;
import com.sskmtm.autoreply.utils.SpringContextUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 主类（项目启动入口）
 */
@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@Slf4j
public class MainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        OpenAiConfig openAiConfig = SpringContextUtils.getBean(OpenAiConfig.class);
        ZsxqConfig zsxqConfig = SpringContextUtils.getBean(ZsxqConfig.class);
        log.info("OpenAi 配置 {}", zsxqConfig);
        log.info("知识星球配置 {}", openAiConfig);
    }
}
