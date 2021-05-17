package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    int idContactoObtenido;

    public Clientes() {
        initComponents();
        mostrarDatosTabla();
        cbCliente_Contactos.setModel(llenarComboClientes());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbActivo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbCliente_Contactos = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmOrdenarID = new javax.swing.JMenuItem();
        jmOrdenarNombre = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmBuscarNombreSucursal = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Nombre del Cliente: ");

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

        cbActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Activo:");

        jMenu1.setText("Ordenar Tabla");

        jmOrdenarID.setText("Ordenar por ID");
        jmOrdenarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOrdenarIDActionPerformed(evt);
            }
        });
        jMenu1.add(jmOrdenarID);

        jmOrdenarNombre.setText("Ordenar por Nombre");
        jmOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOrdenarNombreActionPerformed(evt);
            }
        });
        jMenu1.add(jmOrdenarNombre);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buscar dato");

        jmBuscarNombreSucursal.setText("Buscar por Nombre de Cliente");
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
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbActivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbCliente_Contactos, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminar)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCliente_Contactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        añadirDatos();
        mostrarDatosTabla();
        limpiarCeldas();


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked

        try {

            int filaSeleccionada = tablaClientes.getSelectedRow();
            //int filaSeleccionada = tablaUsuarios.rowAtPoint(evt.getPoint());

            txtNombreCliente.setText(tablaClientes.getValueAt(filaSeleccionada, 1).toString());
            cbActivo.setSelectedItem(tablaClientes.getValueAt(filaSeleccionada, 2));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en copiar los datos de la tabla --> " + e);
        }

    }//GEN-LAST:event_tablaClientesMouseClicked

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
        String[] titulosTabla = {"ID Cliente", "Nombre", "ID Contacto", "Activo"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String datoBuscar = JOptionPane.showInputDialog("Ingrese el criterio a buscar:");

        String Query = "SELECT idCliente, nombre, idContacto, Activo FROM Clientes WHERE nombre LIKE '%" + datoBuscar + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("idContacto");
                registros[3] = rs.getString("Activo");

                modelo.addRow(registros);

            }

            tablaClientes.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }


    }//GEN-LAST:event_jmBuscarNombreSucursalActionPerformed

    //MÉTODOS
    public void añadirDatos() {

        String nombreCliente = txtNombreCliente.getText();

        boolean activo = true;

        if (cbActivo.getSelectedItem() == "Si") {
            activo = true;
        }

        if (cbActivo.getSelectedItem() == "No") {
            activo = false;
        }

        obtenerId(cbCliente_Contactos.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();
            String query = "INSERT INTO Clientes (nombre, idContacto, activo) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, nombreCliente);

            ps.setInt(2, idContactoObtenido);

            ps.setBoolean(3, activo);

            ps.executeUpdate();

            cbCliente_Contactos.setSelectedIndex(0);

            //JOptionPane.showMessageDialog(null, "Registro exitoso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos --> " + e);
        }
    }

    public void actualiarDatos() {

        String nombreCliente = txtNombreCliente.getText();

        boolean activo = true;

        if (cbActivo.getSelectedItem() == "Si") {
            activo = true;
        }

        if (cbActivo.getSelectedItem() == "No") {
            activo = false;
        }

        obtenerId(cbCliente_Contactos.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();

            int filaSeleccionada = tablaClientes.getSelectedRow();
            String filaSeleccionadaText = String.valueOf(tablaClientes.getValueAt(filaSeleccionada, 0));

            String query = "UPDATE Clientes SET nombre = ?, idContacto = ?, activo= ? WHERE idCliente = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, nombreCliente);
            ps.setInt(2, idContactoObtenido);

            ps.setBoolean(3, activo);
            ps.setString(4, filaSeleccionadaText);

            ps.executeUpdate();

            cbCliente_Contactos.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado un registro para actualizar.");
        }
    }

    public void eliminarDatos() {

        int filaSeleccionada = tablaClientes.getSelectedRow();

        try {

            String query = "DELETE FROM Clientes WHERE idCliente = " + tablaClientes.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado ningún dato para eliminar.");
        }

    }

    public void mostrarDatosTabla() {

        String[] titulosTabla = {"ID Cliente", "Nombre", "ID Contacto", "Activo"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idCliente, nombre, idContacto, activo FROM Clientes";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("idContacto");
                registros[3] = rs.getString("Activo");

                modelo.addRow(registros);

            }

            tablaClientes.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void ordenarTabla() {

        String[] titulosTabla = {"ID Cliente", "Nombre", "ID Contacto", "Activo"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idCliente, nombre, idContacto, Activo FROM Clientes ORDER BY nombre ASC";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idCliente");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("idContacto");
                registros[3] = rs.getString("Activo");

                modelo.addRow(registros);

            }

            tablaClientes.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void limpiarCeldas() {
        txtNombreCliente.setText("");

    }

    public DefaultComboBoxModel llenarComboClientes() {

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("Seleccionar contacto...");

        try {

            String Query = "SELECT telefono FROM Contactos";

            CallableStatement cs = con.prepareCall(Query);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {

                modeloCombo.addElement(rs.getString(1));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox --> " + e);
        }

        return modeloCombo;

    }

    public int obtenerId(String telefono) {

        idContactoObtenido = 0;

        String Query = "SELECT idContacto FROM Contactos WHERE telefono = '" + telefono + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                idContactoObtenido = rs.getInt(1);

                //JOptionPane.showMessageDialog(null, "ID obtenido -->" + idContactoObtenido);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id Contacto --> " + e);
        }
        return idContactoObtenido;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbActivo;
    private javax.swing.JComboBox<String> cbCliente_Contactos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmBuscarNombreSucursal;
    private javax.swing.JMenuItem jmOrdenarID;
    private javax.swing.JMenuItem jmOrdenarNombre;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
