/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import datos.ReservaDAO;
import entidades.Reserva;
import java.util.List;
import entidades.Alquiler;
import datos.AlquilerDAO;
import entidades.Alquiler;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import java.util.List;
/**
 *
 * @author camil
 */
public class FrmAlquileres extends javax.swing.JInternalFrame {

   AlquilerDAO dao = new AlquilerDAO();

private int idAlquiler = 0;

    public FrmAlquileres() {
        initComponents();
         cargarReservas();

    listar();
    limpiar();
    }

  public void cargarReservas() {

    cbReserva.removeAllItems();

    ReservaDAO daoReserva =
        new ReservaDAO();

    List<Reserva> lista =
        daoReserva.listar();

    for (Reserva r : lista) {

        cbReserva.addItem(
            r.getId() +
            " - " +
            r.getEstado()
        );
    }
}
  public void listar() {

    List<Alquiler> lista =
        dao.listar();

    DefaultTableModel modelo =
        (DefaultTableModel)
        tblAlquileres.getModel();

    modelo.setRowCount(0);

    Object[] fila = new Object[7];

    for (Alquiler a : lista) {

        fila[0] = a.getId();
        fila[1] = a.getReservaId();
        fila[2] = a.getFechaInicio();
        fila[3] = a.getFechaFin();
        fila[4] = a.getCostoTotal();
        fila[5] = a.getEstado();
        fila[6] = a.getFechaCreacion();

        modelo.addRow(fila);
    }
}
  public void limpiar() {

    idAlquiler = 0;

    cbReserva.setSelectedIndex(0);

    txtFechaInicio.setText("");

    txtFechaFin.setText("");

    txtCostoTotal.setText("");

    cbEstado.setSelectedIndex(0);

    txtFechaCreacion.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbReserva = new javax.swing.JComboBox<>();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaCreacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlquileres = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alquileres");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel1.setText("ALQUILERES");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel2.setText("RentMovy");

        jLabel3.setText("Reserva:");

        jLabel4.setText("Fecha de Inicio");

        cbReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Costo Total");

        jLabel6.setText("Fecha de Creación");

        jLabel7.setText("Estado :");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Finalizado", "Cancelado" }));

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

        tblAlquileres.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Reserva", "Fecha Inicio", "Fecha Fin", "Costo Total", "Estado", "Fecha Creacion"
            }
        ));
        tblAlquileres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlquileresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlquileres);

        jLabel8.setText("Fecha Fin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(25, 25, 25)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(15, 15, 15)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addComponent(txtFechaInicio)
                                    .addComponent(txtCostoTotal))
                                .addComponent(txtFechaCreacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
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

        Alquiler obj =
            new Alquiler();

        String reservaTexto =
            cbReserva
            .getSelectedItem()
            .toString();

        int reservaId =
            Integer.parseInt(
                reservaTexto
                .split(" - ")[0]
            );

        obj.setReservaId(
            reservaId
        );

        obj.setFechaInicio(
            formato.parse(
                txtFechaInicio
                .getText()
            )
        );

        obj.setFechaFin(
            formato.parse(
                txtFechaFin
                .getText()
            )
        );

        obj.setCostoTotal(
            Double.parseDouble(
                txtCostoTotal
                .getText()
            )
        );

        obj.setEstado(
            cbEstado
            .getSelectedItem()
            .toString()
        );

        obj.setFechaCreacion(
            formato.parse(
                txtFechaCreacion
                .getText()
            )
        );

        if (dao.insertar(obj)) {

            JOptionPane.showMessageDialog(
                null,
                "Alquiler guardado"
            );

            listar();

        } else {

            JOptionPane.showMessageDialog(
                null,
                "Error al guardar"
            );
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
            null,
            "Formato incorrecto. Usa yyyy-MM-dd"
        );
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblAlquileresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlquileresMouseClicked
         int fila =
        tblAlquileres.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(
            null,
            "Seleccione un registro"
        );

    } else {

        idAlquiler =
            Integer.parseInt(
                tblAlquileres
                .getValueAt(fila, 0)
                .toString()
            );

        cbReserva.setSelectedItem(
            tblAlquileres
            .getValueAt(fila, 1)
            .toString()
        );

        txtFechaInicio.setText(
            tblAlquileres
            .getValueAt(fila, 2)
            .toString()
        );

        txtFechaFin.setText(
            tblAlquileres
            .getValueAt(fila, 3)
            .toString()
        );

        txtCostoTotal.setText(
            tblAlquileres
            .getValueAt(fila, 4)
            .toString()
        );

        cbEstado.setSelectedItem(
            tblAlquileres
            .getValueAt(fila, 5)
            .toString()
        );

        txtFechaCreacion.setText(
            tblAlquileres
            .getValueAt(fila, 6)
            .toString()
        );
    }
    }//GEN-LAST:event_tblAlquileresMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       try {

        SimpleDateFormat formato =
            new SimpleDateFormat(
                "yyyy-MM-dd"
            );

        Alquiler obj =
            new Alquiler();

        String reservaTexto =
            cbReserva
            .getSelectedItem()
            .toString();

        int reservaId =
            Integer.parseInt(
                reservaTexto
                .split(" - ")[0]
            );

        obj.setId(idAlquiler);

        obj.setReservaId(
            reservaId
        );

        obj.setFechaInicio(
            formato.parse(
                txtFechaInicio
                .getText()
            )
        );

        obj.setFechaFin(
            formato.parse(
                txtFechaFin
                .getText()
            )
        );

        obj.setCostoTotal(
            Double.parseDouble(
                txtCostoTotal
                .getText()
            )
        );

        obj.setEstado(
            cbEstado
            .getSelectedItem()
            .toString()
        );

        obj.setFechaCreacion(
            formato.parse(
                txtFechaCreacion
                .getText()
            )
        );

        if (dao.actualizar(obj)) {

            JOptionPane.showMessageDialog(
                null,
                "Registro actualizado"
            );

            listar();

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
 if (idAlquiler == 0) {

        JOptionPane.showMessageDialog(
            null,
            "Seleccione un registro"
        );

    } else {

        int opcion =
            JOptionPane.showConfirmDialog(
                null,
                "¿Desea eliminar el registro?"
            );

        if (opcion == 0) {

            if (dao.eliminar(idAlquiler)) {

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
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbReserva;
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
    private javax.swing.JTable tblAlquileres;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtFechaCreacion;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
