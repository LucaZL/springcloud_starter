package com.zl.starter.export.user;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {
    @Bean
    @ConditionalOnProperty(prefix = "spring.user", value = "enabled", havingValue = "true")
    public UserClient userClient(UserProperties userProperties) {
        return new UserClient(userProperties);
    }
}
