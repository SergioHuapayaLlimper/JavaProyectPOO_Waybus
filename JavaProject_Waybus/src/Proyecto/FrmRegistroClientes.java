//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.*;

    public class FrmRegistroClientes extends javax.swing.JFrame {
        
    MantenimientoClientes mantenimientoClientes;
    
    private void personalizarBotonRegistrar(JButton boton) {
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

    class CodigoClienteFilter extends DocumentFilter {
        private static final String PREFIJO = "C-";
        private static final int MAX_DIGITOS = 5;

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            String textoActual = fb.getDocument().getText(0, fb.getDocument().getLength());
            String nuevoTexto = new StringBuilder(textoActual).insert(offset, string).toString();

            if (nuevoTexto.startsWith(PREFIJO) && nuevoTexto.substring(PREFIJO.length()).matches("\\d{0," + MAX_DIGITOS + "}")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException {
            String textoActual = fb.getDocument().getText(0, fb.getDocument().getLength());
            StringBuilder sb = new StringBuilder(textoActual);
            sb.replace(offset, offset + length, string);
            String nuevoTexto = sb.toString();

            if (nuevoTexto.startsWith(PREFIJO) && nuevoTexto.substring(PREFIJO.length()).matches("\\d{0," + MAX_DIGITOS + "}")) {
                super.replace(fb, offset, length, string, attr);
            }
        }

        @Override
        public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
            if (offset < PREFIJO.length()) {
                return; // No se permite borrar el prefijo
            }
            super.remove(fb, offset, length);
        }
    }

    class NumericLimitFilter extends DocumentFilter {
        private int maxLength;

        public NumericLimitFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (string.matches("\\d*") && fb.getDocument().getLength() + string.length() <= maxLength) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException {
            if (string.matches("\\d*") && fb.getDocument().getLength() - length + string.length() <= maxLength) {
                super.replace(fb, offset, length, string, attr);
            }
        }
    }
    
    public FrmRegistroClientes() {
        initComponents();
        
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue
        
        personalizarBotonRegistrar(btnRegistroDeClientes);
        
        mantenimientoClientes = new MantenimientoClientes();
        
        // Código con prefijo C-
        txtCodigo.setText("C-");
        ((AbstractDocument) txtCodigo.getDocument()).setDocumentFilter(new CodigoClienteFilter());

        // DNI: máximo 8 dígitos
        ((AbstractDocument) txtDNI.getDocument()).setDocumentFilter(new NumericLimitFilter(8));

        // Teléfono: máximo 9 dígitos
        ((AbstractDocument) txtTelefono.getDocument()).setDocumentFilter(new NumericLimitFilter(9));
        
        // Acción con Enter para pasar de un campo a otro en Registro de Clientes
        txtCodigo.addActionListener(e -> txtNombre.requestFocus());
        txtNombre.addActionListener(e -> txtApellido.requestFocus());
        txtApellido.addActionListener(e -> txtDNI.requestFocus());
        txtDNI.addActionListener(e -> txtCorreo.requestFocus());
        txtCorreo.addActionListener(e -> txtTelefono.requestFocus());
        txtTelefono.addActionListener(e -> txtEdad.requestFocus());
        txtEdad.addActionListener(e -> cmbSexo.requestFocus());

        cmbSexo.addActionListener(e -> {
            if (cmbSexo.getSelectedIndex() > 0) {
                btnRegistroDeClientes.requestFocus();
            }
        });

        // Al presionar Enter en el botón, ejecuta su acción
        getRootPane().setDefaultButton(btnRegistroDeClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelefono = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        lblTituloMenuClientes = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        btnRegistroDeClientes = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuRegistroClientes = new javax.swing.JMenu();
        menuItemActualizarCliente = new javax.swing.JMenuItem();
        menuItemRegresarMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Registro de Clientes");
        setResizable(false);

        lblTelefono.setText("Telefono:");

        lblApellidos.setText("Apellidos:");

        lblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------SELECCIONE-------", "Masculino", "Femenino" }));

        lblTituloMenuClientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTituloMenuClientes.setText("Ingresa los datos de los clientes:");

        lblEdad.setText("Edad:");

        btnRegistroDeClientes.setText("Registrar Cliente");
        btnRegistroDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeClientesActionPerformed(evt);
            }
        });

        lblCodigo.setText("Codigo:");

        lblNombres.setText("Nombres:");

        lblDNI.setText("DNI:");

        lblCorreo.setText("Correo:");

        menuRegistroClientes.setText("Opciones");

        menuItemActualizarCliente.setText("Actualizar Cliente");
        menuItemActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarClienteActionPerformed(evt);
            }
        });
        menuRegistroClientes.add(menuItemActualizarCliente);

        menuItemRegresarMenu.setText("Regresar al Menú");
        menuItemRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegresarMenuActionPerformed(evt);
            }
        });
        menuRegistroClientes.add(menuItemRegresarMenu);

        menuBarPrincipal.add(menuRegistroClientes);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtDNI))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtApellido))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblCorreo))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo)
                            .addComponent(txtTelefono)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad)
                            .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEdad)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTituloMenuClientes)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistroDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTituloMenuClientes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo))
                .addGap(31, 31, 31)
                .addComponent(btnRegistroDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(493, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeClientesActionPerformed
        // Obtener los textos ingresados y eliminar espacios innecesarios
        String codigo = txtCodigo.getText().trim();
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String dni = txtDNI.getText().trim();
        String correo = txtCorreo.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String edadStr = txtEdad.getText().trim();
        String sexo = cmbSexo.getSelectedItem().toString().trim();

        // Validar formato del código: "C-XXXXX"
        if (!codigo.matches("C-\\d{5}")) {
            JOptionPane.showMessageDialog(this, "El código debe tener el formato C-XXXXX (5 dígitos).");
            return;
        }

        // Validar que ningún campo tenga espacios en medio
        if (codigo.contains(" ") || nombre.contains(" ") || apellido.contains(" ") ||
            dni.contains(" ") || correo.contains(" ") || telefono.contains(" ") ||
            edadStr.contains(" ") || sexo.contains(" ")) {
            JOptionPane.showMessageDialog(this, "Ningún campo debe contener espacios.");
            return;
        }

        // Validar que nombre y apellido solo contengan letras (sin espacios ni números ni símbolos)
        if (!nombre.matches("[A-Za-zÁÉÍÓÚáéíóúñÑ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras sin espacios ni símbolos.");
            return;
        }

        if (!apellido.matches("[A-Za-zÁÉÍÓÚáéíóúñÑ]+")) {
            JOptionPane.showMessageDialog(this, "El apellido solo debe contener letras sin espacios ni símbolos.");
            return;
        }

        // Validar correo: solo @gmail.com o @outlook.com
        if (!correo.matches("^[A-Za-z0-9._%+-]+@(gmail\\.com|outlook\\.com)$")) {
            JOptionPane.showMessageDialog(this, "El correo debe ser de dominio @gmail.com o @outlook.com.");
            return;
        }

        // Validar que la edad sea numérica
        int edad;
        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.");
            return;
        }

        // Crear cliente y guardar
        RegistroClientes cliente = new RegistroClientes(
            codigo, nombre, apellido, dni, correo, telefono, edad, sexo
        );

        mantenimientoClientes.AgregarCliente(cliente);

        // Guardar en archivo
        try (FileWriter writer = new FileWriter("clientes.txt", true)) {
            writer.write(codigo + "," + nombre + "," + apellido + "," + dni + "," +
                         correo + "," + telefono + "," + edad + "," + sexo + "\n");

            JOptionPane.showMessageDialog(this, "Cliente registrado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al registrar cliente: " + e.getMessage());
        }

        // Limpiar campos
        txtCodigo.setDocument(new javax.swing.text.PlainDocument());// Reiniciar campo de código correctamente
        txtCodigo.setText("C-"); // para que se reinicie con el prefijo
        ((AbstractDocument) txtCodigo.getDocument()).setDocumentFilter(new CodigoClienteFilter());
        txtNombre.setText("");
        txtApellido.setText("");
        txtDNI.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtEdad.setText("");
        cmbSexo.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegistroDeClientesActionPerformed

    private void menuItemRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegresarMenuActionPerformed
        FrmCounter formCounter = new FrmCounter();
        formCounter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemRegresarMenuActionPerformed

    private void menuItemActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarClienteActionPerformed
        FrmEditorClientes formCounter = new FrmEditorClientes();
        formCounter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemActualizarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistroDeClientes;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloMenuClientes;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemActualizarCliente;
    private javax.swing.JMenuItem menuItemRegresarMenu;
    private javax.swing.JMenu menuRegistroClientes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
