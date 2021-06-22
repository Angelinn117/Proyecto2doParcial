package ViewLayer;

import DataAccessLayer.Conexion;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JInternalFrame {

    Connection con = Conexion.getConexion();

    int idSucursalObtenido;
    int idContactoObtenido;

    public Usuarios() {
        initComponents();
        mostrarDatosTabla();
        cbUsuarios_Sucursales.setModel(llenarComboSucursales());
        cbUsuarios_Contactos.setModel(llenarComboContactos());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        cbActivo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbUsuarios_Contactos = new javax.swing.JComboBox<>();
        cbUsuarios_Sucursales = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmOrdenarID = new javax.swing.JMenuItem();
        jmOrdenarNombreUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmBuscarNombreUsuario = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuarios");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Tipo de Usuario:");

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

        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Empleado", "Gerente" }));

        cbActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Activo:");

        cbUsuarios_Sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuarios_SucursalesActionPerformed(evt);
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

        jmOrdenarNombreUsuario.setText("Ordenar por Nombre de Usuario");
        jmOrdenarNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOrdenarNombreUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmOrdenarNombreUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buscar dato");

        jmBuscarNombreUsuario.setText("Buscar por Nombre de Usuario");
        jmBuscarNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarNombreUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmBuscarNombreUsuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContraseña)
                                    .addComponent(txtNombre)
                                    .addComponent(txtNombreUsuario)
                                    .addComponent(cbTipoUsuario, 0, 156, Short.MAX_VALUE)
                                    .addComponent(cbActivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(cbUsuarios_Sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(cbUsuarios_Contactos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAñadir)
                        .addGap(27, 27, 27)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbUsuarios_Sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUsuarios_Contactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAñadir)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        añadirDatos();
        mostrarDatosTabla();
        limpiarCeldas();


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked

        try {

            int filaSeleccionada = tablaUsuarios.getSelectedRow();
            //int filaSeleccionada = tablaUsuarios.rowAtPoint(evt.getPoint());

            cbTipoUsuario.setSelectedItem(tablaUsuarios.getValueAt(filaSeleccionada, 2));
            txtNombre.setText(tablaUsuarios.getValueAt(filaSeleccionada, 3).toString());
            txtNombreUsuario.setText(tablaUsuarios.getValueAt(filaSeleccionada, 5).toString());
            txtContraseña.setText(tablaUsuarios.getValueAt(filaSeleccionada, 6).toString());
            cbActivo.setSelectedItem(tablaUsuarios.getValueAt(filaSeleccionada, 7));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en copiar los datos de la tabla --> " + e);
        }

    }//GEN-LAST:event_tablaUsuariosMouseClicked

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

    private void jmOrdenarNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOrdenarNombreUsuarioActionPerformed
        ordenarTabla();
    }//GEN-LAST:event_jmOrdenarNombreUsuarioActionPerformed

    private void jmOrdenarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOrdenarIDActionPerformed
        mostrarDatosTabla();
    }//GEN-LAST:event_jmOrdenarIDActionPerformed

    private void jmBuscarNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarNombreUsuarioActionPerformed

        String[] titulosTabla = {"ID de Usuario", "ID de Sucursal", "Tipo de Usuario", "Nombre", "ID de Contacto", "Nombre de Usuario", "Contraseña", "Activo"};
        String[] registros = new String[8];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String datoBuscar = JOptionPane.showInputDialog("Ingrese el criterio a buscar:");

        String Query = "SELECT idUsuario, idSucursal, tipoUsuario, nombre, idContacto, usuario, password, activo FROM Usuarios WHERE usuario LIKE '%" + datoBuscar + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idUsuario");
                registros[1] = rs.getString("idSucursal");
                registros[2] = rs.getString("tipoUsuario");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("idContacto");
                registros[5] = rs.getString("usuario");
                registros[6] = rs.getString("password");
                registros[7] = rs.getString("activo");

                modelo.addRow(registros);

            }

            tablaUsuarios.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }
        //


    }//GEN-LAST:event_jmBuscarNombreUsuarioActionPerformed

    private void cbUsuarios_SucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuarios_SucursalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUsuarios_SucursalesActionPerformed

    //MÉTODOS
    public int obtenerIdSucursales(String nombreSucursal) {

        idSucursalObtenido = 0;

        String Query = "SELECT idSucursal FROM Sucursales WHERE nombre = '" + nombreSucursal + "'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                idSucursalObtenido = rs.getInt(1);

                //JOptionPane.showMessageDialog(null, "ID obtenido -->" + idSucursalObtenido);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id Sucursal --> " + e);
        }
        return idSucursalObtenido;

    }

    public int obtenerIdContactos(String telefono) {

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

    public void añadirDatos() {

        String tipoUsuario = String.valueOf(cbTipoUsuario.getSelectedItem());
        String nombre = txtNombre.getText();
        String nombreUsuario = txtNombreUsuario.getText();
        String contraseña = String.valueOf(txtContraseña.getPassword());

        boolean activo = true;

        if (cbActivo.getSelectedItem() == "Si") {
            activo = true;
        }

        if (cbActivo.getSelectedItem() == "No") {
            activo = false;
        }

        obtenerIdSucursales(cbUsuarios_Sucursales.getSelectedItem().toString());
        obtenerIdContactos(cbUsuarios_Contactos.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();
            String query = "INSERT INTO Usuarios (idSucursal, tipoUsuario, nombre, idContacto, usuario, password, activo) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idSucursalObtenido);
            ps.setString(2, tipoUsuario);
            ps.setString(3, nombre);
            ps.setInt(4, idContactoObtenido);
            ps.setString(5, nombreUsuario);
            ps.setString(6, contraseña);
            ps.setBoolean(7, activo);

            ps.executeUpdate();

            cbUsuarios_Sucursales.setSelectedIndex(0);
            cbUsuarios_Contactos.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos --> " + e);
        }
    }

    public void actualiarDatos() {
        String tipoUsuario = String.valueOf(cbTipoUsuario.getSelectedItem());
        String nombre = txtNombre.getText();
        String nombreUsuario = txtNombreUsuario.getText();
        String contraseña = String.valueOf(txtContraseña.getPassword());

        boolean activo = true;

        if (cbActivo.getSelectedItem() == "Si") {
            activo = true;
        }

        if (cbActivo.getSelectedItem() == "No") {
            activo = false;
        }

        obtenerIdSucursales(cbUsuarios_Sucursales.getSelectedItem().toString());
        obtenerIdContactos(cbUsuarios_Contactos.getSelectedItem().toString());

        try {

            Connection con = Conexion.getConexion();

            int filaSeleccionada = tablaUsuarios.getSelectedRow();
            String filaSeleccionadaText = String.valueOf(tablaUsuarios.getValueAt(filaSeleccionada, 0));

            String query = "UPDATE Usuarios SET idSucursal = ?, tipoUsuario = ?, nombre= ?, idContacto = ?, usuario= ?, password= ?, activo= ? WHERE idUsuario = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idSucursalObtenido);
            ps.setString(2, tipoUsuario);
            ps.setString(3, nombre);
            ps.setInt(4, idContactoObtenido);
            ps.setString(5, nombreUsuario);
            ps.setString(6, contraseña);
            ps.setBoolean(7, activo);

            ps.setString(8, filaSeleccionadaText);

            cbUsuarios_Sucursales.setSelectedIndex(0);
            cbUsuarios_Contactos.setSelectedIndex(0);

            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado un registro para actualizar.");
        }
    }

    public void eliminarDatos() {

        int filaSeleccionada = tablaUsuarios.getSelectedRow();

        try {

            String query = "DELETE FROM Usuarios WHERE idUsuario = " + tablaUsuarios.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No a seleccionado ningún dato para eliminar.");
        }

    }

    public void mostrarDatosTabla() {

        String[] titulosTabla = {"ID de Usuario", "ID de Sucursal", "Tipo de Usuario", "Nombre", "ID de Contacto", "Nombre de Usuario", "Contraseña", "Activo"};
        String[] registros = new String[8];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idUsuario, idSucursal, tipoUsuario, nombre, idContacto, usuario, password, activo FROM Usuarios";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idUsuario");
                registros[1] = rs.getString("idSucursal");
                registros[2] = rs.getString("tipoUsuario");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("idContacto");
                registros[5] = rs.getString("usuario");
                registros[6] = rs.getString("password");
                registros[7] = rs.getString("activo");

                modelo.addRow(registros);

            }

            tablaUsuarios.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public void ordenarTabla() {

        String[] titulosTabla = {"ID de Usuario", "ID de Sucursal", "Tipo de Usuario", "Nombre", "ID de Contacto", "Nombre de Usuario", "Contraseña", "Activo"};
        String[] registros = new String[8];

        DefaultTableModel modelo = new DefaultTableModel(null, titulosTabla);

        String Query = "SELECT idUsuario, idSucursal, tipoUsuario, nombre, idContacto, usuario, password, activo FROM Usuarios ORDER BY usuario ASC";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {

                registros[0] = rs.getString("idUsuario");
                registros[1] = rs.getString("idSucursal");
                registros[2] = rs.getString("tipoUsuario");
                registros[3] = rs.getString("nombre");
                registros[4] = rs.getString("idContacto");
                registros[5] = rs.getString("usuario");
                registros[6] = rs.getString("password");
                registros[7] = rs.getString("activo");

                modelo.addRow(registros);

            }

            tablaUsuarios.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la información para la tabla --> " + e);
        }

    }

    public DefaultComboBoxModel llenarComboSucursales() {

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        modeloCombo.addElement("Seleccionar sucursal...");

        try {

            String Query = "SELECT nombre FROM Sucursales";

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

    public DefaultComboBoxModel llenarComboContactos() {

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

    public void limpiarCeldas() {
        txtNombre.setText("");
        txtNombreUsuario.setText("");
        txtContraseña.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbActivo;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private javax.swing.JComboBox<String> cbUsuarios_Contactos;
    private javax.swing.JComboBox<String> cbUsuarios_Sucursales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmBuscarNombreUsuario;
    private javax.swing.JMenuItem jmOrdenarID;
    private javax.swing.JMenuItem jmOrdenarNombreUsuario;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
