
package Proyecto;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class FrmBuses extends javax.swing.JFrame {
    
    MantenimientoBuses mantenimiento;
    
    private void personalizarBoton(JButton boton) {
        Color fondo = new Color(0, 120, 215); // Azul moderno
        Color fondoHover = new Color(0, 150, 255);
        Color texto = Color.WHITE;

        boton.setBackground(fondo);
        boton.setForeground(texto);
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Padding
        boton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Quitar efectos de Look&Feel predeterminados
        boton.setContentAreaFilled(true);
        boton.setOpaque(true);

        // Efecto hover
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
    
    public FrmBuses() {
        initComponents();
        mantenimiento = new MantenimientoBuses();
        personalizarBoton(btnRegistrarBus);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarPrincipal = new javax.swing.JMenuBar();
        menuRegistroEmpleados = new javax.swing.JMenu();
        menuItemActualizarEmpleado = new javax.swing.JMenuItem();
        menuItemRegresarMenu = new javax.swing.JMenuItem();
        lblBuses = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        cbMarcaBus = new javax.swing.JComboBox<>();
        cbEstado = new javax.swing.JComboBox<>();
        btnRegistrarBus = new javax.swing.JButton();
        menuBarPrincipal1 = new javax.swing.JMenuBar();
        menuRegistroEmpleados1 = new javax.swing.JMenu();
        menuItemRegresarMenu1 = new javax.swing.JMenuItem();

        menuRegistroEmpleados.setText("Opciones");
        menuRegistroEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuItemActualizarEmpleado.setText("Actualizar Empleado");
        menuItemActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarEmpleadoActionPerformed(evt);
            }
        });
        menuRegistroEmpleados.add(menuItemActualizarEmpleado);

        menuItemRegresarMenu.setText("Regresar al Menú");
        menuItemRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegresarMenuActionPerformed(evt);
            }
        });
        menuRegistroEmpleados.add(menuItemRegresarMenu);

        menuBarPrincipal.add(menuRegistroEmpleados);

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

        menuRegistroEmpleados1.setText("Opciones");
        menuRegistroEmpleados1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuItemRegresarMenu1.setText("Regresar al Menú");
        menuItemRegresarMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegresarMenu1ActionPerformed(evt);
            }
        });
        menuRegistroEmpleados1.add(menuItemRegresarMenu1);

        menuBarPrincipal1.add(menuRegistroEmpleados1);

        setJMenuBar(menuBarPrincipal1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblBuses))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtModelo)
                        .addComponent(txtPlaca)
                        .addComponent(cbEstado, 0, 0, Short.MAX_VALUE)
                        .addComponent(cbMarcaBus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnRegistrarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(cbMarcaBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuses)
                        .addGap(18, 18, 18)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRegistrarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(351, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarBusActionPerformed
        registrarBus();
    }//GEN-LAST:event_btnRegistrarBusActionPerformed

    private void menuItemActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarEmpleadoActionPerformed
        FrmEditorEmpleados formadim = new FrmEditorEmpleados();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemActualizarEmpleadoActionPerformed

    private void menuItemRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegresarMenuActionPerformed
        FrmAdminGeneral formadim = new FrmAdminGeneral();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemRegresarMenuActionPerformed

    private void menuItemRegresarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegresarMenu1ActionPerformed
        FrmDirectorLogistica formdirlog = new FrmDirectorLogistica();
        formdirlog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemRegresarMenu1ActionPerformed
     
    
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
        
        MantenimientoBuses archivo = new MantenimientoBuses();
        ArrayList<Buses> buses = archivo.obtenerBuses();

        for (Buses b : buses) {
            if (b.getPlaca().equalsIgnoreCase(placa)) {
                JOptionPane.showMessageDialog(this, "Ya existe un bus registrado con la misma placa: " + placa);
                return;
            }
        }
        
        // Crear el objeto empleado
        Buses objetobus = new Buses(
                placa, modelo, marca, estado, usos
        );

        // Agregar a la lista y guardar
        mantenimiento.Agregar(objetobus);

        try (FileWriter writer = new FileWriter("buses.txt", true)) {
            writer.write(
                objetobus.getPlaca()+ "," +
                objetobus.getModelo() + "," +
                objetobus.getMarca() + "," +
                objetobus.getEstado() + "," +
                objetobus.getUsos() + "\n"
            );

            JOptionPane.showMessageDialog(this, "Datos ingresados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al registrar bus: " + e.getMessage());
        }

        // Reiniciar el campo de código completamente
        txtPlaca.setText("");
        txtModelo.setText("");
        cbMarcaBus.setSelectedIndex(0);
        cbEstado.setSelectedIndex(0);
        
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
    private javax.swing.JButton btnRegistrarBus;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbMarcaBus;
    private javax.swing.JLabel lblBuses;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuBar menuBarPrincipal1;
    private javax.swing.JMenuItem menuItemActualizarEmpleado;
    private javax.swing.JMenuItem menuItemRegresarMenu;
    private javax.swing.JMenuItem menuItemRegresarMenu1;
    private javax.swing.JMenu menuRegistroEmpleados;
    private javax.swing.JMenu menuRegistroEmpleados1;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
