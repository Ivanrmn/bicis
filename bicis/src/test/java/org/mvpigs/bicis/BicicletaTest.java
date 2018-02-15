package org.mvpigs.bicis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mvpigs.bicicleta.Bicicleta;

/**
 * BicicletaTest
 */
public class BicicletaTest {

    Bicicleta bicicleta = new Bicicleta(0);
    Bicicleta bicicleta2 = new Bicicleta(123);

    @Test
    public void consultarBicicleta() {

        assertEquals(bicicleta.getId(), 000);
        assertEquals(bicicleta2.getId(), 123);

    }

}