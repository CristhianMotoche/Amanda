/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Logica;

import com.amanda.Datos.Datos;
import com.amanda.Datos.Usuario;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camm
 */
public class TablaUsuario extends Tabla{

    @Override
    public boolean insertar(Datos dts) {
        Usuario user = (Usuario) dts;
        cadSQL = "INSERT INTO USUARIOS (NOMBRE, APELLIDO, CEDULA, CONTRASENA, RESP1"+
                ", RESP2) values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = this.con.preparar(cadSQL);
            pst.setString(1, user.getNombre());
            pst.setString(2, user.getApellido());
            pst.setString(3, user.getCedula());
            pst.setString(4, user.getContrasena());
            pst.setString(5, user.getResp1());
            pst.setString(6, user.getResp2());

            int n = pst.executeUpdate();

            return (n != 0);
        } catch (Exception e) {
            System.err.println("Error al intentar insertar!\n" + e);
            return false;
        }
    }


    @Override
    public boolean eliminar(Datos dts) {
        return true;
    }

    @Override
    public DefaultTableModel mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(Datos dts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
