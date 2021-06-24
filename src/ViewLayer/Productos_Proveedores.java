package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos_Proveedores extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    int idProductoObtenido;
    int idProveedorObtenido;

    public Productos_Proveedores() {
        initComponents();
        cbProductos.setModel(llenarComboProductos());
        cbProveedores.setModel(llenarComboProveedores());
        mostrarDatosTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos_Proveedores = new javax.swing.JTable();
        cbProductos = new javax.swing.JComboBox<>();
        cbProveedores = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos - Proveedores");

        tablaProductos_Proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos_Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductos_ProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos_Proveedores);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbProveedores, 0, 366, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(390, 390, 390))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProductos_ProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductos_ProveedoresMouseClicked

        //int filaSeleccionada = tablaProductos_Proveedores.getSelectedRow();
        //JOptionPane.showMessageDialog(null, tablaProductos_Proveedores.getValueAt(filaSeleccionada, 0));
    }//GEN-LAST:event_tablaProductos_ProveedoresMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        mostrarDatosTabla();
        añadirDatos();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatos();
        mostrarDatosTabla();

    }//GEN-LAST:event_btnEliminarActionPerformed

    //MÉTODOS
    public void mostrarDatosTabla() {

        String[] titulosTabla = {"ID Proveedor", "Nombre Proveedor", "ID Producto", "Nombre Producto"};
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT pr.idProveedor IdProveedor, pr.nombre NombreProveedor, p.idProducto IdProducto, p.nombre NombreProducto  FROM ProductosProveedores pp\n"
                + "INNER JOIN Productos p ON p.idProducto = pp.idProducto\n"
                + "INNER JOIN Proveedores pr ON pr.idProveedor = pp.idProveedor";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                //JOptionPane.showMessageDialog(null, "Si entra");
                registros[0] = rs.getString("idProveedor");
                registros[1] = rs.getString("NombreProveedor");
                registros[2] = rs.getString("idProducto");
                registros[3] = rs.getString("NombreProducto");

                modelo.addRow(registros);

            }

            tablaProductos_Proveedores.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void añadirDatos() {

        int idProducto = obtenerIdProducto(cbProductos.getSelectedItem().toString());
        int idProveedor = obtenerIdProveedor(cbProveedores.getSelectedItem().toString());

        //System.out.println("Producto" + idProducto);
        //System.out.println("Proveedor" + idProveedor);
        try {

            Connection con = Conexion.getConexion();

            String query = "INSERT INTO ProductosProveedores (idProveedor, idProducto) VALUES (" + idProveedor + " ," + idProducto + ")";

            PreparedStatement ps = con.prepareStatement(query);

            //ps.setInt(1, idProducto);
            //ps.setInt(2, idProveedor);     
            //ps.setInt(3, precio);
            ps.executeUpdate();

            mostrarDatosTabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos --> " + e);
        }

    }

    public void eliminarDatos() {

        try {

            int filaSeleccionada = tablaProductos_Proveedores.getSelectedRow();

            String query = "DELETE FROM ProductosProveedores WHERE idProveedor = " + tablaProductos_Proveedores.getValueAt(filaSeleccionada, 0) ;
                    //+ " AND idProducto = " + tablaProductos_Proveedores.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar. No ha seleccionado ningún registro. " + e);
        }

    }

    public DefaultComboBoxModel llenarComboProductos() {

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("Seleccionar productos...");

        try {

            String Query = "SELECT nombre FROM Productos";

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

    public DefaultComboBoxModel llenarComboProveedores() {

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("Seleccionar proveedores...");

        try {

            String Query = "SELECT nombre FROM Proveedores";

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

    public int obtenerIdProducto(String nombreProducto) {

        idProductoObtenido = 0;

        String Query = "SELECT idProducto FROM Productos WHERE nombre = '" + nombreProducto + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                idProductoObtenido = rs.getInt(1);

                //JOptionPane.showMessageDialog(null, "ID obtenido -->" + idContactoObtenido);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id Producto --> " + e);
        }
        return idProductoObtenido;

    }

    public int obtenerIdProveedor(String nombreProveedor) {

        idProveedorObtenido = 0;

        String Query = "SELECT idProveedor FROM Proveedores WHERE nombre = '" + nombreProveedor + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                idProveedorObtenido = rs.getInt(1);

                //JOptionPane.showMessageDialog(null, "ID obtenido -->" + idContactoObtenido);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id Estado --> " + e);
        }
        return idProveedorObtenido;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos_Proveedores;
    // End of variables declaration//GEN-END:variables
}
