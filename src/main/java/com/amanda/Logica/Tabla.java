package com.amanda.Logica;

import com.amanda.Datos.Datos;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public abstract class Tabla {
    protected final Connection con;
    protected String cadSQL;
    public int totalregistros;
    
    public Tabla(){
        con = (new Conexion()).obtenerConexion();
        cadSQL = "";
        totalregistros = 0;
    }
    
    public abstract DefaultTableModel mostrar();
    public abstract boolean insertar(Datos dts);
    public abstract boolean editar(Datos dts);
    public abstract boolean eliminar(Datos dts);
}