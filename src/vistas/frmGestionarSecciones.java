/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.CtrlSecciones;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.MtoSecciones;
import modelo.Validaciones;

/**
 *
 * @author katy0
 */
public class frmGestionarSecciones extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    CtrlSecciones ctrl = new CtrlSecciones();
    Validaciones val = new Validaciones();
    /**
     * Creates new form GestionarSeccionesForm
     */
    public frmGestionarSecciones() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        tSecciones.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 18));
        tSecciones.getTableHeader().setOpaque(false);
        tSecciones.getTableHeader().setBackground(new Color(33, 37, 41));
        tSecciones.getTableHeader().setForeground(new Color(254,254,254));
        calAnio.setFont(new Font("Roboto", Font.PLAIN, 16));
        modelo.addColumn("identifi");
        modelo.addColumn("Grado");
        modelo.addColumn("Sección");
        modelo.addColumn("Usuario Asignado");
        modelo.addColumn("Año");
        tSecciones.setModel(modelo);
        tSecciones.getColumnModel().getColumn(0).setMinWidth(0);
        tSecciones.getColumnModel().getColumn(0).setMaxWidth(0);
        
        btnActualizar.setEnabled(false);
        btnSuspender.setEnabled(false);
        
        mostrarSecciones();
        llenarUsuarios();
        llenarGrados();
        llenarSecciones();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbSecciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tSecciones = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        cbUsuario = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSuspender = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbGrados = new javax.swing.JComboBox<>();
        calAnio = new com.toedter.calendar.JYearChooser();

        setBackground(new java.awt.Color(33, 37, 41));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Gestionar Secciones ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Digite lo que desea buscar:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("Sección:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        cbSecciones.setBackground(new java.awt.Color(33, 37, 41));
        cbSecciones.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbSecciones.setForeground(new java.awt.Color(254, 254, 254));
        cbSecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbSecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 220, -1));

        tSecciones.setBackground(new java.awt.Color(33, 37, 41));
        tSecciones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tSecciones.setForeground(new java.awt.Color(255, 255, 255));
        tSecciones.setModel(new javax.swing.table.DefaultTableModel(
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
        tSecciones.setFocusable(false);
        tSecciones.setGridColor(new java.awt.Color(64, 65, 65));
        tSecciones.setRowHeight(30);
        tSecciones.setSelectionBackground(new java.awt.Color(45, 252, 119));
        tSecciones.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tSecciones.setShowVerticalLines(false);
        tSecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tSeccionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tSecciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 890, 380));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Usuario:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        cbUsuario.setBackground(new java.awt.Color(33, 37, 41));
        cbUsuario.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbUsuario.setForeground(new java.awt.Color(254, 254, 254));
        cbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 270, -1));

        btnAgregar.setBackground(new java.awt.Color(33, 37, 41));
        btnAgregar.setForeground(new java.awt.Color(254, 254, 254));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_default.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_rollover.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 140, 70));

        btnActualizar.setBackground(new java.awt.Color(33, 37, 41));
        btnActualizar.setForeground(new java.awt.Color(254, 254, 254));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_default.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_rollover.png"))); // NOI18N
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 140, 70));

        btnSuspender.setBackground(new java.awt.Color(33, 37, 41));
        btnSuspender.setForeground(new java.awt.Color(254, 254, 254));
        btnSuspender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_default.png"))); // NOI18N
        btnSuspender.setBorder(null);
        btnSuspender.setContentAreaFilled(false);
        btnSuspender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSuspender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_rollover.png"))); // NOI18N
        jPanel1.add(btnSuspender, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 140, 70));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("Año:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jTextField1.setBackground(new java.awt.Color(33, 37, 41));
        jTextField1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(254, 254, 254));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 560, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("Grado:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        cbGrados.setBackground(new java.awt.Color(33, 37, 41));
        cbGrados.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbGrados.setForeground(new java.awt.Color(254, 254, 254));
        cbGrados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbGrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 220, -1));

        calAnio.setEndYear(2040);
        calAnio.setStartYear(2000);
        calAnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calAnioMousePressed(evt);
            }
        });
        jPanel1.add(calAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    public void llenarUsuarios(){
        MtoSecciones mto = new MtoSecciones();
        cbUsuario.setModel(mto.obtenerUsuarios());
    }
    public void llenarSecciones(){
        MtoSecciones mto = new MtoSecciones();
        cbSecciones.setModel(mto.obtenerSecciones());
    }
    public void llenarGrados(){
        MtoSecciones mto = new MtoSecciones();
        cbGrados.setModel(mto.obtenerGrados());
    }
    
    public void vaciarTabla(){
       int filas = tSecciones.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        } 
    }
    
    public void mostrarSecciones(){
        
        Conexion con = new Conexion();
        Connection datos;
        try
        {
            datos = con.conectar();
            String sql = "Select gs.id_grado_seccion, g.grado, s.seccion, u.usuario, gs.anio_seccion "
                    + "from grado_seccion gs, grado g, seccion s, usuario u "
                    + "where gs.id_usuario = u.id_usuario and gs.id_grado = g.id_grado and gs.id_seccion = s.id_seccion";
            PreparedStatement dato = datos.prepareStatement(sql);
            ResultSet rs = dato.executeQuery();
            while(rs.next()){
                Object fila[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                modelo.addRow(fila);
            }
            tSecciones.setModel(modelo);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    //<editor-fold defaultstate="collapsed" desc="Validaciones">
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isWhitespace(c) && c != '@' && c != '.' && c != '_') {
            val.verificarAlfanumerico(evt);
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        val.verificarPegar(evt);
    }//GEN-LAST:event_jTextField1KeyPressed

    private void calAnioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calAnioMousePressed
        
    }//GEN-LAST:event_calAnioMousePressed

    private void tSeccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tSeccionesMouseClicked
        btnActualizar.setEnabled(true);
        btnSuspender.setEnabled(true);
    }//GEN-LAST:event_tSeccionesMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        MtoSecciones mto = new MtoSecciones();
        ctrl.setGrado((String)cbGrados.getSelectedItem());
        ctrl.setSeccion((String)cbSecciones.getSelectedItem());
        ctrl.setUsuario((String)cbUsuario.getSelectedItem());
        ctrl.setAnio(String.valueOf(calAnio.getValue()));
        mto.obtenerUltimoId();
        mto.obtenerIdGrado();
        mto.obtenerIdUsuario();
        mto.obtenerIdSeccion();
        if (mto.verificarRegistro()) {
            JOptionPane.showMessageDialog(null, "El grado que intenta ingresar ya ha sido registrado");
        }else{
            if (mto.insertarGradoSeccion()) {
                JOptionPane.showMessageDialog(null, "Se han ingresado los datos correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        vaciarTabla();
        mostrarSecciones();
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSuspender;
    private com.toedter.calendar.JYearChooser calAnio;
    private javax.swing.JComboBox<String> cbGrados;
    private javax.swing.JComboBox<String> cbSecciones;
    private javax.swing.JComboBox<String> cbUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tSecciones;
    // End of variables declaration//GEN-END:variables
}
