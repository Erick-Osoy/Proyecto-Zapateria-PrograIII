package Controlador;

import Formularios.Form_Productos;
import Formularios.Form_Productos_Editar;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Vistas.JF_Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick E. Osoy
 */
public class ControladorProducto implements ActionListener{

    Producto producto = new Producto();
    ProductoDAO pDAO = new ProductoDAO();
    JF_Productos jf_Productos = new JF_Productos();
    Form_Productos agregar = new Form_Productos();
    Form_Productos_Editar edit = new Form_Productos_Editar();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    
    public ControladorProducto(JF_Productos v){
        this.jf_Productos = v;
        this.jf_Productos.btnAgregar.addActionListener(this);
        this.jf_Productos.btnEditar.addActionListener(this);
        this.jf_Productos.btnEliminar.addActionListener(this);
        this.jf_Productos.btnActualizar.addActionListener(this);
        listar(jf_Productos.tabla);
    }
    
    public ControladorProducto(Form_Productos form){
        this.agregar = form;
        this.agregar.btnAgregar.addActionListener(this);
        listar(jf_Productos.tabla);
    }
    
    public ControladorProducto(Form_Productos_Editar edit){
        this.edit = edit;
        this.edit.btnOK.addActionListener(this);
        listar(jf_Productos.tabla);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == jf_Productos.btnActualizar){
            LimpiarTabla();
            listar(jf_Productos.tabla);
        }
        
        if(e.getSource() == agregar.btnAgregar){
            agregar();
            LimpiarCajas();
            LimpiarTabla();
            listar(jf_Productos.tabla);
        }
        
        if(e.getSource() == edit.btnOK){
            actualizar();
            LimpiarCajas();
        }
        
        if(e.getSource() == jf_Productos.btnEliminar){
            eliminar();
            LimpiarTabla();
            listar(jf_Productos.tabla);
        }
    }
    
    
    /* ----- METODOS -----*/
    
    public void listar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Producto>lista = pDAO.Listar();
        Object[] object = new Object[6];
        
        for(int i=0; i<lista.size(); i++){
            object[0] = lista.get(i).getId_Producto();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCantidad();
            object[3] = lista.get(i).getPrecio_Unitario();
            object[4] = lista.get(i).getPrecio_Total();
            object[5] = lista.get(i).getId_Proveedor();
            modelo.addRow(object);
        }
        jf_Productos.tabla.setModel(modelo);
    }
    
    public void agregar(){
        String nombre = agregar.txtNombre.getText();
        int cantidad = Integer.parseInt(agregar.txtCantidad.getText());
        Double precio = Double.parseDouble(agregar.txtPrecio.getText());
        Double total = cantidad*precio;
        agregar.txtTotal.setText(""+total);
        int proveedor = Integer.parseInt(agregar.txtProveedor.getText());
        
        producto.setNombre(nombre);
        producto.setCantidad(cantidad);
        producto.setPrecio_Unitario(precio);
        producto.setPrecio_Total(total);
        producto.setId_Proveedor(proveedor);
        
        int r = pDAO.Agregar(producto);
        
        if(r == 1){
            JOptionPane.showMessageDialog(null, "Registro Agregado");
            agregar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    

    
    public void actualizar(){

            int id = Integer.parseInt(edit.txtID.getText());
            String nombre = edit.txtNombre.getText();
            int cantidad = Integer.parseInt(edit.txtCantidad.getText());
            Double precio = Double.parseDouble(edit.txtPrecio.getText());
            Double total = cantidad*precio;
            edit.txtTotal.setText(""+total);
            int proveedor = Integer.parseInt(edit.txtProveedor.getText());
            
            producto.setId_Producto(id);
            producto.setNombre(nombre);
            producto.setCantidad(cantidad);
            producto.setPrecio_Unitario(precio);
            producto.setPrecio_Total(total);
            producto.setId_Proveedor(proveedor);
            
            pDAO.Actualizar(producto);
            edit.setVisible(false);
            

    }
    
    public void eliminar(){
        int fila = jf_Productos.tabla.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String)jf_Productos.tabla.getValueAt(fila, 0).toString());
            pDAO.eliminar(id);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
    }
    
    private void LimpiarTabla(){
        for(int i=0; i<jf_Productos.tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    private void LimpiarCajas(){
        edit.txtID.setText("");
        edit.txtNombre.setText("");
        edit.txtCantidad.setText("");
        edit.txtPrecio.setText("");
        edit.txtTotal.setText("");
        edit.txtProveedor.setText("");
        
        agregar.txtID.setText("");
        agregar.txtNombre.setText("");
        agregar.txtCantidad.setText("");
        agregar.txtPrecio.setText("");
        agregar.txtTotal.setText("");
        agregar.txtProveedor.setText("");
    }
    
}
