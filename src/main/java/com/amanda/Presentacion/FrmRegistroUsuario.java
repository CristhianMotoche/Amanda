/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Presentacion;

import com.amanda.Datos.Usuario;
import com.amanda.Logica.TablaUsuario;
import com.amanda.Utilidades.Cifrador;
import com.amanda.Utilidades.Validador;
import javax.swing.JOptionPane;

/**
 *
 * @author camm
 */
public class FrmRegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistroUsuario
     */
    public FrmRegistroUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistro = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblPregunta1 = new javax.swing.JLabel();
        lblResp1 = new javax.swing.JLabel();
        lblPregunta2 = new javax.swing.JLabel();
        lblConfirmacion = new javax.swing.JLabel();
        lblResp2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        passContrasena = new javax.swing.JPasswordField();
        passConfirmacion = new javax.swing.JPasswordField();
        txtResp1 = new javax.swing.JTextField();
        cmbPregunta1 = new javax.swing.JComboBox();
        cmbPregunta2 = new javax.swing.JComboBox();
        txtResp2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Usuario"));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblCedula.setText("Cédula Identidad:");

        lblContrasena.setText("Contraseña:");

        lblPregunta1.setText("Pregunta 1:");

        lblResp1.setText("Respuesta 1:");

        lblPregunta2.setText("Pregunta 2:");

        lblConfirmacion.setText("Confirmación:");

        lblResp2.setText("Respuesta 2:");

        passContrasena.setText("jPasswordField1");

        passConfirmacion.setText("jPasswordField2");

        cmbPregunta1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "¿Cuál es tu película favorita?", "¿Nombre de tu primera mascota?", "¿Cumpleaños de tu mamá?", "¿Cuál es tu libro preferido?" }));

        cmbPregunta2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "¿Cuál es tu película favorita?", "¿Nombre de tu primera mascota?", "¿Cumpleaños de tu mamá?", "¿Cuál es tu libro preferido" }));

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido)
                            .addComponent(lblCedula)
                            .addComponent(lblContrasena)
                            .addComponent(lblConfirmacion)
                            .addComponent(lblResp1)
                            .addComponent(lblPregunta1))
                        .addGap(25, 25, 25)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPregunta1, 0, 1, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtCedula)
                            .addComponent(passContrasena)
                            .addComponent(passConfirmacion)
                            .addComponent(txtResp1)))
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResp2)
                            .addComponent(lblPregunta2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(58, 58, 58)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResp2)
                            .addComponent(cmbPregunta2, 0, 1, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnGuardar)
                .addGap(45, 45, 45)
                .addComponent(btnCancelar)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena)
                    .addComponent(passContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmacion)
                    .addComponent(passConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPregunta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResp1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPregunta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResp2)
                    .addComponent(txtResp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (camposValidos()) {
            ingresarNuevoUsuario();
        } else {
            JOptionPane.showMessageDialog(this, "Error en el ingreso de datos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbPregunta1;
    private javax.swing.JComboBox cmbPregunta2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblConfirmacion;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPregunta1;
    private javax.swing.JLabel lblPregunta2;
    private javax.swing.JLabel lblResp1;
    private javax.swing.JLabel lblResp2;
    private javax.swing.JPasswordField passConfirmacion;
    private javax.swing.JPasswordField passContrasena;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtResp1;
    private javax.swing.JTextField txtResp2;
    // End of variables declaration//GEN-END:variables

    private void ingresarNuevoUsuario() {
        Usuario user = new Usuario();
        Cifrador cifrador = new Cifrador();

        user.setNombre(this.txtNombre.getText().trim());
        user.setApellido(this.txtApellido.getText().trim());
        user.setContrasena(cifrador
                .md5((new String(this.passContrasena.getPassword()))
                .concat(this.txtCedula.getText())));
        user.setCedula(this.txtCedula.getText().trim());
        user.setPreg1(this.cmbPregunta1.getSelectedIndex());
        user.setPreg2(this.cmbPregunta2.getSelectedIndex());
        user.setResp1(this.txtResp1.getText().trim());
        user.setResp2(this.txtResp2.getText().trim());

        TablaUsuario tablaUsuario = new TablaUsuario();
        if (tablaUsuario.buscarPorCedula(user.getCedula()).getCedula() == null) {
            if (tablaUsuario.insertar(user)) {
                JOptionPane.showMessageDialog(this, "Ingreso con éxito");
            } else {
                JOptionPane.showMessageDialog(this, "Error al insertar");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "El usuario ya se encuentra registrado");
        }

    }

    private boolean camposValidos() {
        Validador validador = new Validador();
        String contrasena = new String(this.passContrasena.getPassword());
        String confirmacion = new String(this.passConfirmacion.getPassword());

        return validador.cedulaValida(this.txtCedula.getText())
                && validador.contrasenaValida(contrasena)
                && confirmacion.equals(contrasena);
    }
}
