/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Presentacion;

import com.amanda.Datos.DatosLimiteGasto;
import com.amanda.Datos.DatosUsuario;
import com.amanda.Logica.ConsultaAleatoria;
import com.amanda.Logica.TablaLimiteGasto;
import java.awt.Image;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;


/**
 *
 * @author patricia
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {
    private DatosUsuario usr;
    private int añoActivo;
    public FrmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        Calendar fecha = Calendar.getInstance();
        añoActivo = fecha.get(Calendar.YEAR);
    }
    
    public void setUsuario(DatosUsuario Usuario){
        this.usr = Usuario;
        lblNombreUsuario.setText("Ha iniciado sesión como " + Usuario.getNombre() + ".");
    }
    
    public void calcularEstadoAnual() {
        lblAñoActivo.setText("Año activo: " + Integer.toString(añoActivo));
        DatosLimiteGasto dlg = new DatosLimiteGasto();
        dlg.año = añoActivo;
        int ret = (new TablaLimiteGasto()).idLimiteDesdeAño(dlg);
        switch (ret) {
            case -1:
                lblMensajeAño.setText("No ha registrado los límetes de gasto para el año " + añoActivo + ".");
                break;
            default:
                if (new ConsultaAleatoria().sobrepasaLimiteGasto(usr.getIdUsuario(), añoActivo)){
                    lblMensajeAño.setText("Usted ha sobrepasado los límites de gasto para el año " + añoActivo + ".");
                } else {
                    lblMensajeAño.setText("Usted está dentro de los límites de gasto para el año " + añoActivo + ".");
                }
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreUsuario = new javax.swing.JLabel();
        lblAñoActivo = new javax.swing.JLabel();
        lblMensajeAño = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuProveedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuFacturas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        mnuAñoActivo = new javax.swing.JMenuItem();
        mnuLimiteGasto = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amanda");
        setResizable(false);

        lblNombreUsuario.setText("Ha iniciado sesión como [tú].");
        lblNombreUsuario.setName("lblBienvenido"); // NOI18N

        lblAñoActivo.setText("Año Activo:");
        lblAñoActivo.setName("lblAnioActivo"); // NOI18N

        lblMensajeAño.setText("[mesaje año activo]");
        lblMensajeAño.setName("lblAnioActivo"); // NOI18N

        jMenu1.setText("Proveedores");
        jMenu1.setName("jProveedor"); // NOI18N

        mnuProveedor.setText("Consultar");
        mnuProveedor.setName("jProvConsulta"); // NOI18N
        mnuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProveedorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuProveedor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Facturas");
        jMenu2.setName("jFacturas"); // NOI18N

        mnuFacturas.setText("Consultar");
        mnuFacturas.setName("jFactConsulta"); // NOI18N
        mnuFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFacturasActionPerformed(evt);
            }
        });
        jMenu2.add(mnuFacturas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");
        jMenu3.setName("jReportes"); // NOI18N

        jMenuItem3.setText("Reporte por Año Activo");
        jMenuItem3.setName("JReporteAnio"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Reporte por Proveedor");
        jMenuItem4.setName("jReporteProv"); // NOI18N
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ingresos");
        jMenu4.setName("jIngresos"); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Configuración");
        jMenu5.setName("jConfiguracion"); // NOI18N

        jMenu7.setText("Sistema");
        jMenu7.setName("JConSistema"); // NOI18N

        mnuAñoActivo.setText("Año Activo");
        mnuAñoActivo.setName("jAnioActivo"); // NOI18N
        mnuAñoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAñoActivoActionPerformed(evt);
            }
        });
        jMenu7.add(mnuAñoActivo);

        mnuLimiteGasto.setText("Límite de Gastos");
        mnuLimiteGasto.setName("jLimiteGasto"); // NOI18N
        mnuLimiteGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLimiteGastoActionPerformed(evt);
            }
        });
        jMenu7.add(mnuLimiteGasto);

        jMenu5.add(jMenu7);

        jMenu8.setText("Usuario");
        jMenu8.setName("jConfUsuario"); // NOI18N

        jMenuItem8.setText("Editar");
        jMenuItem8.setName("jEditar"); // NOI18N
        jMenu8.add(jMenuItem8);

        jMenuItem9.setText("Eliminar");
        jMenuItem9.setName("jEliminar"); // NOI18N
        jMenu8.add(jMenuItem9);

        jMenu5.add(jMenu8);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ayuda");
        jMenu6.setName("jAyuda"); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblAñoActivo)
                    .addComponent(lblMensajeAño))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAñoActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeAño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(lblNombreUsuario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFacturasActionPerformed
        FrmFactura facturas = new FrmFactura(this, true);
        facturas.setIdUsuario(usr.getIdUsuario());
        facturas.mostrar();
        facturas.setVisible(true);
        calcularEstadoAnual();
    }//GEN-LAST:event_mnuFacturasActionPerformed

    private void mnuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProveedorActionPerformed
        FrmProveedor proveedor = new FrmProveedor(this, true);
        proveedor.setIdUsuario(usr.getIdUsuario());
        proveedor.setVisible(true);
    }//GEN-LAST:event_mnuProveedorActionPerformed

    private void mnuLimiteGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLimiteGastoActionPerformed
        FrmLimiteGasto limiteGasto = new FrmLimiteGasto(this, true);
        limiteGasto.setVisible(true);
        calcularEstadoAnual();
    }//GEN-LAST:event_mnuLimiteGastoActionPerformed

    private void mnuAñoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAñoActivoActionPerformed
        FrmAñoActivo configAñoActivo = new FrmAñoActivo(this, true);
        configAñoActivo.setAñoActivo(añoActivo);
        configAñoActivo.setVisible(true);
        if (configAñoActivo.getAñoActivo() != añoActivo){
            añoActivo = configAñoActivo.getAñoActivo();
            calcularEstadoAnual();
        }
    }//GEN-LAST:event_mnuAñoActivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblAñoActivo;
    private javax.swing.JLabel lblMensajeAño;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JMenuItem mnuAñoActivo;
    private javax.swing.JMenuItem mnuFacturas;
    private javax.swing.JMenuItem mnuLimiteGasto;
    private javax.swing.JMenuItem mnuProveedor;
    // End of variables declaration//GEN-END:variables
}
