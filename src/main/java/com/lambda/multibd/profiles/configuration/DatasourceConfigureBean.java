package com.lambda.multibd.profiles.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DatasourceConfigureBean {

    @SuppressWarnings("unused")
    @Primary
    @Bean(name = "dataSourceConfigure")
    @ConfigurationProperties(prefix = "app.datasource.configure")
    public DataSource configureDatasource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @SuppressWarnings("unused")
    @Primary
    @Bean(name = "namedJdbcConfigure")
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(@Qualifier("dataSourceConfigure") DataSource dataSourceConfigure){
        return new NamedParameterJdbcTemplate(dataSourceConfigure);
    }
}