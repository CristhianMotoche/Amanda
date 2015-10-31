/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Logica;

import com.amanda.Datos.Datos;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camm
 */
public abstract class Tabla {
    public abstract boolean insertar(Datos dts);
    public abstract boolean actualizar(Datos dts);
    public abstract DefaultTableModel mostrar(Datos dts);
    public abstract boolean eliminar(Datos dts);
}
