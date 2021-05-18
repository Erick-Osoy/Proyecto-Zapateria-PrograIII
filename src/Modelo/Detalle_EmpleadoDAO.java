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
public class Detalle_EmpleadoDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /* METODO LISTAR detalle */
    public List Listar(){
        List<Detalle_Empleado> datos = new ArrayList<>();
        String sql = "select * from detalle_empleado";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Detalle_Empleado detalle = new Detalle_Empleado();
                detalle.setId_Detalle_Empleado(rs.getInt(1));
                detalle.setUser(rs.getString(2));
                detalle.setPass(rs.getString(3));
                detalle.setSueldo_Base(rs.getDouble(4));
                detalle.setDescuentos(rs.getDouble(5));
                detalle.setTotal_Pagar(rs.getDouble(6));
                detalle.setHora(rs.getDouble(7));
                detalle.setExtras(rs.getDouble(8));
                detalle.setId_Empleado(rs.getInt(9));
                datos.add(detalle);
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR EN LISTAR detalle DAO" +e);
        }
        return datos;
    }
    
    /* METODO AGREGAR detalle */
    public int Agregar(Detalle_Empleado detalle){
        String sql = "insert into detalle_empleado(User, Pass, Sueldo_Base, Descuentos, Total_Pagar, Hora, Extras, Id_Empleado) values(?,?,?,?,?,?,?,?)";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, detalle.getUser());
            ps.setString(2, detalle.getPass());
            ps.setDouble(3, detalle.getSueldo_Base());
            ps.setDouble(4, detalle.getDescuentos());
            ps.setDouble(5, detalle.getTotal_Pagar());
            ps.setDouble(6, detalle.getHora());
            ps.setDouble(7, detalle.getExtras());
            ps.setInt(8, detalle.getId_Empleado());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AGREGAR detalle DAO" +e);
        }
        return 1;
    }
    
    /* METODO ACTUALIZAR detalle*/
    public int Actualizar(Detalle_Empleado detalle){
        String sql = "update detalle_empleado set User=?, Pass=?, Sueldo_Base=?, Descuentos=?, Total_Pagar=?, Hora=?, Extras=?, Id_Empleado=? where Id_Detalle_Empleado=?";
         
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, detalle.getUser());
            ps.setString(2, detalle.getPass());
            ps.setDouble(3, detalle.getSueldo_Base());
            ps.setDouble(4, detalle.getDescuentos());
            ps.setDouble(5, detalle.getTotal_Pagar());
            ps.setDouble(6, detalle.getHora());
            ps.setDouble(7, detalle.getExtras());
            ps.setInt(8, detalle.getId_Empleado());
            ps.setInt(9, detalle.getId_Detalle_Empleado());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ERROR ACTUALIZAR detalle DAO : " +e);
        }
        return 1;
    }
    
    /* METODO ELIMINAR detalle */
    public void eliminar(int id){
        String sql = "delete from detalle_empleado where Id_Detalle_Empleado="+id;
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR ELIMINAR detalle DAO : " + e);
        }
    }
    
    
    public Detalle_Empleado validarLogin(String user, String pass){
        Detalle_Empleado detalle = new Detalle_Empleado();
        String sql = "select * from detalle_empleado where User=? and Pass=?";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                detalle.setId_Detalle_Empleado(rs.getInt(1));
                detalle.setUser(rs.getString(2));
                detalle.setPass(rs.getString(3));
                detalle.setSueldo_Base(rs.getDouble(4));
                detalle.setDescuentos(rs.getDouble(5));
                detalle.setTotal_Pagar(rs.getDouble(6));
                detalle.setHora(rs.getDouble(7));
                detalle.setExtras(rs.getDouble(8));
                detalle.setId_Empleado(rs.getInt(9));
            }
        } catch (Exception e) {
            System.out.println("error login dao" +e);
        }
        return detalle;
    }
}
