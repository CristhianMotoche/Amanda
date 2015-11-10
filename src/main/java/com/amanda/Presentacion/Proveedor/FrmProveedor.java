package com.amanda.Presentacion.Proveedor;

import com.amanda.Datos.*;
import com.amanda.Logica.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmProveedor extends javax.swing.JDialog {
    private String accion;
    private int idProveedor, idUsuarioRegistro, idUsuario;
    
    public FrmProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        mostrar();
        idUsuario = -1;
        idProveedor = -1;
        idUsuarioRegistro = -1;
    }
    
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    
    private void mostrar(){
        try {
            DefaultTableModel modelo;
            TablaProveedor tp = new TablaProveedor();
            modelo = tp.mostrar();
            gridProveedores.setModel(modelo);
            ocultarColumnas();
            lblTotalRegs.setText("Total de registros:" +  Integer.toString(tp.totalregistros));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Poner en tabla' " + e);
        }
    }
    
    private void ocultarColumnas(){
        for(int i = 0; i < 2; i++){
            gridProveedores.getColumnModel().getColumn(i).setMaxWidth(0);
            gridProveedores.getColumnModel().getColumn(i).setMinWidth(0);
            gridProveedores.getColumnModel().getColumn(i).setPreferredWidth(0);
        }
    }
    
    private void habilitarModificacion(boolean estado){
         cmdNuevo.setEnabled(!estado);
         cmdGuardar.setEnabled(estado);
         cmdCancelar.setEnabled(estado);
         cmdEditar.setEnabled(!estado);
         cmdEliminar.setEnabled(!estado);
         gridProveedores.setVisible(!estado);
         txtRUC.setEnabled(estado);
         txtRSocial.setEnabled(estado);
         txtDireccion.setEnabled(estado);
         txtTelefono.setEnabled(estado);
    }
    
    private void limpiar() {
        txtRUC.setText("");
        txtRSocial.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        idUsuarioRegistro = -1;
        idProveedor = -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdNuevo = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        lblTotalRegs = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        txtRSocial = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        cmdNuevo.setText("Nuevo");
        cmdNuevo.setName("cmdNuevo"); // NOI18N
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        cmdEditar.setText("Editar");
        cmdEditar.setName("cmdEditar"); // NOI18N
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        cmdEliminar.setText("Eliminar");
        cmdEliminar.setName("cmdEliminar"); // NOI18N
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        cmdGuardar.setText("Guardar");
        cmdGuardar.setEnabled(false);
        cmdGuardar.setName("cmdGuardar"); // NOI18N
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        cmdCancelar.setText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.setName("cmdCancelar"); // NOI18N
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        lblTotalRegs.setText("Total de registros: 0");

        txtRUC.setEnabled(false);
        txtRUC.setName("txfRUC"); // NOI18N

        txtRSocial.setEnabled(false);
        txtRSocial.setName("txfRazon"); // NOI18N

        txtTelefono.setEnabled(false);
        txtTelefono.setName("txfTelefono"); // NOI18N

        txtDireccion.setEnabled(false);
        txtDireccion.setName("txfDireccion"); // NOI18N

        jLabel1.setText("RUC:");

        jLabel2.setText("Razón social:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Teléfono:");

        gridProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        gridProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridProveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(gridProveedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCancelar)
                        .addGap(70, 70, 70)
                        .addComponent(cmdEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotalRegs)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdGuardar)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdEditar)
                    .addComponent(cmdEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 139, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        limpiar();
        accion = "nuevo";
        habilitarModificacion(true);
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        DatosProveedor dp = new DatosProveedor();
        TablaProveedor tp = new TablaProveedor();
        dp.IdProveedor = idProveedor;
        dp.IdUsuario = idUsuario;
        dp.Ruc = txtRUC.getText().trim();
        dp.RazonSocial = txtRSocial.getText().trim();
        dp.Direccion = txtDireccion.getText().trim();
        dp.Telefono = txtTelefono.getText().trim();
        boolean resultado = false;
        switch(accion){
            case "nuevo":
                resultado = tp.insertar(dp);
            break;
            case "editar":
                resultado = tp.editar(dp);
            break;
        }
        if(resultado) {
            JOptionPane.showMessageDialog(null, "Operación completada");
            habilitarModificacion(false);
            limpiar();
            mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "Error. La operación no ha podido ser ejecutada");
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        habilitarModificacion(false);
        limpiar();
        accion = "";
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        if (idProveedor != -1){
        accion = "editar";
        habilitarModificacion(true);
        txtRUC.setEnabled(false);
        }
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        if (idProveedor != -1){
            if (idUsuario == idUsuarioRegistro) {
                DatosFactura df = new DatosFactura();
                TablaFactura tf = new TablaFactura();
                df.IdProveedor = idProveedor;
                //df.IdUsuario = idUsuario;
                if (tf.contarFacturasProveedor(df) == 0) {
                    if (JOptionPane.showConfirmDialog(rootPane, "¿Seguro de eliminar?", "Confirmar", 2) == 0) {
                        DatosProveedor dp = new DatosProveedor();
                        TablaProveedor tp = new TablaProveedor();
                        dp.IdProveedor = idProveedor;
                        if (tp.eliminar(dp)) {
                            JOptionPane.showMessageDialog(null, "Operación completada");
                            mostrar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error. La operación no ha podido ser ejecutada");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error. Hay usuarios que regisran facturas de este proveedor");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usted no puede eliminar este registro");
            }
        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void gridProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridProveedoresMouseClicked
        int fila = gridProveedores.rowAtPoint(evt.getPoint());
        idProveedor = Integer.parseInt(gridProveedores.getValueAt(fila, 0).toString());
        idUsuarioRegistro = Integer.parseInt(gridProveedores.getValueAt(fila, 1).toString()); //comentr esta línea posteriormente
        txtRUC.setText(gridProveedores.getValueAt(fila, 2).toString());
        txtRSocial.setText(gridProveedores.getValueAt(fila, 3).toString());
        txtDireccion.setText(gridProveedores.getValueAt(fila, 4).toString());
        txtTelefono.setText(gridProveedores.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_gridProveedoresMouseClicked

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
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmProveedor dialog = new FrmProveedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdEditar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JTable gridProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotalRegs;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRSocial;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
