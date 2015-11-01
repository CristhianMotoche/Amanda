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

    @Test
    public void testContrasenaValida() {
        System.out.println("Contrasena invalida - menos de 8 caracteres");

        String contrasena = "1a3b";
        Validador instance = new Validador();

        boolean expResult = false;
        boolean result = instance.contrasenaValida(contrasena);

        assertEquals(expResult, result);
    }

    @Test
    public void testContrasenaValida2() {
        System.out.println("Contrasena invalida - mas de 16 caracteres");

        String contrasena = "12a45B78c01234567";
        Validador instance = new Validador();

        boolean expResult = false;
        boolean result = instance.contrasenaValida(contrasena);

        assertEquals(expResult, result);
    }

    @Test
    public void testContrasenaValida3() {
        System.out.println("Contrasena invalida - solo caracteres");

        String contrasena = "aSdfGhjkLm";
        Validador instance = new Validador();

        boolean expResult = false;
        boolean result = instance.contrasenaValida(contrasena);

        assertEquals(expResult, result);
    }

    @Test
    public void testContrasenaValida4() {
        System.out.println("Contrasena invalida - solo numeros");

        String contrasena = "1234567890";
        Validador instance = new Validador();

        boolean expResult = false;
        boolean result = instance.contrasenaValida(contrasena);

        assertEquals(expResult, result);
    }

    @Test
    public void testContrasenaValida5() {
        System.out.println("Contrasena invalida - No tiene mayusculas");

        String contrasena = "asdf1h2klm";
        Validador instance = new Validador();

        boolean expResult = false;
        boolean result = instance.contrasenaValida(contrasena);

        assertEquals(expResult, result);
    }

    @Test
    public void testContrasenaValida6() {
        System.out.println("Contrasena valida");

        String contrasena = "Amanda1234";
        Validador instance = new Validador();

        boolean expResult = true;
        boolean result = instance.contrasenaValida(contrasena);

        assertEquals(expResult, result);
    }
}
