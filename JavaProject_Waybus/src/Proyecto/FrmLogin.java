//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
// Ventana de inicio de sesión
public class FrmLogin extends javax.swing.JFrame {

    private void personalizarBotonLogin(JButton boton) {
        Color fondo = new Color(0, 120, 215);         // Azul principal
        Color fondoHover = new Color(0, 150, 255);    // Hover más claro
        Color texto = Color.WHITE;

        boton.setBackground(fondo);
        boton.setForeground(texto);
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setContentAreaFilled(true);
        boton.setOpaque(true);

        // Hover
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
    
    public FrmLogin() {
        initComponents();        
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue        
        personalizarBotonLogin(btnIniciarSesion);        
        // Navegación con Enter
        txtUsuario.addActionListener((java.awt.event.ActionEvent evt) -> {
            pfContraseña.requestFocus();
        });
        pfContraseña.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnIniciarSesion.doClick();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblMensaje1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pfContraseña = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTitulo.setText("Bienvenid@");

        lblMensaje1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblMensaje1.setText("Inicio de Sesión:");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContra.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblContra.setText("Contraseña:");

        btnIniciarSesion.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblMensaje1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContra)
                            .addComponent(lblUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContra)
                    .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(524, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String usuarioIngresado = txtUsuario.getText(); 
        String contraseñaIngresada = new String(pfContraseña.getPassword());
        
        // Acceso para el admin principal
        if (usuarioIngresado.equals("admin") && contraseñaIngresada.equals("1234")) {
            FrmAdminGeneral ventanaAdmin = new FrmAdminGeneral();
            ventanaAdmin.setVisible(true);
            this.dispose();
        } else {
    // Validación para empleados desde el archivo usuarios.txt
            boolean accesoConcedido = false;
            String cargo = "";
        
            try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
               String linea;
               while ((linea = reader.readLine()) != null) {
                    String[] partes = linea.split(",");
                    if (partes.length == 10) {
                        String codigoEmpleado = partes[0].trim();
                        String clave = partes[3].trim();
                        String cargoactivo = partes[7].trim();

                        if (usuarioIngresado.equals(codigoEmpleado) && contraseñaIngresada.equals(clave)) {
                            accesoConcedido = true;
                            cargo = cargoactivo;
                            break;
                        }
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (accesoConcedido) {
                switch(cargo.toLowerCase()){
                    case "counter" -> {
                        new FrmCounter().setVisible(true);
                        this.dispose();
                    }
                    case "conductor" -> {
                        new FrmConductor().setVisible(true);
                        this.dispose();
                    }
                    case "operario de rutas" -> {
                        new FrmOperarioRutas().setVisible(true);
                        this.dispose();
                    }
                    case "gerente de finanzas" -> {
                        new FrmGerenteFinanzas().setVisible(true);
                        this.dispose();
                    }
                    case "analista de viajes" -> {
                        new FrmAnalistaViajes().setVisible(true);
                        this.dispose();
                    }
                    case "director de logistica" -> {
                        new FrmDirectorLogistica().setVisible(true);
                        this.dispose();
                    }
                    case "responsable de recursos humanos" -> {
                        new FrmResponsableRRHH().setVisible(true);
                        this.dispose();
                    }
                    default -> JOptionPane.showMessageDialog(this, "Cargo no reconocido: " + cargo);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
