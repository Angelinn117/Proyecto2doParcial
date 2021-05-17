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
        JOptionPane.showMessageDialog(null, "No funciona del todo.");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();
        cbProductos = new javax.swing.JComboBox<>();
        cbProveedores = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos - Proveedores");

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

        btnAñadir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadir.png"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir)
                        .addGap(26, 26, 26)
                        .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContactosMouseClicked
        /*
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
         */

    }//GEN-LAST:event_tablaContactosMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        mostrarDatosTabla();

    }//GEN-LAST:event_btnAñadirActionPerformed

    //MÉTODOS
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

    public void mostrarDatosTabla() {

        String[] titulosTabla = {"Productos", "Proveedores"};
        String[] registros = new String[2];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT prod.nombre, prov.nombre From Productos prod CROSS JOIN Proveedores prov";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                //JOptionPane.showMessageDialog(null, "Si entra");
                registros[0] = rs.getString("nombre"); //Nombre de productos.
                registros[1] = rs.getString("nombre"); //Nombre de proveedores.

                modelo.addRow(registros);

            }

            tablaContactos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

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
            JOptionPane.showMessageDialog(null, "Error al obtener el id Estado --> " + e);
        }
        return idProductoObtenido;

    }

    public int obtenerIdProveedor(String nombreProveedor) {

        idProveedorObtenido = 0;

        String Query = "SELECT idCategoria FROM Categorias WHERE nombre = '" + nombreProveedor + "'";

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaContactos;
    // End of variables declaration//GEN-END:variables
}