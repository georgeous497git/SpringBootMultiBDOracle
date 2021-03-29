package com.lambda.multibd.profiles.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class ApplicationRepositoryImpl implements ApplicationRepository {

    @Autowired @Qualifier("namedJdbcApplication")
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public <T> T ejecutaQuery(final String query, final Class<T> classType) {
        return ejecutaQuery(query, null, classType, classType);
    }

    @Override
    public <R, T> R ejecutaQuery(final String query, final Class<T> classType, final Class<R> classReturn) {
        return ejecutaQuery(query, null, classType, classReturn);
    }

    /*
        Class<R>: Clase de retorno de datos (Permitidos: ArrayList y POJO)
        Class<T>: Clase de tipo de objeto-entidad obtenida de Base de Datos
    */
    @Override
    public <R, T> R ejecutaQuery(final String query, final Map<String, Object> mapaParametros, final Class<T> classType, final Class<R> classReturn) {

        List<T> listaObjetos = namedParameterJdbcTemplate.query(query, mapaParametros, new BeanPropertyRowMapper<T>(classType));

        return getTipoRetorno(listaObjetos, classType, classReturn);
    }

    private <R, T> R getTipoRetorno(List<T> listaObjetos, final Class<T> classType, final Class<R> classRetorno) {

        R r = null;

        if(listaObjetos != null) {

            if (List.class.equals(classRetorno)) {
                r = (R)listaObjetos;
            } else if(classType.equals(classRetorno)) {
                T t = null;

                Optional<T> optionalT = listaObjetos.stream().findFirst();

                if(optionalT.isPresent()) {
                    t = optionalT.get();
                    r = (R)t;
                }
            }
        }

        return r;
    }
}
