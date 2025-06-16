/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class FrmRutas extends javax.swing.JFrame {

    private void actualizarPrecio() {
        Object objSalida = cmbLugarPartida.getSelectedItem();
        Object objLlegada = cmbLugarLlegada.getSelectedItem();

        if (objSalida == null || objLlegada == null) {
            txtPrecio.setText("S/ 0.0");
            return;
        }

        String salida = objSalida.toString();
        String llegada = objLlegada.toString();

        if (salida.equals("SELECCIONE") || llegada.equals("SELECCIONE")) {
            txtPrecio.setText("S/ 0.0");
            return;
        }

        double precio = EvaluadorRutas.obtenerPrecio(salida, llegada);

        if (precio > 0) {
            txtPrecio.setText("S/ " + precio);
        } else {
            txtPrecio.setText("Ruta no permitida");
        }
    }

    private void cargarConductoresDesdeArchivo(String rutaArchivo) {
        try (Scanner sc = new Scanner(new File(rutaArchivo))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) continue;

                String[] partes = linea.split(",");

                // Validación: aseguramos que tenga al menos 9 campos
                if (partes.length >= 9) {
                    String codigo = partes[0].trim();
                    String cargo = partes[7].trim().toLowerCase();

                    if (cargo.equals("conductor")) {
                        cmbConductor.addItem(codigo);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Archivo usuarios.txt no encontrado.");
        }
    }
    
    private void cargarPlacasDesdeArchivo(String archivo) {
        cmbBus.addItem("SELECCIONE");

        try (Scanner sc = new Scanner(new File(archivo))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine().trim();
                if (linea.isEmpty()) continue;

                // Formato esperado: placa;modelo;marca;estado;usos
                String[] partes = linea.split(";");
                if (partes.length >= 4) {
                    String placa = partes[0].trim();
                    String estado = partes[3].trim();

                    if (estado.equalsIgnoreCase("Listo")) {
                        cmbBus.addItem(placa);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo buses.txt");
        }
    }
    
    private void guardarRutaEnArchivo(String archivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, true))) {

            String fecha = txtFechaEmbarque.getText().trim();
            String precio = txtPrecio.getText().trim();
            String horario = cmbHorarioEmbarque.getSelectedItem().toString();
            String salida = cmbLugarPartida.getSelectedItem().toString();
            String llegada = cmbLugarLlegada.getSelectedItem().toString();
            String conductor = cmbConductor.getSelectedItem().toString();
            String bus = cmbBus.getSelectedItem().toString();

            // Validación básica
            if (fecha.isEmpty() || precio.isEmpty() || horario.equals("SELECCIONE") || salida.equals("SELECCIONE") ||
                llegada.equals("SELECCIONE") || conductor.equals("SELECCIONE") || bus.equals("SELECCIONE")) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            // Construcción de línea
            String linea = String.join(",", fecha, precio, horario, salida, llegada, conductor, bus);
            pw.println(linea);

            JOptionPane.showMessageDialog(this, "Ruta registrada correctamente.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la ruta: " + e.getMessage());
        }
    }
    
    public FrmRutas() {
        initComponents();
        // Eventos para calcular precio cuando se cambia la selección
        cmbLugarPartida.addActionListener(e -> actualizarPrecio());
        cmbLugarLlegada.addActionListener(e -> actualizarPrecio());

        txtPrecio.setEditable(false);// Desactivar edición manual del campo de precio
        txtPrecio.setFocusable(false);// No sale el cursor al hacer click

        cmbConductor.addItem("SELECCIONE");
        cargarConductoresDesdeArchivo("usuarios.txt"); // usa ruta relativa o absoluta si es necesario
        
        // Cargar solo los lugares permitidos para cada combo
        String[] lugaresSalida = {"Arequipa", "Alto Siguas", "Camaná", "Ica", "Atocongo", "Lima"};
        String[] lugaresLlegada = {"Ica", "Atocongo", "Lima", "Arequipa", "Alto Siguas", "Camaná"};
        
        //Horarios de embarque
        cmbHorarioEmbarque.addItem("SELECCIONE");
        cmbHorarioEmbarque.addItem("Mañana - 07:00 AM");
        cmbHorarioEmbarque.addItem("Tarde - 12:00 PM");
        cmbHorarioEmbarque.addItem("Noche - 06:00 PM");
        
        cargarPlacasDesdeArchivo("buses.txt");
        
        //Detalles en los combobox de partida y llegada
        cmbLugarPartida.addItem("SELECCIONE");
        cmbLugarLlegada.addItem("SELECCIONE");

        for (String lugar : lugaresSalida) {
            cmbLugarPartida.addItem(lugar);
        }
        for (String lugar : lugaresLlegada) {
            cmbLugarLlegada.addItem(lugar);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistroRutas = new javax.swing.JLabel();
        txtFechaEmbarque = new javax.swing.JTextField();
        cmbHorarioEmbarque = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        lblFechaHorario = new javax.swing.JLabel();
        lblDestinoCosto = new javax.swing.JLabel();
        lblConductorTransporte = new javax.swing.JLabel();
        cmbConductor = new javax.swing.JComboBox<>();
        cmbBus = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        cmbLugarPartida = new javax.swing.JComboBox<>();
        cmbLugarLlegada = new javax.swing.JComboBox<>();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuRutas = new javax.swing.JMenu();
        menuItemListaRutas = new javax.swing.JMenuItem();
        menuItemRetroceder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Registro de Rutas");
        setResizable(false);

        lblRegistroRutas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRegistroRutas.setText("Registro de Rutas");

        txtFechaEmbarque.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Embarque"));

        cmbHorarioEmbarque.setBorder(javax.swing.BorderFactory.createTitledBorder("Horario de Embarque"));

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));

        lblFechaHorario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFechaHorario.setText("Fecha & Horario");

        lblDestinoCosto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDestinoCosto.setText("Destino & Costo");

        lblConductorTransporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblConductorTransporte.setText("Conductor & Transporte");

        cmbConductor.setBorder(javax.swing.BorderFactory.createTitledBorder("Conductor"));

        cmbBus.setBorder(javax.swing.BorderFactory.createTitledBorder("Bus"));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cmbLugarPartida.setBorder(javax.swing.BorderFactory.createTitledBorder(" Lugar de Partida"));

        cmbLugarLlegada.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de Llegada"));

        menuRutas.setText("Opciones");

        menuItemListaRutas.setText("Lista de Rutas");
        menuItemListaRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaRutasActionPerformed(evt);
            }
        });
        menuRutas.add(menuItemListaRutas);

        menuItemRetroceder.setText("Retroceder");
        menuItemRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRetrocederActionPerformed(evt);
            }
        });
        menuRutas.add(menuItemRetroceder);

        menuBarPrincipal.add(menuRutas);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(lblRegistroRutas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblConductorTransporte)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblFechaHorario))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cmbConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbHorarioEmbarque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBus, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbLugarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbLugarLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDestinoCosto)
                                .addGap(160, 160, 160))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegistroRutas)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaHorario)
                    .addComponent(lblDestinoCosto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFechaEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbHorarioEmbarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLugarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbLugarLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(lblConductorTransporte)
                .addGap(18, 18, 18)
                .addComponent(cmbConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(cmbBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(736, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        guardarRutaEnArchivo("rutas.txt");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void menuItemListaRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaRutasActionPerformed
        FrmListaRutas formlistarutas = new FrmListaRutas();
        formlistarutas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemListaRutasActionPerformed

    private void menuItemRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRetrocederActionPerformed
        
        FrmOperarioRutas formoperariorutas = new FrmOperarioRutas();
        formoperariorutas.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_menuItemRetrocederActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbBus;
    private javax.swing.JComboBox<String> cmbConductor;
    private javax.swing.JComboBox<String> cmbHorarioEmbarque;
    private javax.swing.JComboBox<String> cmbLugarLlegada;
    private javax.swing.JComboBox<String> cmbLugarPartida;
    private javax.swing.JLabel lblConductorTransporte;
    private javax.swing.JLabel lblDestinoCosto;
    private javax.swing.JLabel lblFechaHorario;
    private javax.swing.JLabel lblRegistroRutas;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemListaRutas;
    private javax.swing.JMenuItem menuItemRetroceder;
    private javax.swing.JMenu menuRutas;
    private javax.swing.JTextField txtFechaEmbarque;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
