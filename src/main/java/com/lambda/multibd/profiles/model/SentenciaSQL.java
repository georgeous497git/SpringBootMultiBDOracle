package com.lambda.multibd.profiles.model;

import java.io.Serializable;

public class SentenciaSQL implements Serializable {

    private String idSentencia;
    private int orden;
    private String query;


    public String getIdSentencia() {
        return idSentencia;
    }

    public void setIdSentencia(String idSentencia) {
        this.idSentencia = idSentencia;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
