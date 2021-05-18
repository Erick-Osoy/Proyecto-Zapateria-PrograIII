
package Formularios;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Erick E. Osoy
 */
public class Form_Proveedores_Editar extends javax.swing.JFrame {

    Calendar fecha = new GregorianCalendar();
    
    public Form_Proveedores_Editar() {
        initComponents();
        this.setTitle("Menu Principal");
        this.setLocation(425, 80);
        ObtenerFecha();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 47, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(46, 64, 83));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 33)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Formulario Proveedores");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 460, 100));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, 30));

        lblFecha.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, 30));

        lblHora.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 140, 30));

        jPanel9.setBackground(new java.awt.Color(33, 47, 60));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(33, 47, 60));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        jPanel9.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 10));

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo:");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(33, 47, 60));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setToolTipText("");
        txtTelefono.setBorder(null);
        jPanel9.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, 10));

        txtCorreo.setBackground(new java.awt.Color(33, 47, 60));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(null);
        jPanel9.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 170, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 10));

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID:");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefono:");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre:");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(33, 47, 60));
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setToolTipText("");
        txtID.setBorder(null);
        jPanel9.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 170, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 170, 10));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 360, 250));

        btnOK.setBackground(new java.awt.Color(126, 81, 9));
        btnOK.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.setBorder(null);
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 270, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MousePressed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHora;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
