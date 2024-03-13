/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CConexion {
        Connection con;
    public Connection estableceConexion() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "cangrejo12");
            //System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            //System.out.println("Problemas en la conexión: " + e.getMessage());
        }
            return con;
    }
}
