package es.christianms.jasypttest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom")
public record CustomProperties(
        String user,
        String password
) { }
