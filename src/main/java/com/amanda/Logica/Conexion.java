/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Logica;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author camm
 */
public class Conexion {
    private Connection con;
    private String user = "amanda";
    private String pass = "amanda";
    private String url = "jdbc:derby://localhost/Amanda";

    public Conexion() {
        con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(url, user, pass);
            con.setSchema("AMANDA");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public Statement Crear(){
        try {
            return con.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    public PreparedStatement preparar(String CadSQL){
        try {
            return con.prepareStatement(CadSQL);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }

    public boolean Cerrar(){
        boolean ret = true;
        try {
            con.close();
        } catch (SQLException ex) {
            ret = false;
            JOptionPane.showMessageDialog(null, ex);
        }
        return ret;
    }
}
