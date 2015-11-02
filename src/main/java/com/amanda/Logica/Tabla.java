/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Logica;

import com.amanda.Datos.Datos;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camm
 */
public abstract class Tabla {
    protected final Conexion con;
    protected String cadSQL;
    protected String nombreTabla;
    protected ResultSet resultadoCrudo;

    public Tabla(){
        con = new Conexion();
        cadSQL = "";
        resultadoCrudo = null;
    }

    //protected ResultSet getResultadoCrudo() { return resultadoCrudo; }

    protected void consultar(){
        resultadoCrudo = null;
        try {
            Statement s = con.Crear();
            s.execute(cadSQL);
            resultadoCrudo = s.getResultSet();
            con.Cerrar();
        } catch (Exception e) { resultadoCrudo = null; }
    }

    protected DefaultTableModel obtenerTabla(String encabezado[]){
        DefaultTableModel ret = null;
        try {
            consultar();
            String regs[] = new String[encabezado.length];
            while(resultadoCrudo.next()){
                for (int i = 0; i < encabezado.length; i++) regs[i] = resultadoCrudo.getString(encabezado[i]);
                ret.addRow(regs);
            }
            resultadoCrudo.first();
        } catch (Exception e) { ret = null; }
        return ret;
    }

    public abstract DefaultTableModel mostrar();
    public abstract boolean insertar(Datos dts);
    public abstract boolean editar(Datos dts);
    public abstract boolean eliminar(Datos dts);
}
