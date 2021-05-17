package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Localidades extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    int idMunicipioObtenido;

    public Localidades() {
        initComponents();
        mostrarDatosTabla();
        cbLocalidad_Municipio.setModel(llenarComboLocalidades());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLocalidades = new javax.swing.JTable();
        txtNombreLocalidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbLocalidad_Municipio = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmOrdenarID = new javax.swing.JMenuItem();
        jmOrdenarNombre = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmBuscarNombreSucursal = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Localidades");

        tablaLocalidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaLocalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLocalidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLocalidades);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Nombre de la Localidad: ");

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

        jmBuscarNombreSucursal.setText("Buscar por Nombre de Localidad");
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
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbLocalidad_Municipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(txtNombreLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(69, 69, 69)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbLocalidad_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAñadir)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        añadirDatos();
        mostrarDatosTabla();
        limpiarCeldas();


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablaLocalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLocalidadesMouseClicked

        try {

            int filaSeleccionada = tablaLocalidades.getSelectedRow();
            //int filaSeleccionada = tablaUsuarios.rowAtPoint(evt.getPoint());

            txtNombreLocalidad.setText(tablaLocalidades.getValueAt(filaSeleccionada, 2).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en copiar los datos de la tabla --> " + e);
        }

    }//GEN-LAST:event_tablaLocalidadesMouseClicked

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
        String[] titulosTabla = {"ID Localidad", "ID Municipio", "Localidad"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String datoBuscar = JOptionPane.showInputDialog("Ingrese el criterio a buscar:");

        String Query = "SELECT idLocalidad, idMunicipio, localidad FROM Localidades WHERE localidad LIKE '%" + datoBuscar + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idLocalidad");
                registros[1] = rs.getString("idMunicipio");
                registros[2] = rs.getString("localidad");

                modelo.addRow(registros);

            }

            tablaLocalidades.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }


    }//GEN-LAST:event_jmBuscarNombreSucursalActionPerformed

    //MÉTODOS
    public void añadirDatos() {

        String nombreLocalidad = txtNombreLocalidad.getText();

        obtenerId(cbLocalidad_Municipio.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();
            String query = "INSERT INTO Localidades (idMunicipio, localidad) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idMunicipioObtenido);
            ps.setString(2, nombreLocalidad);

            cbLocalidad_Municipio.setSelectedIndex(0);

            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos --> " + e);
        }
    }

    public void actualiarDatos() {

        String nombreLocalidad = txtNombreLocalidad.getText();

        obtenerId(cbLocalidad_Municipio.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();

            int filaSeleccionada = tablaLocalidades.getSelectedRow();
            String filaSeleccionadaText = String.valueOf(tablaLocalidades.getValueAt(filaSeleccionada, 0));

            String query = "UPDATE Localidades SET localidad = ?, idMunicipio = ? WHERE idLocalidad = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, nombreLocalidad);
            ps.setInt(2, idMunicipioObtenido);

            ps.setString(3, filaSeleccionadaText);

            ps.executeUpdate();

            cbLocalidad_Municipio.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado un registro para actualizar.");
        }
    }

    public void eliminarDatos() {

        int filaSeleccionada = tablaLocalidades.getSelectedRow();

        try {

            String query = "DELETE FROM Localidades WHERE idLocalidad = " + tablaLocalidades.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(query);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado ningún dato para eliminar.");
        }

    }

    public void mostrarDatosTabla() {

        String[] titulosTabla = {"ID Localidad", "ID Municipio", "Localidad"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idLocalidad, idMunicipio, localidad FROM Localidades";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idLocalidad");
                registros[1] = rs.getString("idMunicipio");
                registros[2] = rs.getString("localidad");

                modelo.addRow(registros);

            }

            tablaLocalidades.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void ordenarTabla() {

        String[] titulosTabla = {"ID Localidad", "ID Municipio", "Localidad"};
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idLocalidad, idMunicipio, localidad FROM Localidades ORDER BY localidad ASC";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idLocalidad");
                registros[1] = rs.getString("idMunicipio");
                registros[2] = rs.getString("localidad");

                modelo.addRow(registros);

            }

            tablaLocalidades.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void limpiarCeldas() {
        txtNombreLocalidad.setText("");

    }

    public DefaultComboBoxModel llenarComboLocalidades() {

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("Seleccionar municipio...");

        try {

            String Query = "SELECT municipio FROM Municipios";

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

    public int obtenerId(String municipio) {

        idMunicipioObtenido = 0;

        String Query = "SELECT idMunicipio FROM Municipios WHERE municipio = '" + municipio + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                idMunicipioObtenido = rs.getInt(1);

                //JOptionPane.showMessageDialog(null, "ID obtenido -->" + idContactoObtenido);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id Municipio --> " + e);
        }
        return idMunicipioObtenido;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbLocalidad_Municipio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmBuscarNombreSucursal;
    private javax.swing.JMenuItem jmOrdenarID;
    private javax.swing.JMenuItem jmOrdenarNombre;
    private javax.swing.JTable tablaLocalidades;
    private javax.swing.JTextField txtNombreLocalidad;
    // End of variables declaration//GEN-END:variables
}
