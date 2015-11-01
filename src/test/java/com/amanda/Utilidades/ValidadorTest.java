/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Utilidades;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camm
 */
public class ValidadorTest {
    @Test
    public void testCedulaValida() {
        System.out.println("Cedula con menos de 10 numeros no es valida");
        Validador instance = new Validador();

        String ci = "12345";

        boolean expResult = false;
        boolean result = instance.cedulaValida(ci);

        assertEquals(expResult, result);
    }

    @Test
    public void testCedulaValida2() {
        System.out.println("Cedula con más de 10 numeros no es valida");
        Validador instance = new Validador();

        String ci = "12345678910";

        boolean expResult = false;
        boolean result = instance.cedulaValida(ci);

        assertEquals(expResult, result);
    }

    @Test
    public void testCedulaValida3() {
        System.out.println("Cedula valida");
        Validador instance = new Validador();

        String ci = "1725651630";

        boolean expResult = true;
        boolean result = instance.cedulaValida(ci);

        assertEquals(expResult, result);
    }

    @Test
    public void testCedulaValida4() {
        System.out.println("Cedula no valida");
        Validador instance = new Validador();

        String ci = "1725651631";

        boolean expResult = false;
        boolean result = instance.cedulaValida(ci);

        assertEquals(expResult, result);
    }
    
    @Test
    public void testCedulaValida5() {
        System.out.println("Cedula no valida");
        Validador instance = new Validador();

        String ci = "17s5651631";

        boolean expResult = false;
        boolean result = instance.cedulaValida(ci);

        assertEquals(expResult, result);
    }
}
