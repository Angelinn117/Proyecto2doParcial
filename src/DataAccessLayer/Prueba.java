
        
package DataAccessLayer;

import java.sql.*;
import javax.swing.JOptionPane;


public class Prueba {
    
    public static void main(String[] args) {
        
        String bases = "";
        
        try{
            
            Statement sql = Conexion.getConexion().createStatement();
            
            String query = "SELECT nombre FROM Sucursales";
            ResultSet resultado = sql.executeQuery(query);
            
            while(resultado.next()){
                
                bases += resultado.getString(1) + "\n";
                
            }
            
            JOptionPane.showMessageDialog(null, bases);
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
            
    }
    
}