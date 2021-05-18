
package Vistas;

import Controlador.ControladorEmpleado;
import Formularios.Form_Empleado;
import Formularios.Form_Empleado_Editar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick E. Osoy
 */
public class JF_Empleado extends javax.swing.JFrame {

    Calendar fecha = new GregorianCalendar();
    DefaultTableModel modelo = new DefaultTableModel();
    Form_Empleado agregar = new Form_Empleado();
    Form_Empleado_Editar editar = new Form_Empleado_Editar();
    
    public JF_Empleado() {
        initComponents();
        this.setTitle("Menu Principal");
        this.setLocation(200, 50);
        ObtenerFecha();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        lblCalculadora = new javax.swing.JLabel();
        lblWord = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 47, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(46, 64, 83));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_20px.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 20, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inicio");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        jPanel6.setBackground(new java.awt.Color(46, 64, 83));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puestos");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 50));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("•");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 20, 50));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 230, 50));

        jPanel7.setBackground(new java.awt.Color(46, 64, 83));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opcion");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("•");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 20, 50));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 230, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_125px.png"))); // NOI18N
        jLabel2.setAlignmentX(100.0F);
        jLabel2.setAlignmentY(155.0F);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 130, 150));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings_22px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        lblCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator_25px.png"))); // NOI18N
        lblCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCalculadoraMousePressed(evt);
            }
        });
        jPanel2.add(lblCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 30, 50));

        lblWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microsoft_word_25px.png"))); // NOI18N
        lblWord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblWordMousePressed(evt);
            }
        });
        jPanel2.add(lblWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 30, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microsoft_excel_25px.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 30, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microsoft_outlook_25px.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 30, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 210, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 640));

        jPanel3.setBackground(new java.awt.Color(46, 64, 83));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administracion de Empeleados");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 440, 100));

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 33)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bienvenido");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 220, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1020, 100));

        jPanel4.setBackground(new java.awt.Color(169, 50, 38));
        jPanel4.setToolTipText("");
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 0, -1, 30));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, 30));

        lblFecha.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 130, 20));

        lblHora.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 130, 20));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "DPI", "Sexo", "Celular", "Correo", "Nacimiento", "Puesto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(33, 47, 60));
        tabla.setSelectionBackground(new java.awt.Color(33, 47, 60));
        tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 770, 340));

        jPanel8.setBackground(new java.awt.Color(33, 47, 60));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setBackground(new java.awt.Color(123, 36, 28));
        btnEliminar.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 130, 50));

        btnAgregar.setBackground(new java.awt.Color(20, 90, 50));
        btnAgregar.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        jPanel8.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 130, 50));

        btnEditar.setBackground(new java.awt.Color(126, 81, 9));
        btnEditar.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
        });
        jPanel8.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 750, 70));

        btnActualizar4.setBackground(new java.awt.Color(33, 47, 60));
        btnActualizar4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnActualizar4.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar4.setText("Actualizar");
        btnActualizar4.setBorder(null);
        btnActualizar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizar4MousePressed(evt);
            }
        });
        jPanel1.add(btnActualizar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 270, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar_16px.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 20, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wall_clock_16px.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
       Menu menu = new Menu();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel7MousePressed

    private void btnActualizar4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar4MousePressed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
       
        ControladorEmpleado controlador = new ControladorEmpleado(agregar);
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        editarEmpleado();
        ControladorEmpleado controlador = new ControladorEmpleado(editar);
    }//GEN-LAST:event_btnEditarMousePressed

    private void lblCalculadoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalculadoraMousePressed
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("calc");
            process.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lblCalculadoraMousePressed

    private void lblWordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWordMousePressed
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("C:\\Program Files\\Microsoft Office\\Office16\\WINWORD.exe");
            process.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lblWordMousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("C:\\Program Files\\Microsoft Office\\Office16\\EXCEL.exe");
            process.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("C:\\Program Files\\Microsoft Office\\Office16\\OUTLOOK.exe");
            process.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel16MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
    }
    
    public void ObtenerFecha(){
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
       
        
        
        lblFecha.setText(dia + " / " + mes + " / " + anio);
        lblHora.setText(hora + " : " + minuto);
    }
    
    public void editarEmpleado(){
        int fila = this.tabla.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String)this.tabla.getValueAt(fila, 0).toString());
            String nombre = (String)this.tabla.getValueAt(fila, 1).toString();
            String apellido = (String)this.tabla.getValueAt(fila, 2).toString();
            int edad = Integer.parseInt((String)this.tabla.getValueAt(fila, 3).toString());
            String dpi = (String)this.tabla.getValueAt(fila, 4).toString();
            String sexo = (String)this.tabla.getValueAt(fila, 5).toString();
            String telefono = (String)this.tabla.getValueAt(fila, 6).toString();
            String correo = (String)this.tabla.getValueAt(fila, 7).toString();
            String nacimiento = (String)this.tabla.getValueAt(fila, 8).toString();
            int puesto = Integer.parseInt((String)this.tabla.getValueAt(fila, 9).toString());
            
            editar.txtID.setText(""+id);
            editar.txtNombre.setText(nombre);
            editar.txtApellido.setText(apellido);
            editar.txtEdad.setText(""+edad);
            editar.txtDPI.setText(dpi);
            editar.txtSexo.setText(sexo);
            editar.txtCelular.setText(telefono);
            editar.txtCorreo.setText(correo);
            editar.txtFecha.setText(nacimiento);
            editar.txtPuesto.setText(""+puesto);
            
            editar.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar4;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCalculadora;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblWord;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
