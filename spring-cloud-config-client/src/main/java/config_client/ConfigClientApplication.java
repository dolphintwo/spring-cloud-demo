package config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DolphinTwo
 * @date 2018/8/10
 */

@EnableEurekaClient
@SpringBootApplication
@RefreshScope
@RestController
@Configuration
@EnableAutoConfiguration
public class ConfigClientApplication {

    @Value("${from}")
    private String from;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @RequestMapping(value = "/from")
    public String from(){
        return from;
    }
}
