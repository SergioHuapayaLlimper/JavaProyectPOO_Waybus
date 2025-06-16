//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
// Ventana para mostrar y eliminar clientes
public class FrmListaClientes extends javax.swing.JFrame {

    DefaultTableModel modelo;
    MantenimientoClientes manCliente;
    private JFrame parentForm;
    
    private void personalizarBotonLista(JButton boton) {
        Color fondo = new Color(0, 120, 215);
        Color fondoHover = new Color(0, 150, 255);
        Color texto = Color.WHITE;

        boton.setBackground(fondo);
        boton.setForeground(texto);
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setContentAreaFilled(true);
        boton.setOpaque(true);

        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(fondoHover);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(fondo);
            }
        });
    }
    
    private void cargarClientesDesdeArchivo() {
    modelo.setRowCount(0); // Limpiar tabla sin destruir columnas

    ArrayList<RegistroClientes> lista = new MantenimientoClientes().obtenerClientes();

    for (RegistroClientes c : lista) {
        modelo.addRow(new Object[]{
            c.getCodigo_c(),
            c.getNombres(),
            c.getApellidos(),
            c.getDni(),
            c.getCorreo(),
            c.getTelefono(),
            c.getEdad(),
            c.getSexo(),
            c.getServicio(),
            c.getRuta()
        });
    }

    tblClientes.setModel(modelo);
}
    
    public FrmListaClientes() {
        initComponents();
        
        // Inicializar modelo antes de usarlo
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("DNI");
        modelo.addColumn("Correo");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Servicio");
        modelo.addColumn("Ruta");
        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
            "-------SELECCIONE-------", "Viaje", "Encomienda"
        }));
        cmbServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione el Servicio:"));

        // Asignar el modelo a la tabla
        tblClientes.setModel(modelo);

        // Establecer color de fondo
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue

        // Personalizar botón
        personalizarBotonLista(btnEliminar);

        // Cargar datos desde el archivo
        cargarClientesDesdeArchivo();
        }
    
    private void filtrarPorTexto(int columna, String texto) {
    DefaultTableModel modeloFiltrado = new DefaultTableModel();
    for (int i = 0; i < modelo.getColumnCount(); i++) {
        modeloFiltrado.addColumn(modelo.getColumnName(i));
    }

    boolean encontrado = false;

    for (int i = 0; i < modelo.getRowCount(); i++) {
        String celda = modelo.getValueAt(i, columna).toString().toLowerCase();
        if (celda.contains(texto.toLowerCase())) {
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                fila[j] = modelo.getValueAt(i, j);
            }
            modeloFiltrado.addRow(fila);
            encontrado = true;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No se encontraron resultados.");
    }

    tblClientes.setModel(modeloFiltrado);
}
    
     public FrmListaClientes(JFrame parent) {
         this();
         this.parentForm = parent;
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtFiltroCódigo = new javax.swing.JTextField();
        btnFiltrarCódigo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtFiltroNombreEmpleado = new javax.swing.JTextField();
        btnFiltrarCódigo1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnFiltrarCódigo2 = new javax.swing.JButton();
        cmbServicio = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuListaClientes = new javax.swing.JMenu();
        menuItemRegresarMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Clientes");
        setResizable(false);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblClientes);

        btnEliminar.setText("Borrar Cliente");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setText("Lista de clientes Ingresados:");

        txtFiltroCódigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el Código:"));
        txtFiltroCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroCódigoActionPerformed(evt);
            }
        });

        btnFiltrarCódigo.setText("Filtrar");
        btnFiltrarCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCódigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(txtFiltroCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFiltrarCódigo)
                .addGap(400, 400, 400))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtFiltroCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnFiltrarCódigo)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Código", jPanel1);

        txtFiltroNombreEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el Nombre del Clliente:"));

        btnFiltrarCódigo1.setText("Filtrar");
        btnFiltrarCódigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCódigo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFiltroNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFiltrarCódigo1)
                        .addGap(400, 400, 400))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtFiltroNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnFiltrarCódigo1)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Nombre", jPanel2);

        btnFiltrarCódigo2.setText("Filtrar");
        btnFiltrarCódigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCódigo2ActionPerformed(evt);
            }
        });

        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Viaje", "Encomienda" }));
        cmbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnFiltrarCódigo2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnFiltrarCódigo2)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Servicio", jPanel3);

        btnModificar.setText("Modificar Datos");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar toda la lista");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        menuListaClientes.setText("Opciones");

        menuItemRegresarMenu.setText("Regresar al Menú");
        menuItemRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegresarMenuActionPerformed(evt);
            }
        });
        menuListaClientes.add(menuItemRegresarMenu);

        menuBarPrincipal.add(menuListaClientes);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        setSize(new java.awt.Dimension(963, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tblClientes.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila para eliminar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de eliminar este cliente?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Eliminar de la tabla visual
            modelo.removeRow(filaSeleccionada);

            // Reescribir el archivo clientes.txt con los datos actualizados
            try (java.io.FileWriter writer = new java.io.FileWriter("clientes.txt")) {
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    StringBuilder linea = new StringBuilder();
                    for (int j = 0; j < modelo.getColumnCount(); j++) {
                        linea.append(modelo.getValueAt(i, j).toString());
                        if (j < modelo.getColumnCount() - 1) {
                            linea.append(",");
                        }
                    }
                    writer.write(linea.toString() + "\n");
                }
                JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al actualizar el archivo: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void menuItemRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegresarMenuActionPerformed
        if(parentForm != null){
            parentForm.setVisible(true);
            this.dispose();
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_menuItemRegresarMenuActionPerformed

    private void btnFiltrarCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCódigoActionPerformed
      filtrarPorTexto(0, txtFiltroCódigo.getText().trim()); // Código
    }//GEN-LAST:event_btnFiltrarCódigoActionPerformed

    private void txtFiltroCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroCódigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroCódigoActionPerformed

    private void btnFiltrarCódigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCódigo1ActionPerformed
         filtrarPorTexto(1, txtFiltroNombreEmpleado.getText().trim()); 
    }//GEN-LAST:event_btnFiltrarCódigo1ActionPerformed

    private void btnFiltrarCódigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCódigo2ActionPerformed
           String servicio = cmbServicio.getSelectedItem().toString();
    if (servicio.equals("-------SELECCIONE-------")) {
        JOptionPane.showMessageDialog(this, "Seleccione un servicio válido.");
        return;
    }

    DefaultTableModel modeloFiltrado = new DefaultTableModel();
    for (int i = 0; i < modelo.getColumnCount(); i++) {
        modeloFiltrado.addColumn(modelo.getColumnName(i));
    }

    boolean encontrado = false;

    for (int i = 0; i < modelo.getRowCount(); i++) {
        String valor = modelo.getValueAt(i, 8).toString(); // Columna 8 = Servicio
        if (valor.equalsIgnoreCase(servicio)) {
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                fila[j] = modelo.getValueAt(i, j);
            }
            modeloFiltrado.addRow(fila);
            encontrado = true;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No se encontraron clientes con el servicio seleccionado.");
    }

    tblClientes.setModel(modeloFiltrado);
    }//GEN-LAST:event_btnFiltrarCódigo2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        FrmEditorClientes editor = new FrmEditorClientes();
    editor.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        cargarClientesDesdeArchivo();
        cmbServicio.setSelectedIndex(0); // ← vuelve a "-------SELECCIONE-------"
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void cmbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbServicioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrarCódigo;
    private javax.swing.JButton btnFiltrarCódigo1;
    private javax.swing.JButton btnFiltrarCódigo2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cmbServicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemRegresarMenu;
    private javax.swing.JMenu menuListaClientes;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtFiltroCódigo;
    private javax.swing.JTextField txtFiltroNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
