/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author MINEDUCYT
 */
public class ProductosDao {
    Connection con;
    conector cn = new conector();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarProductos(Productos pro){
        String sql = "INSERT INTO productos (codigo_producto, nombre_producto,cantidad,precio_producto,) VALUES (?,?,?,?,?)";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getStock());
            ps.setDouble(4, pro.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
}
    public Productos BuscarPro(String cod){
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE codigo_producto = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setId(rs.getString("codigo_producto"));
                producto.setNombre(rs.getString("nombre_producto"));
                producto.setPrecio(rs.getDouble("precio_producto"));
                producto.setStock(rs.getInt("cantidad"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
    
    public Productos ProducHis(String codi){
        Productos producto = new Productos();
        String sql = "select (nombre) from productos_muestra WHERE codigo_producto = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, codi);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setNombre(rs.getString("nombre"));
                //producto.setPrecio(rs.getDouble("precio_producto"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    } 
    
    public Productos ProducHis2(String codi){
        Productos producto = new Productos();
        String sql = "select (precio) from productos_muestra WHERE codigo_producto = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, codi);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setNombre(rs.getString("precio"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    } 
    
    
}


