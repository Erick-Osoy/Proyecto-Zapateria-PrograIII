package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick E. Osoy
 */
public class ProductoDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /* METODO LISTAR PRODUCTOS */
    public List Listar(){
        List<Producto> datos = new ArrayList<>();
        String sql = "select * from producto";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Producto producto = new Producto();
                producto.setId_Producto(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setCantidad(rs.getInt(3));
                producto.setPrecio_Unitario(rs.getDouble(4));
                producto.setPrecio_Total(rs.getDouble(5));
                producto.setId_Proveedor(rs.getInt(6));
                datos.add(producto);
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR EN LISTAR producto DAO" +e);
        }
        return datos;
    }
    
    /* METODO AGREGAR producto */
    public int Agregar(Producto producto){
        String sql = "insert into producto(Nombre, Cantidad, Precio_Unitario, Precio_Total, Id_Proveedor) values(?,?,?,?,?)";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio_Unitario());
            ps.setDouble(4, producto.getPrecio_Total());
            ps.setInt(5, producto.getId_Proveedor());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AGREGAR producto DAO" +e);
        }
        return 1;
    }
    
    /* METODO ACTUALIZAR producto*/
    public int Actualizar(Producto producto){
        String sql = "update producto set Nombre=?, Cantidad=?, Precio_Unitario=?, Precio_Total=?, Id_Proveedor=? where Id_Producto=?";
         
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio_Unitario());
            ps.setDouble(4, producto.getPrecio_Total());
            ps.setInt(5, producto.getId_Proveedor());
            ps.setInt(6, producto.getId_Producto());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ERROR ACTUALIZAR producto DAO : " +e);
        }
        return 1;
    }
    
    /* METODO ELIMINAR PROVEEDOR */
    public void eliminar(int id){
        String sql = "delete from producto where Id_Producto="+id;
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR ELIMINAR producto DAO : " + e);
        }
    }
}
