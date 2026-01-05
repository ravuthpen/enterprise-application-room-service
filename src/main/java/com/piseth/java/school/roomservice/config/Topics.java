package com.piseth.java.school.roomservice.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app.messaging.topics")
public class Topics {
    private String roomEvents = "room.events.v1";
}
