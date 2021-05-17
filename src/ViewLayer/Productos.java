package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    int idCategoriaObtenido;

    public Productos() {
        initComponents();
        mostrarDatosTabla();
        cbProductos_Categoria.setModel(llenarComboProductos());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbActivo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCaducidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        cbProductos_Categoria = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmOrdenarID = new javax.swing.JMenuItem();
        jmOrdenarNombre = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmBuscarNombreProducto = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Nombre del Producto: ");

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

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Caducidad:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Descuento:");

        cbProductos_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

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

        jmBuscarNombreProducto.setText("Buscar por Nombre del Producto");
        jmBuscarNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarNombreProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jmBuscarNombreProducto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(147, 147, 147)
                                    .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cbProductos_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnAñadir)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbProductos_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAñadir)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        añadirDatos();
        mostrarDatosTabla();
        limpiarCeldas();


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked

        try {

            int filaSeleccionada = tablaProductos.getSelectedRow();
            //int filaSeleccionada = tablaUsuarios.rowAtPoint(evt.getPoint());

            txtNombreProducto.setText(tablaProductos.getValueAt(filaSeleccionada, 2).toString());
            txtPrecio.setText(tablaProductos.getValueAt(filaSeleccionada, 3).toString());
            txtCaducidad.setText(tablaProductos.getValueAt(filaSeleccionada, 4).toString());
            txtDescuento.setText(tablaProductos.getValueAt(filaSeleccionada, 5).toString());

            cbActivo.setSelectedItem(tablaProductos.getValueAt(filaSeleccionada, 6));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en copiar los datos de la tabla --> " + e);
        }

    }//GEN-LAST:event_tablaProductosMouseClicked

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

    private void jmBuscarNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarNombreProductoActionPerformed
        String[] titulosTabla = {"ID Producto", "ID Categoría", "Nombre", "Precio", "Caducidad", "Descuento", "Activo"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String datoBuscar = JOptionPane.showInputDialog("Ingrese el criterio a buscar:");

        String Query = "SELECT idProducto, idCategoria, nombre, precio, caducidad, descuento, activo FROM Productos WHERE nombre LIKE '%" + datoBuscar + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idProducto");
                registros[1] = rs.getString("idCategoria");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("precio");
                registros[4] = rs.getString("caducidad");
                registros[5] = rs.getString("descuento");
                registros[6] = rs.getString("activo");

                modelo.addRow(registros);

            }

            tablaProductos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }


    }//GEN-LAST:event_jmBuscarNombreProductoActionPerformed

    //MÉTODOS
    public void añadirDatos() {

        String nombre = txtNombreProducto.getText();
        int precio = Integer.parseInt(txtPrecio.getText());
        String caducidad = txtCaducidad.getText();
        double descuento = Double.parseDouble(txtDescuento.getText());

        boolean activo = true;

        if (cbActivo.getSelectedItem() == "Si") {
            activo = true;
        }

        if (cbActivo.getSelectedItem() == "No") {
            activo = false;
        }

        obtenerId(cbProductos_Categoria.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();

            String query = "INSERT INTO Productos (idCategoria, nombre, precio, caducidad, descuento, activo) VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idCategoriaObtenido);
            ps.setString(2, nombre);
            ps.setInt(3, precio);
            ps.setString(4, caducidad);
            ps.setDouble(5, descuento);
            ps.setBoolean(6, activo);

            ps.executeUpdate();

            cbProductos_Categoria.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos --> " + e);
        }

    }

    public void actualiarDatos() {

        String nombre = txtNombreProducto.getText();
        int precio = Integer.parseInt(txtPrecio.getText());
        String caducidad = txtCaducidad.getText();
        double descuento = Double.parseDouble(txtDescuento.getText());

        boolean activo = true;

        if (cbActivo.getSelectedItem() == "Si") {
            activo = true;
        }

        if (cbActivo.getSelectedItem() == "No") {
            activo = false;
        }

        obtenerId(cbProductos_Categoria.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();

            int filaSeleccionada = tablaProductos.getSelectedRow();
            String filaSeleccionadaText = String.valueOf(tablaProductos.getValueAt(filaSeleccionada, 0));

            String query = "UPDATE Productos SET idCategoria = ?, nombre = ?, precio= ?, caducidad = ?, descuento = ?, activo = ? WHERE idProducto = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idCategoriaObtenido);
            ps.setString(2, nombre);
            ps.setInt(3, precio);
            ps.setString(4, caducidad);
            ps.setDouble(5, descuento);
            ps.setBoolean(6, activo);
            ps.setString(7, filaSeleccionadaText);

            ps.executeUpdate();

            cbProductos_Categoria.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado un registro para actualizar.");
        }
    }

    public void eliminarDatos() {

        int filaSeleccionada = tablaProductos.getSelectedRow();

        try {

            String query = "DELETE FROM Productos WHERE idProducto = " + tablaProductos.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado ningún dato para eliminar.");
        }

    }

    public void mostrarDatosTabla() {

        String[] titulosTabla = {"ID Producto", "ID Categoría", "Nombre", "Precio", "Caducidad", "Descuento", "Activo"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idProducto, idCategoria, nombre, precio, caducidad, descuento, activo FROM Productos";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idProducto");
                registros[1] = rs.getString("idCategoria");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("precio");
                registros[4] = rs.getString("caducidad");
                registros[5] = rs.getString("descuento");
                registros[6] = rs.getString("activo");

                modelo.addRow(registros);

            }

            tablaProductos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void ordenarTabla() {

        String[] titulosTabla = {"ID Producto", "ID Categoría", "Nombre", "Precio", "Caducidad", "Descuento", "Activo"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idProducto, idCategoria, nombre, precio, caducidad, descuento, activo FROM Productos ORDER BY nombre";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idProducto");
                registros[1] = rs.getString("idCategoria");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("precio");
                registros[4] = rs.getString("caducidad");
                registros[5] = rs.getString("descuento");
                registros[6] = rs.getString("activo");

                modelo.addRow(registros);

            }

            tablaProductos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void limpiarCeldas() {
        txtNombreProducto.setText("");
        txtPrecio.setText("");
        txtCaducidad.setText("");
        txtDescuento.setText("");

    }

    public DefaultComboBoxModel llenarComboProductos() {

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("Seleccionar categoría...");

        try {

            String Query = "SELECT nombre FROM Categorias";

            CallableStatement cs = con.prepareCall(Query);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {

                modeloCombo.addElement(rs.getString(1));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox --> " + e);
        }

        return modeloCombo;

    }

    public int obtenerId(String nombreCategoria) {

        idCategoriaObtenido = 0;

        String Query = "SELECT idCategoria FROM Categorias WHERE nombre = '" + nombreCategoria + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                idCategoriaObtenido = rs.getInt(1);

                //JOptionPane.showMessageDialog(null, "ID obtenido -->" + idContactoObtenido);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id Estado --> " + e);
        }
        return idCategoriaObtenido;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbActivo;
    private javax.swing.JComboBox<String> cbProductos_Categoria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmBuscarNombreProducto;
    private javax.swing.JMenuItem jmOrdenarID;
    private javax.swing.JMenuItem jmOrdenarNombre;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCaducidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
