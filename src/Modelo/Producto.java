package Modelo;

/**
 *
 * @author Erick E. Osoy
 */
public class Producto {
    private int Id_Producto;
    String Nombre;
    int Cantidad;
    Double Precio_Unitario;
    Double Precio_Total;
    int Id_Proveedor;

    public Producto() {
    }

    public Producto(int Id_Producto, String Nombre, int Cantidad, Double Precio_Unitario, Double Precio_Total, int Id_Proveedor) {
        this.Id_Producto = Id_Producto;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio_Unitario = Precio_Unitario;
        this.Precio_Total = Precio_Total;
        this.Id_Proveedor = Id_Proveedor;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getPrecio_Unitario() {
        return Precio_Unitario;
    }

    public void setPrecio_Unitario(Double Precio_Unitario) {
        this.Precio_Unitario = Precio_Unitario;
    }

    public Double getPrecio_Total() {
        return Precio_Total;
    }

    public void setPrecio_Total(Double Precio_Total) {
        this.Precio_Total = Precio_Total;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
    }
    
}
