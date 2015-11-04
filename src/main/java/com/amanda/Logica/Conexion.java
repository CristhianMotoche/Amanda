package com.amanda.Logica;


import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection con;
    
    public Conexion() {
        con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost/Amanda; create = true; user = amanda; password = amanda");
            con.setSchema("AMANDA");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public Connection obtenerConexion(){ return con; }
    
}