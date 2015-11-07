package com.amanda.Logica;

import com.amanda.Datos.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TablaFactura extends Tabla {
       
    @Override
    public DefaultTableModel mostrar(){
        String cabecera[] = {"IdFactura", "IdUsuario", "IdProveedor", "IdLimite", "Número", "Fecha", "Alimentación", "Educación", "Salud", "Vestido", "Vivienda", "Otros", "Gasto de negocio", "Total sin IVA", "IVA", "Total"};
        String registro[] = new String[16];
        DefaultTableModel modelo = new DefaultTableModel(null, cabecera);
        totalregistros = 0;
        cadSQL = "select * from factura";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadSQL);
            while (rs.next()){
                registro[0] = rs.getString("IdFactura");
                registro[1] = rs.getString("IdUsuario");
                registro[2] = rs.getString("IdProveedor");
                registro[3] = rs.getString("IdLimite");
                registro[4] = rs.getString("numero");
                registro[5] = rs.getString("fecha");
                registro[6] = rs.getString("sumalimentacion");
                registro[7] = rs.getString("sumeducacion");
                registro[8] = rs.getString("sumsalud");
                registro[9] = rs.getString("sumvestido");
                registro[10] = rs.getString("sumvivienda");
                registro[11] = rs.getString("sumotros");
                registro[12] = rs.getString("sumgastosdenegocio");
                registro[13] = rs.getString("totalsiniva");
                registro[14] = rs.getString("iva");
                registro[15] = rs.getString("total");
                totalregistros++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Mostrar' " + e);
        }
        return modelo;
    }
    
    @Override
    public boolean insertar(Datos dts){
        DatosFactura df = (DatosFactura)dts;
        boolean ret = false;
        try {
            cadSQL = "INSERT INTO FACTURA (IDUSUARIO, IDPROVEEDOR, IDLIMITE, NUMERO, FECHA, SUMALIMENTACION, SUMEDUCACION, SUMSALUD, SUMVESTIDO, SUMVIVIENDA, SUMOTROS, SUMGASTOSDENEGOCIO, TOTALSINIVA, IVA, TOTAL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(cadSQL);
            pst.setInt(1, df.IdUsuario);
            pst.setInt(2, df.IdProveedor);
            pst.setInt(3, df.IdLimite);
            pst.setString(4, df.Numero);
            pst.setDate(5, df.Fecha);
            pst.setDouble(6, df.SumAlimentacion);
            pst.setDouble(7, df.SumEducacion);
            pst.setDouble(8, df.SumSalud);
            pst.setDouble(9, df.SumVestido);
            pst.setDouble(10, df.SumVivienda);
            pst.setDouble(11, df.SumOtros);
            pst.setDouble(12, df.SumGastosNegocio);
            pst.setDouble(13, df.TotalSinIVA);
            pst.setDouble(14, df.IVA);
            pst.setDouble(15, df.Total);
            if (pst.executeUpdate()!= 0) ret = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Insertar' " + e);
        }
        return ret;
    }
    
    @Override
    public boolean editar(Datos dts){
        DatosFactura df = (DatosFactura)dts;
        boolean ret = false;
        try {
            cadSQL = "UPDATE FACTURA SET IDUSUARIO = ?, IDPROVEEDOR = ?, IDLIMITE = ?, NUMERO = ?, FECHA = ?, SUMALIMENTACION = ?, SUMEDUCACION = ?, SUMSALUD = ?, SUMVESTIDO = ?, SUMVIVIENDA = ?, SUMOTROS = ?, SUMGASTOSDENEGOCIO = ?, TOTALSINIVA = ?, IVA = ?, TOTAL = ? WHERE IDFACTURA = ?";
            PreparedStatement pst = con.prepareStatement(cadSQL);
            pst.setInt(1, df.IdUsuario);
            pst.setInt(2, df.IdProveedor);
            pst.setInt(3, df.IdLimite);
            pst.setString(4, df.Numero);
            pst.setDate(5, df.Fecha);
            pst.setDouble(6, df.SumAlimentacion);
            pst.setDouble(7, df.SumEducacion);
            pst.setDouble(8, df.SumSalud);
            pst.setDouble(9, df.SumVestido);
            pst.setDouble(10, df.SumVivienda);
            pst.setDouble(11, df.SumOtros);
            pst.setDouble(12, df.SumGastosNegocio);
            pst.setDouble(13, df.TotalSinIVA);
            pst.setDouble(14, df.IVA);
            pst.setDouble(15, df.Total);
            pst.setInt(16, df.IdFactura);
            if (pst.executeUpdate()!= 0) ret = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Editar' " + e);
        }
        return ret;
    }
    
    @Override
    public boolean eliminar(Datos dts){
        DatosFactura df = (DatosFactura)dts;
        boolean ret = false;
        try {
            cadSQL = "DELETE FROM FACTURA WHERE IDFACTURA = ?";
            PreparedStatement pst = con.prepareStatement(cadSQL);
            pst.setInt(1, df.IdFactura);
            if (pst.executeUpdate()!= 0) ret = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Eliminar' " + e);
        }
        return ret;
    }
    
    public int contarFacturasProveedor(Datos dts){
        DatosFactura df = (DatosFactura)dts;
        int ret = -1;
        cadSQL = "select count(idfactura) as idproveedor from factura where idproveedor = " + df.IdProveedor;// + " and idusuario <> " + df.IdUsuario;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadSQL);
            while (rs.next()){
                ret = rs.getInt("idproveedor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Mostrar' " + e);
        }
        return ret;
    }
    
    /*public boolean eliminarPorIdLimite(Datos dts){
        DatosLimiteGasto dlg = (DatosLimiteGasto)dts;
        boolean ret = false;
        try {
            CadSQL = "DELETE FROM FACTURA WHERE idLimite = ?";
            PreparedStatement pst = cn.prepareStatement(CadSQL);
            pst.setInt(1, dlg.idLimite);
            if (pst.executeUpdate()!= 0) ret = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Eliminar' " + e);
        }
        return ret;
    }*/
}
