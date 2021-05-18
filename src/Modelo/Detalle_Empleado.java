package Modelo;

/**
 *
 * @author Erick E. Osoy
 */
public class Detalle_Empleado {
    private int Id_Detalle_Empleado;
    private String User;
    private String Pass;
    private Double Sueldo_Base;
    private Double Descuentos;
    private Double Total_Pagar;
    private Double Hora;
    private Double Extras;
    private int Id_Empleado;

    public Detalle_Empleado() {
    }

    public Detalle_Empleado(int Id_Detalle_Empleado, String User, String Pass, Double Sueldo_Base, Double Descuentos, Double Total_Pagar, Double Hora, Double Extras, int Id_Empleado) {
        this.Id_Detalle_Empleado = Id_Detalle_Empleado;
        this.User = User;
        this.Pass = Pass;
        this.Sueldo_Base = Sueldo_Base;
        this.Descuentos = Descuentos;
        this.Total_Pagar = Total_Pagar;
        this.Hora = Hora;
        this.Extras = Extras;
        this.Id_Empleado = Id_Empleado;
    }

    public int getId_Detalle_Empleado() {
        return Id_Detalle_Empleado;
    }

    public void setId_Detalle_Empleado(int Id_Detalle_Empleado) {
        this.Id_Detalle_Empleado = Id_Detalle_Empleado;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public Double getSueldo_Base() {
        return Sueldo_Base;
    }

    public void setSueldo_Base(Double Sueldo_Base) {
        this.Sueldo_Base = Sueldo_Base;
    }

    public Double getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(Double Descuentos) {
        this.Descuentos = Descuentos;
    }

    public Double getTotal_Pagar() {
        return Total_Pagar;
    }

    public void setTotal_Pagar(Double Total_Pagar) {
        this.Total_Pagar = Total_Pagar;
    }

    public Double getHora() {
        return Hora;
    }

    public void setHora(Double Hora) {
        this.Hora = Hora;
    }

    public Double getExtras() {
        return Extras;
    }

    public void setExtras(Double Extras) {
        this.Extras = Extras;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }
}
