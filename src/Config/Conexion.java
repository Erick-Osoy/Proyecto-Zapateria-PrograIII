package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Erick E. Osoy
 */
public class Conexion {
    Connection con;
    
    private final static String url = "jdbc:mysql://localhost:3306/bd_zapateria";
    private final static String usu = "root";
    private final static String pass = "";
    
    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usu,pass);
        } catch (Exception e) {
            System.out.println("Error al conectar con la Base de Datos : " +e);
        }
        return con;
    }
}
