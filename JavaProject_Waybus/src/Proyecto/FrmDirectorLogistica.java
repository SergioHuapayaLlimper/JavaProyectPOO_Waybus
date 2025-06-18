//Elaborado por el Grupo 04
package Proyecto;

import java.awt.Color;

//Clase de Interfaz de Director de Logista
public class FrmDirectorLogistica extends javax.swing.JFrame {
    
    public FrmDirectorLogistica() {
        initComponents();
        
        getContentPane().setBackground(new Color(240, 248, 255)); // AliceBlue
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnInventarioObjetos = new javax.swing.JButton();
        btnRegistroBuses = new javax.swing.JButton();
        btnAdministradorObjetos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuDirectorLogistica = new javax.swing.JMenu();
        menuItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Director de Logística");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setText("Bienvenid@, a la interfaz de Director de Logística");

        btnInventarioObjetos.setText("Inventario de Objetos");
        btnInventarioObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioObjetosActionPerformed(evt);
            }
        });

        btnRegistroBuses.setText("Registro de Buses");
        btnRegistroBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroBusesActionPerformed(evt);
            }
        });

        btnAdministradorObjetos.setText("Administrador de Objetos");
        btnAdministradorObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorObjetosActionPerformed(evt);
            }
        });

        jButton4.setText("Envíos Logísticos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        menuDirectorLogistica.setText("Opciones");

        menuItemCerrarSesion.setText("Cerrar Sesión ");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuDirectorLogistica.add(menuItemCerrarSesion);

        menuBarPrincipal.add(menuDirectorLogistica);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInventarioObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistroBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdministradorObjetos)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitulo)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInventarioObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministradorObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(655, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        FrmLogin formlogin = new FrmLogin();
        formlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void btnInventarioObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioObjetosActionPerformed
        FrmInventarioObjetos formlogin = new FrmInventarioObjetos();
        formlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInventarioObjetosActionPerformed

    private void btnRegistroBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroBusesActionPerformed
        FrmBuses formlogin = new FrmBuses();
        formlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroBusesActionPerformed

    private void btnAdministradorObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorObjetosActionPerformed
        FrmAdministradorObjetos formlogin = new FrmAdministradorObjetos();
        formlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministradorObjetosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FrmEnvioObjetos formlogin = new FrmEnvioObjetos();
        formlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDirectorLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDirectorLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDirectorLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDirectorLogistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDirectorLogistica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministradorObjetos;
    private javax.swing.JButton btnInventarioObjetos;
    private javax.swing.JButton btnRegistroBuses;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuDirectorLogistica;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    // End of variables declaration//GEN-END:variables
}
