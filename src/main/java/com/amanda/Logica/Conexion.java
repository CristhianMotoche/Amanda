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
    private String bd = "Amanda";
    private String url = "jdbc:derby://localhost/Amanda" + bd;
    
    public Conexion() {
        con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(url, user, pass);
            con.setSchema("Amanda");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
