//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

//Interfaz del Operario de Rutas
public class FrmOperarioRutas extends javax.swing.JFrame {

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
    
    public FrmOperarioRutas() {
        initComponents();
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue
        personalizarBoton(btnMostrarRutas);
        personalizarBoton(btnRegistroDeRutas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnRegistroDeRutas = new javax.swing.JButton();
        btnMostrarRutas = new javax.swing.JButton();
        menuBarPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Operario de Rutas");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setText("Bienvenid@, a la interfaz de Operario de Rutas");

        btnRegistroDeRutas.setText("Registro de Rutas");
        btnRegistroDeRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeRutasActionPerformed(evt);
            }
        });

        btnMostrarRutas.setText("Mostrar Rutas");
        btnMostrarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRutasActionPerformed(evt);
            }
        });

        jMenu1.setText("Opciones");

        menuItemCerrarSesion.setText("Cerrar Sesión ");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCerrarSesion);

        menuBarPrincipal.add(jMenu1);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(btnMostrarRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistroDeRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistroDeRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(652, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        FrmLogin formlogin = new FrmLogin();
        formlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void btnRegistroDeRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDeRutasActionPerformed
        FrmRutas formularioregistro = new FrmRutas();
        formularioregistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroDeRutasActionPerformed

    private void btnMostrarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRutasActionPerformed
        FrmListaRutas formulariolistarutas = new FrmListaRutas();
        formulariolistarutas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarRutasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOperarioRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOperarioRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOperarioRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOperarioRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOperarioRutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarRutas;
    private javax.swing.JButton btnRegistroDeRutas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    // End of variables declaration//GEN-END:variables
}
