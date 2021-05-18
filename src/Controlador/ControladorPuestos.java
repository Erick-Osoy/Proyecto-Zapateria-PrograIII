package Controlador;

import Formularios.Form_Puestos;
import Formularios.Form_Puestos_Editar;
import Modelo.Puestos;
import Modelo.PuestosDAO;
import Tablas.T_Puestos;
import Vistas.JF_Puestos;
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
public class ControladorPuestos implements ActionListener{
    
    Puestos puestos = new Puestos();
    PuestosDAO pDAO = new PuestosDAO();
    
    JF_Puestos jf_Puestos = new JF_Puestos();
    T_Puestos t_Puestos = new T_Puestos();
    Form_Puestos form = new Form_Puestos();
    Form_Puestos_Editar editar = new Form_Puestos_Editar();
    DefaultTableModel modelo = new DefaultTableModel();

    
    public ControladorPuestos(JF_Puestos v){
        this.jf_Puestos = v;
        this.jf_Puestos.btnAgregar.addActionListener(this);
        this.jf_Puestos.btnEditar.addActionListener(this);
        this.jf_Puestos.btnEliminar.addActionListener(this);
        this.jf_Puestos.btnActualizar.addActionListener(this);
        listar(jf_Puestos.tabla);
    }
    
    public ControladorPuestos(T_Puestos tp){
        this.t_Puestos = tp;
        LimpiarTabla();
        listar(t_Puestos.tabla);
    }
    
    public ControladorPuestos(Form_Puestos fp){
        this.form = fp;
        this.form.btnAgregar.addActionListener(this);  
        listar(jf_Puestos.tabla);
    }
    
    public ControladorPuestos(Form_Puestos_Editar edit){
        this.editar = edit;
        this.editar.btnEditarOK.addActionListener(this);  
        listar(jf_Puestos.tabla);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == form.btnAgregar){   
            
            agregarPuesto();
            LimpiarCajas();
            LimpiarTabla();
            listar(jf_Puestos.tabla);
            form.setVisible(false);
        }
        
        if(e.getSource() == jf_Puestos.btnActualizar){
            LimpiarTabla();
            listar(jf_Puestos.tabla);
        }
        
        if(e.getSource() == editar.btnEditarOK){
            actualizar();
            LimpiarCajas();
        }
        
        if(e.getSource() == jf_Puestos.btnEliminar){
            eliminar();
            LimpiarTabla();
            listar(jf_Puestos.tabla);
        }
    }
    
    
    public void listar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Puestos>lista = pDAO.Listar();
        Object[] object = new Object[2];
        
        for(int i=0; i<lista.size(); i++){
            object[0] = lista.get(i).getId_Puesto();
            object[1] = lista.get(i).getNombre();
            modelo.addRow(object);
        }
        jf_Puestos.tabla.setModel(modelo);
    }
    
    
    public void actualizar(){
        
            int id = Integer.parseInt(editar.txtID.getText());
            String nombre = editar.txtNombre.getText();
            
            
            puestos.setId_Puesto(id);
            puestos.setNombre(nombre);
        
            pDAO.Actualizar(puestos);
            editar.setVisible(false);

    }
    
    public void eliminar(){
        int fila = jf_Puestos.tabla.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String)jf_Puestos.tabla.getValueAt(fila, 0).toString());
            pDAO.eliminar(id);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
    }
    
    void LimpiarTabla(){
        for (int i=0; i<jf_Puestos.tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    void LimpiarCajas(){
        form.txtID.setText("");
        form.txtNombre.setText("");
    }
    
    
    public void agregarPuesto(){
        String nombre = form.txtNombre.getText();
        puestos.setNombre(nombre);
        
        int r = pDAO.Agregar(puestos);
        
        if(r == 1) {
            LimpiarCajas();
            LimpiarTabla();
            JOptionPane.showMessageDialog(null, "Registro Agregado");
            listar(jf_Puestos.tabla);
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar");
        }
    }
    
}
