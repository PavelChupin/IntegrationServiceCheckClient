package ru.ysolutions.integration_service.client_check.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringJdbcConfig {
    private JDBCProperties jdbcProperties;

    @Autowired
    public SpringJdbcConfig(JDBCProperties jdbcProperties) {
        this.jdbcProperties = jdbcProperties;
    }

    @Bean(name="mssqlDataSource")
    public DataSource mssqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }

}
