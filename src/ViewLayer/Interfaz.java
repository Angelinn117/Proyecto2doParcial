package ViewLayer;

import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    boolean estado = true;

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto 2do Parcial");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Escritorio = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmUsuarios = new javax.swing.JMenuItem();
        jmSucursales = new javax.swing.JMenuItem();
        jmCategorias = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenuItem();
        jmLocalidades = new javax.swing.JMenuItem();
        jmMunicipios = new javax.swing.JMenuItem();
        jmEstados = new javax.swing.JMenuItem();
        jmContactos = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmProductos_Proveedores = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Farmacia 2-min.jpg"))); // NOI18N

        Escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Seleccionar base de datos ");

        jmUsuarios.setText("Usuarios");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jmUsuarios);

        jmSucursales.setText("Sucursales");
        jmSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSucursalesActionPerformed(evt);
            }
        });
        jMenu1.add(jmSucursales);

        jmCategorias.setText("Categorías");
        jmCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCategoriasActionPerformed(evt);
            }
        });
        jMenu1.add(jmCategorias);

        jmClientes.setText("Clientes");
        jmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jmClientes);

        jmProveedores.setText("Proveedores");
        jmProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(jmProveedores);

        jmLocalidades.setText("Localidades");
        jmLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLocalidadesActionPerformed(evt);
            }
        });
        jMenu1.add(jmLocalidades);

        jmMunicipios.setText("Municipios");
        jmMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMunicipiosActionPerformed(evt);
            }
        });
        jMenu1.add(jmMunicipios);

        jmEstados.setText("Estados");
        jmEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEstadosActionPerformed(evt);
            }
        });
        jMenu1.add(jmEstados);

        jmContactos.setText("Contactos");
        jmContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmContactosActionPerformed(evt);
            }
        });
        jMenu1.add(jmContactos);

        jmProductos.setText("Productos");
        jmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jmProductos);
        jMenu1.add(jSeparator1);

        jmProductos_Proveedores.setText("Productos-Proveedores");
        jmProductos_Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductos_ProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(jmProductos_Proveedores);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
        Usuarios usuarios = new Usuarios();

        Escritorio.add(usuarios);
        usuarios.show();
        usuarios.setVisible(true);


    }//GEN-LAST:event_jmUsuariosActionPerformed

    private void jmSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSucursalesActionPerformed
        Sucursales sucursales = new Sucursales();

        Escritorio.add(sucursales);
        sucursales.show();
        sucursales.setVisible(true);
    }//GEN-LAST:event_jmSucursalesActionPerformed

    private void jmCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCategoriasActionPerformed
        Categorias categorias = new Categorias();

        Escritorio.add(categorias);
        categorias.show();
        categorias.setVisible(true);
    }//GEN-LAST:event_jmCategoriasActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        Clientes clientes = new Clientes();

        Escritorio.add(clientes);
        clientes.show();
        clientes.setVisible(true);

    }//GEN-LAST:event_jmClientesActionPerformed

    private void jmProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProveedoresActionPerformed
        Proveedores proveedores = new Proveedores();

        Escritorio.add(proveedores);
        proveedores.show(); 
        proveedores.setVisible(true);
    }//GEN-LAST:event_jmProveedoresActionPerformed

    private void jmLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLocalidadesActionPerformed
        Localidades localidades = new Localidades();

        Escritorio.add(localidades);
        localidades.show(); 
        localidades.setVisible(true);
    }//GEN-LAST:event_jmLocalidadesActionPerformed

    private void jmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosActionPerformed
        Productos productos = new Productos();

        Escritorio.add(productos);
        productos.show(); 
        productos.setVisible(true);
    }//GEN-LAST:event_jmProductosActionPerformed

    private void jmMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMunicipiosActionPerformed
        Municipios municipios = new Municipios();

        Escritorio.add(municipios);
        municipios.show(); 
        municipios.setVisible(true);
    }//GEN-LAST:event_jmMunicipiosActionPerformed

    private void jmEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEstadosActionPerformed
        Estados estados = new Estados();

        Escritorio.add(estados);
        estados.show(); 
        estados.setVisible(true);
    }//GEN-LAST:event_jmEstadosActionPerformed

    private void jmContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmContactosActionPerformed
        Contactos contactos = new Contactos();

        Escritorio.add(contactos);
        contactos.show(); 
        contactos.setVisible(true);
    }//GEN-LAST:event_jmContactosActionPerformed

    private void jmProductos_ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductos_ProveedoresActionPerformed
        Productos_Proveedores productos_Proveedores = new Productos_Proveedores();

        Escritorio.add(productos_Proveedores);
        productos_Proveedores.show(); 
        productos_Proveedores.setVisible(true);
    }//GEN-LAST:event_jmProductos_ProveedoresActionPerformed

    //Método aún en desarrollo (no funciona del todo).
    /*public void validarVentana() {
        Usuarios usuarios = new Usuarios();
        if (estado) {

            estado = false;

            Escritorio.add(usuarios);
            usuarios.show();
            usuarios.setVisible(true);

        }
    }*/

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmCategorias;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenuItem jmContactos;
    private javax.swing.JMenuItem jmEstados;
    private javax.swing.JMenuItem jmLocalidades;
    private javax.swing.JMenuItem jmMunicipios;
    private javax.swing.JMenuItem jmProductos;
    private javax.swing.JMenuItem jmProductos_Proveedores;
    private javax.swing.JMenuItem jmProveedores;
    private javax.swing.JMenuItem jmSucursales;
    private javax.swing.JMenuItem jmUsuarios;
    // End of variables declaration//GEN-END:variables
}
