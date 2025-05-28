package Proyecto;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
// Ventana para mostrar, filtrar y eliminar empleados
public class FrmListaEmpleados extends javax.swing.JFrame {

    
    DefaultTableModel modelo;
    MantenimientoEmpleados mantenimiento;
    /**
     * Creates new form FrmListaEmpleados
     */
    public FrmListaEmpleados() {
        initComponents();
        String[] nombreColumna = {"Codigo","Nombres","Apellidos","DNI","Correo","Teléfono","Oficina","Cargo","Edad","Sexo"};
        modelo= new DefaultTableModel(nombreColumna,0);
        tblListaEmpleados.setModel(modelo);
        tblListaEmpleados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblListaEmpleados.setShowGrid(false);
        tblListaEmpleados.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        mantenimiento = new MantenimientoEmpleados();
        
        cargarEmpleadosDesdeArchivo();//llamo al metodo que cree a la tabla
        
        txtFiltroCódigo.addActionListener(e -> btnFiltrarCódigo.doClick());
        txtFiltroNombreEmpleado.addActionListener(e -> btnFiltrarEmpleado.doClick());
        txtFiltroDNI.addActionListener(e -> btnFiltrarDNI.doClick());
        cbFiltroOficina.addActionListener(e -> btnFiltrarOficina.doClick());
        cbFiltroCargo.addActionListener(e -> btnFiltrarCargo.doClick());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEmpleados = new javax.swing.JTable();
        btnModificarDatos = new javax.swing.JButton();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtFiltroCódigo = new javax.swing.JTextField();
        btnFiltrarCódigo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtFiltroNombreEmpleado = new javax.swing.JTextField();
        btnFiltrarEmpleado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtFiltroDNI = new javax.swing.JTextField();
        btnFiltrarDNI = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnFiltrarOficina = new javax.swing.JButton();
        cbFiltroOficina = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnFiltrarCargo = new javax.swing.JButton();
        cbFiltroCargo = new javax.swing.JComboBox<>();
        btnBorrarEmpleado = new javax.swing.JButton();
        btnMostrarLista1 = new javax.swing.JButton();
        MenuBarPrincipal = new javax.swing.JMenuBar();
        menuListaEmpleados = new javax.swing.JMenu();
        menuItemRegresarMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setText("Lista de empleados Ingresados:");

        tblListaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblListaEmpleados);

        btnModificarDatos.setText("Modificar datos");
        btnModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatosActionPerformed(evt);
            }
        });

        txtFiltroCódigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el Código:"));

        btnFiltrarCódigo.setText("Filtrar");
        btnFiltrarCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCódigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFiltroCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFiltrarCódigo)
                        .addGap(405, 405, 405))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtFiltroCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarCódigo)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Código", jPanel1);

        txtFiltroNombreEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el Nombre del Empleado:"));

        btnFiltrarEmpleado.setText("Filtrar");
        btnFiltrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(txtFiltroNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnFiltrarEmpleado)
                        .addGap(405, 405, 405))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtFiltroNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarEmpleado)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane7.addTab("Empleado", jPanel2);

        txtFiltroDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el DNI:"));

        btnFiltrarDNI.setText("Filtrar");
        btnFiltrarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(txtFiltroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnFiltrarDNI)
                        .addGap(405, 405, 405))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtFiltroDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarDNI)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane7.addTab("DNI", jPanel3);

        btnFiltrarOficina.setText("Filtrar");
        btnFiltrarOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarOficinaActionPerformed(evt);
            }
        });

        cbFiltroOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lima", "Cañete", "Cerro Azul", "Ica", "Atíco", "Camana", "Alto Siguas", "Arequipa" }));
        cbFiltroOficina.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese la Oficina:"));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFiltrarOficina)
                .addGap(405, 405, 405))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(cbFiltroOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cbFiltroOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFiltrarOficina)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 57, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 58, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane7.addTab("Oficina", jPanel4);

        btnFiltrarCargo.setText("Filtrar");
        btnFiltrarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarCargoActionPerformed(evt);
            }
        });

        cbFiltroCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operario de Rutas", "Conductor", "Counter", "Gerente de Finanzas", "Analista de Viajes", "Director de Logística", "Responsable de Recursos Humanos" }));
        cbFiltroCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese el Cargo:"));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFiltrarCargo)
                .addGap(393, 393, 393))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(cbFiltroCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cbFiltroCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarCargo)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane7.addTab("Cargo", jPanel5);

        btnBorrarEmpleado.setText("Borrar Empleado");
        btnBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEmpleadoActionPerformed(evt);
            }
        });

        btnMostrarLista1.setText("Mostrar Toda la Lista");
        btnMostrarLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLista1ActionPerformed(evt);
            }
        });

        menuListaEmpleados.setText("Opciones");

        menuItemRegresarMenu.setText("Regresar al Menú");
        menuItemRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegresarMenuActionPerformed(evt);
            }
        });
        menuListaEmpleados.add(menuItemRegresarMenu);

        MenuBarPrincipal.add(menuListaEmpleados);

        setJMenuBar(MenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrarLista1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrarLista1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(985, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void cargarEmpleadosDesdeArchivo() {
    // Asegurar que la tabla vuelva a usar el modelo original
    tblListaEmpleados.setModel(modelo);

    modelo.setRowCount(0); 

    try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File("usuarios.txt"))) {
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] datos = linea.split(",");
            if (datos.length == 10) {
                modelo.addRow(datos);
            }
        }
    } catch (java.io.FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "No se encontró el archivo de empleados.");
    }
}

    //filtra la tabla por columna
    private void filtrarPorTexto(int columna, String texto) {
        DefaultTableModel modeloFiltrado = new DefaultTableModel();
        //copiar estructura por columna
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            modeloFiltrado.addColumn(modelo.getColumnName(i));
        }

        boolean encontrado = false;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            String celda = modelo.getValueAt(i, columna).toString().toLowerCase();
            if (celda.contains(texto.toLowerCase())) {
                Object[] fila = new Object[modelo.getColumnCount()];
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    fila[j] = modelo.getValueAt(i, j);
                }
                modeloFiltrado.addRow(fila);
                encontrado = true;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontraron resultados válidos en esta categoría.", "Sin resultados", JOptionPane.INFORMATION_MESSAGE);
        }

        tblListaEmpleados.setModel(modeloFiltrado);
    }

    
    private void btnFiltrarCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCódigoActionPerformed
         filtrarPorTexto(0, txtFiltroCódigo.getText()); // Columna 0 = Código
    }//GEN-LAST:event_btnFiltrarCódigoActionPerformed

    private void btnFiltrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarEmpleadoActionPerformed
        filtrarPorTexto(1, txtFiltroNombreEmpleado.getText()); // Columna 1 = Nombre
    }//GEN-LAST:event_btnFiltrarEmpleadoActionPerformed

    private void btnFiltrarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarDNIActionPerformed
        filtrarPorTexto(3, txtFiltroDNI.getText()); // Columna 3 = DNI
    }//GEN-LAST:event_btnFiltrarDNIActionPerformed

    private void btnFiltrarOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarOficinaActionPerformed
        filtrarPorTexto(6, cbFiltroOficina.getSelectedItem().toString()); // Columna 6 = Oficina
    }//GEN-LAST:event_btnFiltrarOficinaActionPerformed

    private void btnFiltrarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarCargoActionPerformed
        filtrarPorTexto(7, cbFiltroCargo.getSelectedItem().toString()); // Columna 7 = Cargo
    }//GEN-LAST:event_btnFiltrarCargoActionPerformed

    private void btnMostrarLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLista1ActionPerformed
        cargarEmpleadosDesdeArchivo();
    }//GEN-LAST:event_btnMostrarLista1ActionPerformed

    private void btnBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEmpleadoActionPerformed
        eliminarEmpleadoSeleccionado();
        cargarEmpleadosDesdeArchivo();
    }//GEN-LAST:event_btnBorrarEmpleadoActionPerformed

    private void btnModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatosActionPerformed
        FrmEditorEmpleados formadim = new FrmEditorEmpleados();
        formadim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModificarDatosActionPerformed

    private void menuItemRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegresarMenuActionPerformed
        FrmAdminGeneral formadmi = new FrmAdminGeneral();
        formadmi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuItemRegresarMenuActionPerformed
    private void eliminarEmpleadoSeleccionado() {
    int fila = tblListaEmpleados.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        return;
    }

    String codigoAEliminar = tblListaEmpleados.getValueAt(fila, 0).toString(); // Código del empleado


    int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres eliminar al empleado con código " + codigoAEliminar + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirm != JOptionPane.YES_OPTION) return;


    java.io.File archivoOriginal = new java.io.File("usuarios.txt");
    java.io.File archivoTemporal = new java.io.File("usuarios_temp.txt");

    try (
        java.util.Scanner lector = new java.util.Scanner(archivoOriginal);
        java.io.PrintWriter escritor = new java.io.PrintWriter(archivoTemporal)
    ) {
        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            if (!linea.startsWith(codigoAEliminar + ",")) {
                escritor.println(linea);
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar del archivo: " + e.getMessage());
        return;
    }


    archivoOriginal.delete();
    archivoTemporal.renameTo(archivoOriginal);

    JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente.");
    cargarEmpleadosDesdeArchivo(); 
}

    
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
            java.util.logging.Logger.getLogger(FrmListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListaEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarPrincipal;
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnFiltrarCargo;
    private javax.swing.JButton btnFiltrarCódigo;
    private javax.swing.JButton btnFiltrarDNI;
    private javax.swing.JButton btnFiltrarEmpleado;
    private javax.swing.JButton btnFiltrarOficina;
    private javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnMostrarLista1;
    private javax.swing.JComboBox<String> cbFiltroCargo;
    private javax.swing.JComboBox<String> cbFiltroOficina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem menuItemRegresarMenu;
    private javax.swing.JMenu menuListaEmpleados;
    private javax.swing.JTable tblListaEmpleados;
    private javax.swing.JTextField txtFiltroCódigo;
    private javax.swing.JTextField txtFiltroDNI;
    private javax.swing.JTextField txtFiltroNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
