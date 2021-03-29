package com.lambda.multibd.profiles.component;

import com.lambda.multibd.profiles.model.Edificio;
import com.lambda.multibd.profiles.repository.ApplicationRepository;
import com.lambda.multibd.profiles.repository.ConfigurationRepository;
import com.lambda.multibd.profiles.utils.Constantes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionalidadComponent {

    private final static Logger LOG = LoggerFactory.getLogger(FuncionalidadComponent.class);

    @Autowired
    ConfigurationRepository configurationRepository;
    @Autowired
    ApplicationRepository applicationRepository;

    public void iniciarComponente() {
        this.ejecutaProceso();
    }

    private void ejecutaProceso() {
        String qry = configurationRepository.getQuery(Constantes.ID_QRY_EDIFICIO);

        LOG.info(">> [{}]", qry);

        List<Edificio> list = applicationRepository.ejecutaQuery(qry, Edificio.class, List.class);
        list.stream().forEach(System.out::println);

        Edificio edificio = applicationRepository.ejecutaQuery(qry, Edificio.class);

        LOG.info(">> {}", (edificio != null ? edificio.getUbicacion() : "no hay edificio"));
    }
}
