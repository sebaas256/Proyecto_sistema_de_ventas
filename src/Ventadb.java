/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author MINEDUCYT
 */
public class Ventadb {
    Connection con;
    ConectorL cn = new ConectorL();
    PreparedStatement ps;
    int res;
    public int RegistrarVenta(Venta V){
        String sql = "INSERT INTO historial_ventas(dui,total) VALUES (?,?)";
        try{
           con = cn.conexion();
           ps=   con.prepareStatement(sql);
           ps.setInt(1, V.getdui());
           ps.setDouble(2, V.getTotal());
           ps.execute();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public boolean ActualizarStock(int cant, String cod){
        String sql = "UPDATE productos SET cantidad = ? WHERE codigo_producto = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
}
