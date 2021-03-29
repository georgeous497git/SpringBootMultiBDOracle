package com.lambda.multibd.profiles.init;

import com.lambda.multibd.profiles.service.FuncionalidadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarterCommandLine implements CommandLineRunner {

    private final static Logger LOG = LoggerFactory.getLogger(StarterCommandLine.class);

    @Autowired
    FuncionalidadService funcionalidadService;

    @Override
    public void run(String... args) throws Exception {
        funcionalidadService.ejecutaFuncionalidad();
    }
}
