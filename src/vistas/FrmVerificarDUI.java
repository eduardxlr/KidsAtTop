package vistas;

import java.awt.Component;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author EDUARDO
 */
public class FrmVerificarDUI extends javax.swing.JInternalFrame {

    public FrmVerificarDUI() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        for (Component component : pnlResponsable.getComponents()) {
        component.setEnabled(false); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlResponsable = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlVerificar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1080, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlResponsable.setBackground(new java.awt.Color(33, 37, 41));
        pnlResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Responsable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlResponsable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(33, 37, 41));
        jTextField1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        pnlResponsable.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 230, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parentesco:");
        pnlResponsable.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 110, 30));

        jTextField3.setBackground(new java.awt.Color(33, 37, 41));
        jTextField3.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        pnlResponsable.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");
        pnlResponsable.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 80, 30));

        jTextField4.setBackground(new java.awt.Color(33, 37, 41));
        jTextField4.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        pnlResponsable.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 230, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");
        pnlResponsable.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 80, 30));

        jTextField5.setBackground(new java.awt.Color(33, 37, 41));
        jTextField5.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        pnlResponsable.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 230, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo Electrónico:");
        pnlResponsable.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, 30));

        jComboBox1.setBackground(new java.awt.Color(33, 37, 41));
        jComboBox1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(null);
        pnlResponsable.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 230, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        pnlResponsable.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, 30));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_default.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_rollover.png"))); // NOI18N
        pnlResponsable.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 160, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnReingresarDUIDefault.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnReingresarDUIRollover.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlResponsable.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 180, 90));

        jPanel1.add(pnlResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1060, 370));

        pnlVerificar.setBackground(new java.awt.Color(33, 37, 41));
        pnlVerificar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verificar DUI ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlVerificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><p style=overflow:auto;>Para continuar, ingrese el DUI del responsable para verificar si este existe o no, si el DUI ingresado no existe, podra ingresar los datos del nuevo responsable.</p>");
        pnlVerificar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 970, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVerificar_rollover-1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVerificar_default.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlVerificar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 180, 70));

        jTextField2.setBackground(new java.awt.Color(33, 37, 41));
        jTextField2.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        pnlVerificar.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 170, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DUI: ");
        pnlVerificar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVerificar_rollover-1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVerificar_default.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlVerificar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 180, 70));

        jPanel1.add(pnlVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (Component component : pnlVerificar.getComponents()) {
            component.setEnabled(false);  
        }
        
        for (Component component : pnlResponsable.getComponents()) {
            component.setEnabled(true);  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (Component component : pnlVerificar.getComponents()) {
            component.setEnabled(true);  
        }
        
        for (Component component : pnlResponsable.getComponents()) {
            component.setEnabled(false);  
        }
    }//GEN-LAST:event_jButton4ActionPerformed
         
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel pnlResponsable;
    private javax.swing.JPanel pnlVerificar;
    // End of variables declaration//GEN-END:variables
}
