/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Presentacion;

import com.amanda.Datos.LimiteGastos;
import com.amanda.Logica.TablaLimiteGasto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Megan
 */
public class frmLimiteGasto extends javax.swing.JDialog {

    String accion;
    int idLimite;
    
    public frmLimiteGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mostrar();
    }
    
    private void mostrar(){
        try {
            DefaultTableModel modelo;
            TablaLimiteGasto tli = new TablaLimiteGasto();
            modelo = tli.mostrar();
            gridLimiteG.setModel(modelo);
            //ocultarColumas();
            jLabel1.setText(Integer.toString(tli.totalregistros));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Poner en tabla' " + e);
        }
    }
    
    private boolean DatosCorrectos(){
        if ("".equals(txtAlimentacion.getText().trim()) || "".equals(txtEducacion.getText().trim()) || "".equals(txtSalud.getText().trim()) || "".equals(txtVestimenta.getText().trim()) || "".equals(txtVivienda.getText().trim())|| "".equals(txtAnio.getText().trim())) return false;  
        if(!validarCajas(txtAlimentacion.getText().trim()))return false;
        if(!validarCajas(txtEducacion.getText().trim()))return false;
        if(!validarCajas(txtSalud.getText().trim()))return false;
        if(!validarCajas(txtVestimenta.getText().trim()))return false;
        if(!validarCajas(txtVivienda.getText().trim()))return false;
        if(!validarCajas(txtAnio.getText().trim()))return false;
        return true;
        
    }
    
    private boolean validarCajas(String cad){
        double d;
         boolean ret = true;
         try{
             d = Double.parseDouble(cad);
             if (d < 0) ret = false;
         }catch(Exception e) {
             ret = false;
         }
         return ret;
    }
    
    private void modificarHabilitacion(boolean estado){
        txtAnio.setEnabled(estado);
        txtAlimentacion.setEnabled(estado);
        txtEducacion.setEnabled(estado);
        txtSalud.setEnabled(estado);
        txtVestimenta.setEnabled(estado);
        txtVivienda.setEnabled(estado);
        cmdGuardar.setEnabled(estado);
        cmdCancelar.setEnabled(estado);
        cmdCrear.setEnabled(!estado);
        cmdEliminar.setEnabled(!estado);
        cmdEditar.setEnabled(!estado);
        gridLimiteG.setVisible(!estado);
    }
    
    private void limpiar(){
        txtAnio.setText("");
        txtAlimentacion.setText("");
        txtEducacion.setText("");
        txtSalud.setText("");
        txtVestimenta.setText("");
        txtVivienda.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridLimiteG = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmdCrear = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAlimentacion = new javax.swing.JTextField();
        txtVestimenta = new javax.swing.JTextField();
        txtEducacion = new javax.swing.JTextField();
        txtVivienda = new javax.swing.JTextField();
        txtSalud = new javax.swing.JTextField();
        cmdGuardar = new javax.swing.JButton();
        txtAnio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        gridLimiteG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gridLimiteG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridLimiteGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridLimiteG);

        jLabel1.setText("0");

        cmdCrear.setText("Nuevo");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });

        cmdEditar.setText("Editar");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        cmdCancelar.setText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCrear)
                    .addComponent(cmdEditar)
                    .addComponent(cmdEliminar)
                    .addComponent(cmdCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        jLabel2.setText("Año:");

        jLabel3.setText("Vestimenta:");

        jLabel4.setText("Alimentación:");

        jLabel6.setText("Educacion:");

        jLabel7.setText("Vivienda:");

        jLabel8.setText("Salud:");

        txtAlimentacion.setEnabled(false);
        txtAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlimentacionActionPerformed(evt);
            }
        });

        txtVestimenta.setEnabled(false);

        txtEducacion.setEnabled(false);

        txtVivienda.setEnabled(false);

        txtSalud.setEnabled(false);

        cmdGuardar.setText("Guardar");
        cmdGuardar.setEnabled(false);
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        txtAnio.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText(" Parámetros de Año Activo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdGuardar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVivienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEducacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVestimenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlimentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(cmdGuardar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        modificarHabilitacion(true);
        accion="nuevo";
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        modificarHabilitacion(true);
        accion="editar";  
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        LimiteGastos dli = new LimiteGastos();
        TablaLimiteGasto tli = new TablaLimiteGasto();

        // CONSULTA Como seleccionar los datos de la tabla presentada en pantalla
        dli.idLimite = idLimite;
        if (tli.eliminar(dli)){
            JOptionPane.showMessageDialog(null, "Parámetros eliminados exitosamente.");
        } else{
            JOptionPane.showMessageDialog(null, "Parámetros no eliminados.");
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        modificarHabilitacion(false);
        limpiar();
        
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlimentacionActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        LimiteGastos dli = new LimiteGastos();
        TablaLimiteGasto tli = new TablaLimiteGasto();
        
        if (!DatosCorrectos()){
            JOptionPane.showMessageDialog(null, "Información incorrecta.");
            return;
        }
        
        switch(accion){
            case "nuevo":
                 dli.anio= Integer.parseInt(txtAnio.getText().trim());
                 dli.alimentacion = Double.parseDouble(txtAlimentacion.getText().trim());
                 dli.vestido= Double.parseDouble(txtVestimenta.getText().trim());
                 dli.educacion= Double.parseDouble(txtEducacion.getText().trim());
                 dli.vivienda= Double.parseDouble(txtVivienda.getText().trim());
                 dli.salud= Double.parseDouble(txtSalud.getText().trim());

                if (tli.insertar(dli)){
                    JOptionPane.showMessageDialog(null, "Registro de parámetros correctamente.");
                } else{
                    JOptionPane.showMessageDialog(null, "Parámetros no registrados.");
                }
                this.limpiar();
                break;
            case "editar":
                dli.idLimite=idLimite;
                dli.anio= Integer.parseInt(txtAnio.getText().trim());
                dli.alimentacion = Double.parseDouble(txtAlimentacion.getText().trim());
                dli.vestido= Double.parseDouble(txtVestimenta.getText().trim());
                dli.educacion= Double.parseDouble(txtEducacion.getText().trim());
                dli.vivienda= Double.parseDouble(txtVivienda.getText().trim());
                dli.salud= Double.parseDouble(txtSalud.getText().trim());
        
                if (tli.editar(dli)){
                    JOptionPane.showMessageDialog(null, "Registro de parámetros correctamente.");
                } else{
                    JOptionPane.showMessageDialog(null, "Parámetros no registrados.");
                }
                limpiar();
                break; 
        }     
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void gridLimiteGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridLimiteGMouseClicked
        int fila = gridLimiteG.rowAtPoint(evt.getPoint());
        idLimite = Integer.parseInt(gridLimiteG.getValueAt(fila, 0).toString());
        txtAnio.setText(gridLimiteG.getValueAt(fila, 1).toString());
        txtAlimentacion.setText(gridLimiteG.getValueAt(fila, 2).toString());
        txtVestimenta.setText(gridLimiteG.getValueAt(fila, 3).toString());
        txtEducacion.setText(gridLimiteG.getValueAt(fila, 4).toString());
        txtVivienda.setText(gridLimiteG.getValueAt(fila, 5).toString());
        txtSalud.setText(gridLimiteG.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_gridLimiteGMouseClicked

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
            java.util.logging.Logger.getLogger(frmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLimiteGasto dialog = new frmLimiteGasto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdEditar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JTable gridLimiteG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlimentacion;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtEducacion;
    private javax.swing.JTextField txtSalud;
    private javax.swing.JTextField txtVestimenta;
    private javax.swing.JTextField txtVivienda;
    // End of variables declaration//GEN-END:variables
}
