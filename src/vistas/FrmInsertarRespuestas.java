package vistas;

import controlador.CtrlLoginUsuario;
import controlador.CtrlRespuestas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelo.MtoRespuestas;
import modelo.ClsValidaciones;

/**
 *
 * @author EDUARDO
 */
public class FrmInsertarRespuestas extends javax.swing.JFrame {

    CtrlLoginUsuario mod;
    MtoRespuestas mto = new MtoRespuestas();
    CtrlRespuestas ctrl = new CtrlRespuestas();
    ClsValidaciones val = new ClsValidaciones();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FrmInsertarRespuestas() {
        initComponents();
        
    }

    public FrmInsertarRespuestas(CtrlLoginUsuario mod) {
        initComponents();
        this.mod = mod;
        this.setLocationRelativeTo(null);
        jID.setVisible(false);
        //Cargando ID
        jID.setText(String.valueOf(mod.getId_usuario()));
        
        //Metodos a ejecutar
        llenarPreguntas();
    }
    
    public void llenarPreguntas(){
        cb1.setModel(mto.llenarPreguntas());
        cb2.setModel(mto.llenarPreguntas());
        cb3.setModel(mto.llenarPreguntas());
        cb4.setModel(mto.llenarPreguntas());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jID = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        cb1 = new javax.swing.JComboBox<>();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        cb4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnPreguntas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 450, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnCuadrado.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, -90, 240, 260));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnCuadrado.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 600, 240, 260));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Respuestas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 390, 40));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preguntas de Seguridad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html><p style=overflow:auto;><center>En caso de que olvides tu contraseña, puedes recuperarla rellenando estas preguntas.</center></p>");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 600, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Preguntas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 440, 40));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_default.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_rollover.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 170, 80));

        jID.setBackground(new java.awt.Color(33, 37, 41));
        jID.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jID.setForeground(new java.awt.Color(255, 255, 255));
        jID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIDKeyTyped(evt);
            }
        });
        jPanel1.add(jID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb1.setBackground(new java.awt.Color(33, 37, 41));
        cb1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cb1.setForeground(new java.awt.Color(255, 255, 255));
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jLayeredPane1.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 40));

        j1.setBackground(new java.awt.Color(33, 37, 41));
        j1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 255));
        j1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j1KeyTyped(evt);
            }
        });
        jLayeredPane1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 390, 40));

        j2.setBackground(new java.awt.Color(33, 37, 41));
        j2.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        j2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j2KeyTyped(evt);
            }
        });
        jLayeredPane1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 390, 40));

        cb2.setBackground(new java.awt.Color(33, 37, 41));
        cb2.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cb2.setForeground(new java.awt.Color(255, 255, 255));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jLayeredPane1.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 40));

        cb3.setBackground(new java.awt.Color(33, 37, 41));
        cb3.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cb3.setForeground(new java.awt.Color(255, 255, 255));
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jLayeredPane1.add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 440, 40));

        j3.setBackground(new java.awt.Color(33, 37, 41));
        j3.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 255));
        j3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j3KeyTyped(evt);
            }
        });
        jLayeredPane1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 390, 40));

        j4.setBackground(new java.awt.Color(33, 37, 41));
        j4.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        j4.setForeground(new java.awt.Color(255, 255, 255));
        j4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j4KeyTyped(evt);
            }
        });
        jLayeredPane1.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 390, 40));

        cb4.setBackground(new java.awt.Color(33, 37, 41));
        cb4.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cb4.setForeground(new java.awt.Color(255, 255, 255));
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jLayeredPane1.add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 440, 40));

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 860, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyPressed
        String Caracteres = j1.getText();
        if(Caracteres.length()>=50){
            j1.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_j1KeyPressed

    private void j1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyTyped
        val.verificarLetras(evt);
    }//GEN-LAST:event_j1KeyTyped

    private void j2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyPressed
        String Caracteres = j2.getText();
        if(Caracteres.length()>=50){
            j2.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_j2KeyPressed

    private void j2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyTyped
        val.verificarLetras(evt);
    }//GEN-LAST:event_j2KeyTyped

    private void j3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j3KeyPressed
        String Caracteres = j3.getText();
        if(Caracteres.length()>=50){
            j3.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_j3KeyPressed

    private void j3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j3KeyTyped
        val.verificarLetras(evt);
    }//GEN-LAST:event_j3KeyTyped

    private void j4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j4KeyPressed
        String Caracteres = j4.getText();
        if(Caracteres.length()>=50){
            j4.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_j4KeyPressed

    private void j4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j4KeyTyped
        val.verificarLetras(evt);
    }//GEN-LAST:event_j4KeyTyped

    private void jIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIDKeyPressed

    private void jIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jIDKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         String p1,p2,p3,p4;
        p1 = cb1.getItemAt(cb1.getSelectedIndex());
        p2 = cb2.getItemAt(cb2.getSelectedIndex());
        p3 = cb3.getItemAt(cb3.getSelectedIndex());
        p4 = cb4.getItemAt(cb4.getSelectedIndex());
        
        if (j1.getText().trim().isEmpty() || j2.getText().trim().isEmpty() || j3.getText().trim().isEmpty() || j4.getText().trim().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios.","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        else if(p1.equals(p2) || p1.equals(p3) || p1.equals(p4) ||
                   p2.equals(p1) || p2.equals(p3) || p2.equals(p4) ||
                   p3.equals(p1) || p3.equals(p2) || p3.equals(p4) ||
                   p4.equals(p1) || p4.equals(p2) || p4.equals(p3))
        {
            JOptionPane.showMessageDialog(null, "No puedes repetir las preguntas.","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
           
            //Insertando primera respuesta
            int id1 = mto.capturarMaxIDRespuesta() + 1;
            ctrl.setIdRespuesta(id1);
            ctrl.setRespuesta(j1.getText());
            int idPregunta = mto.obtenerIDPregunta(p1);
            ctrl.setIdPregunta(idPregunta);
            ctrl.setIdUsuario(Integer.parseInt(jID.getText()));
            if (mto.insertarRespuestas()) {
               
            }
            
            //Insertando segunda respuesta
            int id2 = mto.capturarMaxIDRespuesta() + 1;
            ctrl.setIdRespuesta(id2);
            ctrl.setRespuesta(j2.getText());
            int idPregunta2 = mto.obtenerIDPregunta(p2);
            ctrl.setIdPregunta(idPregunta2);
            
            if (mto.insertarRespuestas()) {
              
            }
            
            //Insertando tercera respuesta
            int id3 = mto.capturarMaxIDRespuesta() + 1;
            ctrl.setIdRespuesta(id3);
            ctrl.setRespuesta(j3.getText());
            int idPregunta3 = mto.obtenerIDPregunta(p3);
            ctrl.setIdPregunta(idPregunta3);
         
            if (mto.insertarRespuestas()) {
               
            }
            
            //Insertando cuarta respuesta
            int id4 = mto.capturarMaxIDRespuesta() + 1;
            ctrl.setIdRespuesta(id4);
            ctrl.setRespuesta(j4.getText());
            int idPregunta4 = mto.obtenerIDPregunta(p4);
            ctrl.setIdPregunta(idPregunta4);
          
            if (mto.insertarRespuestas()) {
                JOptionPane.showMessageDialog(null, "Las preguntas se han guardado correctamente.","Exito",JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                FrmIniciarSesion frm = null;
                try {
                    frm = new FrmIniciarSesion();
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FrmInsertarRespuestas.class.getName()).log(Level.SEVERE, null, ex);
                }
                frm.setVisible(true);
            }
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInsertarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInsertarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInsertarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInsertarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInsertarRespuestas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
