
package Proyecto;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//Formulario de registro de empleados.
public class FrmRegistroEmpleados extends javax.swing.JFrame {

    MantenimientoEmpleados mantenimiento;
    
public FrmRegistroEmpleados() {
    initComponents();
    mantenimiento = new MantenimientoEmpleados();

    // Acción con Enter para pasar de un campo a otro
    txtCodigo.addActionListener(e -> txtNombres.requestFocus());
    txtNombres.addActionListener(e -> txtApellidos.requestFocus());
    txtApellidos.addActionListener(e -> txtDNI.requestFocus());
    txtDNI.addActionListener(e -> txtCorreo.requestFocus());
    txtCorreo.addActionListener(e -> txtTelefono.requestFocus());
    txtTelefono.addActionListener(e -> cmbOficina.requestFocus());

    cmbOficina.addActionListener(e -> {
        if (cmbOficina.getSelectedIndex() > 0) {
            cmbCargo.requestFocus();
        }
    });

    cmbCargo.addActionListener(e -> {
        if (cmbCargo.getSelectedIndex() > 0) {
            txtEdad.requestFocus();
        }
    });

    txtEdad.addActionListener(e -> cmbSexo.requestFocus());

    cmbSexo.addActionListener(e -> {
        if (cmbSexo.getSelectedIndex() > 0) {
            btnRegistroDeEmpleados.requestFocus();
        }
    });

    // Al presionar Enter en el botón, ejecuta su acción
    getRootPane().setDefaultButton(btnRegistroDeEmpleados);
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloMenuAdministrador = new javax.swing.JLabel();
        btnRegistroDeEmpleados = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblOficina = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        cmbOficina = new javax.swing.JComboBox<>();
        cmbCargo = new javax.swing.JComboBox<>();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lblEdad = new javax.swing.JLabel();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuRegistroEmpleados = new javax.swing.JMenu();
        menuItemActualizarEmpleado = new javax.swing.JMenuItem();
        menuItemRegresarMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Registro de Empleados");
        setResizable(false);

        lblTituloMenuAdministrador.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTituloMenuAdministrador.setText("Ingresa los datos de los empleados:");

        btnRegistroDeEmpleados.setText("Registrar Empleado");
        btnRegistroDeEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeEmpleadosActionPerformed(evt);
            }
        });

        lblCodigo.setText("Codigo:");

        lblNombres.setText("Nombres:");

        lblDNI.setText("DNI:");

        lblCorreo.setText("Correo:");

        lblTelefono.setText("Telefono:");

        lblOficina.setText("Oficina:");

        lblCargo.setText("Cargo:");

        cmbOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Lima", "Cañete", "Cerro Azul", "Ica", "Atíco", "Camana", "Alto Siguas", "Arequipa" }));

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Operario de Rutas", "Conductor", "Counter", "Gerente de Finanzas", "Analista de Viajes", "Director de Logística", "Responsable de Recursos Humanos" }));

        lblApellidos.setText("Apellidos:");

        lblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Masculino", "Femenino" }));

        lblEdad.setText("Edad:");

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

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloMenuAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(txtDNI))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(txtApellidos))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCodigo)
                                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblEdad)
                                                .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(30, 30, 30)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEdad)
                                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                .addComponent(cmbCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRegistroDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTituloMenuAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(30, 30, 30)
                .addComponent(btnRegistroDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(493, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroDeEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeEmpleadosActionPerformed
        // Validaciones de campos
        String codigo = txtCodigo.getText().trim();
        String nombres = txtNombres.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        String dni = txtDNI.getText().trim();
        String correo = txtCorreo.getText().trim().toLowerCase();
        String telefono = txtTelefono.getText().trim();
        String edadTexto = txtEdad.getText().trim();
        String sexo = cmbSexo.getSelectedItem().toString().trim();
        String oficina = cmbOficina.getSelectedItem().toString().trim();
        String cargo = cmbCargo.getSelectedItem().toString().trim();

        // Validar campos vacíos
        if (codigo.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || dni.isEmpty()
                || correo.isEmpty() || telefono.isEmpty() || edadTexto.isEmpty()
                || cmbSexo.getSelectedIndex() == 0 || cmbOficina.getSelectedIndex() == 0
                || cmbCargo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }

        // Validar formato del código: "U-XXXXX"
        if (!codigo.matches("^U-\\d{5}$")) {
            JOptionPane.showMessageDialog(this, "El código debe tener el formato U-XXXXX (exactamente 5 dígitos).");
            return;
        }

        // Validar que ningún campo contenga espacios intermedios
        if (codigo.contains(" ") || nombres.contains(" ") || apellidos.contains(" ") ||
            dni.contains(" ") || correo.contains(" ") || telefono.contains(" ") || edadTexto.contains(" ")) {
            JOptionPane.showMessageDialog(this, "Ningún campo debe contener espacios en blanco.");
            return;
        }

        // Validar nombres y apellidos (solo letras)
        if (!nombres.matches("[A-Za-zÁÉÍÓÚáéíóúñÑ]+")) {
            JOptionPane.showMessageDialog(this, "Los nombres solo deben contener letras sin espacios ni símbolos.");
            return;
        }
        if (!apellidos.matches("[A-Za-zÁÉÍÓÚáéíóúñÑ]+")) {
            JOptionPane.showMessageDialog(this, "Los apellidos solo deben contener letras sin espacios ni símbolos.");
            return;
        }

        // Validar DNI: exactamente 8 dígitos
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido de 8 dígitos.");
            return;
        }

        // Validar correo
        if (!correo.matches("^[A-Za-z0-9._%+-]+@(gmail\\.com|outlook\\.com)$")) {
            JOptionPane.showMessageDialog(this, "El correo debe ser de dominio @gmail.com o @outlook.com.");
            return;
        }

        // Validar teléfono: empieza con 9 y tiene 9 dígitos
        if (!telefono.matches("9\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El teléfono debe comenzar con 9 y tener 9 dígitos.");
            return;
        }

        // Validar edad
        if (!edadTexto.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.");
            return;
        }
        int edad = Integer.parseInt(edadTexto);
        if (edad < 20 || edad > 70) {
            JOptionPane.showMessageDialog(this, "La edad debe estar entre 20 y 70 años.");
            return;
        }

        // Verificar duplicados
        MantenimientoEmpleados archivo = new MantenimientoEmpleados();
        ArrayList<RegistroEmpleados> empleados = archivo.obtenerEmpleados();

        for (RegistroEmpleados emp : empleados) {
            if (emp.getCodigo().equalsIgnoreCase(codigo)) {
                JOptionPane.showMessageDialog(this, "Ya existe un empleado registrado con el mismo código: " + codigo);
                return;
            }
        }

        // Validar duplicados en DNI, correo, teléfono
        ArrayList<String> camposDuplicados = new ArrayList<>();
        String nombreEmpleadoExistente = "";

        for (RegistroEmpleados emp : empleados) {
            boolean coincide = false;

            if (emp.getCodigo().equals(codigo)) {
                camposDuplicados.add("Código");
                coincide = true;
            }
            if (emp.getDni().equals(dni)) {
                camposDuplicados.add("DNI");
                coincide = true;
            }
            if (emp.getTelefono().equals(telefono)) {
                camposDuplicados.add("Teléfono");
                coincide = true;
            }
            if (emp.getCorreo().equalsIgnoreCase(correo)) {
                camposDuplicados.add("Correo electrónico");
                coincide = true;
            }

            if (coincide && nombreEmpleadoExistente.isEmpty()) {
                nombreEmpleadoExistente = emp.getNombres() + " " + emp.getApellidos();
            }
        }

        if (!camposDuplicados.isEmpty()) {
            String mensaje = "No se puede registrar al empleado \"" + nombres + " " + apellidos
                    + "\" porque ya existe un empleado registrado"
                    + (!nombreEmpleadoExistente.isEmpty() ? " con el nombre \"" + nombreEmpleadoExistente + "\"" : "")
                    + " que tiene los siguientes datos repetidos:\n- "
                    + String.join("\n- ", camposDuplicados);
            JOptionPane.showMessageDialog(this, mensaje);
            return;
        }
        
        // Crear el objeto empleado
        RegistroEmpleados objetoempleado = new RegistroEmpleados(
                codigo, nombres, apellidos, dni, correo, telefono, oficina, cargo, edad, sexo
        );

        // Agregar a la lista y guardar
        mantenimiento.AgregarEmpleado(objetoempleado);

        try (FileWriter writer = new FileWriter("usuarios.txt", true)) {
            writer.write(
                objetoempleado.getCodigo() + "," +
                objetoempleado.getNombres() + "," +
                objetoempleado.getApellidos() + "," +
                objetoempleado.getDni() + "," +
                objetoempleado.getCorreo() + "," +
                objetoempleado.getTelefono() + "," +
                objetoempleado.getOficina() + "," +
                objetoempleado.getCargo() + "," +
                objetoempleado.getEdad() + "," +
                objetoempleado.getSexo() + "\n"
            );

            JOptionPane.showMessageDialog(this, "Datos ingresados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }

        // Limpiar campos
        txtCodigo.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDNI.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        cmbOficina.setSelectedIndex(0);
        cmbCargo.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        txtEdad.setText("");
    }//GEN-LAST:event_btnRegistroDeEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistroDeEmpleados;
    private javax.swing.JComboBox<String> cmbCargo;
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
    private javax.swing.JLabel lblTituloMenuAdministrador;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemActualizarEmpleado;
    private javax.swing.JMenuItem menuItemRegresarMenu;
    private javax.swing.JMenu menuRegistroEmpleados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
