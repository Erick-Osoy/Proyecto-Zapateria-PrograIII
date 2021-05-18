package Modelo;

/**
 *
 * @author Erick E. Osoy
 */
public class Puestos {
    private int Id_Puesto;
    private String Nombre;

    public Puestos() {
    }

    public Puestos(int Id_Puesto, String Nombre) {
        this.Id_Puesto = Id_Puesto;
        this.Nombre = Nombre;
    }

    public int getId_Puesto() {
        return Id_Puesto;
    }

    public void setId_Puesto(int Id_Puesto) {
        this.Id_Puesto = Id_Puesto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
