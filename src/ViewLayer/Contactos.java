package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Contactos extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    public Contactos() {
        initComponents();
        mostrarDatosTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();
        txtCodigoPostal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEntidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtComuna = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmOrdenarID = new javax.swing.JMenuItem();
        jmOrdenarNombre = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmBuscarNombreSucursal = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Contactos");

        tablaContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaContactos);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Código Postal:");

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAñadir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir.png"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Entidad:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Comuna:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Calle:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Teléfono:");

        jMenu1.setText("Ordenar Tabla");

        jmOrdenarID.setText("Ordenar por ID");
        jmOrdenarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOrdenarIDActionPerformed(evt);
            }
        });
        jMenu1.add(jmOrdenarID);

        jmOrdenarNombre.setText("Ordenar por Calle");
        jmOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOrdenarNombreActionPerformed(evt);
            }
        });
        jMenu1.add(jmOrdenarNombre);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buscar dato");

        jmBuscarNombreSucursal.setText("Buscar por Nombre de Calle");
        jmBuscarNombreSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarNombreSucursalActionPerformed(evt);
            }
        });
        jMenu2.add(jmBuscarNombreSucursal);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(80, 80, 80)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnAñadir)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAñadir)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        añadirDatos();
        mostrarDatosTabla();
        limpiarCeldas();


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablaContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContactosMouseClicked

        try {

            int filaSeleccionada = tablaContactos.getSelectedRow();
            //int filaSeleccionada = tablaUsuarios.rowAtPoint(evt.getPoint());

            txtCodigoPostal.setText(tablaContactos.getValueAt(filaSeleccionada, 1).toString());
            txtEntidad.setText(tablaContactos.getValueAt(filaSeleccionada, 2).toString());
            txtComuna.setText(tablaContactos.getValueAt(filaSeleccionada, 3).toString());
            txtCalle.setText((tablaContactos.getValueAt(filaSeleccionada, 4)).toString());
            txtTelefono.setText((tablaContactos.getValueAt(filaSeleccionada, 5)).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en copiar los datos de la tabla --> " + e);
        }

    }//GEN-LAST:event_tablaContactosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualiarDatos();
        mostrarDatosTabla();
        limpiarCeldas();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatos();
        mostrarDatosTabla();
        limpiarCeldas();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jmOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOrdenarNombreActionPerformed
        ordenarTabla();
    }//GEN-LAST:event_jmOrdenarNombreActionPerformed

    private void jmOrdenarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOrdenarIDActionPerformed
        mostrarDatosTabla();
    }//GEN-LAST:event_jmOrdenarIDActionPerformed

    private void jmBuscarNombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarNombreSucursalActionPerformed
        String[] titulosTabla = {"ID Contacto", "Código Postal", "Entidad", "Comuna", "Calle", "Teléfono"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String datoBuscar = JOptionPane.showInputDialog("Ingrese el criterio a buscar:");

        String Query = "SELECT idContacto, codigoPostal, entidad, comuna, calle, telefono FROM Contactos WHERE calle LIKE '%" + datoBuscar + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idContacto");
                registros[1] = rs.getString("codigoPostal");
                registros[2] = rs.getString("entidad");
                registros[3] = rs.getString("comuna");
                registros[4] = rs.getString("calle");
                registros[5] = rs.getString("telefono");

                modelo.addRow(registros);

            }

            tablaContactos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }


    }//GEN-LAST:event_jmBuscarNombreSucursalActionPerformed

    //MÉTODOS
    public void añadirDatos() {

        int codigoPostal = Integer.parseInt(txtCodigoPostal.getText());

        String entidad = txtEntidad.getText();
        String comuna = txtComuna.getText();
        String calle = txtCalle.getText();
        String telefono = txtTelefono.getText();

        try {

            Connection con = Conexion.getConexion();
            String query = "INSERT INTO Contactos (codigoPostal, entidad, comuna, calle, telefono) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, codigoPostal);
            ps.setString(2, entidad);
            ps.setString(3, comuna);
            ps.setString(4, calle);
            ps.setString(5, telefono);

            ps.executeUpdate();

            //JOptionPane.showMessageDialog(null, "Registro exitoso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos --> " + e);
        }
    }

    public void actualiarDatos() {

        try {

            int codigoPostal = Integer.parseInt(txtCodigoPostal.getText());
            String entidad = txtEntidad.getText();
            String comuna = txtComuna.getText();
            String calle = txtCalle.getText();
            String telefono = txtTelefono.getText();

            Connection con = Conexion.getConexion();

            int filaSeleccionada = tablaContactos.getSelectedRow();
            String filaSeleccionadaText = String.valueOf(tablaContactos.getValueAt(filaSeleccionada, 0));

            String query = "UPDATE Contactos SET codigoPostal = ?, entidad = ?, comuna = ?, calle = ?, telefono = ? WHERE idContacto = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, codigoPostal);
            ps.setString(2, entidad);
            ps.setString(3, comuna);
            ps.setString(4, calle);
            ps.setString(5, telefono);
            ps.setString(6, filaSeleccionadaText);

            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado un registro para actualizar.");
        }
    }

    public void eliminarDatos() {

        int filaSeleccionada = tablaContactos.getSelectedRow();

        try {

            String query = "DELETE FROM Contactos WHERE idContacto = " + tablaContactos.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado ningún dato para eliminar.");
        }

    }

    public void mostrarDatosTabla() {

        String[] titulosTabla = {"ID Contacto", "Código Postal", "Entidad", "Comuna", "Calle", "Teléfono"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idContacto, codigoPostal, entidad, comuna, calle, telefono FROM Contactos";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idContacto");
                registros[1] = rs.getString("codigoPostal");
                registros[2] = rs.getString("entidad");
                registros[3] = rs.getString("comuna");
                registros[4] = rs.getString("calle");
                registros[5] = rs.getString("telefono");

                modelo.addRow(registros);

            }

            tablaContactos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void ordenarTabla() {

        String[] titulosTabla = {"ID Contacto", "Código Postal", "Entidad", "Comuna", "Calle", "Teléfono"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idContacto, codigoPostal, entidad, comuna, calle, telefono FROM Contactos ORDER BY calle ASC";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idContacto");
                registros[1] = rs.getString("codigoPostal");
                registros[2] = rs.getString("entidad");
                registros[3] = rs.getString("comuna");
                registros[4] = rs.getString("calle");
                registros[5] = rs.getString("telefono");

                modelo.addRow(registros);

            }

            tablaContactos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void limpiarCeldas() {
        txtCodigoPostal.setText("");
        txtEntidad.setText("");
        txtComuna.setText("");
        txtCalle.setText("");
        txtTelefono.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmBuscarNombreSucursal;
    private javax.swing.JMenuItem jmOrdenarID;
    private javax.swing.JMenuItem jmOrdenarNombre;
    private javax.swing.JTable tablaContactos;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JTextField txtEntidad;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
