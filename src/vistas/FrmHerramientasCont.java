/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.CtrlLoginUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.MtoLogin;


/**
 *
 * @author katy0
 */
public class FrmHerramientasCont extends javax.swing.JFrame {
     
    CtrlLoginUsuario mod;
  
   
    public FrmHerramientasCont() {
        initComponents();
        
    }
     public FrmHerramientasCont(CtrlLoginUsuario mod){
        initComponents();
        this.setLocationRelativeTo(null);
        this.mod = mod;
        System.out.println(mod.getId_tipo_usuario());
        
        int user=mod.getId_tipo_usuario();
         if (user==2||user==3) {
             
             jControlarUsuarios.setEnabled(false);
             jIndicadores.setEnabled(false);
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
        jEscritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jControlarUsuarios = new javax.swing.JButton();
        jIndicadores = new javax.swing.JButton();
        jReportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 37, 41));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEscritorio.setBackground(new java.awt.Color(33, 37, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoKidsAtTop.png"))); // NOI18N

        jEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(253, 253, 253))
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel2)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel1.add(jEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 1000, 730));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backpng.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back_rollover.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 240, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fndHerramientasSistema.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 280, 180));

        jControlarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAdministrarUsuarios_default.png"))); // NOI18N
        jControlarUsuarios.setBorder(null);
        jControlarUsuarios.setContentAreaFilled(false);
        jControlarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jControlarUsuarios.setFocusPainted(false);
        jControlarUsuarios.setFocusable(false);
        jControlarUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAdministrarUsuarios_rollover.png"))); // NOI18N
        jControlarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jControlarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(jControlarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 350, 90));

        jIndicadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIndicadoresDefault.png"))); // NOI18N
        jIndicadores.setBorder(null);
        jIndicadores.setContentAreaFilled(false);
        jIndicadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jIndicadores.setFocusPainted(false);
        jIndicadores.setFocusable(false);
        jIndicadores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIndicadoresRollover.png"))); // NOI18N
        jIndicadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIndicadoresActionPerformed(evt);
            }
        });
        jPanel1.add(jIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 350, 90));

        jReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnReportesDefault.png"))); // NOI18N
        jReportes.setBorder(null);
        jReportes.setContentAreaFilled(false);
        jReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jReportes.setFocusPainted(false);
        jReportes.setFocusable(false);
        jReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnReportesRollover.png"))); // NOI18N
        jReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportesActionPerformed(evt);
            }
        });
        jPanel1.add(jReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 350, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dashboard.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jControlarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jControlarUsuariosActionPerformed
        //Abriendo formulario de Controlar Usuarios
        MtoLogin log=new MtoLogin();
        log.obtenerDatosUsuario(mod);
        FrmUsuarioContenedor usuarios = new FrmUsuarioContenedor(mod);
        this.setVisible(false);
        usuarios.setVisible(true);
        
        //Seteando iconos
        Icon Imagenes;
         Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnAdministrarUsuarios_pressed.png"));
        jControlarUsuarios.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnReportesDefault.png"));
        jReportes.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnIndicadoresDefault.png"));
        jIndicadores.setIcon(Imagenes);
    }//GEN-LAST:event_jControlarUsuariosActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
         MtoLogin log=new MtoLogin();
         log.obtenerDatosUsuario(mod);
        FrmMenu formulario = new FrmMenu(mod);
        formulario.setVisible(true);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportesActionPerformed
        FrmReportes reportes = new FrmReportes();
        jEscritorio.add(reportes);
        reportes.setVisible(true);
        
        //Seteando iconos
        Icon Imagenes;
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnAdministrarUsuarios_default.png"));
        jControlarUsuarios.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnReportesPressed.png"));
        jReportes.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnIndicadoresDefault.png"));
        jIndicadores.setIcon(Imagenes);
    }//GEN-LAST:event_jReportesActionPerformed

    private void jIndicadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIndicadoresActionPerformed
        FrmIndicadores reportes = new FrmIndicadores(mod);
        jEscritorio.add(reportes);
        reportes.setVisible(true);

        //Seteando iconos
        Icon Imagenes;
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnAdministrarUsuarios_default.png"));
        jControlarUsuarios.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnReportesDefault.png"));
        jReportes.setIcon(Imagenes);
        
        Imagenes = new ImageIcon(getClass().getResource("/imagenes/btnIndicadoresPressed.png"));
        jIndicadores.setIcon(Imagenes);
    }//GEN-LAST:event_jIndicadoresActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHerramientasCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHerramientasCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHerramientasCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHerramientasCont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmHerramientasCont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jControlarUsuarios;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JButton jIndicadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jReportes;
    // End of variables declaration//GEN-END:variables
}
