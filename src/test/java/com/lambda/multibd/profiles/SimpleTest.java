package com.lambda.multibd.profiles;

import com.lambda.multibd.profiles.model.Edificio;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SimpleTest {

    Class<Edificio> cl = Edificio.class;

    @Before
    public void init() {
        cl = Edificio.class;
    }

    @Test
    public void testClasses(){

        int n = 0;

        if(Edificio.class.equals(cl)){
            n = 1;
        }

        Assert.assertEquals(1, n);

    }

}
