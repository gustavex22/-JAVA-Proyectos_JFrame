/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyects_jframe.Temporizador_con_Alarma;

import javax.swing.JOptionPane;

/**
 *
 * @author Iberos-HP
 */
public class Main {
         public static Sesion login = new Sesion();
         public static Timer_Alarma app = new Timer_Alarma();
         public static Conexion_SQL conexionsql = new Conexion_SQL();
    
    public static void main(String[] args){
        boolean continuar= false;
        //inicia el login
         login.setVisible(true);
         String usuario =login.getUser();
         String contraseña = login.getContra();
         
         
         while(continuar){
            continuar = login.estado();
            JOptionPane.showMessageDialog(null,"Implementado con exito");
            //? Inicia sesion en SQL SERVER
            conexionsql.SQL(usuario, contraseña);
         }
            
         
         
         
         
         
        
    }
    
}
