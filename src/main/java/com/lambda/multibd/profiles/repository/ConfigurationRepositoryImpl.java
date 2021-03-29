package com.lambda.multibd.profiles.repository;

import com.lambda.multibd.profiles.model.SentenciaSQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ConfigurationRepositoryImpl implements ConfigurationRepository {

    private final static Logger LOG = LoggerFactory.getLogger(ConfigurationRepositoryImpl.class);

    @Autowired
    @Qualifier("namedJdbcConfigure")
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public String getQuery(String idSentencia) {

        Map<String, Object> parametros = new HashMap<>();
        parametros.put("idSentencia", idSentencia);

        StringBuilder qryCompleto = new StringBuilder();

        List<SentenciaSQL> listaSentencias = namedParameterJdbcTemplate.query(QRY_GENERAL, parametros, new BeanPropertyRowMapper<SentenciaSQL>(SentenciaSQL.class));
        listaSentencias.stream().forEach(s -> qryCompleto.append(s.getQuery()));

        return qryCompleto.toString();
    }

}
