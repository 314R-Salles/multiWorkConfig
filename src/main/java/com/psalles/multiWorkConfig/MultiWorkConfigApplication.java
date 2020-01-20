package com.psalles.multiWorkConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MultiWorkConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiWorkConfigApplication.class, args);
    }

}
