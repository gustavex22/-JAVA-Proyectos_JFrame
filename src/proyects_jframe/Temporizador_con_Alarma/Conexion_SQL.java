package proyects_jframe.Temporizador_con_Alarma;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexion_SQL {
        
    
    
        public void SQL(String user,String contra){
            
            
            
            int localhost = 1433;
            String dataBase = "Alarmas";
            String User=user;
            String Contraseña = contra;
            
            String url ="jdbc:sqlserver://localhost:"+String.valueOf(localhost)+";databaseName="+dataBase;
            
            
            try {
            Connection conexion = DriverManager.getConnection(url, User, Contraseña);
            JOptionPane.showMessageDialog(null,"¡Conexión exitosa a SQL Server!");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Error al conectar: " + e.getMessage());
        }
        }
        
    }

