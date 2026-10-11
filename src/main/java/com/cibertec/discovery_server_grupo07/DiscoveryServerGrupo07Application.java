package com.cibertec.discovery_server_grupo07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerGrupo07Application {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerGrupo07Application.class, args);
    }

}
