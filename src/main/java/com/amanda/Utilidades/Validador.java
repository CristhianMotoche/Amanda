/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Utilidades;

import java.util.regex.Pattern;

/**
 *
 * @author camm
 */
public class Validador {

    public Validador() {
    }

    public boolean cedulaValida(String cedula){
        if (cedula.length() > 10 || cedula.length() < 10 
                || !Pattern.matches("[0-9]+", cedula)) {
            return false;
        }
        else{
            int numeros [] = new int [10];
            for (int i = 0; i < cedula.length(); i++) {
                numeros[i] = (int) (cedula.charAt(i)) - 48;
            }
            return luhn(numeros);
        }
    }

    public boolean luhn(int numeros[]){
        int numVerificacion = numeros[numeros.length - 1];
        int suma = 0;

        for (int i = 0; i < numeros.length - 1; i+=2) {
            numeros[i] = numeros[i]*2;
            if(numeros[i] > 9){
                numeros[i] -= 9;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        int resultado = 10 - suma%10;
        resultado = (resultado < 10)? resultado : 0;

        return (resultado == numVerificacion);
    }
}
