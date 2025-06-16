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
        DefaultTableModel modelo = new DefaultTableModel();
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

        tblClientes.setModel(modelo);  // ⬅ Asegúrate que tu JTable se llame así
    }
    
    public FrmListaClientes() {
        initComponents();
        cargarClientesDesdeArchivo();
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue
        personalizarBotonLista(btnEliminar);
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

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                .addGap(120, 879, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(1136, 611));
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemRegresarMenu;
    private javax.swing.JMenu menuListaClientes;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
