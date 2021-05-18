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
public class ProveedorDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    /* METODO LISTAR PROVEEDOR */
    public List Listar(){
        List<Proveedor> datos = new ArrayList<>();
        String sql = "select * from proveedores";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Proveedor proveedor = new Proveedor();
                proveedor.setId_Proveedor(rs.getInt(1));
                proveedor.setNombre(rs.getString(2));
                proveedor.setTelefono(rs.getString(3));
                proveedor.setCorreo(rs.getString(4));
                datos.add(proveedor);
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR EN LISTAR PROVEEDOR DAO" +e);
        }
        return datos;
    }
    
    
    /* METODO AGREGAR Proveedor */
    public int Agregar(Proveedor proveedor){
        String sql = "insert into proveedores(Nombre, Telefono, Correo) values(?,?,?)";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getNombre());
            ps.setString(2, proveedor.getTelefono());
            ps.setString(3, proveedor.getCorreo());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AGREGAR PROVEEDOR DAO" +e);
        }
        return 1;
    }
    
    /* METODO ACTUALIZAR PROVEEDOR*/
    public int Actualizar(Proveedor proveedor){
        String sql = "update proveedores set Nombre=?, Telefono=?, Correo=? where Id_Proveedor=?";
         
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getNombre());
            ps.setString(2, proveedor.getTelefono());
            ps.setString(3, proveedor.getCorreo());
            ps.setInt(4, proveedor.getId_Proveedor());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ERROR ACTUALIZAR PROVEEDOR DAO : " +e);
        }
        return 1;
    }
    
    /* METODO ELIMINAR PROVEEDOR */
    public void eliminar(int id){
        String sql = "delete from proveedores where Id_Proveedor="+id;
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR ELIMINAR PROVEEDOR DAO : " + e);
        }
    }
}
