
package Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FrmRutasProgramadas extends javax.swing.JFrame {

    
    public FrmRutasProgramadas() {
        initComponents();
        
    }

    
   private void eliminarRutaSeleccionada() {
    int fila = tblRutas.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this,
        "¿Seguro que deseas eliminar esta ruta?",
        "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) return;

    // Construir la línea completa como está en el archivo
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < tblRutas.getColumnCount(); i++) {
        sb.append(tblRutas.getValueAt(fila, i).toString());
        if (i < tblRutas.getColumnCount() - 1) {
            sb.append(",");
        }
    }
    String lineaAEliminar = sb.toString().trim();

    File archivoOriginal = new File("rutas.txt");
    File archivoTemporal = new File("rutas_temp.txt");

    try (
        BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
        java.io.PrintWriter pw = new java.io.PrintWriter(archivoTemporal)
    ) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (!linea.trim().equals(lineaAEliminar)) {
                pw.println(linea);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al modificar el archivo: " + e.getMessage());
        return;
    }

    if (archivoOriginal.delete()) {
        archivoTemporal.renameTo(archivoOriginal);
        ((DefaultTableModel) tblRutas.getModel()).removeRow(fila);
        JOptionPane.showMessageDialog(this, "Ruta eliminada correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo eliminar el archivo original.");
    }
}
   private void cargarRutasDesdeArchivo() {
    String[] columnas = {"Fecha", "Precio", "Horario", "Salida", "Llegada", "Conductor", "Bus"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    tblRutas.setModel(modelo);  // Asignar el nuevo modelo

    try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File("rutas.txt"))) {
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] datos = linea.split(",");
            if (datos.length == 7) {
                modelo.addRow(datos);
            }
        }
    } catch (java.io.FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "No se encontró el archivo de rutas.");
    }
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRutas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rutas Programadas");
        setResizable(false);

        tblRutas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRutas);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Rutas Programadas");

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Retroceder");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        setSize(new java.awt.Dimension(880, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Formatear la fecha seleccionada del calendario
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String fechaSeleccionada = sdf.format(jDateChooser1.getDate());

    // Definir columnas de la tabla
    String[] columnas = {"Fecha", "Precio", "Horario", "Salida", "Llegada", "Conductor", "Bus"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    tblRutas.setModel(modelo);

    boolean hayCoincidencias = false;

    try (BufferedReader br = new BufferedReader(new FileReader("rutas.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.startsWith(fechaSeleccionada)) {
                hayCoincidencias = true;
                String[] datos = linea.split(",");
                modelo.addRow(datos);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo rutas.txt");
        return;
    }

    if (!hayCoincidencias) {
        JOptionPane.showMessageDialog(this, "No hay rutas programadas para la fecha seleccionada.");
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       
        int fila = tblRutas.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una ruta para editar.");
        return;
    }

    // Obtener los datos de la fila seleccionada
    String[] datos = new String[7];
    for (int i = 0; i < 7; i++) {
        datos[i] = tblRutas.getValueAt(fila, i).toString();
    }

    // Llamar al editor
    FrmEditorRutas.abrirConDatos(datos, fila, null); // si tienes FrmListaRutas, pásala; si no, pon null

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
    eliminarRutaSeleccionada();
    cargarRutasDesdeArchivo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
        FrmRutas formrutas = new FrmRutas();
        formrutas.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRutasProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRutasProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRutasProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRutasProgramadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRutasProgramadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRutas;
    // End of variables declaration//GEN-END:variables
}
