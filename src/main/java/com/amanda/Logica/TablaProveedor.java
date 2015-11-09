/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Logica;

import com.amanda.Datos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class TablaProveedor extends Tabla {

    @Override
    public DefaultTableModel mostrar() {
        String cabecera[] = {"idProveedor", "idUsuario", "RUC", "Razón Social", "Dirección", "Teléfono"};
        String registro[] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, cabecera);
        totalregistros = 0;
        cadSQL = "select * from PROVEEDOR";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadSQL);
            while (rs.next()) {

                registro[0] = rs.getString("idProveedor");
                registro[1] = rs.getString("idUsuario");
                registro[2] = rs.getString("ruc");
                registro[3] = rs.getString("RazonSocial");
                registro[4] = rs.getString("Direccion");
                registro[5] = rs.getString("Telefono");
                totalregistros++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Mostrar' " + e);
        }
        return modelo;
    }

    public DefaultTableModel miniMostrar(String busqueda, String tipo) {
        String cabecera[] = {"idProveedor", "RUC", "Razón Social"};
        String registro[] = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, cabecera);
        totalregistros = 0;
        cadSQL = "select idproveedor, ruc, razonsocial from PROVEEDOR";
        if (!busqueda.equals("")) {
            switch (tipo) {
                case "ruc":
                    cadSQL = cadSQL + " where ruc = '" + busqueda + "'";
                    break;
                case "id":
                    cadSQL = cadSQL + " where idproveedor = " + busqueda;
                    break;
            }
        }
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadSQL);
            while (rs.next()) {

                registro[0] = rs.getString("idProveedor");
                registro[1] = rs.getString("ruc");
                registro[2] = rs.getString("RazonSocial");
                totalregistros++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Mini mostrar' " + e);
        }
        return modelo;
    }

    @Override
    public boolean insertar(Datos dts) {
        DatosProveedor dp = (DatosProveedor) dts;
        boolean ret = false;
        try {
            cadSQL = "INSERT INTO PROVEEDOR (IDUSUARIO, RUC, RAZONSOCIAL, DIRECCION, TELEFONO) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(cadSQL);
            pst.setInt(1, dp.IdUsuario);
            pst.setString(2, dp.Ruc);
            pst.setString(3, dp.RazonSocial);
            pst.setString(4, dp.Direccion);
            pst.setString(5, dp.Telefono);

            if (pst.executeUpdate() != 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Insertar' " + e);
        }
        return ret;
    }

    @Override
    public boolean editar(Datos dts) {
        DatosProveedor dp = (DatosProveedor) dts;
        boolean ret = false;
        try {
            cadSQL = "UPDATE PROVEEDOR SET IDUSUARIO=?, RUC=?, RAZONSOCIAL=?, DIRECCION=?, TELEFONO=? WHERE IDPROVEEDOR=?";
            PreparedStatement pst = con.prepareStatement(cadSQL);

            pst.setInt(1, dp.IdUsuario);
            pst.setString(2, dp.Ruc);
            pst.setString(3, dp.RazonSocial);
            pst.setString(4, dp.Direccion);
            pst.setString(5, dp.Telefono);
            pst.setInt(6, dp.IdProveedor);
            if (pst.executeUpdate() != 0) {
                ret = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Insertar' " + e);
        }
        return ret;
    }

    @Override
    public boolean eliminar(Datos dts) {
        DatosProveedor dp = (DatosProveedor) dts;
        boolean ret = false;

        try {
            cadSQL = "DELETE FROM PROVEEDOR WHERE IDPROVEEDOR = ?";
            PreparedStatement pst = con.prepareStatement(cadSQL);
            pst.setInt(1, dp.IdProveedor);
            if (pst.executeUpdate() != 0) {
                ret = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Eliminar' " + e);
        }

        return ret;
    }
}
