package com.amanda.Logica;

import com.amanda.Datos.Datos;
import com.amanda.Datos.DatosLimiteGasto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TablaLimiteGasto extends Tabla{

    public TablaLimiteGasto() {
        super();
    }

    @Override
    public DefaultTableModel mostrar(){   
        cadSQL = "SELECT * FROM LIMITEGASTO";
        String encabezado[] = {"IdLímite","Año","Alimentación","Educación","Salud","Vestido","Vivienda"};
        String registro[] =new String[7];
        DefaultTableModel ret = new DefaultTableModel(null,encabezado);
        
        try {
            ResultSet rs;
            Statement s = con.createStatement();
            rs=s.executeQuery(cadSQL);

            while(rs.next()){
                registro[0]=rs.getString("IdLimite");
                registro[1]=rs.getString("Anio");
                registro[2]=rs.getString("Alimentacion");
                registro[3]=rs.getString("Educacion");
                registro[4]=rs.getString("Salud");
                registro[5]=rs.getString("Vestido");
                registro[6]=rs.getString("Vivienda");
                totalregistros++;
                ret.addRow(registro);
            }
        } catch (Exception e) { 
            System.out.println(e);
            ret = null; 
        }
        return ret;
    }

    @Override
    public boolean insertar(Datos dts){
        boolean ret = false;
        DatosLimiteGasto dlg = (DatosLimiteGasto)dts;
        cadSQL = "INSERT INTO LIMITEGASTO (ANIO, ALIMENTACION, EDUCACION, SALUD, VESTIDO, VIVIENDA) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(cadSQL);
            ps.setInt(1, dlg.año);
            ps.setDouble(2, dlg.alimentacion);
            ps.setDouble(3, dlg.educacion);
            ps.setDouble(4, dlg.salud);
            ps.setDouble(5, dlg.vestido);
            ps.setDouble(6, dlg.vivienda);
            if (ps.executeUpdate() != 0) ret = true;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error 'Insertar' " + e);
        }
        return ret;
    }

    @Override
    public boolean editar(Datos dts){
        boolean ret = false;
        DatosLimiteGasto dlg = (DatosLimiteGasto)dts;
        cadSQL = "UPDATE LIMITEGASTO SET ANIO=?, ALIMENTACION = ?, EDUCACION = ?, SALUD = ?, VESTIDO = ?, VIVIENDA = ? WHERE IDLIMITE = ?";
        try{
            PreparedStatement ps = con.prepareStatement(cadSQL);
            ps.setInt(1, dlg.año);
            ps.setDouble(2, dlg.alimentacion);
            ps.setDouble(3, dlg.educacion);
            ps.setDouble(4, dlg.salud);
            ps.setDouble(5, dlg.vestido);
            ps.setDouble(6, dlg.vivienda);
            ps.setInt(7, dlg.idLimite);
            if (ps.executeUpdate() != 0) ret = true;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error 'Editar' " + e);
        }
        return ret;
    }

    @Override
    public boolean eliminar(Datos dts){
        DatosLimiteGasto dlg = (DatosLimiteGasto)dts;
        boolean ret = false;
        try {
            cadSQL = "DELETE FROM limitegasto WHERE idlimite = ?";
            PreparedStatement pst = con.prepareStatement(cadSQL);
            pst.setInt(1, dlg.idLimite);
            if (pst.executeUpdate() != 0) ret = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Eliminar' " + e);
        }
        return ret;
    }
    
    public int idLimiteDesdeAño(Datos dts){
        DatosLimiteGasto dlg = (DatosLimiteGasto)dts;
        int ret = -1;
        cadSQL = "select idlimite from limitegasto where anio = " + dlg.año;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadSQL);
            while (rs.next()){
                ret = rs.getInt("idlimite");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Contar' " + e);
        }
        return ret;
    }
    
    /*public boolean obtenerDatosLogin(Datos dts){
        boolean ret = true;
        LimiteGastos du = (LimiteGastos)dts;
        cadSQL = "SELECT * FROM LIMITEGASTO WHERE ANIO = ?";
        try{
            PreparedStatement ps = con.prepareStatement(cadSQL);
            ps.setInt(1, du.anio);
            if (ps.executeUpdate() == 0) ret = false;
        } catch(Exception e){
            ret = false;
        }
        return ret;
    }*/

}