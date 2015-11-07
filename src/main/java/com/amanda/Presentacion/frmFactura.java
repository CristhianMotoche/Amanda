package com.amanda.Presentacion;

import com.amanda.Datos.*;
import com.amanda.Logica.*;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmFactura extends javax.swing.JFrame {
    private String accion;
    private int IdUsuario;
    
    public frmFactura() {
        initComponents();
        lblRUC.setText("");
        dateFechaFactura.setMaxSelectableDate(new java.util.Date());
        accion = "";
        IdUsuario = -1;
        mostrar();
    }
    
    public void setIdUsuario(int idusr){
        IdUsuario = idusr;
    }
    
    private void mostrar(){
        try {
            DefaultTableModel modelo;
            TablaFactura tf = new TablaFactura();
            modelo = tf.mostrar();
            gridFacturas.setModel(modelo);
            ocultarColumas();
            lblTotalRegs.setText(Integer.toString(tf.totalregistros));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 'Poner en tabla' " + e);
        }
    }
    
    private void ocultarColumas(){
        //ocultar la columna del idusuario
        for (int i = 0; i < 4; i++){
            gridFacturas.getColumnModel().getColumn(i).setMaxWidth(0);
            gridFacturas.getColumnModel().getColumn(i).setMinWidth(0);
            gridFacturas.getColumnModel().getColumn(i).setPreferredWidth(0);
        }
    }
    
    private void habilitarModificacion(boolean estado){
        cmdNuevo.setEnabled(!estado);
        cmdGuardar.setEnabled(estado);
        cmdCancelar.setEnabled(estado);
        cmdEditar.setEnabled(!estado);
        cmdEliminar.setEnabled(!estado);
        gridFacturas.setVisible(!estado);
        cmbProveedor.setEnabled(estado);
        txtNumFactura.setEnabled(estado);
        dateFechaFactura.setEnabled(estado);
        txtValAlimentacion.setEnabled(estado);
        txtValEducacion.setEnabled(estado);
        txtValGastoDeNegocio.setEnabled(estado);
        txtValOtros.setEnabled(estado);
        txtValSalud.setEnabled(estado);
        txtValVestimenta.setEnabled(estado);
        txtValVivienda.setEnabled(estado);
        cmdMasAlimentacion.setEnabled(estado);
        cmdMasEducacion.setEnabled(estado);
        cmdMasGastoNegocio.setEnabled(estado);
        cmdMasOtrosGastos.setEnabled(estado);
        cmdMasVestimenta.setEnabled(estado);
        cmdMasVivienda.setEnabled(estado);
        cmdMasSalud.setEnabled(estado);
        cmdMenosAlimentacion.setEnabled(estado);
        cmdMenosEducacion.setEnabled(estado);
        cmdMenosGastoNegocio.setEnabled(estado);
        cmdMenosOtrosGastos.setEnabled(estado);
        cmdMenosSalud.setEnabled(estado);
        cmdMenosVestimenta.setEnabled(estado);
        cmdMenosVivienda.setEnabled(estado);
        txtTotalSinIVA.setEnabled(estado);
        txtIVA.setEnabled(estado);
    }
    
    private void limpiar(){
        txtNumFactura.setText("");
        dateFechaFactura.setDate(null);
        txtValAlimentacion.setText("0");
        txtValEducacion.setText("0");
        txtValGastoDeNegocio.setText("0");
        txtValOtros.setText("0");
        txtValSalud.setText("0");
        txtValVestimenta.setText("0");
        txtValVivienda.setText("0");
        txtTotalAlimentacion.setText("0.0");
        txtTotal.setText("0.0");
        txtTotalDeducible.setText("0.0");
        txtTotalEducacion.setText("0.0");
        txtTotalGastoNegocio.setText("0.0");
        txtTotalNoDeducible.setText("0.0");
        txtTotalOtrosGastos.setText("0.0");
        txtTotalSalud.setText("0.0");
        txtTotalSinIVA.setText("");
        txtTotalVestimenta.setText("0.0");
        txtTotalVivienda.setText("0.0");
        txtIVA.setText("12");    
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

    private void calcularTotalDeducible(){
        txtTotalDeducible.setText(String.valueOf(Double.parseDouble(txtTotalAlimentacion.getText()) + Double.parseDouble(txtTotalEducacion.getText()) + Double.parseDouble(txtTotalSalud.getText()) + Double.parseDouble(txtTotalVestimenta.getText()) + Double.parseDouble(txtTotalVivienda.getText())));
    }
    
    private void calcularTotalNoDeducible(){
        txtTotalNoDeducible.setText(String.valueOf(Double.parseDouble(txtTotalGastoNegocio.getText()) + Double.parseDouble(txtTotalOtrosGastos.getText())));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpDetalleGastos = new javax.swing.JPanel();
        lblAlimentacion = new javax.swing.JLabel();
        lblEducacion = new javax.swing.JLabel();
        lblVestimenta = new javax.swing.JLabel();
        lblSalud = new javax.swing.JLabel();
        lblVivienda = new javax.swing.JLabel();
        cmdMasAlimentacion = new javax.swing.JButton();
        cmdMenosAlimentacion = new javax.swing.JButton();
        cmdMenosEducacion = new javax.swing.JButton();
        cmdMasEducacion = new javax.swing.JButton();
        cmdMenosSalud = new javax.swing.JButton();
        cmdMasSalud = new javax.swing.JButton();
        cmdMenosVestimenta = new javax.swing.JButton();
        cmdMasVestimenta = new javax.swing.JButton();
        cmdMenosVivienda = new javax.swing.JButton();
        cmdMasVivienda = new javax.swing.JButton();
        lblEqTotalDeducibles = new javax.swing.JLabel();
        txtTotalAlimentacion = new javax.swing.JTextField();
        txtTotalEducacion = new javax.swing.JTextField();
        txtTotalSalud = new javax.swing.JTextField();
        txtTotalVivienda = new javax.swing.JTextField();
        txtTotalVestimenta = new javax.swing.JTextField();
        cmdMenosGastoNegocio = new javax.swing.JButton();
        cmdMasGastoNegocio = new javax.swing.JButton();
        txtTotalGastoNegocio = new javax.swing.JTextField();
        lblGastoNegocio = new javax.swing.JLabel();
        cmdMenosOtrosGastos = new javax.swing.JButton();
        cmdMasOtrosGastos = new javax.swing.JButton();
        txtTotalOtrosGastos = new javax.swing.JTextField();
        lblOtrosGastos = new javax.swing.JLabel();
        lblEqTipoGasto = new javax.swing.JLabel();
        txtValGastoDeNegocio = new javax.swing.JTextField();
        txtValOtros = new javax.swing.JTextField();
        txtValVivienda = new javax.swing.JTextField();
        txtValVestimenta = new javax.swing.JTextField();
        txtValSalud = new javax.swing.JTextField();
        txtValEducacion = new javax.swing.JTextField();
        txtValAlimentacion = new javax.swing.JTextField();
        grpInfoGeneral = new javax.swing.JPanel();
        cmbProveedor = new javax.swing.JComboBox();
        lblRUC = new javax.swing.JLabel();
        lblEqProveedor = new javax.swing.JLabel();
        lblEqNumFactura = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        lblEqFecha = new javax.swing.JLabel();
        dateFechaFactura = new com.toedter.calendar.JDateChooser();
        grpTotales = new javax.swing.JPanel();
        lblEqDeducible = new javax.swing.JLabel();
        lblEqNoDeducible = new javax.swing.JLabel();
        lblEqTotalSinIVA = new javax.swing.JLabel();
        lblEqIVA = new javax.swing.JLabel();
        lblEqTotal = new javax.swing.JLabel();
        txtTotalDeducible = new javax.swing.JTextField();
        txtTotalNoDeducible = new javax.swing.JTextField();
        txtTotalSinIVA = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridFacturas = new javax.swing.JTable();
        cmdNuevo = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        lblTotalRegs = new javax.swing.JLabel();
        cmdEliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grpDetalleGastos.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de gastos"));

        lblAlimentacion.setText("Alimentación:");

        lblEducacion.setText("Educación:");

        lblVestimenta.setText("Vestmenta:");

        lblSalud.setText("Salud:");

        lblVivienda.setText("Vivienda:");

        cmdMasAlimentacion.setText("+");
        cmdMasAlimentacion.setEnabled(false);
        cmdMasAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasAlimentacionActionPerformed(evt);
            }
        });

        cmdMenosAlimentacion.setText("-");
        cmdMenosAlimentacion.setEnabled(false);
        cmdMenosAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosAlimentacionActionPerformed(evt);
            }
        });

        cmdMenosEducacion.setText("-");
        cmdMenosEducacion.setEnabled(false);
        cmdMenosEducacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosEducacionActionPerformed(evt);
            }
        });

        cmdMasEducacion.setText("+");
        cmdMasEducacion.setEnabled(false);
        cmdMasEducacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasEducacionActionPerformed(evt);
            }
        });

        cmdMenosSalud.setText("-");
        cmdMenosSalud.setEnabled(false);
        cmdMenosSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosSaludActionPerformed(evt);
            }
        });

        cmdMasSalud.setText("+");
        cmdMasSalud.setEnabled(false);
        cmdMasSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasSaludActionPerformed(evt);
            }
        });

        cmdMenosVestimenta.setText("-");
        cmdMenosVestimenta.setEnabled(false);
        cmdMenosVestimenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosVestimentaActionPerformed(evt);
            }
        });

        cmdMasVestimenta.setText("+");
        cmdMasVestimenta.setEnabled(false);
        cmdMasVestimenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasVestimentaActionPerformed(evt);
            }
        });

        cmdMenosVivienda.setText("-");
        cmdMenosVivienda.setEnabled(false);
        cmdMenosVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosViviendaActionPerformed(evt);
            }
        });

        cmdMasVivienda.setText("+");
        cmdMasVivienda.setEnabled(false);
        cmdMasVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasViviendaActionPerformed(evt);
            }
        });

        lblEqTotalDeducibles.setText("Total");

        txtTotalAlimentacion.setText("0.0");
        txtTotalAlimentacion.setEnabled(false);

        txtTotalEducacion.setText("0.0");
        txtTotalEducacion.setEnabled(false);

        txtTotalSalud.setText("0.0");
        txtTotalSalud.setEnabled(false);

        txtTotalVivienda.setText("0.0");
        txtTotalVivienda.setEnabled(false);

        txtTotalVestimenta.setText("0.0");
        txtTotalVestimenta.setEnabled(false);
        txtTotalVestimenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVestimentaActionPerformed(evt);
            }
        });

        cmdMenosGastoNegocio.setText("-");
        cmdMenosGastoNegocio.setEnabled(false);
        cmdMenosGastoNegocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosGastoNegocioActionPerformed(evt);
            }
        });

        cmdMasGastoNegocio.setText("+");
        cmdMasGastoNegocio.setEnabled(false);
        cmdMasGastoNegocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasGastoNegocioActionPerformed(evt);
            }
        });

        txtTotalGastoNegocio.setText("0.0");
        txtTotalGastoNegocio.setEnabled(false);

        lblGastoNegocio.setText("Gastos de negocio:");

        cmdMenosOtrosGastos.setText("-");
        cmdMenosOtrosGastos.setEnabled(false);
        cmdMenosOtrosGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenosOtrosGastosActionPerformed(evt);
            }
        });

        cmdMasOtrosGastos.setText("+");
        cmdMasOtrosGastos.setEnabled(false);
        cmdMasOtrosGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMasOtrosGastosActionPerformed(evt);
            }
        });

        txtTotalOtrosGastos.setText("0.0");
        txtTotalOtrosGastos.setEnabled(false);

        lblOtrosGastos.setText("Oros:");

        lblEqTipoGasto.setText("Tipo de gasto");

        txtValGastoDeNegocio.setText("0");
        txtValGastoDeNegocio.setEnabled(false);

        txtValOtros.setText("0");
        txtValOtros.setEnabled(false);

        txtValVivienda.setText("0");
        txtValVivienda.setEnabled(false);

        txtValVestimenta.setText("0");
        txtValVestimenta.setEnabled(false);

        txtValSalud.setText("0");
        txtValSalud.setEnabled(false);

        txtValEducacion.setText("0");
        txtValEducacion.setEnabled(false);

        txtValAlimentacion.setText("0");
        txtValAlimentacion.setEnabled(false);

        javax.swing.GroupLayout grpDetalleGastosLayout = new javax.swing.GroupLayout(grpDetalleGastos);
        grpDetalleGastos.setLayout(grpDetalleGastosLayout);
        grpDetalleGastosLayout.setHorizontalGroup(
            grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                        .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAlimentacion)
                                    .addComponent(lblEducacion)
                                    .addComponent(lblSalud)
                                    .addComponent(lblVestimenta)
                                    .addComponent(lblVivienda))
                                .addGap(36, 36, 36)
                                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                        .addComponent(txtValVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMasVivienda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMenosVivienda))
                                    .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                        .addComponent(txtValVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMasVestimenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMenosVestimenta))
                                    .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                        .addComponent(txtValSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMasSalud)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMenosSalud))
                                    .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                        .addComponent(txtValEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMasEducacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMenosEducacion))
                                    .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                        .addComponent(txtValAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMasAlimentacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdMenosAlimentacion))))
                            .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lblEqTipoGasto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalEducacion)
                            .addComponent(txtTotalSalud)
                            .addComponent(txtTotalVestimenta)
                            .addComponent(txtTotalVivienda)
                            .addComponent(txtTotalAlimentacion)
                            .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblEqTotalDeducibles)
                                .addGap(0, 188, Short.MAX_VALUE))))
                    .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                        .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                .addComponent(lblGastoNegocio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValGastoDeNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdMasGastoNegocio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdMenosGastoNegocio))
                            .addGroup(grpDetalleGastosLayout.createSequentialGroup()
                                .addComponent(lblOtrosGastos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdMasOtrosGastos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdMenosOtrosGastos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalGastoNegocio)
                            .addComponent(txtTotalOtrosGastos))))
                .addContainerGap())
        );
        grpDetalleGastosLayout.setVerticalGroup(
            grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grpDetalleGastosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEqTotalDeducibles)
                    .addComponent(lblEqTipoGasto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlimentacion)
                    .addComponent(cmdMasAlimentacion)
                    .addComponent(cmdMenosAlimentacion)
                    .addComponent(txtTotalAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEducacion)
                    .addComponent(cmdMasEducacion)
                    .addComponent(cmdMenosEducacion)
                    .addComponent(txtTotalEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalud)
                    .addComponent(cmdMasSalud)
                    .addComponent(cmdMenosSalud)
                    .addComponent(txtTotalSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVestimenta)
                    .addComponent(cmdMasVestimenta)
                    .addComponent(cmdMenosVestimenta)
                    .addComponent(txtTotalVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValVestimenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVivienda)
                    .addComponent(cmdMasVivienda)
                    .addComponent(cmdMenosVivienda)
                    .addComponent(txtTotalVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGastoNegocio)
                    .addComponent(cmdMasGastoNegocio)
                    .addComponent(cmdMenosGastoNegocio)
                    .addComponent(txtTotalGastoNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValGastoDeNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpDetalleGastosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOtrosGastos)
                    .addComponent(cmdMasOtrosGastos)
                    .addComponent(cmdMenosOtrosGastos)
                    .addComponent(txtTotalOtrosGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        grpInfoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacíon general"));

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProveedor.setEnabled(false);

        lblRUC.setText("[RUC]");

        lblEqProveedor.setText("Proveedor:");

        lblEqNumFactura.setText("N° factura:");

        txtNumFactura.setEnabled(false);
        txtNumFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFacturaActionPerformed(evt);
            }
        });

        lblEqFecha.setText("Fecha:");

        dateFechaFactura.setEnabled(false);

        javax.swing.GroupLayout grpInfoGeneralLayout = new javax.swing.GroupLayout(grpInfoGeneral);
        grpInfoGeneral.setLayout(grpInfoGeneralLayout);
        grpInfoGeneralLayout.setHorizontalGroup(
            grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpInfoGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEqProveedor)
                    .addComponent(lblEqNumFactura)
                    .addComponent(lblEqFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grpInfoGeneralLayout.createSequentialGroup()
                        .addComponent(lblRUC)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(grpInfoGeneralLayout.createSequentialGroup()
                        .addGroup(grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNumFactura)
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, 479, Short.MAX_VALUE)
                            .addComponent(dateFechaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        grpInfoGeneralLayout.setVerticalGroup(
            grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpInfoGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEqProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRUC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEqNumFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEqFecha)
                    .addComponent(dateFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        grpTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));

        lblEqDeducible.setText("Deducible:");

        lblEqNoDeducible.setText("No deducible:");

        lblEqTotalSinIVA.setText("Total sin IVA:");

        lblEqIVA.setText("IVA (%):");

        lblEqTotal.setText("Total:");

        txtTotalDeducible.setText("0.0");
        txtTotalDeducible.setEnabled(false);
        txtTotalDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDeducibleActionPerformed(evt);
            }
        });

        txtTotalNoDeducible.setText("0.0");
        txtTotalNoDeducible.setEnabled(false);
        txtTotalNoDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalNoDeducibleActionPerformed(evt);
            }
        });

        txtTotalSinIVA.setEnabled(false);
        txtTotalSinIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalSinIVAActionPerformed(evt);
            }
        });

        txtIVA.setText("12");
        txtIVA.setEnabled(false);
        txtIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAActionPerformed(evt);
            }
        });

        txtTotal.setText("0.0");
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout grpTotalesLayout = new javax.swing.GroupLayout(grpTotales);
        grpTotales.setLayout(grpTotalesLayout);
        grpTotalesLayout.setHorizontalGroup(
            grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grpTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grpTotalesLayout.createSequentialGroup()
                        .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEqDeducible)
                            .addComponent(lblEqNoDeducible))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalDeducible, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtTotalNoDeducible)))
                    .addGroup(grpTotalesLayout.createSequentialGroup()
                        .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEqIVA)
                            .addComponent(lblEqTotal))
                        .addGap(32, 32, 32)
                        .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIVA)
                            .addComponent(txtTotal)))
                    .addGroup(grpTotalesLayout.createSequentialGroup()
                        .addComponent(lblEqTotalSinIVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalSinIVA)))
                .addGap(236, 236, 236))
        );
        grpTotalesLayout.setVerticalGroup(
            grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grpTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEqDeducible)
                    .addComponent(txtTotalDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEqNoDeducible)
                    .addComponent(txtTotalNoDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEqTotalSinIVA)
                    .addComponent(txtTotalSinIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEqIVA)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(grpTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEqTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        gridFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        gridFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridFacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridFacturas);

        cmdNuevo.setText("Nuevo");
        cmdNuevo.setName(""); // NOI18N
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
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

        lblTotalRegs.setText("Total de registros: 0");

        cmdEliminar1.setText("Eliminar");
        cmdEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grpDetalleGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpTotales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpInfoGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalRegs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdEliminar1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdGuardar)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdEditar)
                    .addComponent(cmdEliminar)
                    .addComponent(cmdEliminar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grpInfoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grpDetalleGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grpTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalRegs)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFacturaActionPerformed

    private void txtTotalDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDeducibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDeducibleActionPerformed

    private void txtTotalNoDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalNoDeducibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalNoDeducibleActionPerformed

    private void txtTotalSinIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalSinIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalSinIVAActionPerformed

    private void txtIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        habilitarModificacion(false);
        limpiar();
        accion = "";
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        DatosFactura df = new DatosFactura();
        TablaFactura tf = new TablaFactura();
        df.IdUsuario = IdUsuario;
        df.IdProveedor = 1;
        df.Numero = txtNumFactura.getText().trim();
        df.Fecha = new java.sql.Date(dateFechaFactura.getDate().getTime());
        df.SumAlimentacion = Double.parseDouble(txtTotalAlimentacion.getText().trim());
        df.SumEducacion = Double.parseDouble(txtTotalEducacion.getText().trim());
        df.SumSalud = Double.parseDouble(txtTotalSalud.getText().trim());
        df.SumVestido = Double.parseDouble(txtTotalVestimenta.getText().trim());
        df.SumVivienda = Double.parseDouble(txtTotalVivienda.getText().trim());
        df.SumOtros = Double.parseDouble(txtTotalOtrosGastos.getText().trim());
        df.SumGastosNegocio = Double.parseDouble(txtTotalGastoNegocio.getText().trim());
        df.TotalSinIVA = Double.parseDouble(txtTotalSinIVA.getText().trim());
        df.IVA = Double.parseDouble(txtIVA.getText().trim());
        df.Total = Double.parseDouble(txtTotal.getText().trim());
        boolean resultado = false;
        switch(accion){
            case "nuevo":
                resultado = tf.insertar(df);
                break;
            case "editar":
                resultado = tf.editar(df);
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

    private void cmdMasAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasAlimentacionActionPerformed
        if (validarCajas(txtValAlimentacion.getText()))
            txtTotalAlimentacion.setText(String.valueOf(Double.parseDouble(txtTotalAlimentacion.getText()) + Double.parseDouble(txtValAlimentacion.getText())));
        txtValAlimentacion.setText("0");
        calcularTotalDeducible();
    }//GEN-LAST:event_cmdMasAlimentacionActionPerformed

    private void txtTotalVestimentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVestimentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVestimentaActionPerformed

    private void cmdMasEducacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasEducacionActionPerformed
        if (validarCajas(txtValEducacion.getText()))
            txtTotalEducacion.setText(String.valueOf(Double.parseDouble(txtTotalEducacion.getText()) + Double.parseDouble(txtValEducacion.getText())));
        txtValEducacion.setText("0");
        calcularTotalDeducible();
    }//GEN-LAST:event_cmdMasEducacionActionPerformed

    private void cmdMasSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasSaludActionPerformed
        if (validarCajas(txtValSalud.getText()))
            txtTotalSalud.setText(String.valueOf(Double.parseDouble(txtTotalSalud.getText()) + Double.parseDouble(txtValSalud.getText())));
        txtValSalud.setText("0");
        calcularTotalDeducible();
    }//GEN-LAST:event_cmdMasSaludActionPerformed

    private void cmdMasVestimentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasVestimentaActionPerformed
        if (validarCajas(txtValVestimenta.getText()))
            txtTotalVestimenta.setText(String.valueOf(Double.parseDouble(txtTotalVestimenta.getText()) + Double.parseDouble(txtValVestimenta.getText())));
        txtValVestimenta.setText("0");
        calcularTotalDeducible();
    }//GEN-LAST:event_cmdMasVestimentaActionPerformed

    private void cmdMasViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasViviendaActionPerformed
        if (validarCajas(txtValVivienda.getText()))
            txtTotalVivienda.setText(String.valueOf(Double.parseDouble(txtTotalVivienda.getText()) + Double.parseDouble(txtValVivienda.getText())));
        txtValVivienda.setText("0");
        calcularTotalDeducible();
    }//GEN-LAST:event_cmdMasViviendaActionPerformed

    private void cmdMasGastoNegocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasGastoNegocioActionPerformed
        if (validarCajas(txtValGastoDeNegocio.getText()))
            txtTotalGastoNegocio.setText(String.valueOf(Double.parseDouble(txtTotalGastoNegocio.getText()) + Double.parseDouble(txtValGastoDeNegocio.getText())));
        txtValGastoDeNegocio.setText("0");
        calcularTotalNoDeducible();
    }//GEN-LAST:event_cmdMasGastoNegocioActionPerformed

    private void cmdMasOtrosGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMasOtrosGastosActionPerformed
        if (validarCajas(txtValOtros.getText()))
            txtTotalOtrosGastos.setText(String.valueOf(Double.parseDouble(txtTotalOtrosGastos.getText()) + Double.parseDouble(txtValOtros.getText())));
        txtValOtros.setText("0");
        calcularTotalNoDeducible();
    }//GEN-LAST:event_cmdMasOtrosGastosActionPerformed

    private void cmdMenosAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosAlimentacionActionPerformed
        if (validarCajas(txtValAlimentacion.getText())){
            double resto = Double.parseDouble(txtTotalAlimentacion.getText()) - Double.parseDouble(txtValAlimentacion.getText());
            if (resto < 0) resto = 0;
            txtTotalAlimentacion.setText(String.valueOf(resto));
            calcularTotalDeducible();
        }
        txtValAlimentacion.setText("0");
    }//GEN-LAST:event_cmdMenosAlimentacionActionPerformed

    private void cmdMenosEducacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosEducacionActionPerformed
        if (validarCajas(txtValEducacion.getText())){
            double resto = Double.parseDouble(txtTotalEducacion.getText()) - Double.parseDouble(txtValEducacion.getText());
            if (resto < 0) resto = 0;
            txtTotalEducacion.setText(String.valueOf(resto));
            calcularTotalDeducible();
        }
        txtValEducacion.setText("0");
    }//GEN-LAST:event_cmdMenosEducacionActionPerformed

    private void cmdMenosSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosSaludActionPerformed
        if (validarCajas(txtValSalud.getText())){
            double resto = Double.parseDouble(txtTotalSalud.getText()) - Double.parseDouble(txtValSalud.getText());
            if (resto < 0) resto = 0;
            txtTotalSalud.setText(String.valueOf(resto));
            calcularTotalDeducible();
        }
        txtValSalud.setText("0");
    }//GEN-LAST:event_cmdMenosSaludActionPerformed

    private void cmdMenosVestimentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosVestimentaActionPerformed
        if (validarCajas(txtValVestimenta.getText())){
            double resto = Double.parseDouble(txtTotalVestimenta.getText()) - Double.parseDouble(txtValVestimenta.getText());
            if (resto < 0) resto = 0;
            txtTotalVestimenta.setText(String.valueOf(resto));
            calcularTotalDeducible();
        }
        txtValVestimenta.setText("0");
    }//GEN-LAST:event_cmdMenosVestimentaActionPerformed

    private void cmdMenosViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosViviendaActionPerformed
        if (validarCajas(txtValVivienda.getText())){
            double resto = Double.parseDouble(txtTotalVivienda.getText()) - Double.parseDouble(txtValVivienda.getText());
            if (resto < 0) resto = 0;
            txtTotalVivienda.setText(String.valueOf(resto));
            calcularTotalDeducible();
        }
        txtValVivienda.setText("0");
    }//GEN-LAST:event_cmdMenosViviendaActionPerformed

    private void cmdMenosGastoNegocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosGastoNegocioActionPerformed
        if (validarCajas(txtValGastoDeNegocio.getText())){
            double resto = Double.parseDouble(txtTotalGastoNegocio.getText()) - Double.parseDouble(txtValGastoDeNegocio.getText());
            if (resto < 0) resto = 0;
            txtTotalGastoNegocio.setText(String.valueOf(resto));
            calcularTotalNoDeducible();
        }
        txtValGastoDeNegocio.setText("0");
    }//GEN-LAST:event_cmdMenosGastoNegocioActionPerformed

    private void cmdMenosOtrosGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenosOtrosGastosActionPerformed
        if (validarCajas(txtValOtros.getText())){
            double resto = Double.parseDouble(txtTotalOtrosGastos.getText()) - Double.parseDouble(txtValOtros.getText());
            if (resto < 0) resto = 0;
            txtTotalOtrosGastos.setText(String.valueOf(resto));
            calcularTotalNoDeducible();
        }
        txtValOtros.setText("0");
    }//GEN-LAST:event_cmdMenosOtrosGastosActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        limpiar();
        accion = "nuevo";
        habilitarModificacion(true);
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        accion = "editar";
        habilitarModificacion(true);
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void gridFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridFacturasMouseClicked
        int fila = gridFacturas.rowAtPoint(evt.getPoint());
        txtNumFactura.setText(gridFacturas.getValueAt(fila, 4).toString());
        dateFechaFactura.setDate(Date.valueOf(gridFacturas.getValueAt(fila, 5).toString()));
        txtTotalAlimentacion.setText(gridFacturas.getValueAt(fila, 6).toString());
        txtTotalEducacion.setText(gridFacturas.getValueAt(fila, 7).toString());
        txtTotalSalud.setText(gridFacturas.getValueAt(fila, 8).toString());
        txtTotalVestimenta.setText(gridFacturas.getValueAt(fila, 9).toString());
        txtTotalVivienda.setText(gridFacturas.getValueAt(fila, 10).toString());
        txtTotalOtrosGastos.setText(gridFacturas.getValueAt(fila, 11).toString());
        txtTotalGastoNegocio.setText(gridFacturas.getValueAt(fila, 12).toString());
        txtTotalSinIVA.setText(gridFacturas.getValueAt(fila, 13).toString());
        txtIVA.setText(gridFacturas.getValueAt(fila, 14).toString());
        txtTotal.setText(gridFacturas.getValueAt(fila, 15).toString());
    }//GEN-LAST:event_gridFacturasMouseClicked

    private void cmdEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdEliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbProveedor;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEditar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdEliminar1;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdMasAlimentacion;
    private javax.swing.JButton cmdMasEducacion;
    private javax.swing.JButton cmdMasGastoNegocio;
    private javax.swing.JButton cmdMasOtrosGastos;
    private javax.swing.JButton cmdMasSalud;
    private javax.swing.JButton cmdMasVestimenta;
    private javax.swing.JButton cmdMasVivienda;
    private javax.swing.JButton cmdMenosAlimentacion;
    private javax.swing.JButton cmdMenosEducacion;
    private javax.swing.JButton cmdMenosGastoNegocio;
    private javax.swing.JButton cmdMenosOtrosGastos;
    private javax.swing.JButton cmdMenosSalud;
    private javax.swing.JButton cmdMenosVestimenta;
    private javax.swing.JButton cmdMenosVivienda;
    private javax.swing.JButton cmdNuevo;
    private com.toedter.calendar.JDateChooser dateFechaFactura;
    private javax.swing.JTable gridFacturas;
    private javax.swing.JPanel grpDetalleGastos;
    private javax.swing.JPanel grpInfoGeneral;
    private javax.swing.JPanel grpTotales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlimentacion;
    private javax.swing.JLabel lblEducacion;
    private javax.swing.JLabel lblEqDeducible;
    private javax.swing.JLabel lblEqFecha;
    private javax.swing.JLabel lblEqIVA;
    private javax.swing.JLabel lblEqNoDeducible;
    private javax.swing.JLabel lblEqNumFactura;
    private javax.swing.JLabel lblEqProveedor;
    private javax.swing.JLabel lblEqTipoGasto;
    private javax.swing.JLabel lblEqTotal;
    private javax.swing.JLabel lblEqTotalDeducibles;
    private javax.swing.JLabel lblEqTotalSinIVA;
    private javax.swing.JLabel lblGastoNegocio;
    private javax.swing.JLabel lblOtrosGastos;
    private javax.swing.JLabel lblRUC;
    private javax.swing.JLabel lblSalud;
    private javax.swing.JLabel lblTotalRegs;
    private javax.swing.JLabel lblVestimenta;
    private javax.swing.JLabel lblVivienda;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalAlimentacion;
    private javax.swing.JTextField txtTotalDeducible;
    private javax.swing.JTextField txtTotalEducacion;
    private javax.swing.JTextField txtTotalGastoNegocio;
    private javax.swing.JTextField txtTotalNoDeducible;
    private javax.swing.JTextField txtTotalOtrosGastos;
    private javax.swing.JTextField txtTotalSalud;
    private javax.swing.JTextField txtTotalSinIVA;
    private javax.swing.JTextField txtTotalVestimenta;
    private javax.swing.JTextField txtTotalVivienda;
    private javax.swing.JTextField txtValAlimentacion;
    private javax.swing.JTextField txtValEducacion;
    private javax.swing.JTextField txtValGastoDeNegocio;
    private javax.swing.JTextField txtValOtros;
    private javax.swing.JTextField txtValSalud;
    private javax.swing.JTextField txtValVestimenta;
    private javax.swing.JTextField txtValVivienda;
    // End of variables declaration//GEN-END:variables
}
