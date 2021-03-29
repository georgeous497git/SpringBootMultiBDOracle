package com.lambda.multibd.profiles.repository;

import java.util.Map;

public interface ApplicationRepository {

    public <T> T ejecutaQuery(final String query, final Class<T> classType);
    public <R, T> R ejecutaQuery(final String query, final Class<T> classType, final Class<R> classReturn);
    public <R, T> R ejecutaQuery(final String query, final Map<String, Object> mapaParametros, final Class<T> classType, final Class<R> classReturn);
}
