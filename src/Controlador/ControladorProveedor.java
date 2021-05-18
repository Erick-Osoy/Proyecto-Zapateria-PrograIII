
package Controlador;

import Formularios.Form_Proveedores;
import Formularios.Form_Proveedores_Editar;
import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Tablas.T_Proveedores;
import Vistas.JF_Proveedores;
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
public class ControladorProveedor implements ActionListener{
    
    ProveedorDAO pDAO = new ProveedorDAO();
    Proveedor proveedor = new Proveedor();
    JF_Proveedores jfProveedores = new JF_Proveedores();  
    T_Proveedores t_Proveedores = new T_Proveedores();
    Form_Proveedores form = new Form_Proveedores();
    Form_Proveedores_Editar editar = new Form_Proveedores_Editar();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorProveedor(JF_Proveedores v){
        this.jfProveedores = v;
        this.jfProveedores.btnAgregar.addActionListener(this);
        this.jfProveedores.btnEliminar.addActionListener(this);
        this.jfProveedores.btnActualizar1.addActionListener(this);
        listar(jfProveedores.tabla);
    }
    
    public ControladorProveedor(T_Proveedores pro){
        this.t_Proveedores = pro;
        listar(t_Proveedores.tabla);
    }
    
    public ControladorProveedor(Form_Proveedores fr){
        this.form = fr;
        this.form.btnAgregar.addActionListener(this);
    }
    
    public ControladorProveedor(Form_Proveedores_Editar edit){
        this.editar = edit;
        this.editar.btnOK.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == jfProveedores.btnActualizar1){
             LimpiarTabla();
             listar(jfProveedores.tabla);
        }

        if(e.getSource() == form.btnAgregar){
            agregar();
            LimpiarCajas();
            LimpiarTabla();
            listar(jfProveedores.tabla);
        }
        
        if(e.getSource() == editar.btnOK){
            actualizar();
            LimpiarTabla();
        }
        
        if(e.getSource() == jfProveedores.btnEliminar){
            eliminar();
            LimpiarTabla();
            listar(jfProveedores.tabla);
        }
    }
    
    
    
    
    public void listar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Proveedor>lista = pDAO.Listar();
        Object[] object = new Object[4];
        
        for(int i=0; i < lista.size(); i++){
            object[0] = lista.get(i).getId_Proveedor();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getTelefono();
            object[3] = lista.get(i).getCorreo();
            modelo.addRow(object);
        }
        jfProveedores.tabla.setModel(modelo);
    }
    
    
    public void agregar(){
        
        
        String nombre = form.txtNombre.getText();
        String telefono = form.txtTelefono.getText();
        String correo = form.txtCorreo.getText();
        
     
        proveedor.setNombre(nombre);
        proveedor.setTelefono(telefono);
        proveedor.setCorreo(correo);
        
        int r = pDAO.Agregar(proveedor);
        
        if(r == 1 ){
            JOptionPane.showMessageDialog(null, "Registro Agregado");
            form.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }
    
    public void actualizar(){
        
            int id = Integer.parseInt(editar.txtID.getText());
            String nombre = editar.txtNombre.getText();
            String telefono = editar.txtTelefono.getText();
            String correo = editar.txtCorreo.getText();
        
            proveedor.setId_Proveedor(id);
            proveedor.setNombre(nombre);
            proveedor.setTelefono(telefono);
            proveedor.setCorreo(correo);
        
            pDAO.Actualizar(proveedor);
            editar.setVisible(false);
        
    }
    
    public void eliminar(){
        int fila = jfProveedores.tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String)jfProveedores.tabla.getValueAt(fila, 0).toString());
            pDAO.eliminar(id);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
    }
    
    
    void LimpiarTabla(){
        for (int i=0; i<jfProveedores.tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    void LimpiarCajas(){
        form.txtID.setText("");
        form.txtNombre.setText("");
        form.txtTelefono.setText("");
        form.txtCorreo.setText("");
        
        editar.txtID.setText("");
        editar.txtNombre.setText("");
        editar.txtTelefono.setText("");
        editar.txtCorreo.setText("");
    }
    
}
