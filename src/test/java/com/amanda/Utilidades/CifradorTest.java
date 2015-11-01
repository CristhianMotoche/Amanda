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
public class CifradorTest {
    
    public CifradorTest() {
    }

    @Test
    public void testMd5() {
        System.out.println("md5");
        
        String textoPlano = "hola";
        Cifrador instance = new Cifrador();
        
        String expResult = "4d186321c1a7f0f354b297e8914ab240";
        String result = instance.md5(textoPlano);
        
        assertEquals(expResult, result);
    }    
}
