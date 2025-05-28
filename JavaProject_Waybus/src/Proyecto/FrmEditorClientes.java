//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;


// Ventana para editar los datos de un cliente
public class FrmEditorClientes extends javax.swing.JFrame {
    
    private void personalizarBotonGuardar(JButton boton) {
    Color fondo = new Color(0, 120, 215);         // Azul principal
    Color fondoHover = new Color(0, 150, 255);    // Hover
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

    private String[] datosOriginales = new String[7];//para detectar cambios
    
    public FrmEditorClientes() {
        initComponents();
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue
        personalizarBotonGuardar(btnGuardarCambios);
        cargarCodigos();
    }
    
    private void cargarCodigos() {
        MantenimientoClientes archivo = new MantenimientoClientes();
        ArrayList<RegistroClientes> clientes = archivo.obtenerClientes();

        cmbCodigo.removeAllItems();
        cmbCodigo.addItem("-------SELECCIONE-------");
        for (RegistroClientes cli : clientes) {
            cmbCodigo.addItem(cli.getCodigo());
        }
    }
    
        private void limpiarCampos() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDNI.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtEdad.setText("");

        cmbSexo.setSelectedIndex(0);

        // Solo cambia el índice si el combo tiene elementos
        if (cmbCodigo.getItemCount() > 0) {
            cmbCodigo.setSelectedIndex(0);
        }

        for (int i = 0; i < datosOriginales.length; i++) {
            datosOriginales[i] = null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbSexo = new javax.swing.JComboBox<>();
        lblCorreo = new javax.swing.JLabel();
        lblTituloActualizarClientes = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        cmbCodigo = new javax.swing.JComboBox<>();
        lblSexo = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuEditorClientes = new javax.swing.JMenu();
        menuItemListaClientes = new javax.swing.JMenuItem();
        menuItemRetroceder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Editor de Clientes");
        setResizable(false);

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Masculino", "Femenino" }));

        lblCorreo.setText("Correo:");

        lblTituloActualizarClientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTituloActualizarClientes.setText("Actualiza datos de los clientes:");

        lblTelefono.setText("Telefono:");

        lblApellidos.setText("Apellidos:");

        lblEdad.setText("Edad:");

        lblCodigo.setText("Codigo:");

        lblNombres.setText("Nombres:");

        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        cmbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------" }));
        cmbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoActionPerformed(evt);
            }
        });

        lblSexo.setText("Sexo:");

        lblDNI.setText("DNI:");

        MenuEditorClientes.setText("Opciones");

        menuItemListaClientes.setText("Ir a lista clientes");
        menuItemListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaClientesActionPerformed(evt);
            }
        });
        MenuEditorClientes.add(menuItemListaClientes);

        menuItemRetroceder.setText("Retroceder");
        menuItemRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRetrocederActionPerformed(evt);
            }
        });
        MenuEditorClientes.add(menuItemRetroceder);

        jMenuBar1.add(MenuEditorClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres)
                            .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefono)
                                .addComponent(lblCorreo))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEdad)
                                .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(txtDNI))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblTituloActualizarClientes)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTituloActualizarClientes)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(cmbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo))
                .addGap(41, 41, 41)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(497, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        String codigo = (String) cmbCodigo.getSelectedItem();

        boolean sinCambios =
        datosOriginales[0] != null &&
        datosOriginales[0].equals(txtNombres.getText()) &&
        datosOriginales[1].equals(txtApellidos.getText()) &&
        datosOriginales[2].equals(txtDNI.getText()) &&
        datosOriginales[3].equals(txtCorreo.getText()) &&
        datosOriginales[4].equals(txtTelefono.getText()) &&
        datosOriginales[5].equals(txtEdad.getText()) &&
        datosOriginales[6].equals(cmbSexo.getSelectedItem().toString());

        if (sinCambios) {
            JOptionPane.showMessageDialog(this, "No se ha realizado ningún cambio.");
            return;
        }

        // ← AQUI
        int confirmacion = JOptionPane.showConfirmDialog(
            this,
            "¿Estás seguro de que deseas guardar los cambios?",
            "Confirmar guardado",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        if (codigo == null || codigo.equals("-------SELECCIONE-------")) {
            JOptionPane.showMessageDialog(this, "Seleccione un código válido.");
            return;
        }

        MantenimientoClientes archivo = new MantenimientoClientes();
        ArrayList<RegistroClientes> clientes = archivo.obtenerClientes();
        RegistroClientes original = null;

        for (RegistroClientes cli : clientes) {
            if (cli.getCodigo().equals(codigo)) {
                original = cli;
                break;
            }
        }

        if (original == null) {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            return;
        }

        try {
            // Mantener original si el campo está vacío
            String nombres = txtNombres.getText().isEmpty() ? original.getNombres() : txtNombres.getText();
            String apellidos = txtApellidos.getText().isEmpty() ? original.getApellidos() : txtApellidos.getText();
            String dni = txtDNI.getText().isEmpty() ? original.getDni() : txtDNI.getText();
            String correo = txtCorreo.getText().isEmpty() ? original.getCorreo() : txtCorreo.getText().toLowerCase();
            String telefono = txtTelefono.getText().isEmpty() ? original.getTelefono() : txtTelefono.getText();
            String sexo = cmbSexo.getSelectedIndex() <= 0 ? original.getSexo() : cmbSexo.getSelectedItem().toString();
            int edad = txtEdad.getText().isEmpty() ? original.getEdad() : Integer.parseInt(txtEdad.getText());

            // Validaciones de formato
            if (!dni.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos numéricos.");
                return;
            }

            if (!correo.endsWith("@gmail.com") && !correo.endsWith("@outlook.com")) {
                JOptionPane.showMessageDialog(this, "El correo debe terminar en @gmail.com o @outlook.com.");
                return;
            }

            if (!telefono.matches("9\\d{8}")) {
                JOptionPane.showMessageDialog(this, "El teléfono debe comenzar con 9 y tener 9 dígitos.");
                return;
            }

            if (edad < 18 || edad > 65) {
                JOptionPane.showMessageDialog(this, "La edad debe estar entre 18 y 65 años.");
                return;
            }

            // Verificación de datos repetidos en otros empleados (solo DNI, Teléfono, Correo)
            ArrayList<String> conflictos = new ArrayList<>();
            String nombreConflicto = "";

            for (RegistroClientes emp : clientes) {
                if (emp.getCodigo().equals(codigo)) continue; // Ignorar al propio empleado

                boolean coincide = false;

                if (emp.getDni().equals(dni)) {
                    conflictos.add("DNI");
                    coincide = true;
                }
                if (emp.getTelefono().equals(telefono)) {
                    conflictos.add("Teléfono");
                    coincide = true;
                }
                if (emp.getCorreo().equalsIgnoreCase(correo)) {
                    conflictos.add("Correo electrónico");
                    coincide = true;
                }

                if (coincide && nombreConflicto.isEmpty()) {
                    nombreConflicto = emp.getNombres() + " " + emp.getApellidos();
                }
            }

            if (!conflictos.isEmpty()) {
                String mensaje = "No se puede actualizar al empleado \"" + nombres + " " + apellidos + "\" porque los siguientes datos ya están registrados por otro empleado"
                + (nombreConflicto.isEmpty() ? "" : " llamado \"" + nombreConflicto + "\"") + ":\n- "
                + String.join("\n- ", conflictos);
                JOptionPane.showMessageDialog(this, mensaje);
                return;
            }

            // Crear objeto actualizado
            RegistroClientes actualizado = new RegistroClientes(codigo, nombres, apellidos, dni, correo, telefono, edad, sexo);

            boolean exito = archivo.actualizarCliente(actualizado);

            if (exito) {
                JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
                limpiarCampos(); // ← Limpia campos y restablece combo
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el empleado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad inválida. Ingrese un número.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        String codigoSeleccionado = (String) cmbCodigo.getSelectedItem();

        if (codigoSeleccionado == null || codigoSeleccionado.equals("-------SELECCIONE-------")) {
            limpiarCampos(); // limpia todos los campos si no hay selección válida
            return;
        }

        MantenimientoClientes archivo = new MantenimientoClientes();
        ArrayList<RegistroClientes> clientes = archivo.obtenerClientes();

        for (RegistroClientes cli : clientes) {
            if (cli.getCodigo().equals(codigoSeleccionado)) {
                txtNombres.setText(cli.getNombres());
                txtApellidos.setText(cli.getApellidos());
                txtDNI.setText(cli.getDni());
                txtCorreo.setText(cli.getCorreo());
                txtTelefono.setText(cli.getTelefono());
                txtEdad.setText(String.valueOf(cli.getEdad()));
                cmbSexo.setSelectedItem(cli.getSexo());

                // Guardar los datos originales para detección de cambios
                datosOriginales[0] = cli.getNombres();
                datosOriginales[1] = cli.getApellidos();
                datosOriginales[2] = cli.getDni();
                datosOriginales[3] = cli.getCorreo();
                datosOriginales[4] = cli.getTelefono();
                datosOriginales[5] = String.valueOf(cli.getEdad());
                datosOriginales[6] = cli.getSexo();

                break;
            }
        }
    }//GEN-LAST:event_cmbCodigoActionPerformed

    private void menuItemRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRetrocederActionPerformed
        // Validar si hubo cambios
        if (datosOriginales[0] != null) {
            boolean hayCambios =
            !datosOriginales[0].equals(txtNombres.getText()) ||
            !datosOriginales[1].equals(txtApellidos.getText()) ||
            !datosOriginales[2].equals(txtDNI.getText()) ||
            !datosOriginales[3].equals(txtCorreo.getText()) ||
            !datosOriginales[4].equals(txtTelefono.getText()) ||
            !datosOriginales[5].equals(txtEdad.getText()) ||
            !datosOriginales[6].equals(cmbSexo.getSelectedItem().toString());

            if (hayCambios) {
                int respuesta = JOptionPane.showConfirmDialog(this,
                    "Hay cambios sin guardar. ¿Estás seguro de que deseas salir?",
                    "Cambios sin guardar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

                if (respuesta != JOptionPane.YES_OPTION) {
                    return; // Cancelar salida si el usuario elige "No"
                }
            }
        }

        FrmRegistroClientes formadim = new FrmRegistroClientes();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemRetrocederActionPerformed

    private void menuItemListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaClientesActionPerformed
        FrmListaClientes formadim = new FrmListaClientes();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemListaClientesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditorClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditorClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditorClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditorClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditorClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuEditorClientes;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloActualizarClientes;
    private javax.swing.JMenuItem menuItemListaClientes;
    private javax.swing.JMenuItem menuItemRetroceder;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
