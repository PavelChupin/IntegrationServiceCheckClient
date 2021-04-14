package ru.ysolutions.integration_service.client_check.configs;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "custom-settings.datasource")
@PropertySource("classpath:application.yaml")
public class JDBCProperties {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

   /* @PostConstruct
    public void text(){
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }*/
}
