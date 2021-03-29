package com.lambda.multibd.profiles.repository;

public interface ConfigurationRepository {

    public static final String QRY_GENERAL = "select id_sentencia, orden, query from sentencias_sql where id_sentencia = :idSentencia order by orden asc";

    public String getQuery(String idSentecia);
}
