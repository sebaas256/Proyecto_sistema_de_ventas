
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MINEDUCYT
 */
public class ConectorL {
   Connection con;    
   public Connection conexion(){
       try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "cangrejo12");
           //JOptionPane.showMessageDialog(null, "Conexion exitosaaa");  
       }catch(Exception e){
           //JOptionPane.showMessageDialog(null, "Error al conectar la base de datos:"+e.toString());
       }
       return con;
   } 
}
