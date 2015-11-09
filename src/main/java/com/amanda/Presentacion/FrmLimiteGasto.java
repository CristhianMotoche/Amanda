/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Presentacion;

import com.amanda.Datos.DatosFactura;
import com.amanda.Datos.DatosLimiteGasto;
import com.amanda.Logica.TablaFactura;
import com.amanda.Logica.TablaLimiteGasto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Megan
 */
public class FrmLimiteGasto extends javax.swing.JDialog {

    String accion;
    int idLimite;
    
    public FrmLimiteGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.mostrar();
        idLimite = -1;
    }
    
    private void mostrar(){
        try {
            DefaultTableModel modelo;
            TablaLimiteGasto tli = new TablaLimiteGasto();
            modelo = tli.mostrar();
            gridLimiteG.setModel(modelo);
            ocultarColumnas();
            lblTotalRegs.setText("Total de registros: " + Integer.toString(tli.totalregistros));
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
    
    private void ocultarColumnas(){
        for(int i = 0; i < 1; i++){
            gridLimiteG.getColumnModel().getColumn(i).setMaxWidth(0);
            gridLimiteG.getColumnModel().getColumn(i).setMinWidth(0);
            gridLimiteG.getColumnModel().getColumn(i).setPreferredWidth(0);
        }
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
    
    private void habilitarModificacion(boolean estado){
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
        idLimite = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdCrear = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        txtAlimentacion = new javax.swing.JTextField();
        txtVestimenta = new javax.swing.JTextField();
        txtEducacion = new javax.swing.JTextField();
        txtVivienda = new javax.swing.JTextField();
        txtSalud = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridLimiteG = new javax.swing.JTable();
        cmdEliminar = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        lblTotalRegs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Límite de gastos");
        setResizable(false);

        cmdCrear.setText("Nuevo");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });

        cmdGuardar.setText("Guardar");
        cmdGuardar.setEnabled(false);
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        cmdCancelar.setText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Año:");

        jLabel4.setText("Alimentación:");

        jLabel3.setText("Vestimenta:");

        jLabel6.setText("Educacion:");

        jLabel7.setText("Vivienda:");

        jLabel8.setText("Salud:");

        txtAnio.setEnabled(false);

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

        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        cmdEditar.setText("Editar");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        lblTotalRegs.setText("Total de registros: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(43, 43, 43)
                        .addComponent(txtSalud))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVestimenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(txtAlimentacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(txtVivienda)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalRegs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCrear)
                    .addComponent(cmdGuardar)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdEditar)
                    .addComponent(cmdEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        limpiar();
        habilitarModificacion(true);
        accion = "nuevo";    
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        if (idLimite != -1) {
            habilitarModificacion(true);
            accion = "editar";  
            txtAnio.setEnabled(false);
        }
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        if (idLimite != -1) {
            if (JOptionPane.showConfirmDialog(rootPane, "¿Seguro de eliminar?", "Confirmar", 2) == 0){
                TablaFactura tf = new TablaFactura();
                DatosFactura df = new DatosFactura();
                df.IdLimite = idLimite;
                if (tf.contarFacturasPorLimiteDeGasto(df) == 0) {
                    DatosLimiteGasto dlg = new DatosLimiteGasto();
                    TablaLimiteGasto tlg = new TablaLimiteGasto();
                    dlg.idLimite = idLimite;
                    if (tlg.eliminar(dlg)) {
                        JOptionPane.showMessageDialog(null, "Operación completada");
                        limpiar();
                        mostrar();
                    } else {
                        JOptionPane.showMessageDialog(null, "La operación no ha podido ser completada");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No es posible eliminar este registro.");
                }
            }
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        habilitarModificacion(false);
        limpiar();
        
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void txtAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlimentacionActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        if (!DatosCorrectos()) {
            JOptionPane.showMessageDialog(null, "Información incorrecta.");
            return;
        }
        DatosLimiteGasto dlg = new DatosLimiteGasto();
        TablaLimiteGasto tlg = new TablaLimiteGasto();
        dlg.idLimite = idLimite;
        dlg.año = Integer.parseInt(txtAnio.getText().trim());
        dlg.alimentacion = Double.parseDouble(txtAlimentacion.getText().trim());
        dlg.vestido = Double.parseDouble(txtVestimenta.getText().trim());
        dlg.educacion = Double.parseDouble(txtEducacion.getText().trim());
        dlg.vivienda = Double.parseDouble(txtVivienda.getText().trim());
        dlg.salud = Double.parseDouble(txtSalud.getText().trim());
        boolean resultado = false;
        switch (accion) {
            case "nuevo":
                resultado = tlg.insertar(dlg);
                break;
            case "editar":
                resultado = tlg.editar(dlg);
                break;
        }   
        if (resultado){
            JOptionPane.showMessageDialog(null, "Operación completada");
            habilitarModificacion(false);
            limpiar();
            mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "Error. La operación no ha podido ser ejecutada");
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
            java.util.logging.Logger.getLogger(FrmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLimiteGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmLimiteGasto dialog = new FrmLimiteGasto(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalRegs;
    private javax.swing.JTextField txtAlimentacion;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtEducacion;
    private javax.swing.JTextField txtSalud;
    private javax.swing.JTextField txtVestimenta;
    private javax.swing.JTextField txtVivienda;
    // End of variables declaration//GEN-END:variables
}
