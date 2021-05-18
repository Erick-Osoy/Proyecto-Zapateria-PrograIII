
package Vistas;

import Controlador.ControladorDetalle;
import Controlador.ControladorDetalleEmpleado;
import Controlador.ControladorEmpleado;
import Controlador.ControladorProducto;
import Controlador.ControladorProveedor;
import Controlador.ControladorPuestos;
import Tablas.T_Detalle;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Erick E. Osoy
 */
public class Menu extends javax.swing.JFrame {
    
    Calendar fecha = new GregorianCalendar();
    
    public Menu() {
        initComponents();
        this.setTitle("Menu Principal");
        this.setLocation(200, 50);
        ObtenerFecha();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
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
        jLabel12 = new javax.swing.JLabel();
        lblCalculadora = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblWord = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnProveedores = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnPuestos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnEmpleados1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

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
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        jPanel6.setBackground(new java.awt.Color(46, 64, 83));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Georgia", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Opcion");
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
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 210, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings_22px.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        lblCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator_25px.png"))); // NOI18N
        lblCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCalculadoraMousePressed(evt);
            }
        });
        jPanel2.add(lblCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 30, 50));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 20));

        lblWord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microsoft_word_25px.png"))); // NOI18N
        lblWord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblWordMousePressed(evt);
            }
        });
        jPanel2.add(lblWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 30, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microsoft_excel_25px.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 30, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microsoft_outlook_25px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 30, 30));

        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shutdown_26px.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLogoutMousePressed(evt);
            }
        });
        jPanel2.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 640));

        jPanel3.setBackground(new java.awt.Color(46, 64, 83));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 33)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenidos Sistema Zapateria");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 590, 100));

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
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 120, 20));

        lblHora.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 140, 20));

        btnProveedores.setBackground(new java.awt.Color(33, 47, 60));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/truck_87px.png"))); // NOI18N
        btnProveedores.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(52, 73, 94)));
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setOpaque(false);
        btnProveedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/truck_107px.png"))); // NOI18N
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProveedoresMousePressed(evt);
            }
        });
        jPanel1.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 160, 130));

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Proveedores");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 110, -1));

        btnPuestos.setBackground(new java.awt.Color(33, 47, 60));
        btnPuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/briefcase_87px.png"))); // NOI18N
        btnPuestos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(52, 73, 94)));
        btnPuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPuestos.setOpaque(false);
        btnPuestos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/briefcase_107px.png"))); // NOI18N
        btnPuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPuestosMousePressed(evt);
            }
        });
        jPanel1.add(btnPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 160, 130));

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Puestos");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 80, -1));

        btnProductos.setBackground(new java.awt.Color(33, 47, 60));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping_cart_87px.png"))); // NOI18N
        btnProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(52, 73, 94)));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setOpaque(false);
        btnProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping_cart_107px.png"))); // NOI18N
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductosMousePressed(evt);
            }
        });
        jPanel1.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 160, 130));

        jLabel13.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Productos");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 90, -1));

        btnEmpleados.setBackground(new java.awt.Color(33, 47, 60));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/identification_documents_87px.png"))); // NOI18N
        btnEmpleados.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(52, 73, 94)));
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setOpaque(false);
        btnEmpleados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/identification_documents_107px.png"))); // NOI18N
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpleadosMousePressed(evt);
            }
        });
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 160, 130));

        jLabel16.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ver datos");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 90, -1));

        btnEmpleados1.setBackground(new java.awt.Color(33, 47, 60));
        btnEmpleados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_property_87px.png"))); // NOI18N
        btnEmpleados1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(52, 73, 94)));
        btnEmpleados1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados1.setOpaque(false);
        btnEmpleados1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_property_107px.png"))); // NOI18N
        btnEmpleados1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpleados1MousePressed(evt);
            }
        });
        btnEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleados1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 160, 130));

        jLabel17.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Detalle Empleados");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 180, -1));

        btnVer.setBackground(new java.awt.Color(33, 47, 60));
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/identification_documents_87px.png"))); // NOI18N
        btnVer.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(52, 73, 94)));
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.setOpaque(false);
        btnVer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/identification_documents_107px.png"))); // NOI18N
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVerMousePressed(evt);
            }
        });
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 160, 130));

        jLabel18.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Empleados");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 90, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void btnProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMousePressed
        JF_Proveedores proveedores = new JF_Proveedores();
        ControladorProveedor controladorP = new ControladorProveedor(proveedores);
        proveedores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProveedoresMousePressed

    private void btnPuestosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuestosMousePressed
       JF_Puestos puestos = new JF_Puestos();
       ControladorPuestos controladorPuestos = new ControladorPuestos(puestos);
       puestos.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnPuestosMousePressed

    private void btnProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMousePressed
        JF_Productos productos = new JF_Productos();
        ControladorProducto controladorProducto = new ControladorProducto(productos);
        productos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductosMousePressed

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

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("C:\\Program Files\\Microsoft Office\\Office16\\OUTLOOK.exe");
            process.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel15MousePressed

    private void btnEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMousePressed
        JF_Empleado empleado = new JF_Empleado();
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado(empleado);
        empleado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpleadosMousePressed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnEmpleados1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleados1MousePressed
        JF_Detalle_Empleado detalle = new JF_Detalle_Empleado();
        ControladorDetalleEmpleado controlador = new ControladorDetalleEmpleado(detalle);
        detalle.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpleados1MousePressed

    private void btnEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleados1ActionPerformed

    private void btnVerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMousePressed
       T_Detalle t_detalle = new T_Detalle();
       ControladorDetalle controlador = new ControladorDetalle(t_detalle);
       t_detalle.setVisible(true);
    }//GEN-LAST:event_btnVerMousePressed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerActionPerformed

    private void lblLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMousePressed
        Login_1 login = new Login_1();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblLogoutMousePressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
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
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnEmpleados1;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnPuestos;
    public javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblCalculadora;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblWord;
    // End of variables declaration//GEN-END:variables
}
