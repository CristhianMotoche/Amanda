package com.amanda.Datos;

public class LimiteGastos extends Datos{
    public int idLimite;
    public int anio;
    public double alimentacion;
    public double educacion;
    public double salud;
    public double vestido;
    public double vivienda;

    public LimiteGastos() {
    }

    
    public LimiteGastos(int idLimite, int anio, double alimentacion, double educacion, double salud, double vestido, double vivienda) {
        this.idLimite = idLimite;
        this.anio = anio;
        this.alimentacion = alimentacion;
        this.educacion = educacion;
        this.salud = salud;
        this.vestido = vestido;
        this.vivienda = vivienda;
    }

    public int getIdLimite() {
        return idLimite;
    }

    public int getAnio() {
        return anio;
    }

    public double getAlimentacion() {
        return alimentacion;
    }

    public double getEducacion() {
        return educacion;
    }

    public double getSalud() {
        return salud;
    }

    public double getVestido() {
        return vestido;
    }

    public double getVivienda() {
        return vivienda;
    }

    public void setIdLimite(int idLimite) {
        this.idLimite = idLimite;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setAlimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setEducacion(double educacion) {
        this.educacion = educacion;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public void setVestido(double vestido) {
        this.vestido = vestido;
    }

    public void setVivienda(double vivienda) {
        this.vivienda = vivienda;
    }
    
    
}