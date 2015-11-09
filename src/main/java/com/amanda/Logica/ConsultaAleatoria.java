package com.amanda.Logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaAleatoria {
    private final Connection con;
    private String cadSQL;
    public int totalregistros;
    
    public ConsultaAleatoria(){
        con = (new Conexion()).obtenerConexion();
        cadSQL = "";
        totalregistros = 0;
    }
    
    public DefaultTableModel relacionGastosConLimites(int idUsuario, int año){
        String cabecera[] = {"Alimentación", "Educación", "Salud", "Vestido", "Vivienda"};
        String registro[] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, cabecera);
        totalregistros = 0;
        cadSQL = "select sum(sumalimentacion) as alimentacion, sum(sumeducacion) as educacion, sum(sumsalud) as salud, sum(sumvestido) as vestido, sum(sumvivienda) as vivienda from " 
                + "factura where idusuario = " + idUsuario + " and idlimite = (select idlimite from limitegasto where anio = " + año + ")";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadSQL);
            while (rs.next()){
                registro[0] = rs.getString("alimentacion");
                registro[1] = rs.getString("educacion");
                registro[2] = rs.getString("salud");
                registro[3] = rs.getString("vestido");
                registro[4] = rs.getString("vivienda");
                totalregistros++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Mostrar' " + e);
        }
        return modelo;
    }
    
    public boolean sobrepasaLimiteGasto(int idUsuario, int año){
        cadSQL = "select (lg1.ALIMENTACION - a.alimentacion) as restoalimentacion, (lg1.EDUCACION - a.EDUCACION) as restoeducacion, (lg1.SALUD - a.salud) as restosalud, (lg1.VESTIDO - a.vestido) as restovestido, (lg1.VIVIENDA - a.vivienda) as restovivienda "
                + "from LIMITEGASTO lg1 "
                + "inner join ("
                + "select (sum(f.IDLIMITE) / count(f.IDFACTURA)) as idlimite, sum(f.sumalimentacion) as alimentacion, sum(f.sumeducacion) as educacion, sum(f.sumsalud) as salud, sum(f.sumvestido) as vestido, sum(f.sumvivienda) as vivienda "
                + "from factura as f "
                + "where f.idusuario = " + idUsuario + " and f.idlimite = (select idlimite from limitegasto where anio = " + año + ")"
                + ") as a on a.idlimite = lg1.IDLIMITE";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadSQL);
            while (rs.next()) {
                if (rs.getDouble("restoalimentacion") < 0) return true;
                if (rs.getDouble("restoeducacion") < 0) return true;
                if (rs.getDouble("restosalud") < 0) return true;
                if (rs.getDouble("restovestido") < 0) return true;
                if (rs.getDouble("restovivienda") < 0) return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'sobrepasaLimiteGasto' " + e);
        }
        return false;
    }
    
    
}
