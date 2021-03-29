package com.lambda.multibd.profiles.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DatasourceApplicationBean {

    @SuppressWarnings("unused")
    @Bean(name = "dataSourceApplication")
    @ConfigurationProperties(prefix = "app.datasource.application")
    public DataSource configurationDatasource() {
        return DataSourceBuilder.create()
                .type(HikariDataSource.class).build();
    }

    @SuppressWarnings("unused")
    @Bean(name = "namedJdbcApplication")
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(@Qualifier("dataSourceApplication") DataSource dataSourceApplication) {
        return new NamedParameterJdbcTemplate(dataSourceApplication);
    }
}
