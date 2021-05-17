package DataAccessLayer;

import java.sql.*;
import javax.swing.JOptionPane;

//Conexión de Java a SQL server.
public class Conexion {

    public static Connection getConexion() {

        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=simisoftdb;"
                + "user=sa;"
                + "password=Chilaquilesdetete117;"
                + "loginTimeout=30;";

        try {

            Connection con = DriverManager.getConnection(conexionUrl);
            //JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos.");

            return con;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos --> " + e);

            return null;
        }

    }

}
