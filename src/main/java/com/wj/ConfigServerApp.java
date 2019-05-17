package com.wj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author jun.wang
 * @title: ConfigServerApp
 * @projectName ownerpro
 * @description: TODO
 * @date 2019/5/17 13:34
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer
public class ConfigServerApp {

    public static void main(String args[]) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
