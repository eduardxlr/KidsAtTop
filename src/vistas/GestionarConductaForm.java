/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author katy0
 */
public class GestionarConductaForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionarConductaForm
     */
    public GestionarConductaForm() {
        initComponents();
         this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        tConducta.getTableHeader().setFont(new Font("Roboto Light", Font.BOLD, 12));
        tConducta.getTableHeader().setOpaque(false);
        tConducta.getTableHeader().setBackground(new Color(33, 37, 41));
        tConducta.getTableHeader().setForeground(new Color(254,254,254));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tConducta = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 37, 41));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Gestionar Conducta ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Observación:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jTextField7.setBackground(new java.awt.Color(33, 37, 41));
        jTextField7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(254, 254, 254));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 240, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Fecha:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(33, 37, 41));
        jComboBox1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(254, 254, 254));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("Estudiante:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jTextField8.setBackground(new java.awt.Color(33, 37, 41));
        jTextField8.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(254, 254, 254));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 350, 140));

        jButton3.setBackground(new java.awt.Color(33, 37, 41));
        jButton3.setForeground(new java.awt.Color(254, 254, 254));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGenerarReporte_default.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGenerarReporte_rollover.png"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 140, 70));

        tConducta.setBackground(new java.awt.Color(33, 37, 41));
        tConducta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tConducta.setFocusable(false);
        tConducta.setGridColor(new java.awt.Color(64, 65, 65));
        tConducta.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tConducta.setRowHeight(30);
        tConducta.setSelectionBackground(new java.awt.Color(58, 58, 58));
        tConducta.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tConducta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 950, 230));

        jButton7.setBackground(new java.awt.Color(33, 37, 41));
        jButton7.setForeground(new java.awt.Color(254, 254, 254));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_default.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_rollover.png"))); // NOI18N
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 140, 70));

        jButton8.setBackground(new java.awt.Color(33, 37, 41));
        jButton8.setForeground(new java.awt.Color(254, 254, 254));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMostrar_default.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMostrar_rollover.png"))); // NOI18N
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 140, 70));

        jButton9.setBackground(new java.awt.Color(33, 37, 41));
        jButton9.setForeground(new java.awt.Color(254, 254, 254));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_default.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_rollover.png"))); // NOI18N
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 140, 70));

        jButton4.setBackground(new java.awt.Color(33, 37, 41));
        jButton4.setForeground(new java.awt.Color(254, 254, 254));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_default.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_rollover.png"))); // NOI18N
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 140, 70));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Digite lo que desea buscar:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jTextField9.setBackground(new java.awt.Color(33, 37, 41));
        jTextField9.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(254, 254, 254));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 640, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tConducta;
    // End of variables declaration//GEN-END:variables
}
