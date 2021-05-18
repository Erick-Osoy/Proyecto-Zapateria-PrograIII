package Modelo;

/**
 *
 * @author Erick E. Osoy
 */
public class Empleado {
    private int Id_Empleado;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String DPI;
    private String Sexo;
    private String Telefono;
    private String Correo;
    private String Nacimiento;
    private int Id_Puesto;

    public Empleado() {
    }

    public Empleado(int Id_Empleado, String Nombre, String Apellido, int Edad, String DPI, String Sexo, String Telefono, String Correo, String Nacimiento, int Id_Puesto) {
        this.Id_Empleado = Id_Empleado;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.DPI = DPI;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Nacimiento = Nacimiento;
        this.Id_Puesto = Id_Puesto;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
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

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public int getId_Puesto() {
        return Id_Puesto;
    }

    public void setId_Puesto(int Id_Puesto) {
        this.Id_Puesto = Id_Puesto;
    }
}
