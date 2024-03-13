/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Clogin {
 
    public void validaUsuario(JTextField usuario,JPasswordField contra){
        try{
            ResultSet rs=null;
            PreparedStatement ps=null;
            
            clases.CConexion objetoConexion= new clases.CConexion();
            
            String consulta="select * from usuarios where usuarios.usuarios =(?) and usuarios.contra=(?);";
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            String contrasenia=String.valueOf(contra.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contrasenia);

            rs=ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"El usuario es correcto.");
                MenuMain objetoMenu = new MenuMain();
                objetoMenu.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"El usuario o la contraseña es incorrecto, intente otra vez.");
                usuario objetoUsuario = new usuario();
                objetoUsuario.setVisible(true);
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Eroor:"+e.toString());

        }
    }
    
}
