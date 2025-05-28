//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

// Ventana del menú del administrador general
public class FrmAdminGeneral extends javax.swing.JFrame {

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
    
    public FrmAdminGeneral() {
        initComponents();//carga la interfaz
        
        // Cambiar el color de fondo del panel principal
        panelPrincipal.setBackground(new Color(240, 248, 255)); // Azul claro suave
        
        personalizarBoton(btnRegistroDeEmpleados);
        personalizarBoton(btnMostrarListaDeEmpleados);
        personalizarBoton(btnMostrarListaDeClientes);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblTituloMenuAdministrador = new javax.swing.JLabel();
        btnRegistroDeEmpleados = new javax.swing.JButton();
        btnMostrarListaDeClientes = new javax.swing.JButton();
        btnMostrarListaDeEmpleados = new javax.swing.JButton();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuAdminGeneral = new javax.swing.JMenu();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Administrador General");
        setResizable(false);

        lblTituloMenuAdministrador.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTituloMenuAdministrador.setText("Bienvenid@ al Menú de opciones:");

        btnRegistroDeEmpleados.setText("Registro de Empleados");
        btnRegistroDeEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeEmpleadosActionPerformed(evt);
            }
        });

        btnMostrarListaDeClientes.setText("Mostrar Lista de Clientes");
        btnMostrarListaDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaDeClientesActionPerformed(evt);
            }
        });

        btnMostrarListaDeEmpleados.setText("Mostrar Lista de Empleados");
        btnMostrarListaDeEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaDeEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTituloMenuAdministrador)
                .addContainerGap(304, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnRegistroDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarListaDeEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarListaDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTituloMenuAdministrador)
                .addGap(36, 36, 36)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistroDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarListaDeEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarListaDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        menuAdminGeneral.setText("Opciones");

        menuItemCerrarSesion.setText("Cerrar Sesión ");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuAdminGeneral.add(menuItemCerrarSesion);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuAdminGeneral.add(menuItemSalir);

        menuBarPrincipal.add(menuAdminGeneral);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(696, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Abrir formulario de registro de empleados
    private void btnRegistroDeEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeEmpleadosActionPerformed
        FrmRegistroEmpleados formularioregistro = new FrmRegistroEmpleados();
        formularioregistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroDeEmpleadosActionPerformed

    private void btnMostrarListaDeEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaDeEmpleadosActionPerformed
        FrmListaEmpleados listaemple = new FrmListaEmpleados();
        listaemple.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarListaDeEmpleadosActionPerformed
    
    private void btnMostrarListaDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaDeClientesActionPerformed
        FrmListaClientes formadim = new FrmListaClientes();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarListaDeClientesActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        FrmLogin formlogin = new FrmLogin();
        formlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdminGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarListaDeClientes;
    private javax.swing.JButton btnMostrarListaDeEmpleados;
    private javax.swing.JButton btnRegistroDeEmpleados;
    private javax.swing.JLabel lblTituloMenuAdministrador;
    private javax.swing.JMenu menuAdminGeneral;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
