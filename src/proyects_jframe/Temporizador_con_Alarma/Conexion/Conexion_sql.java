package proyects_jframe.Temporizador_con_Alarma.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion_sql {
    Connection conection = null;
    String usuario ;
    String contraseña;
    String bd ;
    String ip = "localhost";
    String puerto = "1433";
    

    public Conexion_sql(){
        EstablecerDatos_sql();
    }
    public void EstablecerDatos_sql(){
        //? Codigo aqui 
        /*
         * usar un Jframe , Para Introducir las contraseñas manualmente
         * usar temporalmente los datos establecidos en el codigo
         */
        usuario = SesionSQL.getUsers();
        contraseña = SesionSQL.getPassword();
        bd = SesionSQL.getNameTable();
        
    }

    public Connection establecerConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            //? URL para iniciar sesion en sql por la consola
            String url = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+bd+";user="+usuario
                    +";password="+contraseña+";encrypt=true;trustServerCertificate=true";
            
            
            conection = DriverManager.getConnection(url);
            System.out.println("Conexión exitosa.");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"ERROR : DRIVER NO ENCONTRADO");
            e.printStackTrace();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos:"+e.getMessage());
            e.printStackTrace();
        }


        return conection;
    }

}
