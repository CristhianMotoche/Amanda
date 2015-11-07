/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Logica;

import com.amanda.Datos.Datos;
import com.amanda.Datos.Usuario;
import com.amanda.Utilidades.Cifrador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camm
 */
public class TablaUsuario extends Tabla{

    @Override
    public boolean insertar(Datos dts) {
        Usuario user = (Usuario) dts;
        cadSQL = "INSERT INTO USUARIO (NOMBRE, APELLIDO, CI, CONTRASENA, RESPUESTA1"
                + ", RESPUESTA2, PREGUNTA1, PREGUNTA2) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = this.con.prepareStatement(cadSQL);
            pst.setString(1, user.getNombre());
            pst.setString(2, user.getApellido());
            pst.setString(3, user.getCedula());
            pst.setString(4, user.getContrasena());
            pst.setString(5, user.getResp1());
            pst.setString(6, user.getResp2());
            pst.setInt(7, user.getPreg1());
            pst.setInt(8, user.getPreg2());

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
        boolean ret = true;
        Usuario usuario = (Usuario) dts;
        cadSQL = "UPDATE USUARIO SET NOMBRE = ?, APELLIDO = ?, CONTRASENA = ? "
                + ", PREGUNTA1 = ?, PREGUNTA2 = ?, RESPUESTA1 = ?, RESPUESTA2 = ?"
                + "WHERE CI LIKE \'" + usuario.getCedula() + "\'";
        try{
            PreparedStatement ps = con.prepareStatement(cadSQL);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getContrasena());
            ps.setInt(4, usuario.getPreg1());
            ps.setInt(5, usuario.getPreg2());
            ps.setString(6, usuario.getResp1());
            ps.setString(7, usuario.getResp2());
            if (ps.executeUpdate() == 0)
                ret = false;
        } catch(Exception e){
            System.err.println("Error al editar! \n" + e);
            ret = false;
        }
        return ret;
    }

    public Usuario buscarPorCedula(String cedula){
        Usuario usuario = new Usuario();
        cadSQL = "SELECT * FROM USUARIO "
               + "WHERE CI LIKE \'" + cedula + "\'";
        try {
            Statement sentencia = con.createStatement();
            ResultSet resultado = sentencia.executeQuery(cadSQL);

            while (resultado.next()) {
                usuario.setCedula(resultado.getString("CI"));
                usuario.setNombre(resultado.getString("NOMBRE"));
                usuario.setApellido(resultado.getString("APELLIDO"));
                usuario.setContrasena(resultado.getString("CONTRASENA"));
                usuario.setPreg1(resultado.getInt("PREGUNTA1"));
                usuario.setPreg2(resultado.getInt("PREGUNTA2"));
                usuario.setResp1(resultado.getString("RESPUESTA1"));
                usuario.setResp2(resultado.getString("RESPUESTA2"));
            }
            return usuario;
        } catch (Exception e) {
            System.err.println("Error en la búsqueda por cédula!\n" + e);
            return null;
        }
    }

    public void modificarContrasena(Usuario user, String contrasena) {
        Cifrador cifrador = new Cifrador();
        user.setContrasena(cifrador.md5(contrasena.concat(contrasena)));
        editar(user);
    }
}
