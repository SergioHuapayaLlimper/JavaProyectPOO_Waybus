
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
        btnRetornoMenúAdmin = new javax.swing.JButton();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        lblEdad = new javax.swing.JLabel();
        btnEditorDeEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Empleados");
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

        btnRetornoMenúAdmin.setText("Regresar al Menú");
        btnRetornoMenúAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornoMenúAdminActionPerformed(evt);
            }
        });

        lblApellidos.setText("Apellidos:");

        lblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Masculino", "Femenino" }));

        lblEdad.setText("Edad:");

        btnEditorDeEmpleados.setText("Actualizar Empleado");
        btnEditorDeEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorDeEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnRegistroDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditorDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetornoMenúAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
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
                                        .addComponent(cmbCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblTituloMenuAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistroDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditorDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetornoMenúAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        setSize(new java.awt.Dimension(620, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornoMenúAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornoMenúAdminActionPerformed
        FrmAdminGeneral formadim = new FrmAdminGeneral();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornoMenúAdminActionPerformed

    private void btnRegistroDeEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeEmpleadosActionPerformed
        // Validaciones de campos
        String codigo = txtCodigo.getText().trim();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el código del empleado.");
        return;
        }
        if (!codigo.matches("^U-\\d{5}$")) {
            JOptionPane.showMessageDialog(this, "El código debe tener el formato U-XXXXX (exactamente 5 dígitos).");
        return;
        }
        if (txtNombres.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar los nombres del empleado.");
                return;
        }
        if (txtApellidos.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar los apellidos del empleado.");
                return;
        }
        String dni = txtDNI.getText().trim();
        if (dni.isEmpty() || !dni.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido de 8 dígitos.");
                return;
        }
        String correo = txtCorreo.getText().trim().toLowerCase();
        if (correo.isEmpty() || !(correo.endsWith("@gmail.com") || correo.endsWith("@outlook.com"))) {
                JOptionPane.showMessageDialog(this, "El correo debe terminar en @gmail.com o @outlook.com.");
                return;
        }
        String telefono = txtTelefono.getText().trim();
        if (telefono.isEmpty() || !telefono.matches("9\\d{8}")) {
                JOptionPane.showMessageDialog(this, "El teléfono debe comenzar con 9 y tener 9 dígitos.");
                return;
        }
        if (cmbOficina.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una oficina.");
                return;
        }
        if (cmbCargo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un cargo.");
                return;
        }
        String edadTexto = txtEdad.getText().trim();
        if (edadTexto.isEmpty() || !edadTexto.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.");
                return;
        }
        int edad = Integer.parseInt(edadTexto);
        if (edad < 20 || edad > 70) {
                JOptionPane.showMessageDialog(this, "La edad debe estar entre 20 y 70 años.");
                return;
        }
        if (cmbSexo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar el sexo del empleado.");
                return;
        }
	if (!codigo.matches("^U-\\d{5}$")) {
		JOptionPane.showMessageDialog(this, "El código debe tener el formato U-XXXXX (exactamente 5 dígitos).");
		return;
	}

        // Verificar si el código ya está registrado
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
                        camposDuplicados.add("Codigo");
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
                String mensaje = "No se puede registrar al empleado \"" + txtNombres.getText() + " " + txtApellidos.getText()
                        + "\" porque ya existe un empleado registrado"
                        + (!nombreEmpleadoExistente.isEmpty() ? " con el nombre \"" + nombreEmpleadoExistente + "\"" : "")
                        + " que tiene los siguientes datos repetidos:\n- "
                        + String.join("\n- ", camposDuplicados);
                JOptionPane.showMessageDialog(this, mensaje);
                return;
        }

        // Crear el objeto empleado
        RegistroEmpleados objetoempleado = new RegistroEmpleados(
                txtCodigo.getText(),
                txtNombres.getText(),
                txtApellidos.getText(),
                txtDNI.getText(),
                txtCorreo.getText(),
                txtTelefono.getText(),
                cmbOficina.getSelectedItem().toString(),
                cmbCargo.getSelectedItem().toString(),
                Integer.parseInt(txtEdad.getText()),
                cmbSexo.getSelectedItem().toString()
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

    private void btnEditorDeEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorDeEmpleadosActionPerformed
        FrmEditorEmpleados formadim = new FrmEditorEmpleados();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditorDeEmpleadosActionPerformed

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
    private javax.swing.JButton btnEditorDeEmpleados;
    private javax.swing.JButton btnRegistroDeEmpleados;
    private javax.swing.JButton btnRetornoMenúAdmin;
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
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
