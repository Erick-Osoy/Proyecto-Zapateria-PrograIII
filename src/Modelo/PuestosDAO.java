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
public class PuestosDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
     /* METODO LISTAR PUESTOS */
    public List Listar(){
        List<Puestos> datos = new ArrayList<>();
        String sql = "select * from puesto";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Puestos puestos = new Puestos();
                puestos.setId_Puesto(rs.getInt(1));
                puestos.setNombre(rs.getString(2));
                datos.add(puestos);
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR EN LISTAR puesto DAO" +e);
        }
        return datos;
    }
    
    /* METODO AGREGAR PUESTO */
    public int Agregar(Puestos puestos){
        String sql = "insert into puesto(Nombre) values(?)";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, puestos.getNombre());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AGREGAR puesto DAO" +e);
        }
        return 1;
    }
    
    /* METODO ACTUALIZAR PUESTOS*/
    public int Actualizar(Puestos puestos){
        String sql = "update puesto set Nombre=? where Id_Puesto=?";
         
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, puestos.getNombre());
            ps.setInt(2, puestos.getId_Puesto());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ERROR ACTUALIZAR puesto DAO : " +e);
        }
        return 1;
    }
    
    /* METODO ELIMINAR PROVEEDOR */
    public void eliminar(int id){
        String sql = "delete from puesto where Id_Puesto="+id;
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR ELIMINAR puesto DAO : " + e);
        }
    }
    
}
