package Controlador;

import Formularios.Form_Detalle;
import Formularios.Form_Detalle_Editar;
import Modelo.Detalle_Empleado;
import Modelo.Detalle_EmpleadoDAO;
import Vistas.JF_Detalle_Empleado;
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
public class ControladorDetalleEmpleado implements ActionListener{

    Detalle_Empleado detalle = new Detalle_Empleado();
    Detalle_EmpleadoDAO dDao = new Detalle_EmpleadoDAO();
    
    JF_Detalle_Empleado jf_Detalle_Empleado = new JF_Detalle_Empleado();
    Form_Detalle form_Detalle = new Form_Detalle();
    Form_Detalle_Editar detalle_Editar = new Form_Detalle_Editar();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public ControladorDetalleEmpleado(JF_Detalle_Empleado v){
       this.jf_Detalle_Empleado = v;
       this.jf_Detalle_Empleado.btnAgregar.addActionListener(this);
       this.jf_Detalle_Empleado.btnEditar.addActionListener(this);
       this.jf_Detalle_Empleado.btnEliminar.addActionListener(this);
       this.jf_Detalle_Empleado.btnActualizar4.addActionListener(this);
       listarDetalle(jf_Detalle_Empleado.tabla);
    }
    
    public ControladorDetalleEmpleado(Form_Detalle agregar){
        this.form_Detalle = agregar;
        this.form_Detalle.btnAgregar.addActionListener(this);
    }
    
    public ControladorDetalleEmpleado(Form_Detalle_Editar editar){
        this.detalle_Editar = editar;
        this.detalle_Editar.btnOK.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == jf_Detalle_Empleado.btnActualizar4){
            LimpiarTabla();
            listarDetalle(jf_Detalle_Empleado.tabla);
        }
        
        if(e.getSource() == form_Detalle.btnAgregar){
            agregarDetalle();
            LimpiarCajas();
            LimpiarTabla();
            listarDetalle(jf_Detalle_Empleado.tabla);
        }
        
        if(e.getSource() == detalle_Editar.btnOK){
            actualizarDetalle();
            LimpiarCajas();
            LimpiarTabla();
            listarDetalle(jf_Detalle_Empleado.tabla);
        }
        
        if(e.getSource() == jf_Detalle_Empleado.btnEliminar){
            eliminarDetalle();
            LimpiarTabla();
            listarDetalle(jf_Detalle_Empleado.tabla);
        }
    }
    
    
     /* ----- METODOS -----*/
    
    public void listarDetalle(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Detalle_Empleado>lista = dDao.Listar();
        Object[] object = new Object[9];
        
        for(int i =0; i<lista.size(); i++){
            object[0] = lista.get(i).getId_Detalle_Empleado();
            object[1] = lista.get(i).getUser();
            object[2] = lista.get(i).getPass();
            object[3] = lista.get(i).getSueldo_Base();
            object[4] = lista.get(i).getDescuentos();
            object[5] = lista.get(i).getTotal_Pagar();
            object[6] = lista.get(i).getHora();
            object[7] = lista.get(i).getExtras();
            object[8] = lista.get(i).getId_Empleado();
            
            modelo.addRow(object);
        }
        jf_Detalle_Empleado.tabla.setModel(modelo);
    }
    
    public void agregarDetalle(){
        String user = form_Detalle.txtUser.getText();
        String pass = form_Detalle.txtPass.getText();
        Double sueldo = Double.parseDouble(form_Detalle.txtSueldo.getText());
        Double descuentos = Double.parseDouble(form_Detalle.txtDescuentos.getText());
        Double igss = (sueldo * 5)/100;
        Double total = sueldo - descuentos - igss ;
        Double horas = Double.parseDouble(form_Detalle.txtHoras.getText());
        Double extras = Double.parseDouble(form_Detalle.txtExtras.getText());
        int empleado = Integer.parseInt(form_Detalle.txtEmpleado.getText());
        
        
        detalle.setUser(user);
        detalle.setPass(pass);
        detalle.setSueldo_Base(sueldo);
        detalle.setDescuentos(descuentos);
        detalle.setTotal_Pagar(total);
        detalle.setHora(horas);
        detalle.setExtras(extras);
        detalle.setId_Empleado(empleado);
        
        int respuesta = dDao.Agregar(detalle);
        
        if(respuesta == 1){
            JOptionPane.showMessageDialog(null, "Registro Agregado");
            form_Detalle.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error al Agregar");
        }
    }
    
    
    public void actualizarDetalle(){
        
        int id = Integer.parseInt(detalle_Editar.txtID.getText());
        String user = detalle_Editar.txtUser.getText();
        String pass = detalle_Editar.txtPass.getText();
        Double sueldo = Double.parseDouble(detalle_Editar.txtSueldo.getText());
        Double descuentos = Double.parseDouble(detalle_Editar.txtDescuentos.getText());
        Double total = sueldo - descuentos;
        Double horas = Double.parseDouble(detalle_Editar.txtHoras.getText());
        Double extras = Double.parseDouble(detalle_Editar.txtExtras.getText());
        int empleado = Integer.parseInt(detalle_Editar.txtEmpleado.getText());
        
        detalle.setId_Detalle_Empleado(id);
        detalle.setUser(user);
        detalle.setPass(pass);
        detalle.setSueldo_Base(sueldo);
        detalle.setDescuentos(descuentos);
        detalle.setTotal_Pagar(total);
        detalle.setHora(horas);
        detalle.setExtras(extras);
        detalle.setId_Empleado(empleado);
        
        dDao.Actualizar(detalle);
        detalle_Editar.setVisible(false);
    }
    
    
    public void eliminarDetalle(){
        int fila = jf_Detalle_Empleado.tabla.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String)jf_Detalle_Empleado.tabla.getValueAt(fila, 0).toString());
            dDao.eliminar(id);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
        }
    }
    
    
    private void LimpiarTabla(){
        for(int i=0; i<jf_Detalle_Empleado.tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
    }
    
    private void LimpiarCajas(){
        form_Detalle.txtUser.setText("");
        form_Detalle.txtPass.setText("");
        form_Detalle.txtSueldo.setText("");
        form_Detalle.txtDescuentos.setText("");
        form_Detalle.txtTotal.setText("");
        form_Detalle.txtHoras.setText("");
        form_Detalle.txtExtras.setText("");
        form_Detalle.txtEmpleado.setText("");
    }
    
}
