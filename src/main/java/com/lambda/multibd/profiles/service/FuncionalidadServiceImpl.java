package com.lambda.multibd.profiles.service;

import com.lambda.multibd.profiles.component.FuncionalidadComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionalidadServiceImpl implements FuncionalidadService {

    @Autowired
    FuncionalidadComponent funcionalidadComponent;

    public void ejecutaFuncionalidad() {
        funcionalidadComponent.iniciarComponente();
    }
}
