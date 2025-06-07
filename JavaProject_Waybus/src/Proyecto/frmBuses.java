
package Proyecto;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmBuses extends javax.swing.JFrame {
    
    ArrayList<Buses> listaBuses = new ArrayList<>();
    DefaultTableModel modeloTabla;
    String archivoBuses = "buses.txt";
    
    // Componentes
   
    
    public FrmBuses() {
        initComponents();
        modeloTabla = new DefaultTableModel(new String[]{"Placa", "Modelo", "Marca", "Estado", "Usos"}, 0);
        jTable1.setModel(modeloTabla);
        cargarArchivo();
        mostrarTabla(listaBuses);
    }


    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuses = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        cbMarcaBus = new javax.swing.JComboBox<>();
        cbEstado = new javax.swing.JComboBox<>();
        btnRegistrarBus = new javax.swing.JButton();
        btnMostrarBuses = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        tpFiltros = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        txtIngresePlaca = new javax.swing.JTextField();
        btnfiltarPorPlaca = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnFiltrarPorEstado = new javax.swing.JButton();
        cbFiltroPorEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Buses");
        setResizable(false);

        lblBuses.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBuses.setText("Registro de Buses");

        txtPlaca.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa de Vehiculo "));

        txtModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el Modelo"));

        cbMarcaBus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------Seleccione--------------", "Mercedes", "Marcopolo" }));
        cbMarcaBus.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca de bus"));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------Seleccione-----------", "Listo", "En mantenimiento", "Malogrado" }));
        cbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        btnRegistrarBus.setText("Registrar");
        btnRegistrarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarBusActionPerformed(evt);
            }
        });

        btnMostrarBuses.setText("Mostrar Lista");
        btnMostrarBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBusesActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtIngresePlaca.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese la Placa:"));

        btnfiltarPorPlaca.setText("Filtrar");
        btnfiltarPorPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiltarPorPlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(txtIngresePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnfiltarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngresePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfiltarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tpFiltros.addTab("Filtro por Placa", jPanel4);

        btnFiltrarPorEstado.setText("Filtrar");
        btnFiltrarPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarPorEstadoActionPerformed(evt);
            }
        });

        cbFiltroPorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------Seleccione-----------", "Listo", "En mantenimiento", "Malogrado" }));
        cbFiltroPorEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(cbFiltroPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(btnFiltrarPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnFiltrarPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbFiltroPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tpFiltros.addTab("Filtro por Estado", jPanel3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblBuses))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbMarcaBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(btnRegistrarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMostrarBuses)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblBuses)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo)
                    .addComponent(cbMarcaBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btnRegistrarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(tpFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(815, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarBusActionPerformed
        registrarBus();
    }//GEN-LAST:event_btnRegistrarBusActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarBus();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFiltrarPorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarPorEstadoActionPerformed
        filtrarPorEstado();
    }//GEN-LAST:event_btnFiltrarPorEstadoActionPerformed

    private void btnfiltarPorPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiltarPorPlacaActionPerformed
        filtrarPorPlaca();
    }//GEN-LAST:event_btnfiltarPorPlacaActionPerformed

    private void btnMostrarBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBusesActionPerformed
        mostrarTabla(listaBuses);
    }//GEN-LAST:event_btnMostrarBusesActionPerformed
     
    
    private void registrarBus() {
        String placa = txtPlaca.getText().trim();
        String modelo = txtModelo.getText().trim();
        String marca = cbMarcaBus.getSelectedItem().toString();
        String estado = "Listo";
        int usos = 0;

        if (modelo.length() != 7) {
            JOptionPane.showMessageDialog(this, "El modelo debe tener 7 dígitos.");
            return;
        }

        Buses nuevo = new Buses(placa, modelo, marca, estado, usos);
        listaBuses.add(nuevo);
        guardarArchivo();
        mostrarTabla(listaBuses);
    }

    private void eliminarBus() {
        int fila = jTable1.getSelectedRow();
        if (fila >= 0) {
            String placa = (String) modeloTabla.getValueAt(fila, 0);
            listaBuses.removeIf(b -> b.getPlaca().equalsIgnoreCase(placa));
            guardarArchivo();
            mostrarTabla(listaBuses);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        }
    }
    
    private void filtrarPorPlaca() {
        String buscar = txtIngresePlaca.getText().trim();
        ArrayList<Buses> resultado = new ArrayList<>();
        for (Buses b : listaBuses) {
            if (b.getPlaca().equalsIgnoreCase(buscar)) {
                resultado.add(b);
            }
        }
        mostrarTabla(resultado);
    }

    
    private void filtrarPorEstado() {
        String estado = cbFiltroPorEstado.getSelectedItem().toString();
        ArrayList<Buses> resultado = new ArrayList<>();
        for (Buses b : listaBuses) {
            if (b.getEstado().equalsIgnoreCase(estado)) {
                resultado.add(b);
            }
        }
        mostrarTabla(resultado);
    }

    private void mostrarTabla(ArrayList<Buses> lista) {
        modeloTabla.setRowCount(0);
        for (Buses b : lista) {
            modeloTabla.addRow(new Object[]{
                b.getPlaca(), b.getModelo(), b.getMarca(), b.getEstado(), b.getUsos()
            });
        }
    }
    
    private void guardarArchivo() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivoBuses))) {
            for (Buses b : listaBuses) {
                pw.println(b.toString());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar archivo.");
        }
    }

    private void cargarArchivo() {
        listaBuses.clear();
        File file = new File(archivoBuses);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    listaBuses.add(Buses.fromString(linea));
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar archivo.");
            }
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrarPorEstado;
    private javax.swing.JButton btnMostrarBuses;
    private javax.swing.JButton btnRegistrarBus;
    private javax.swing.JButton btnfiltarPorPlaca;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbFiltroPorEstado;
    private javax.swing.JComboBox<String> cbMarcaBus;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBuses;
    private javax.swing.JTabbedPane tpFiltros;
    private javax.swing.JTextField txtIngresePlaca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
