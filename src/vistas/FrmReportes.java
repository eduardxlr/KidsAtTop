package vistas;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Conexion;
import net.sf.jasperreports.engine.JasperReport;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author EDUARDO
 */
public class FrmReportes extends javax.swing.JInternalFrame {

    public FrmReportes() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
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
        btnGenerarBitacora = new javax.swing.JButton();

        setBackground(new java.awt.Color(33, 37, 41));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setForeground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú de Reportes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        btnGenerarBitacora.setText("Bitacora");
        btnGenerarBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBitacoraActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 210, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBitacoraActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(null, "¿Deseas generar este reporte con filtros?","Información",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if (mensaje == JOptionPane.YES_OPTION) {
                String mensaje2 = JOptionPane.showInputDialog(null, "Escribe el usuario del cual quieres un reporte de bitacoras.","Aviso",JOptionPane.INFORMATION_MESSAGE);
                try {
                    Conexion con = new Conexion();
                   String reports = "RptBitacoraParametro";
                   String archivo = getClass().getResource("/reportes/"+reports+".jrxml").getPath();

                   archivo = URLDecoder.decode(archivo,"UTF-8");
                   JasperReport report =
                   JasperCompileManager.compileReport(archivo);
                   Map<String,Object> parametros = new HashMap<String,Object>();
                   parametros.put("FILTRAR_USUARIO",mensaje2); 
                   JasperPrint print = JasperFillManager.fillReport(report,
                   parametros, con.conectar());
                   JasperViewer visor = new JasperViewer(print, false);
                   visor.setTitle("Reporte de Bitacoras");
                   visor.setExtendedState(JFrame.MAXIMIZED_BOTH);
                   visor.setVisible(true);
                   reports="";
                } 
                catch (JRException e) {
                    System.out.println("AQUI1");
                    System.out.println(e.getMessage());
                }catch (UnsupportedEncodingException ex) { 
                    Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }
        else if(mensaje == JOptionPane.NO_OPTION)
        {
                try {
                    Conexion con = new Conexion();
                   String reports = "RptBitacoraSinParametro";
                   String archivo = getClass().getResource("/reportes/"+reports+".jrxml").getPath();
                   String mensaje2 = "";
                   archivo = URLDecoder.decode(archivo,"UTF-8");
                   JasperReport report =
                   JasperCompileManager.compileReport(archivo);
                   Map<String,Object> parametros = new HashMap<String,Object>();
                   parametros.put("",mensaje2); 
                   JasperPrint print = JasperFillManager.fillReport(report,
                   parametros, con.conectar());
                   JasperViewer visor = new JasperViewer(print, false);
                   visor.setTitle("Reporte de Bitacoras");
                   visor.setExtendedState(JFrame.MAXIMIZED_BOTH);
                   visor.setVisible(true);
                   reports="";
                } 
                catch (JRException e) {
                    System.out.println("AQUI1");
                    System.out.println(e.getMessage());
                }catch (UnsupportedEncodingException ex) { 
                    Logger.getLogger(FrmReportes.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }
    }//GEN-LAST:event_btnGenerarBitacoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarBitacora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
