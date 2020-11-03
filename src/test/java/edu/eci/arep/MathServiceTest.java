package edu.eci.arep;

import org.junit.Test;

import edu.eci.arep.service.MathService;
import edu.eci.arep.service.impl.MathServiceEucli;
import junit.framework.Assert;

/**
 * Clase de pruebas
 * @author Julian Gutierrez
 * @version 1.0
 */
public class MathServiceTest {

    MathService ms = new MathServiceEucli();

    @Test
    public void calcularMCMyMCD(){

        int[] resp = ms.calcularMCMyMCD(5, 10);
        Assert.assertEquals(resp[0], 10);
        Assert.assertEquals(resp[1], 5);

        resp = ms.calcularMCMyMCD(5, 11); 
        Assert.assertEquals(resp[0], 55);
        Assert.assertEquals(resp[1], 1);


        resp = ms.calcularMCMyMCD(7, 11); 
        Assert.assertEquals(resp[0], 77);
        Assert.assertEquals(resp[1], 1);

        
    }
    
}
