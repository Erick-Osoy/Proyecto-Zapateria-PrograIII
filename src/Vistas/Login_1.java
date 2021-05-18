package Vistas;
import Modelo.Detalle_Empleado;
import Modelo.Detalle_EmpleadoDAO;
import Tablas.T_Proveedores;
import Tablas.T_Puestos;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick E. Osoy
 */
public class Login_1 extends javax.swing.JFrame {

     Detalle_EmpleadoDAO edao = new Detalle_EmpleadoDAO();
     Detalle_Empleado detalle = new Detalle_Empleado();
 
    public Login_1() {
        initComponents();
        this.setTitle("Login");
        this.setLocation(250, 77);
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jPuesto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(33, 47, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 270, 20));

        jPanel10.setBackground(new java.awt.Color(46, 64, 83));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, 40));

        jPanel12.setBackground(new java.awt.Color(46, 64, 83));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 40));

        jPanel13.setBackground(new java.awt.Color(46, 64, 83));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 60, 40));

        jPanel14.setBackground(new java.awt.Color(46, 64, 83));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 60, 40));

        jPanel15.setBackground(new java.awt.Color(46, 64, 83));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 60, 40));

        jPanel16.setBackground(new java.awt.Color(46, 64, 83));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 60, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shoes_75px.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 80, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trainers_75px.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, 80));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/women_shoe_diagonal_view_75px.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 80, 90));

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Login to Factory System");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 190, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 550));

        jPanel4.setBackground(new java.awt.Color(46, 64, 83));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 20, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 610, 50));

        jPanel5.setBackground(new java.awt.Color(46, 64, 83));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_shield_25px.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        txtUser.setBackground(new java.awt.Color(46, 64, 83));
        txtUser.setBorder(null);
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setOpaque(false);
        jPanel6.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 240, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 360, 50));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password_25px.png"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        txtPass.setBackground(new java.awt.Color(46, 64, 83));
        txtPass.setBorder(null);
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setOpaque(false);
        jPanel7.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 240, 50));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 360, 50));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPuesto.setBackground(new java.awt.Color(46, 64, 83));
        jPuesto.setFont(new java.awt.Font("Bodoni MT", 1, 12)); // NOI18N
        jPuesto.setForeground(new java.awt.Color(255, 255, 255));
        jPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Administrador", "Vendedor" }));
        jPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPuestoActionPerformed(evt);
            }
        });
        jPanel8.add(jPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 6, 210, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_groups_25px.png"))); // NOI18N
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 360, 50));

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bienvenido Sistema Zapateria");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 350, 50));

        jPanel9.setBackground(new java.awt.Color(33, 47, 60));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Log in");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 100, 50));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 300, 50));

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registro");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 150, 50));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password help?");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 120, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 610, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPuestoActionPerformed

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
       ValidarLogin();
    }//GEN-LAST:event_jPanel9MousePressed

    
    public void ValidarLogin(){
        String user = txtUser.getText();
        String pass = txtPass.getText();
        String puesto = jPuesto.getSelectedItem().toString();
        
        
        if(txtUser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un usuario");
            Limpiar();
            
            
        } else if(txtPass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar contraseña");
            Limpiar();
        }
        
        if(puesto.equals("Gerente")){
            detalle = edao.validarLogin(user, pass);
            if(detalle.getUser() != null && detalle.getPass() != null){
                Menu menu = new Menu();
                menu.setVisible(true);
                this.setVisible(false);
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                Limpiar();
            }
        } else if (puesto.equals("Administrador")){
            detalle = edao.validarLogin(user, pass);
            if(detalle.getUser() != null && detalle.getPass() != null){
                T_Proveedores proveedores = new T_Proveedores();
                proveedores.setVisible(true);
                this.setVisible(false);
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                Limpiar();
            }
        } else if (puesto.equals("Vendedor")){
            detalle = edao.validarLogin(user, pass);
            if(detalle.getUser() != null && detalle.getPass() != null){
                T_Puestos puestos = new T_Puestos();
                puestos.setVisible(true);
                this.setVisible(false);
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                Limpiar();
            }
        }
    }
    
    public void Limpiar(){
        txtUser.setText("");
        txtPass.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> jPuesto;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField txtPass;
    private javax.swing.JFormattedTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
