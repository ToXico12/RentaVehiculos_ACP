/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import datos.PagoDAO;
import datos.AlquilerDAO;

import entidades.Pago;
import entidades.Alquiler;

import java.util.List;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author camil
 */
public class FrmPagos extends javax.swing.JInternalFrame {
PagoDAO dao = new PagoDAO();

private int idPago = 0;
    /**
     * Creates new form FrmPagos
     */
    public FrmPagos() {
        initComponents();
           cargarAlquileres();

    listar();
    limpiar();
    }

public void cargarAlquileres() {

    cbAlquiler.removeAllItems();

    AlquilerDAO daoAlquiler =
        new AlquilerDAO();

    List<Alquiler> lista =
        daoAlquiler.listar();

    for (Alquiler a : lista) {

        cbAlquiler.addItem(
            a.getId()
            + " - "
            + a.getEstado()
        );
    }
}
     public void listar() {

    List<Pago> lista =
        dao.listar();

    DefaultTableModel modelo =
        (DefaultTableModel)
        tblPagos.getModel();

    modelo.setRowCount(0);

    Object[] fila = new Object[7];

    for (Pago p : lista) {

        fila[0] = p.getId();
        fila[1] = p.getAlquilerId();
        fila[2] = p.getMonto();
        fila[3] = p.getMetodoPago();
        fila[4] = p.getFecha();
        fila[5] = p.getEstado();
        fila[6] = p.getReferencia();

        modelo.addRow(fila);
    }
}
     public void limpiar() {

    idPago = 0;

    cbAlquiler.setSelectedIndex(0);

    txtMonto.setText("");

    cbMetodoPago.setSelectedIndex(0);

    txtFecha.setText("");

    cbEstado.setSelectedIndex(0);

    txtReferencia.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbAlquiler = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbMetodoPago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pagos");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 2, 18)); // NOI18N
        jLabel1.setText("PAGOS");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel2.setText("RENTMOVY");

        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Alquiler ID", "Monto", "Metodo de Pago", "Fecha", "Estado", "Referencia"
            }
        ));
        tblPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPagos);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("Alquiler");

        cbAlquiler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Monto");

        jLabel5.setText("Fecha");

        jLabel6.setText("Referencia");

        jLabel7.setText("Metodo de Pago");

        cbMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "Transferencia", "Nequi", "Daviplata" }));

        jLabel8.setText("Estado");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Pagado", "Cancelado", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(33, 33, 33)
                                .addComponent(btnActualizar)
                                .addGap(61, 61, 61)
                                .addComponent(btnEliminar)
                                .addGap(45, 45, 45)
                                .addComponent(btnLimpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMonto)
                                    .addComponent(txtFecha)
                                    .addComponent(cbAlquiler, 0, 149, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbMetodoPago, javax.swing.GroupLayout.Alignment.LEADING, 0, 147, Short.MAX_VALUE)
                                        .addComponent(txtReferencia, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      try {

        SimpleDateFormat formato =
            new SimpleDateFormat(
                "yyyy-MM-dd"
            );

        Pago obj = new Pago();

        String alquilerTexto =
            cbAlquiler
            .getSelectedItem()
            .toString();

        int alquilerId =
            Integer.parseInt(
                alquilerTexto
                .split(" - ")[0]
            );

        obj.setAlquilerId(
            alquilerId
        );

        obj.setMonto(
            Double.parseDouble(
                txtMonto.getText()
            )
        );

        obj.setMetodoPago(
            cbMetodoPago
            .getSelectedItem()
            .toString()
        );

        obj.setFecha(
            formato.parse(
                txtFecha.getText()
            )
        );

        obj.setEstado(
            cbEstado
            .getSelectedItem()
            .toString()
        );

        obj.setReferencia(
            txtReferencia.getText()
        );

        if (dao.insertar(obj)) {

            JOptionPane.showMessageDialog(
                null,
                "Pago guardado"
            );

            listar();

            limpiar();

        } else {

            JOptionPane.showMessageDialog(
                null,
                "Error al guardar"
            );
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
            null,
            "Formato incorrecto"
        );
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPagosMouseClicked
      int fila =
        tblPagos.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(
            null,
            "Seleccione un registro"
        );

    } else {

        idPago =
            Integer.parseInt(
                tblPagos
                .getValueAt(fila, 0)
                .toString()
            );

        txtMonto.setText(
            tblPagos
            .getValueAt(fila, 2)
            .toString()
        );

        cbMetodoPago.setSelectedItem(
            tblPagos
            .getValueAt(fila, 3)
            .toString()
        );

        txtFecha.setText(
            tblPagos
            .getValueAt(fila, 4)
            .toString()
        );

        cbEstado.setSelectedItem(
            tblPagos
            .getValueAt(fila, 5)
            .toString()
        );

        txtReferencia.setText(
            tblPagos
            .getValueAt(fila, 6)
            .toString()
        );
    }

    }//GEN-LAST:event_tblPagosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
  try {

        SimpleDateFormat formato =
            new SimpleDateFormat(
                "yyyy-MM-dd"
            );

        Pago obj = new Pago();

        String alquilerTexto =
            cbAlquiler
            .getSelectedItem()
            .toString();

        int alquilerId =
            Integer.parseInt(
                alquilerTexto
                .split(" - ")[0]
            );

        obj.setId(idPago);

        obj.setAlquilerId(alquilerId);

        obj.setMonto(
            Double.parseDouble(
                txtMonto.getText()
            )
        );

        obj.setMetodoPago(
            cbMetodoPago
            .getSelectedItem()
            .toString()
        );

        obj.setFecha(
            formato.parse(
                txtFecha.getText()
            )
        );

        obj.setEstado(
            cbEstado
            .getSelectedItem()
            .toString()
        );

        obj.setReferencia(
            txtReferencia.getText()
        );

        if (dao.actualizar(obj)) {

            JOptionPane.showMessageDialog(
                null,
                "Registro actualizado"
            );

            listar();

            limpiar();

        } else {

            JOptionPane.showMessageDialog(
                null,
                "Error al actualizar"
            );
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
            null,
            "Error en datos"
        );
    }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (idPago == 0) {

        JOptionPane.showMessageDialog(
            null,
            "Seleccione un registro"
        );

    } else {

        int opcion =
            JOptionPane.showConfirmDialog(
                null,
                "¿Desea eliminar?"
            );

        if (opcion == 0) {

            if (dao.eliminar(idPago)) {

                JOptionPane.showMessageDialog(
                    null,
                    "Registro eliminado"
                );

                listar();

                limpiar();

            } else {

                JOptionPane.showMessageDialog(
                    null,
                    "Error al eliminar"
                );
            }
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
   limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbAlquiler;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPagos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
