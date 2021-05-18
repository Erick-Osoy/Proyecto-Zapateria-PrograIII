package Controlador;

import Formularios.Form_Empleado;
import Formularios.Form_Empleado_Editar;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Tablas.T_Empleados;
import Vistas.JF_Empleado;
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
public class ControladorEmpleado implements ActionListener{
    
    Empleado empleado = new Empleado();
    EmpleadoDAO eDAO = new EmpleadoDAO();
    
    JF_Empleado jf_Empleado = new JF_Empleado();
    Form_Empleado agregar = new Form_Empleado();
    Form_Empleado_Editar edit = new Form_Empleado_Editar();
    T_Empleados templeados = new T_Empleados();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorEmpleado(JF_Empleado v){
        this.jf_Empleado = v;
        this.jf_Empleado.btnAgregar.addActionListener(this);
        this.jf_Empleado.btnEditar.addActionListener(this);
        this.jf_Empleado.btnEliminar.addActionListener(this);
        this.jf_Empleado.btnActualizar4.addActionListener(this);
        LimpiarTabla();
        listarEmpleado(jf_Empleado.tabla);
        
    }
    
    public ControladorEmpleado(Form_Empleado form){
        this.agregar = form;
        LimpiarTabla();
        this.agregar.btnAgregar.addActionListener(this);
    }
    
    public ControladorEmpleado(Form_Empleado_Editar edit){
        this.edit = edit;
        LimpiarTabla();
        this.edit.btnOK.addActionListener(this);
    }
    
    public ControladorEmpleado(T_Empleados tabla){
        this.templeados = tabla;
        LimpiarTabla();
        listarEmpleado(templeados.tabla);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == jf_Empleado.btnActualizar4){
            LimpiarTabla();
            listarEmpleado(jf_Empleado.tabla);
        }

        if(e.getSource() == agregar.btnAgregar){
            agregarEmpleado();
            LimpiarCajas();
            LimpiarTabla();
            listarEmpleado(jf_Empleado.tabla);
        }
        
        if(e.getSource() == edit.btnOK){
            actualizarEmpleado();
            LimpiarCajas();
            LimpiarTabla();
            listarEmpleado(jf_Empleado.tabla);
        }

        
        if(e.getSource() == jf_Empleado.btnEliminar){
            eliminarEmpleado();
            LimpiarTabla();
            listarEmpleado(jf_Empleado.tabla);
        }
    }
    
    
        /* ----- METODOS -----*/
    
    public void listarEmpleado(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Empleado>lista = eDAO.Listar();
        Object[] object = new Object[10];
        
        for(int i=0; i<lista.size(); i++){
            object[0] = lista.get(i).getId_Empleado();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getApellido();
            object[3] = lista.get(i).getEdad();
            object[4] = lista.get(i).getDPI();
            object[5] = lista.get(i).getSexo();
            object[6] = lista.get(i).getTelefono();
            object[7] = lista.get(i).getCorreo();
            object[8] = lista.get(i).getNacimiento();
            object[9] = lista.get(i).getId_Puesto();
            modelo.addRow(object);
        }
        jf_Empleado.tabla.setModel(modelo);
    }
    
    public void agregarEmpleado(){
        
        String nombre = agregar.txtNombre.getText();
        String apellido = agregar.txtApellido.getText();
        int edad = Integer.parseInt(agregar.txtEdad.getText());
        String dpi = agregar.txtDPI.getText();
        String sexo = agregar.txtSexo.getText();
        String telefono = agregar.txtCelular.getText();
        String correo = agregar.txtCorreo.getText();
        String nacimiento = agregar.txtFecha.getText();
        int puesto = Integer.parseInt(agregar.txtPuesto.getText());
        
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setEdad(edad);
        empleado.setDPI(dpi);
        empleado.setSexo(sexo);
        empleado.setTelefono(telefono);
        empleado.setCorreo(correo);
        empleado.setNacimiento(nacimiento);
        empleado.setId_Puesto(puesto);
        
        int r = eDAO.Agregar(empleado);
        
        if(r == 1 ){
            JOptionPane.showMessageDialog(null, "Registro Agregado");
            agregar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    
    public void actualizarEmpleado(){

            int id = Integer.parseInt(edit.txtID.getText());
            String nombre = edit.txtNombre.getText();
            String apellido = edit.txtApellido.getText();
            int edad = Integer.parseInt(edit.txtEdad.getText());
            String dpi = edit.txtDPI.getText();
            String sexo = edit.txtSexo.getText();
            String telefono = edit.txtCelular.getText();
            String correo = edit.txtCorreo.getText();
            String nacimiento = edit.txtFecha.getText();
            int puesto = Integer.parseInt(edit.txtPuesto.getText()); 
            
            empleado.setId_Empleado(id);
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setEdad(edad);
            empleado.setDPI(dpi);
            empleado.setSexo(sexo);
            empleado.setTelefono(telefono);
            empleado.setCorreo(correo);
            empleado.setNacimiento(nacimiento);
            empleado.setId_Puesto(puesto);
            
            eDAO.Actualizar(empleado);
            
            edit.setVisible(false);

    }
    
    public void eliminarEmpleado(){
        int fila = jf_Empleado.tabla.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String)jf_Empleado.tabla.getValueAt(fila, 0).toString());
            eDAO.eliminar(id);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }
    }
    
    private void LimpiarTabla(){
        for(int i=0; i<jf_Empleado.tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    private void LimpiarCajas(){
        edit.txtID.setText("");
        edit.txtNombre.setText("");
        edit.txtApellido.setText("");
        edit.txtEdad.setText("");
        edit.txtDPI.setText("");
        edit.txtSexo.setText("");
        edit.txtCelular.setText("");
        edit.txtCorreo.setText("");
        edit.txtFecha.setText("");
        edit.txtPuesto.setText("");
        
        agregar.txtID.setText("");
        agregar.txtNombre.setText("");
        agregar.txtApellido.setText("");
        agregar.txtEdad.setText("");
        agregar.txtDPI.setText("");
        agregar.txtSexo.setText("");
        agregar.txtCelular.setText("");
        agregar.txtCorreo.setText("");
        agregar.txtFecha.setText("");
        agregar.txtPuesto.setText("");
    }
}
