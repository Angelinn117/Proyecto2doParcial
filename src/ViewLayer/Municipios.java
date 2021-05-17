package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Municipios extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    int idEstadoObtenido;

    public Municipios() {
        initComponents();
        mostrarDatosTabla();
        cbMunicipio_Estado.setModel(llenarComboMunicipios());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMunicipio = new javax.swing.JTable();
        txtNombreMunicipio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbMunicipio_Estado = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmOrdenarID = new javax.swing.JMenuItem();
        jmOrdenarNombre = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmBuscarNombreSucursal = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Municipios");

        tablaMunicipio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMunicipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMunicipioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMunicipio);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Nombre del Municipio: ");

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

        jmBuscarNombreSucursal.setText("Buscar por Nombre de Municipio");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAñadir)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMunicipio_Estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMunicipio_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAñadir)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        añadirDatos();
        mostrarDatosTabla();
        limpiarCeldas();


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablaMunicipioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMunicipioMouseClicked

        try {

            int filaSeleccionada = tablaMunicipio.getSelectedRow();
            //int filaSeleccionada = tablaUsuarios.rowAtPoint(evt.getPoint());

            txtNombreMunicipio.setText(tablaMunicipio.getValueAt(filaSeleccionada, 2).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en copiar los datos de la tabla --> " + e);
        }

    }//GEN-LAST:event_tablaMunicipioMouseClicked

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
        String[] titulosTabla = {"ID Municipio", "ID Estado", "Municipio"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String datoBuscar = JOptionPane.showInputDialog("Ingrese el criterio a buscar:");

        String Query = "SELECT idMunicipio, idEstado, municipio FROM Municipios WHERE municipio LIKE '%" + datoBuscar + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idMunicipio");
                registros[1] = rs.getString("idEstado");
                registros[2] = rs.getString("municipio");

                modelo.addRow(registros);

            }

            tablaMunicipio.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }


    }//GEN-LAST:event_jmBuscarNombreSucursalActionPerformed

    //MÉTODOS
    public void añadirDatos() {

        String nombreMunicipio = txtNombreMunicipio.getText();

        obtenerId(cbMunicipio_Estado.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();
            String query = "INSERT INTO Municipios (idEstado, municipio) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idEstadoObtenido);
            ps.setString(2, nombreMunicipio);

            ps.executeUpdate();

            cbMunicipio_Estado.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos --> " + e);
        }
    }

    public void actualiarDatos() {

        String nombreMunicipio = txtNombreMunicipio.getText();

        obtenerId(cbMunicipio_Estado.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();

            int filaSeleccionada = tablaMunicipio.getSelectedRow();
            String filaSeleccionadaText = String.valueOf(tablaMunicipio.getValueAt(filaSeleccionada, 0));

            String query = "UPDATE Municipios SET idEstado = ?, municipio = ? WHERE idMunicipio = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idEstadoObtenido);
            ps.setString(2, nombreMunicipio);

            ps.setString(3, filaSeleccionadaText);

            ps.executeUpdate();

            cbMunicipio_Estado.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado un registro para actualizar.");
        }
    }

    public void eliminarDatos() {

        int filaSeleccionada = tablaMunicipio.getSelectedRow();

        try {

            String query = "DELETE FROM Municipios WHERE idMunicipio = " + tablaMunicipio.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado ningún dato para eliminar.");
        }

    }

    public void mostrarDatosTabla() {

        String[] titulosTabla = {"ID Municipio", "ID Estado", "Municipio"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idMunicipio, idEstado, municipio FROM Municipios";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idMunicipio");
                registros[1] = rs.getString("idEstado");
                registros[2] = rs.getString("municipio");

                modelo.addRow(registros);

            }

            tablaMunicipio.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void ordenarTabla() {

        String[] titulosTabla = {"ID Municipio", "ID Estado", "Municipio"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idMunicipio, idEstado, municipio FROM Municipios ORDER BY municipio ASC";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idMunicipio");
                registros[1] = rs.getString("idEstado");
                registros[2] = rs.getString("municipio");

                modelo.addRow(registros);

            }

            tablaMunicipio.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void limpiarCeldas() {
        txtNombreMunicipio.setText("");

    }

    public DefaultComboBoxModel llenarComboMunicipios() {

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("Seleccionar estado...");

        try {

            String Query = "SELECT estado FROM Estados";

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

    public int obtenerId(String estado) {

        idEstadoObtenido = 0;

        String Query = "SELECT idEstado FROM Estados WHERE estado = '" + estado + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                idEstadoObtenido = rs.getInt(1);

                //JOptionPane.showMessageDialog(null, "ID obtenido -->" + idContactoObtenido);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id Estado --> " + e);
        }
        return idEstadoObtenido;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbMunicipio_Estado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmBuscarNombreSucursal;
    private javax.swing.JMenuItem jmOrdenarID;
    private javax.swing.JMenuItem jmOrdenarNombre;
    private javax.swing.JTable tablaMunicipio;
    private javax.swing.JTextField txtNombreMunicipio;
    // End of variables declaration//GEN-END:variables
}
