package Modelo;

/**
 *
 * @author Erick E. Osoy
 */
public class Proveedor {
    private int Id_Proveedor;
    String Nombre;
    String Telefono;
    String Correo;

    public Proveedor() {
    }

    public Proveedor(int Id_Proveedor, String Nombre, String Telefono, String Correo) {
        this.Id_Proveedor = Id_Proveedor;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    
    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
