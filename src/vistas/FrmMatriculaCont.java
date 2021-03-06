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
public class FrmMatriculaCont extends javax.swing.JFrame {
      CtrlLoginUsuario mod;
    /**
     * Creates new form GestionarMatriculaContenedorForm
     */
    public FrmMatriculaCont() {
        initComponents();
        
    }
     public FrmMatriculaCont(CtrlLoginUsuario mod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mod = mod;
         int user=mod.getId_tipo_usuario();
         if (user==2) {
             
             jMatricularEstudiante.setEnabled(false);
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
        jGestionarResponsables = new javax.swing.JButton();
        jMatricularEstudiante = new javax.swing.JButton();
        jTrasladoAlumnos = new javax.swing.JButton();
        jGestionarEstudiantes = new javax.swing.JButton();
        jDesktop = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jGestionarResponsables1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRelleno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 37, 41));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jGestionarResponsables.setForeground(new java.awt.Color(254, 254, 254));
        jGestionarResponsables.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarResponsable_default.png"))); // NOI18N
        jGestionarResponsables.setBorder(null);
        jGestionarResponsables.setContentAreaFilled(false);
        jGestionarResponsables.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarResponsables.setFocusPainted(false);
        jGestionarResponsables.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarResponsable_rollover.png"))); // NOI18N
        jGestionarResponsables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarResponsablesActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarResponsables, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 90));

        jMatricularEstudiante.setForeground(new java.awt.Color(254, 254, 254));
        jMatricularEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMatricularEstudianteDefault.png"))); // NOI18N
        jMatricularEstudiante.setBorder(null);
        jMatricularEstudiante.setContentAreaFilled(false);
        jMatricularEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMatricularEstudiante.setFocusPainted(false);
        jMatricularEstudiante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMatricularEstudianteRollover.png"))); // NOI18N
        jMatricularEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMatricularEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(jMatricularEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 350, 90));

        jTrasladoAlumnos.setForeground(new java.awt.Color(254, 254, 254));
        jTrasladoAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMatriculaProxDefault.png"))); // NOI18N
        jTrasladoAlumnos.setBorder(null);
        jTrasladoAlumnos.setContentAreaFilled(false);
        jTrasladoAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTrasladoAlumnos.setFocusPainted(false);
        jTrasladoAlumnos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMatriculaProxRollover.png"))); // NOI18N
        jTrasladoAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrasladoAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(jTrasladoAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 350, 90));

        jGestionarEstudiantes.setForeground(new java.awt.Color(254, 254, 254));
        jGestionarEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarEstudiantes_default.png"))); // NOI18N
        jGestionarEstudiantes.setBorder(null);
        jGestionarEstudiantes.setContentAreaFilled(false);
        jGestionarEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarEstudiantes.setFocusPainted(false);
        jGestionarEstudiantes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnGestionarEstudiantes_rollover.png"))); // NOI18N
        jGestionarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarEstudiantesActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 350, 90));

        jDesktop.setBackground(new java.awt.Color(33, 37, 41));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoKidsAtTop.png"))); // NOI18N

        jDesktop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 1000, 740));

        jGestionarResponsables1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backpng.png"))); // NOI18N
        jGestionarResponsables1.setBorder(null);
        jGestionarResponsables1.setContentAreaFilled(false);
        jGestionarResponsables1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jGestionarResponsables1.setFocusPainted(false);
        jGestionarResponsables1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back_rollover.png"))); // NOI18N
        jGestionarResponsables1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionarResponsables1ActionPerformed(evt);
            }
        });
        jPanel1.add(jGestionarResponsables1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 240, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionMatricula.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dashboard.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        lblRelleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rellenoContenedor.png"))); // NOI18N
        getContentPane().add(lblRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGestionarResponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarResponsablesActionPerformed
        //Abriendo formulario de Gestionar Conducta
        FrmAdministrarResponsable responsable = new FrmAdministrarResponsable(mod);
        jDesktop.add(responsable);
        responsable.setVisible(true);
    
        //Cambiando imagenes
        Icon Imagenes;
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarResponsable_pressed.png"));
        jGestionarResponsables.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarEstudiantes_default.png"));
        jGestionarEstudiantes.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatricularEstudianteDefault.png"));
        jMatricularEstudiante.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatriculaProxDefault.png"));
        jTrasladoAlumnos.setIcon(Imagenes);
        
    }//GEN-LAST:event_jGestionarResponsablesActionPerformed

    private void jGestionarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarEstudiantesActionPerformed
       
        try{
        //Abriendo formulario de Gestionar Conducta
        FrmAdministrarEstudiantes estudiante = new FrmAdministrarEstudiantes(mod);
        jDesktop.add(estudiante);
        estudiante.setVisible(true);
        
        //Llamando formularios
        FrmAdministrarResponsable responsable = new FrmAdministrarResponsable();
        
        //Cambiando imagen
        Icon Imagenes;
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarEstudiantes_pressed.png"));
        jGestionarEstudiantes.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarResponsable_default.png"));
        jGestionarResponsables.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatricularEstudianteDefault.png"));
        jMatricularEstudiante.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatriculaProxDefault.png"));
        jTrasladoAlumnos.setIcon(Imagenes);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo abrir el formulario porque existe algunos campos vacios.", "Revise si hay secciones y/o responsables existentes en el sistema", JOptionPane.INFORMATION_MESSAGE);
        }
     
    }//GEN-LAST:event_jGestionarEstudiantesActionPerformed

    private void jGestionarResponsables1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionarResponsables1ActionPerformed
       
        this.setVisible(false);
        MtoLogin log=new MtoLogin();
        log.obtenerDatosUsuario(mod);
        FrmMenu formulario = new FrmMenu(mod);
        formulario.setVisible(true);
    }//GEN-LAST:event_jGestionarResponsables1ActionPerformed

    private void jMatricularEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMatricularEstudianteActionPerformed
        //Abriendo formulario
        this.setVisible(false);
        FrmMatriculaContenedor frm = new FrmMatriculaContenedor(mod);
        frm.setVisible(true); 
        //Cambiando imagenes
        Icon Imagenes;
         Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatricularEstudianteRollover.png"));
        jMatricularEstudiante.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarResponsable_default.png"));
        jGestionarResponsables.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarEstudiantes_default.png"));
        jGestionarEstudiantes.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatriculaProxDefault.png"));
        jTrasladoAlumnos.setIcon(Imagenes);
        
    }//GEN-LAST:event_jMatricularEstudianteActionPerformed

    private void jTrasladoAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrasladoAlumnosActionPerformed
        
        
        try{
            FrmTrasladoAlumnos alumnos = new FrmTrasladoAlumnos(mod);
            jDesktop.add(alumnos);
            alumnos.setVisible(true);

            Icon Imagenes;
            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarResponsable_default.png"));
            jGestionarResponsables.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnGestionarEstudiantes_default.png"));
            jGestionarEstudiantes.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatricularEstudianteDefault.png"));
            jMatricularEstudiante.setIcon(Imagenes);

            Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnMatriculaProxPressed.png"));
            jTrasladoAlumnos.setIcon(Imagenes);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo abrir el formulario porque existe algunos campos vacios.", "Revise si hay secciones y/o responsables existentes en el sistema", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jTrasladoAlumnosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMatriculaCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMatriculaCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMatriculaCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMatriculaCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmMatriculaCont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JButton jGestionarEstudiantes;
    private javax.swing.JButton jGestionarResponsables;
    private javax.swing.JButton jGestionarResponsables1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jMatricularEstudiante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jTrasladoAlumnos;
    private javax.swing.JLabel lblRelleno;
    // End of variables declaration//GEN-END:variables
}
