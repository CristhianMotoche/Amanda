/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amanda.Presentacion.Usuario;

import com.amanda.Datos.DatosUsuario;
import com.amanda.Logica.TablaUsuario;
import com.amanda.Utilidades.Cifrador;
import com.amanda.Utilidades.Validador;
import javax.swing.JOptionPane;

/**
 *
 * @author camm
 */
public class FrmEditarInformacionUsuario extends javax.swing.JDialog {

    private TablaUsuario tablaUsuario = new TablaUsuario();
    private DatosUsuario usuario;
    /**
     * Creates new form Dialog
     */
    public FrmEditarInformacionUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        pnlEdicionInformacion = new javax.swing.JPanel();
        lblContrasena = new javax.swing.JLabel();
        lblNuevaContra = new javax.swing.JLabel();
        lblConfirmacion = new javax.swing.JLabel();
        passContrasena = new javax.swing.JPasswordField();
        pssNuevaContra = new javax.swing.JPasswordField();
        passConfirmacion = new javax.swing.JPasswordField();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlEdicionInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Información"));

        lblContrasena.setText("Contraseña actual");

        lblNuevaContra.setText("Nueva contraseña");

        lblConfirmacion.setText("Confirmar contraseña");

        passContrasena.setText("jPasswordField1");

        pssNuevaContra.setText("jPasswordField2");

        passConfirmacion.setText("jPasswordField3");

        lblApellido.setText("Apellido");

        lblNombre.setText("Nombre");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        lblCedula.setText("Cédula");

        javax.swing.GroupLayout pnlEdicionInformacionLayout = new javax.swing.GroupLayout(pnlEdicionInformacion);
        pnlEdicionInformacion.setLayout(pnlEdicionInformacionLayout);
        pnlEdicionInformacionLayout.setHorizontalGroup(
            pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicionInformacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEdicionInformacionLayout.createSequentialGroup()
                        .addComponent(lblNuevaContra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pssNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEdicionInformacionLayout.createSequentialGroup()
                        .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAceptar)
                            .addComponent(lblConfirmacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEdicionInformacionLayout.createSequentialGroup()
                        .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContrasena)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido)
                            .addComponent(lblCedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtCedula))))
                .addContainerGap())
        );
        pnlEdicionInformacionLayout.setVerticalGroup(
            pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicionInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena)
                    .addComponent(passContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevaContra)
                    .addComponent(pssNuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmacion)
                    .addComponent(passConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlEdicionInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEdicionInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEdicionInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Cifrador cifrador = new Cifrador();

        if (validarCampos()) {
            if(JOptionPane.showConfirmDialog(this, "¿Esta seguro de que desea cambiar "
                + "esta información?") == JOptionPane.YES_OPTION){
            this.usuario.setNombre(this.txtNombre.getText());
            this.usuario.setApellido(this.txtApellido.getText());
            this.usuario.setContrasena(cifrador
                .md5((new String(this.pssNuevaContra.getPassword()))
                    .concat(this.usuario.getCedula())));

            this.tablaUsuario.editar(this.usuario);
            JOptionPane.showMessageDialog(this, "Éxito");
        }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditarInformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditarInformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditarInformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditarInformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmEditarInformacionUsuario dialog = new FrmEditarInformacionUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblConfirmacion;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNuevaContra;
    private javax.swing.JPasswordField passConfirmacion;
    private javax.swing.JPasswordField passContrasena;
    private javax.swing.JPanel pnlEdicionInformacion;
    private javax.swing.JPasswordField pssNuevaContra;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
        String nueva = new String(this.pssNuevaContra.getPassword());
        String confirmacion = new String(this.passConfirmacion.getPassword());

        return contrasenaActualCorrecta()
                && constrasenaValida(nueva)
                && constrasenasCoinciden(nueva, confirmacion);
    }

    private boolean constrasenaValida(String constrasena){
        Validador validador = new Validador();
        if (validador.contrasenaValida(constrasena)) {
            return true;
        }
        else{
            JOptionPane.showMessageDialog(this, "La contraseña nueva no es valida");
            return false;
        }
    }

    private boolean constrasenasCoinciden(String nueva, String confirmacion){
        if(nueva.equals(confirmacion)) {
            return true;
        }
        else{
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            return false;
        }
    }

    private boolean contrasenaActualCorrecta(){
        Cifrador cifrador = new Cifrador();
        String hashContrasena = cifrador
            .md5((new String(this.passContrasena.getPassword()))
            .concat(this.txtCedula.getText()));

        if(hashContrasena.equals(usuario.getContrasena())){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(this, "La contraseña actual no es correcta");
            return false;
        }
    }

    public void setUsuario(DatosUsuario usuario) {
        this.usuario = usuario;
    }
    
    public void setDatos(){
        this.txtCedula.setText(this.usuario.getCedula());
        this.txtCedula.setEditable(false);
        this.txtCedula.setEnabled(false);
        this.txtNombre.setText(this.usuario.getNombre());
        this.txtApellido.setText(this.usuario.getApellido());
    }
}