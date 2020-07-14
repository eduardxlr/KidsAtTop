package vistas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katy0
 */
public class GestionarEstudiantesForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionarEstudiantesForm
     */
    public GestionarEstudiantesForm() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        grupoBotones.add(rbtnMasculino);
        grupoBotones.add(rbtnFemenino);
        tEstudiantes.getTableHeader().setFont(new Font("Roboto Light", Font.BOLD, 12));
        tEstudiantes.getTableHeader().setOpaque(false);
        tEstudiantes.getTableHeader().setBackground(new Color(33, 37, 41));
        tEstudiantes.getTableHeader().setForeground(new Color(254,254,254));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tEstudiantes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 37, 41));
        setBorder(null);
        setToolTipText("");
        setVisible(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Gestionar Estudiantes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextField4.setBackground(new java.awt.Color(33, 37, 41));
        jTextField4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(254, 254, 254));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Apellido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jTextField5.setBackground(new java.awt.Color(33, 37, 41));
        jTextField5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(254, 254, 254));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 250, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jTextField6.setBackground(new java.awt.Color(33, 37, 41));
        jTextField6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(254, 254, 254));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 250, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Dirección:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jTextField7.setBackground(new java.awt.Color(33, 37, 41));
        jTextField7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(254, 254, 254));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 210, 70));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Género:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        rbtnFemenino.setBackground(new java.awt.Color(33, 37, 41));
        rbtnFemenino.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        rbtnFemenino.setForeground(new java.awt.Color(254, 254, 254));
        rbtnFemenino.setText("Femenino");
        rbtnFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        rbtnMasculino.setBackground(new java.awt.Color(33, 37, 41));
        rbtnMasculino.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        rbtnMasculino.setForeground(new java.awt.Color(254, 254, 254));
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Estado estudiante:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(33, 37, 41));
        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(254, 254, 254));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setFocusable(false);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 214, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("Responsable:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(33, 37, 41));
        jComboBox2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(254, 254, 254));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setFocusable(false);
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 214, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Grado y sección:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jComboBox3.setBackground(new java.awt.Color(33, 37, 41));
        jComboBox3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(254, 254, 254));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setFocusable(false);
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 214, -1));

        jButton1.setBackground(new java.awt.Color(33, 37, 41));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMostrar_default.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMostrar_rollover.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 140, 70));

        jButton2.setBackground(new java.awt.Color(33, 37, 41));
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_default.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_rollover.png"))); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 140, 70));

        jButton3.setBackground(new java.awt.Color(33, 37, 41));
        jButton3.setForeground(new java.awt.Color(254, 254, 254));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_default.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_rollover.png"))); // NOI18N
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 140, 70));

        jButton4.setBackground(new java.awt.Color(33, 37, 41));
        jButton4.setForeground(new java.awt.Color(254, 254, 254));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_default.png"))); // NOI18N
        jButton4.setActionCommand("");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_rollover.png"))); // NOI18N
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 140, 70));

        jButton5.setBackground(new java.awt.Color(33, 37, 41));
        jButton5.setForeground(new java.awt.Color(254, 254, 254));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_default.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_rollover.png"))); // NOI18N
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 170, 70));

        tEstudiantes.setBackground(new java.awt.Color(33, 37, 41));
        tEstudiantes.setBorder(null);
        tEstudiantes.setFont(new java.awt.Font("Roboto Light", 1, 17)); // NOI18N
        tEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tEstudiantes.setGridColor(new java.awt.Color(64, 65, 65));
        tEstudiantes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tEstudiantes.setRowHeight(30);
        tEstudiantes.setSelectionBackground(new java.awt.Color(58, 58, 58));
        tEstudiantes.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tEstudiantes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 960, 200));

        jPanel2.setBackground(new java.awt.Color(78, 78, 78));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 170, 210));

        jButton6.setBackground(new java.awt.Color(33, 37, 41));
        jButton6.setForeground(new java.awt.Color(254, 254, 254));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGenerarReporte_default.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGenerarReporte_rollover.png"))); // NOI18N
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 140, 70));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("Digite lo que desea buscar:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 220, 30));

        jTextField8.setBackground(new java.awt.Color(33, 37, 41));
        jTextField8.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(254, 254, 254));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 750, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemeninoActionPerformed

    private void rbtnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMasculinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTable tEstudiantes;
    // End of variables declaration//GEN-END:variables
}
