package com.zl.starter.export.user;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.user")
@Data
public class UserProperties {
    private String name;
}
