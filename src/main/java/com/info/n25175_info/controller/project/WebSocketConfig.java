package com.info.n25175_info.controller.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Class Name: com.example.demo.websocket.config.WebSocketConfig
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/8 12:15
 * Description: WebSocketConfig
 * ==================================
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}