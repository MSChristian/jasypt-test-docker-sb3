package es.christianms.jasypttest;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import es.christianms.jasypttest.config.CustomProperties;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableEncryptableProperties
@EnableConfigurationProperties({CustomProperties.class})
@Slf4j
public class JasyptTestApplication {

    @Autowired
    CustomProperties customProperties;

    public static void main(String[] args) {
        SpringApplication.run(JasyptTestApplication.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("Custom properties: " + customProperties.toString());
    }

}
