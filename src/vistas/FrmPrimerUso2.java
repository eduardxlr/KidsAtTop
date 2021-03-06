package vistas;

import controlador.CtrlLoginUsuario;
import controlador.CtrlUsuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.MtoUsuario;
import modelo.ClsValidaciones;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author EDUARDO
 */
public class FrmPrimerUso2 extends javax.swing.JFrame {
   
    
    String filename = null;
    ClsValidaciones val = new ClsValidaciones();
    byte[] person_image = null;
    
        
    public FrmPrimerUso2() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            jDireccion.setLineWrap(true);
            
            //jCalendar
            jCalendario.getJCalendar().setForeground(new Color(254,254,254));
            jCalendario.getJCalendar().setSundayForeground(Color.WHITE);
            jCalendario.getJCalendar().setWeekdayForeground(Color.WHITE);
            jCalendario.getJCalendar().setDecorationBackgroundVisible(false);
            jCalendario.getJCalendar().setWeekOfYearVisible(false);
            jCalendario.getJCalendar().setBackground(Color.WHITE);
            jCalendario.getJCalendar().setPreferredSize(new Dimension(450, 450));
            
            
            String fecha = "2002/01/1";
            java.util.Date fechaParseada= new SimpleDateFormat("yyyy/MM/dd").parse(fecha);
            jCalendario.setDate(fechaParseada);
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrimerUso2.class.getName()).log(Level.SEVERE, null, ex);
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

        bgGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jCalendario = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFechaNacimiento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JFormattedTextField();
        jDUI = new javax.swing.JFormattedTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jCorreo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDireccion = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jNIT = new javax.swing.JFormattedTextField();
        jNIP = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_default.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_rollover.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 170, 80));

        jLayeredPane1.setNextFocusableComponent(jLayeredPane2);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCalendario.setMaxSelectableDate(new java.util.Date(1041404483000L));
        jCalendario.setMinSelectableDate(new java.util.Date(-315590317000L));
        jCalendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarioPropertyChange(evt);
            }
        });
        jLayeredPane1.add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 50, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, -1));

        jApellido.setBackground(new java.awt.Color(33, 37, 41));
        jApellido.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jApellido.setForeground(new java.awt.Color(255, 255, 255));
        jApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jApellidoKeyTyped(evt);
            }
        });
        jLayeredPane1.add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha de Nacimiento:");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, -1));

        jFechaNacimiento.setEditable(false);
        jFechaNacimiento.setBackground(new java.awt.Color(33, 37, 41));
        jFechaNacimiento.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane1.add(jFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 40));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nombre:");
        jLayeredPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jNombre.setBackground(new java.awt.Color(33, 37, 41));
        jNombre.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });
        jLayeredPane1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Usuario:");
        jLayeredPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, -1));

        jUsuario.setBackground(new java.awt.Color(33, 37, 41));
        jUsuario.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jUsuarioKeyTyped(evt);
            }
        });
        jLayeredPane1.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 280, 40));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Teléfono:");
        jLayeredPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DUI:");
        jLayeredPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 280, -1));

        jTelefono.setBackground(new java.awt.Color(33, 37, 41));
        jTelefono.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTelefono.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTelefonoKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 280, 40));

        jDUI.setBackground(new java.awt.Color(33, 37, 41));
        jDUI.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDUI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDUI.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jDUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDUIKeyPressed(evt);
            }
        });
        jLayeredPane1.add(jDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 280, 40));

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 520));

        jLayeredPane2.setNextFocusableComponent(jLayeredPane1);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Genéro:");
        jLayeredPane2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnGenero.png"))); // NOI18N
        jLayeredPane2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 280, 90));

        rbMasculino.setBackground(new java.awt.Color(33, 37, 41));
        rbMasculino.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setText("Masculino");
        jLayeredPane2.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, 30));

        rbFemenino.setBackground(new java.awt.Color(33, 37, 41));
        rbFemenino.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbFemenino.setText("Femenino");
        jLayeredPane2.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Dirección:");
        jLayeredPane2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, 20));

        jCorreo.setBackground(new java.awt.Color(33, 37, 41));
        jCorreo.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCorreoKeyPressed(evt);
            }
        });
        jLayeredPane2.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 280, 40));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Correo Electrónico:");
        jLayeredPane2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 280, 20));

        jDireccion.setBackground(new java.awt.Color(33, 37, 41));
        jDireccion.setColumns(20);
        jDireccion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jDireccion.setRows(5);
        jDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(119, 119, 119), 1, true));
        jDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDireccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jDireccion);

        jLayeredPane2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, 80));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("NIP:");
        jLayeredPane2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 280, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("NIT:");
        jLayeredPane2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, -1));

        jNIT.setBackground(new java.awt.Color(33, 37, 41));
        jNIT.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jNIT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jNIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNIT.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNITKeyPressed(evt);
            }
        });
        jLayeredPane2.add(jNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 40));

        jNIP.setBackground(new java.awt.Color(33, 37, 41));
        jNIP.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jNIP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jNIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNIP.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jNIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNIPKeyPressed(evt);
            }
        });
        jLayeredPane2.add(jNIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 40));

        jPanel1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 330, 610));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Cómo te llamas?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 330, -1));

        lblFoto.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        lblFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 280, 280));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fndMarcoFoto.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 340, 340));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnCuadrado.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, -120, 230, 270));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMinimizarDefault.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMinimizarRollover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSiguienteDefault.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSiguienteRollover.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 640, 170, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrarDefault.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrarRollover.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 30, 30));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icnCuadrado.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 580, 230, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            JFileChooser buscar = new JFileChooser();
            buscar.showOpenDialog(null);
            File f = buscar.getSelectedFile();
            filename = f.getAbsolutePath();
            ImageIcon imagen = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH));
            lblFoto.setIcon(imagen);
            try
            {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte [1024];
                for (int readNum; (readNum=fis.read(buf))!=-1;) {
                    bos.write(buf,0,readNum);
                }   
                person_image=bos.toByteArray();
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarioPropertyChange
        try{
             String dia = Integer.toString(jCalendario.getCalendar().get(Calendar.DATE));
            String año = Integer.toString(jCalendario.getCalendar().get(Calendar.YEAR));
            int mesInt = jCalendario.getCalendar().get(Calendar.MONTH) + 1;
            String mes = Integer.toString(mesInt);
            String fecha = (mes+"-"+dia+"-"+año);
            jFechaNacimiento.setText(fecha);
      
        }catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jCalendarioPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jNombre.getText().isEmpty() || jApellido.getText().isEmpty() || jFechaNacimiento.getText().isEmpty() || jUsuario.getText().isEmpty() || jTelefono.getText().isEmpty() || 
             jDUI.getText().isEmpty() || jNIP.getText().isEmpty() || jNIT.getText().isEmpty() || jCorreo.getText().isEmpty() || jDireccion.getText().isEmpty() || person_image == null) 
        {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios.","Campos vacios",JOptionPane.WARNING_MESSAGE);
        }
        else if(jTelefono.getText().trim().length() < 9 || jDUI.getText().trim().length() < 10 || jNIT.getText().trim().length() < 17)
        {
            JOptionPane.showMessageDialog(null, "No se permiten campos incompletos.","Campos incompletos",JOptionPane.WARNING_MESSAGE);
        }
        else if (rbMasculino.isSelected() || rbFemenino.isSelected()) 
        {
            if (val.email(jCorreo.getText())) {
                
                int mensaje = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres registrarte con estos datos?","Aviso",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if (mensaje == JOptionPane.YES_OPTION) {
                    CtrlUsuario ctrl = new CtrlUsuario();
                    MtoUsuario mto = new MtoUsuario();

                    ctrl.setId_usuario(1);
                    ctrl.setNombre(jNombre.getText());
                    ctrl.setApellido(jApellido.getText());
                    ctrl.setId_tipo_usuario(1);
                    ctrl.setId_estado_usuario(1);
                    ctrl.setEmail(jCorreo.getText());
                    ctrl.setTelefono(jTelefono.getText());
                    ctrl.setDui(jDUI.getText());
                    ctrl.setNit(jNIT.getText());
                    ctrl.setUsuario(jUsuario.getText());

                    ctrl.setNip(jNIP.getText());
                    ctrl.setFecha_nacimiento(jFechaNacimiento.getText());
                    String genero = null;
                    if (rbMasculino.isSelected()) {
                        genero = "M";
                    }
                    else if(rbFemenino.isSelected())
                    {
                        genero = "F";
                    }
                    ctrl.setGenero(genero);
                    ctrl.setDireccion(jDireccion.getText());
                    String contraseña = "txt";
                    String contraseñaEncriptada = DigestUtils.sha1Hex(contraseña);
                    ctrl.setContraseña(contraseñaEncriptada);
                    ctrl.setFoto(person_image);

                    if (mto.insertarUsuario()) {
                        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.","Exito",JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        FrmPrimerUso3 frm = new FrmPrimerUso3();
                        frm.setVisible(true);
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Correo invalido.","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Seleccione un género.","Genero faltante",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas salir del sistema?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if (mensaje == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "La proxima vez que abras el sistema podras continuar con el registro.","Advertencia",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
        // TODO add your handling code here:
        val.verificarLetras(evt);
    }//GEN-LAST:event_jNombreKeyTyped

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
        String Caracteres = jNombre.getText();
        if(Caracteres.length()>=30){
            jNombre.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_jNombreKeyPressed

    private void jApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyTyped
        // TODO add your handling code here:
        val.verificarLetras(evt);
    }//GEN-LAST:event_jApellidoKeyTyped

    private void jApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyPressed
        // TODO add your handling code here:
        String Caracteres = jApellido.getText();
        if(Caracteres.length()>=30){
            jApellido.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_jApellidoKeyPressed

    private void jUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsuarioKeyTyped
        // TODO add your handling code here:
        val.verificarEspeciales(evt);
    }//GEN-LAST:event_jUsuarioKeyTyped

    private void jUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsuarioKeyPressed
        // TODO add your handling code here:
        String Caracteres = jUsuario.getText();
        if(Caracteres.length()>=25){
            jUsuario.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_jUsuarioKeyPressed

    private void jDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDireccionKeyTyped
        // TODO add your handling code here:
        val.verificarAlfanumerico(evt);
    }//GEN-LAST:event_jDireccionKeyTyped

    private void jDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDireccionKeyPressed
        // TODO add your handling code here:
        String Caracteres = jDireccion.getText();
        if(Caracteres.length()>=200){
            jDireccion.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_jDireccionKeyPressed

    private void jTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jTelefonoKeyPressed

    private void jDUIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDUIKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jDUIKeyPressed

    private void jNIPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNIPKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jNIPKeyPressed

    private void jNITKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNITKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jNITKeyPressed

    private void jCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCorreoKeyPressed
        String Caracteres = jCorreo.getText();
        if(Caracteres.length()>=50){
            jCorreo.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        
        val.verificarPegar(evt);
    }//GEN-LAST:event_jCorreoKeyPressed

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
            java.util.logging.Logger.getLogger(FrmPrimerUso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrimerUso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrimerUso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrimerUso2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrimerUso2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JTextField jCorreo;
    private javax.swing.JFormattedTextField jDUI;
    private javax.swing.JTextArea jDireccion;
    private javax.swing.JTextField jFechaNacimiento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JFormattedTextField jNIP;
    private javax.swing.JFormattedTextField jNIT;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTelefono;
    private javax.swing.JTextField jUsuario;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    // End of variables declaration//GEN-END:variables
}
