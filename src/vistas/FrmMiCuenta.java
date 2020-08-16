package vistas;

import controlador.CtrlLoginUsuario;
import controlador.CtrlUsuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.MtoLogin;
import modelo.MtoUsuario;
import modelo.Validaciones;
import modelo.MtoBitacoras;
/**
 *
 * @author EDUARDO
 */
public class FrmMiCuenta extends javax.swing.JFrame {

    CtrlLoginUsuario mod;
    Validaciones val = new Validaciones();
    byte[] person_image = null;
    String filename = null;
    
    public FrmMiCuenta() {
        initComponents();
    }

    public FrmMiCuenta(CtrlLoginUsuario mod) {
        initComponents();
        this.mod=mod;
         //Centrar formulario
        this.setLocationRelativeTo(null);
        idUsuario.setVisible(false);
        
        //Personalizacion jCalendar
        jCalendario.getJCalendar().setForeground(new Color(254,254,254));
        jCalendario.getJCalendar().setSundayForeground(Color.WHITE);
        jCalendario.getJCalendar().setWeekdayForeground(Color.WHITE);
        jCalendario.getJCalendar().setDecorationBackgroundVisible(false);
        jCalendario.getJCalendar().setWeekOfYearVisible(false);
        jCalendario.getJCalendar().setBackground(Color.WHITE);
        jCalendario.getJCalendar().setPreferredSize(new Dimension(450, 450));
        
        //Asignando datos del usuario logueado
        jNombre.setText(mod.getNombre());
        jApellido.setText(mod.getApellido());
        jFechaNacimiento.setText(mod.getFecha_nacimiento());
        jTelefono.setText(mod.getTelefono());
        jCorreo.setText(mod.getEmail());
        String genero = mod.getGenero();
        if (genero.equals("F")) {
            rbFemenino.setSelected(true);
            rbMasculino.setSelected(false);
        }
        else if(genero.equals("M"))
        {
            rbMasculino.setSelected(true);
            rbFemenino.setSelected(false);
        }
        jUsuario.setText(mod.getUsuario());
        jDUI.setText(mod.getDui());
        jNIP.setText(mod.getNip());
        jNIT.setText(mod.getNit());
        jDireccion.setText(mod.getDireccion());
        person_image = mod.getFoto();
        ImageIcon imagen = new ImageIcon(new ImageIcon(person_image).getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH));
        lblFoto.setIcon(imagen);
        idUsuario.setText(String.valueOf(mod.getId_usuario()));
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
        lblFoto = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLayer1 = new javax.swing.JLayeredPane();
        jApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jFechaNacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jTelefono = new javax.swing.JFormattedTextField();
        jCalendario = new com.toedter.calendar.JDateChooser();
        jLayer2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDireccion = new javax.swing.JTextArea();
        jNIT = new javax.swing.JFormattedTextField();
        jDUI = new javax.swing.JFormattedTextField();
        jNIP = new javax.swing.JFormattedTextField();
        btnCambiarContraseña = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCargarFoto = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        idUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoto.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, 280, 280));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backpng.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back_rollover.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 160, 70));

        jLayer1.setNextFocusableComponent(jLayer2);
        jLayer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jApellido.setBackground(new java.awt.Color(33, 37, 41));
        jApellido.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jApellido.setForeground(new java.awt.Color(255, 255, 255));
        jApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jApellido.setSelectionColor(new java.awt.Color(0, 153, 0));
        jApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jApellidoKeyTyped(evt);
            }
        });
        jLayer1.add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Genero:");
        jLayer1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 200, 30));

        rbFemenino.setBackground(new java.awt.Color(33, 37, 41));
        bgGenero.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbFemenino.setText("Femenino");
        jLayer1.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        rbMasculino.setBackground(new java.awt.Color(33, 37, 41));
        bgGenero.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });
        jLayer1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Fecha de Nacimiento:");
        jLayer1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 30));

        jFechaNacimiento.setBackground(new java.awt.Color(33, 37, 41));
        jFechaNacimiento.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFechaNacimiento.setSelectionColor(new java.awt.Color(0, 153, 0));
        jLayer1.add(jFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Teléfono:");
        jLayer1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, 30));

        jCorreo.setBackground(new java.awt.Color(33, 37, 41));
        jCorreo.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCorreo.setSelectionColor(new java.awt.Color(0, 153, 0));
        jCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCorreoKeyTyped(evt);
            }
        });
        jLayer1.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 30));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Correo Electrónico:");
        jLayer1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 230, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Apellido:");
        jLayer1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Nombre:");
        jLayer1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 30));

        jNombre.setBackground(new java.awt.Color(33, 37, 41));
        jNombre.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNombre.setSelectionColor(new java.awt.Color(0, 153, 0));
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });
        jLayer1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 30));

        jTelefono.setBackground(new java.awt.Color(33, 37, 41));
        jTelefono.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTelefono.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLayer1.add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 230, 30));

        jCalendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarioPropertyChange(evt);
            }
        });
        jLayer1.add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 50, 30));

        jPanel1.add(jLayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 250, 450));

        jLayer2.setNextFocusableComponent(jLayer1);
        jLayer2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DUI:");
        jLayer2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NIP:");
        jLayer2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 230, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NIT:");
        jLayer2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 230, 30));

        jUsuario.setBackground(new java.awt.Color(33, 37, 41));
        jUsuario.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jUsuario.setSelectionColor(new java.awt.Color(0, 153, 0));
        jUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jUsuarioKeyTyped(evt);
            }
        });
        jLayer2.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuario:");
        jLayer2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Dirección:");
        jLayer2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 230, 30));

        jDireccion.setBackground(new java.awt.Color(33, 37, 41));
        jDireccion.setColumns(20);
        jDireccion.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jDireccion.setRows(5);
        jScrollPane1.setViewportView(jDireccion);

        jLayer2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 110));

        jNIT.setBackground(new java.awt.Color(33, 37, 41));
        jNIT.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jNIT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jNIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNIT.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLayer2.add(jNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, 30));

        jDUI.setBackground(new java.awt.Color(33, 37, 41));
        jDUI.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDUI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDUI.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLayer2.add(jDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 30));

        jNIP.setBackground(new java.awt.Color(33, 37, 41));
        jNIP.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jNIP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jNIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNIP.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLayer2.add(jNIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 30));

        jPanel1.add(jLayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 250, 440));

        btnCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCambiarContraseña.png"))); // NOI18N
        btnCambiarContraseña.setBorder(null);
        btnCambiarContraseña.setBorderPainted(false);
        btnCambiarContraseña.setContentAreaFilled(false);
        btnCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambiarContraseña.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCambiarContraseña_rollover.png"))); // NOI18N
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 140, 70));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><p style=overflow:auto;><center>En este apartado puedes configurar ajustes de tu cuenta.</center></p>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 320, 120));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fndMiCuentaFoto.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 220, 240));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fndMarcoFoto.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 340, 340));

        btnCargarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_default.png"))); // NOI18N
        btnCargarFoto.setBorder(null);
        btnCargarFoto.setBorderPainted(false);
        btnCargarFoto.setContentAreaFilled(false);
        btnCargarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCargarFoto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_rollover.png"))); // NOI18N
        btnCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 340, 70));

        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fndMiCuenta.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 730));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_default.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_rollover.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, 140, 70));

        idUsuario.setBackground(new java.awt.Color(33, 37, 41));
        idUsuario.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        idUsuario.setForeground(new java.awt.Color(255, 255, 255));
        idUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idUsuario.setSelectionColor(new java.awt.Color(0, 153, 0));
        idUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void idUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUsuarioActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        MtoLogin log1=new MtoLogin();
        log1.obtenerDatosUsuario(mod);
        frmPrincipal frm = new frmPrincipal(mod);
        frm.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFotoActionPerformed
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
    }//GEN-LAST:event_btnCargarFotoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (jNombre.getText().isEmpty() || jApellido.getText().isEmpty() || jFechaNacimiento.getText().isEmpty() || jTelefono.getText().isEmpty() || jCorreo.getText().isEmpty() ||
             jUsuario.getText().isEmpty() || jDUI.getText().isEmpty() || jNIP.getText().isEmpty() || jNIT.getText().isEmpty() || jDireccion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campos vacios.","Error",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int mensaje = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas actualizar estos datos?","Aviso",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (mensaje == JOptionPane.YES_OPTION) {
                 //Asignando datos
                CtrlUsuario ctrl = new CtrlUsuario();
                MtoUsuario mto = new MtoUsuario();
                
                ctrl.setId_usuario(Integer.parseInt(idUsuario.getText()));
                ctrl.setNombre(jNombre.getText());
                ctrl.setApellido(jApellido.getText());
                ctrl.setEmail(jCorreo.getText());
                ctrl.setTelefono(jTelefono.getText());
                ctrl.setDui(jDUI.getText());
                ctrl.setNit(jNIT.getText());
                ctrl.setUsuario(jUsuario.getText());
                ctrl.setNip(jNIP.getText());
                ctrl.setFecha_nacimiento(jFechaNacimiento.getText());
                if (rbMasculino.isSelected()) {
                    ctrl.setGenero("M");
                }
                else if(rbFemenino.isSelected())
                {
                    ctrl.setGenero("F");
                }
                ctrl.setDireccion(jDireccion.getText());
                ctrl.setFoto(person_image);

                if (mto.actualizarMiCuenta()) {
                    JOptionPane.showMessageDialog(null, "Se han actualizado los datos correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    MtoBitacoras add=new MtoBitacoras();
                    MtoLogin log1=new MtoLogin();
                    log1.obtenerDatosUsuario(mod);
                    int id=add.capturarIdBitacora()+1;
                    mod.setId_usuario(Integer.parseInt(idUsuario.getText()));
                    mod.setId_bitacora(id);
                    add.agregarBitacoraActualizar(mod);
                    frmPrincipal frm = new frmPrincipal(mod);
                    frm.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed
        this.setVisible(false);
        MtoLogin log1=new MtoLogin();
        log1.obtenerDatosUsuario(mod);
        FrmCambiarContraseña frm = new FrmCambiarContraseña(mod);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed

    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
        // TODO add your handling code here:
        val.verificarEspeciales(evt);
    }//GEN-LAST:event_jNombreKeyTyped

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jNombreKeyPressed

    private void jApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyTyped
        // TODO add your handling code here:
        val.verificarEspeciales(evt);
    }//GEN-LAST:event_jApellidoKeyTyped

    private void jApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jApellidoKeyPressed

    private void jCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jCorreoKeyTyped

    private void jCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCorreoKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jCorreoKeyPressed

    private void jUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsuarioKeyTyped
        // TODO add your handling code here:
        val.verificarEspeciales(evt);
    }//GEN-LAST:event_jUsuarioKeyTyped

    private void jUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsuarioKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(FrmMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMiCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField idUsuario;
    private javax.swing.JTextField jApellido;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JTextField jCorreo;
    private javax.swing.JFormattedTextField jDUI;
    private javax.swing.JTextArea jDireccion;
    private javax.swing.JTextField jFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayer1;
    private javax.swing.JLayeredPane jLayer2;
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
