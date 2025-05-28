//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FrmEditorEmpleados extends javax.swing.JFrame {

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
    
    private String[] datosOriginales = new String[9];
    
    public FrmEditorEmpleados() {
        initComponents();
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue
        personalizarBotonGuardar(btnGuardarCambios);
        cargarCodigos();
    }
    
    private void cargarCodigos() {
        MantenimientoEmpleados archivo = new MantenimientoEmpleados();
        ArrayList<RegistroEmpleados> empleados = archivo.obtenerEmpleados();

        cmbCodigo.removeAllItems();
        cmbCodigo.addItem("-------SELECCIONE-------");
        for (RegistroEmpleados emp : empleados) {
            cmbCodigo.addItem(emp.getCodigo());
        }
    }

    private void limpiarCampos() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDNI.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtEdad.setText("");

        cmbOficina.setSelectedIndex(0);
        cmbCargo.setSelectedIndex(0);
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

        txtDNI = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        lblTituloActualizarEmpleado = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblOficina = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        cmbOficina = new javax.swing.JComboBox<>();
        lblDNI = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnGuardarCambios = new javax.swing.JButton();
        cmbCodigo = new javax.swing.JComboBox<>();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuEditorEmpleados = new javax.swing.JMenu();
        menuItemListaEmpleados = new javax.swing.JMenuItem();
        menuItemRetroceder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Editor de Empleados");
        setResizable(false);

        lblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Masculino", "Femenino" }));

        lblTituloActualizarEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTituloActualizarEmpleado.setText("Actualiza datos del empleado:");

        lblEdad.setText("Edad:");

        lblOficina.setText("Oficina:");

        lblCodigo.setText("Codigo:");

        lblCargo.setText("Cargo:");

        lblNombres.setText("Nombres:");

        cmbOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Lima", "Cañete", "Cerro Azul", "Ica", "Atíco", "Camana", "Alto Siguas", "Arequipa" }));

        lblDNI.setText("DNI:");

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Operario de Rutas", "Conductor", "Counter", "Gerente de Finanzas", "Analista de Viajes", "Director de Logística", "Responsable de Recursos Humanos" }));

        lblCorreo.setText("Correo:");

        lblTelefono.setText("Telefono:");

        lblApellidos.setText("Apellidos:");

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

        menuEditorEmpleados.setText("Opciones");

        menuItemListaEmpleados.setText("Ir a Lista Empleados");
        menuItemListaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaEmpleadosActionPerformed(evt);
            }
        });
        menuEditorEmpleados.add(menuItemListaEmpleados);

        menuItemRetroceder.setText("Retroceder");
        menuItemRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRetrocederActionPerformed(evt);
            }
        });
        menuEditorEmpleados.add(menuItemRetroceder);

        menuBarPrincipal.add(menuEditorEmpleados);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
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
                                .addComponent(lblCorreo)
                                .addComponent(lblOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbOficina, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEdad)
                                .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdad)
                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addGap(25, 25, 25)
                        .addComponent(lblTituloActualizarEmpleado)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lblTituloActualizarEmpleado)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOficina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo))
                .addGap(28, 28, 28)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        setSize(new java.awt.Dimension(528, 591));
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
            datosOriginales[5].equals(cmbOficina.getSelectedItem().toString()) &&
            datosOriginales[6].equals(cmbCargo.getSelectedItem().toString()) &&
            datosOriginales[7].equals(txtEdad.getText()) &&
            datosOriginales[8].equals(cmbSexo.getSelectedItem().toString());

        if (sinCambios) {
            JOptionPane.showMessageDialog(this, "No se ha realizado ningún cambio.");
            return;
        }
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

        MantenimientoEmpleados archivo = new MantenimientoEmpleados();
        ArrayList<RegistroEmpleados> empleados = archivo.obtenerEmpleados();
        RegistroEmpleados original = null;

        for (RegistroEmpleados emp : empleados) {
                if (emp.getCodigo().equals(codigo)) {
                        original = emp;
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
                String oficina = cmbOficina.getSelectedIndex() <= 0 ? original.getOficina() : cmbOficina.getSelectedItem().toString();
                String cargo = cmbCargo.getSelectedIndex() <= 0 ? original.getCargo() : cmbCargo.getSelectedItem().toString();
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

                for (RegistroEmpleados emp : empleados) {
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
                RegistroEmpleados actualizado = new RegistroEmpleados(
                        codigo, nombres, apellidos, dni, correo,
                        telefono, oficina, cargo, edad, sexo
                );

                boolean exito = archivo.actualizarEmpleado(actualizado);

                if (exito) {
                        JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
                        limpiarCampos(); // ← Limpia campos y restablece combo
                } else {
                        JOptionPane.showMessageDialog(this, "No se pudo actualizar el empleado.");
                }
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Edad inválida. Ingrese un número.");
        } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void cmbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoActionPerformed
        String codigoSeleccionado = (String) cmbCodigo.getSelectedItem();

        if (codigoSeleccionado == null || codigoSeleccionado.equals("-------SELECCIONE-------")) {
            limpiarCampos(); // limpia todos los campos si no hay selección válida
            return;
        }

        MantenimientoEmpleados archivo = new MantenimientoEmpleados();
        ArrayList<RegistroEmpleados> empleados = archivo.obtenerEmpleados();

        for (RegistroEmpleados emp : empleados) {
            if (emp.getCodigo().equals(codigoSeleccionado)) {
                txtNombres.setText(emp.getNombres());
                txtApellidos.setText(emp.getApellidos());
                txtDNI.setText(emp.getDni());
                txtCorreo.setText(emp.getCorreo());
                txtTelefono.setText(emp.getTelefono());
                cmbOficina.setSelectedItem(emp.getOficina());
                cmbCargo.setSelectedItem(emp.getCargo());
                txtEdad.setText(String.valueOf(emp.getEdad()));
                cmbSexo.setSelectedItem(emp.getSexo());

                // Guardar los datos originales para detección de cambios
                datosOriginales[0] = emp.getNombres();
                datosOriginales[1] = emp.getApellidos();
                datosOriginales[2] = emp.getDni();
                datosOriginales[3] = emp.getCorreo();
                datosOriginales[4] = emp.getTelefono();
                datosOriginales[5] = emp.getOficina();
                datosOriginales[6] = emp.getCargo();
                datosOriginales[7] = String.valueOf(emp.getEdad());
                datosOriginales[8] = emp.getSexo();

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
                !datosOriginales[5].equals(cmbOficina.getSelectedItem().toString()) ||
                !datosOriginales[6].equals(cmbCargo.getSelectedItem().toString()) ||
                !datosOriginales[7].equals(txtEdad.getText()) ||
                !datosOriginales[8].equals(cmbSexo.getSelectedItem().toString());

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

        FrmRegistroEmpleados formadim = new FrmRegistroEmpleados();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemRetrocederActionPerformed

    private void menuItemListaEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaEmpleadosActionPerformed
        FrmListaEmpleados formadim = new FrmListaEmpleados();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemListaEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditorEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditorEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbCodigo;
    private javax.swing.JComboBox<String> cmbOficina;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblOficina;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloActualizarEmpleado;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuEditorEmpleados;
    private javax.swing.JMenuItem menuItemListaEmpleados;
    private javax.swing.JMenuItem menuItemRetroceder;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
