/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.CtrlLoginUsuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.MtoLogin;

/**
 *
 * @author katy0
 */
public class FrmAcademicoContenedor extends javax.swing.JFrame {
     CtrlLoginUsuario mod;
    /**
     * Creates new form ControlAcademicoContenedorForm
     */
    public FrmAcademicoContenedor() {
        initComponents();
        
    }
    public FrmAcademicoContenedor(CtrlLoginUsuario mod){
    
        initComponents();
        this.setLocationRelativeTo(null);
        this.mod = mod;
        int user=mod.getId_tipo_usuario();
        if (user==3) {
            
            jGestionarNotas.setEnabled(false);
            jGestionarAsistencia.setEnabled(false);
            jGestionarConducta.setEnabled(false);
        }
        else if (user==2) {
            jGestionarSecciones.setEnabled(false);
            
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
        jLabel1 = new javax.swing.JLabel();
        jEscritorio = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jGestionarSecciones1 = new javax.swing.JButton();
        jGestionarSecciones = new javax.swing.JButton();
        jGestionarAsistencia = new javax.swing.JButton();
        jGestionarNotas = new javax.swing.JButton();
        jGestionarConducta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 37, 41));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rellenoContenedor.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jEscritorio.setBackground(new java.awt.Color(33, 37, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoKidsAtTop.png"))); // NOI18N

        jEscritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jPanel1.add(jEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 1000, 740));

        jGestionarSecciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backpng.png"))); // NOI18N
        jGestionarSecciones1.setBorder(null);
        jGestionarSecciones1.setContentAreaFilled(false);
        jGestionarSecciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarSecciones1.setFocusPainted(false);
        jGestionarSecciones1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back_rollover.png"))); // NOI18N
        jGestionarSecciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarSecciones1ActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarSecciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 240, 70));

        jGestionarSecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarSecciones_default.png"))); // NOI18N
        jGestionarSecciones.setBorder(null);
        jGestionarSecciones.setContentAreaFilled(false);
        jGestionarSecciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarSecciones.setFocusPainted(false);
        jGestionarSecciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarSecciones_rollover.png"))); // NOI18N
        jGestionarSecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarSeccionesActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarSecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 350, 90));

        jGestionarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnControloarAsistencia_default.png"))); // NOI18N
        jGestionarAsistencia.setBorder(null);
        jGestionarAsistencia.setContentAreaFilled(false);
        jGestionarAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarAsistencia.setFocusPainted(false);
        jGestionarAsistencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnControlarAsistencia_rollover.png"))); // NOI18N
        jGestionarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarAsistenciaActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 350, 90));

        jGestionarNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarNotas_defaultpng.png"))); // NOI18N
        jGestionarNotas.setBorder(null);
        jGestionarNotas.setContentAreaFilled(false);
        jGestionarNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarNotas.setFocusPainted(false);
        jGestionarNotas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarNotas_rollover.png"))); // NOI18N
        jGestionarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarNotasActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 350, 90));

        jGestionarConducta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarConducta_default.png"))); // NOI18N
        jGestionarConducta.setBorder(null);
        jGestionarConducta.setContentAreaFilled(false);
        jGestionarConducta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarConducta.setFocusPainted(false);
        jGestionarConducta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarConducta_rollover.png"))); // NOI18N
        jGestionarConducta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarConductaActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarConducta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 350, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/controlAcademico.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dashboard.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGestionarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarNotasActionPerformed
        
        try{
            //Abriendo formulario de Gestionar Notas
            FrmNotas notas = new FrmNotas(mod);
            jEscritorio.add(notas);
            notas.setVisible(true);

            //Cambiar imagenes
            Icon Imagenes;
             Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarConducta_default.png"));
            jGestionarConducta.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnControloarAsistencia_default.png"));
            jGestionarAsistencia.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarNotasPressed.png"));
            jGestionarNotas.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarSecciones_default.png"));
            jGestionarSecciones.setIcon(Imagenes);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo abrir el formulario porque existe algunos campos vacios.", "Revise si hay secciones existentes en el sistema", JOptionPane.INFORMATION_MESSAGE);
            try{
                //Abriendo formulario de Gestionar Secciones
            FrmSecciones secciones = new FrmSecciones(mod);
            jEscritorio.add(secciones);
            secciones.setVisible(true); 

            //Setear imagenes
            Icon Imagenes;
             Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarConducta_default.png"));
            jGestionarConducta.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnControloarAsistencia_default.png"));
            jGestionarAsistencia.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarNotas_defaultpng.png"));
            jGestionarNotas.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarSecciones_pressed.png"));
            jGestionarSecciones.setIcon(Imagenes);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo abrir el formulario porque existe algunos campos vacios.", "Revise si hay usuarios docente activos en el sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jGestionarNotasActionPerformed

    private void jGestionarConductaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarConductaActionPerformed
        
        try{

            //Abriendo formulario de Gestionar Conducta
            FrmConducta conducta = new FrmConducta(mod);
            jEscritorio.add(conducta);
            conducta.setVisible(true);

            //Cambiando imagenes
            Icon Imagenes;
             Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarConducta_pressed.png"));
            jGestionarConducta.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnControloarAsistencia_default.png"));
            jGestionarAsistencia.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarNotas_defaultpng.png"));
            jGestionarNotas.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarSecciones_default.png"));
            jGestionarSecciones.setIcon(Imagenes);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo abrir el formulario porque existe algunos campos vacios.", "Revise si hay secciones y estudiantes existentes en el sistema", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jGestionarConductaActionPerformed

    private void jGestionarSeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarSeccionesActionPerformed
       
         try{
                //Abriendo formulario de Gestionar Secciones
            FrmSecciones secciones = new FrmSecciones(mod);
            jEscritorio.add(secciones);
            secciones.setVisible(true); 

            //Setear imagenes
            Icon Imagenes;
             Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarConducta_default.png"));
            jGestionarConducta.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnControloarAsistencia_default.png"));
            jGestionarAsistencia.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarNotas_defaultpng.png"));
            jGestionarNotas.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarSecciones_pressed.png"));
            jGestionarSecciones.setIcon(Imagenes);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo abrir el formulario porque existe algunos campos vacios.", "Revise si hay usuarios docente activos en el sistema", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jGestionarSeccionesActionPerformed

    private void jGestionarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarAsistenciaActionPerformed
        
            
            //Abriendo formulario de Controlar Asistencia
            FrmAsistencia asistencia = new FrmAsistencia(mod);
            jEscritorio.add(asistencia);
            asistencia.setVisible(true);

            //Cambiar imagenes
            Icon Imagenes;
             Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarConducta_default.png"));
            jGestionarConducta.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnControlarAsistencia_pressed.png"));
            jGestionarAsistencia.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarNotas_defaultpng.png"));
            jGestionarNotas.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarSecciones_default.png"));
            jGestionarSecciones.setIcon(Imagenes);
       
        
    }//GEN-LAST:event_jGestionarAsistenciaActionPerformed

    private void jGestionarSecciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarSecciones1ActionPerformed
        MtoLogin log=new MtoLogin();
        log.obtenerDatosUsuario(mod);
        this.setVisible(false);
        FrmMenu formulario = new FrmMenu(mod);
        formulario.setVisible(true);
    }//GEN-LAST:event_jGestionarSecciones1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAcademicoContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAcademicoContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAcademicoContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAcademicoContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAcademicoContenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JButton jGestionarAsistencia;
    private javax.swing.JButton jGestionarConducta;
    private javax.swing.JButton jGestionarNotas;
    private javax.swing.JButton jGestionarSecciones;
    private javax.swing.JButton jGestionarSecciones1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
