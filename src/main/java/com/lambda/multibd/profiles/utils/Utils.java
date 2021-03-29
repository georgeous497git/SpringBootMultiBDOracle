package com.lambda.multibd.profiles.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Utils {

    private static final Logger LOG = LoggerFactory.getLogger(Utils.class);

    public static void imprimeVersion() {
        LOG.info("**************************************************************");
        LOG.info("                      " + Constantes.VERSION);
        LOG.info("**************************************************************");
    }
}
