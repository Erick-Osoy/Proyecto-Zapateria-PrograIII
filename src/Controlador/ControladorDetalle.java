
package Controlador;

import Modelo.Detalle_Empleado;
import Modelo.Detalle_EmpleadoDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Tablas.T_Detalle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick E. Osoy
 */
public class ControladorDetalle implements ActionListener{
    
    Empleado empleado = new Empleado();
    EmpleadoDAO eDAO = new EmpleadoDAO();
    
    Detalle_Empleado detalle = new Detalle_Empleado();
    Detalle_EmpleadoDAO dDao = new Detalle_EmpleadoDAO();
    
    T_Detalle t_Detalle = new T_Detalle();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorDetalle(T_Detalle v){
        this.t_Detalle = v;
        listarEmpleado(t_Detalle.tabla);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    
    public void listarEmpleado(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Empleado>listaEmpleado = eDAO.Listar();
        List<Detalle_Empleado>listaDetalle = dDao.Listar();
        Object[] object = new Object[7];
        
        for(int i=0; i<listaEmpleado.size(); i++){
            object[0] = listaEmpleado.get(i).getId_Empleado();
            object[1] = listaEmpleado.get(i).getNombre();
            object[2] = listaEmpleado.get(i).getApellido();
            object[3] = listaDetalle.get(i).getSueldo_Base();
            object[4] = listaDetalle.get(i).getHora();
            object[5] = listaDetalle.get(i).getExtras();
            object[6] = listaDetalle.get(i).getTotal_Pagar();
            modelo.addRow(object);
        }
        t_Detalle.tabla.setModel(modelo);
    }
        
    
        
    private void LimpiarTabla(){
        for(int i=0; i<t_Detalle.tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i-=1;
        }
    }
}
