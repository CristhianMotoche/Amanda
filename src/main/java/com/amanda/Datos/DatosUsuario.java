/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Datos;

/**
 *
 * @author camm
 */
public class DatosUsuario extends Datos{
    private String nombre;
    private String cedula;
    private String apellido;
    private String contrasena;
    private int preg1;
    private int preg2;
    private String resp1;
    private String resp2;
    private int idUsuario;

    // Constructor
    public DatosUsuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getResp1() {
        return resp1;
    }

    public String getResp2() {
        return resp2;
    }

    public int getPreg1() {
        return preg1;
    }

    public int getPreg2() {
        return preg2;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setResp1(String resp1) {
        this.resp1 = resp1;
    }

    public void setResp2(String resp2) {
        this.resp2 = resp2;
    }

    public void setPreg1(int preg1) {
        this.preg1 = preg1;
    }

    public void setPreg2(int preg2) {
        this.preg2 = preg2;
    }
}
