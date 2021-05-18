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
public class EmpleadoDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /* METODO LISTAR empleado */
    public List Listar(){
        List<Empleado> datos = new ArrayList<>();
        String sql = "select * from empleado";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Empleado empleado = new Empleado();
                empleado.setId_Empleado(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellido(rs.getString(3));
                empleado.setEdad(rs.getInt(4));
                empleado.setDPI(rs.getString(5));
                empleado.setSexo(rs.getString(6));
                empleado.setTelefono(rs.getString(7));
                empleado.setCorreo(rs.getString(8));
                empleado.setNacimiento(rs.getString(9));
                empleado.setId_Puesto(rs.getInt(10));
                datos.add(empleado);
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR EN LISTAR empleado DAO" +e);
        }
        return datos;
    }
    
    /* METODO AGREGAR empleado */
    public int Agregar(Empleado empleado){
        String sql = "insert into empleado(Nombre, Apellido, Edad, DPI, Sexo, Telefono, Correo, Nacimiento, Id_Puesto) values(?,?,?,?,?,?,?,?,?)";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setInt(3, empleado.getEdad());
            ps.setString(4, empleado.getDPI());
            ps.setString(5, empleado.getSexo());
            ps.setString(6, empleado.getTelefono());
            ps.setString(7, empleado.getCorreo());
            ps.setString(8, empleado.getNacimiento());
            ps.setInt(9, empleado.getId_Puesto());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR AGREGAR empleado DAO" +e);
        }
        return 1;
    }
    
    /* METODO ACTUALIZAR empleado*/
    public int Actualizar(Empleado empleado){
        String sql = "update empleado set Nombre=?, Apellido=?, Edad=?, DPI=?, Sexo=?, Telefono=?, Correo=?, Nacimiento=?, Id_Puesto=? where Id_Empleado=?";
         
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setInt(3, empleado.getEdad());
            ps.setString(4, empleado.getDPI());
            ps.setString(5, empleado.getSexo());
            ps.setString(6, empleado.getTelefono());
            ps.setString(7, empleado.getCorreo());
            ps.setString(8, empleado.getNacimiento());
            ps.setInt(9, empleado.getId_Puesto());
            ps.setInt(10, empleado.getId_Empleado());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("ERROR ACTUALIZAR empleado DAO : " +e);
        }
        return 1;
    }
    
    /* METODO ELIMINAR empleado */
    public void eliminar(int id){
        String sql = "delete from empleado where Id_Empleado="+id;
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR ELIMINAR empleado DAO : " + e);
        }
    }
}
