/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Validaciones;
import modelo.MtoConducta;
import controlador.CtrlConducta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Conexion;
import modelo.MtoBitacoras;
import controlador.CtrlLoginUsuario;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author katy0
 */
public class FrmAsistencia extends javax.swing.JInternalFrame {

    MtoConducta conducta = new MtoConducta();
    CtrlConducta as = new CtrlConducta();
    DefaultTableModel modelo = new DefaultTableModel();
    CtrlLoginUsuario mod;
    DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();

    int idGS;

    int IdEstudiante;

    /**
     * Creates new form ControlarAsistenciaForm
     */
    Validaciones val = new Validaciones();

    public FrmAsistencia() {
        initComponents();

    }

    public FrmAsistencia(CtrlLoginUsuario mod) {

        this.mod = mod;
        initComponents();

        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        tAsistencia.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 18));
        tAsistencia.getTableHeader().setOpaque(false);
        tAsistencia.getTableHeader().setBackground(new Color(33, 37, 41));
        tAsistencia.getTableHeader().setForeground(new Color(254, 254, 254));

        //jCalendar
        jCalendario.getJCalendar().setForeground(new Color(254, 254, 254));
        jCalendario.getJCalendar().setSundayForeground(Color.WHITE);
        jCalendario.getJCalendar().setWeekdayForeground(Color.WHITE);
        jCalendario.getJCalendar().setDecorationBackgroundVisible(false);
        jCalendario.getJCalendar().setWeekOfYearVisible(false);
        jCalendario.getJCalendar().setBackground(Color.WHITE);
        jCalendario.getJCalendar().setPreferredSize(new Dimension(450, 450));
        Date fecha = new Date();
        jCalendario.setMaxSelectableDate(fecha);

        Calendar fechas = new GregorianCalendar();

        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente                                                     
        String año = String.valueOf(fechas.get(Calendar.YEAR));
        String mes = String.valueOf(fechas.get(Calendar.MONTH) + 1);
        String dia = String.valueOf(fechas.get(Calendar.DAY_OF_MONTH));

        txtFecha.setText(mes + "-" + dia + "-" + año);

        modelo.addColumn("IdAsistencia");
        modelo.addColumn("Observacion");
        modelo.addColumn("Estudiante");
        modelo.addColumn("Fecha");
        modelo.addColumn("Asistencia");

        tAsistencia.setModel(modelo);
        tAsistencia.getColumnModel().getColumn(0).setMinWidth(0);
        tAsistencia.getColumnModel().getColumn(0).setMaxWidth(0);

        tAsistencia.getColumnModel().getColumn(1).setMinWidth(0);
        tAsistencia.getColumnModel().getColumn(1).setMaxWidth(0);

        btnActualizar.setEnabled(false);
        btnSuspender.setEnabled(false);
        txtId.setVisible(false);
        //Seteando modelo del combo
        cbAsistencia.setModel(conducta.getAsistencia());
        this.llenarAnio();
        this.llenarGradoSeccion();
        this.llenarEstudiante();
        this.mostrarTabla();
        this.centrarColumnas();
        txtObservacion.setLineWrap(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void llenarAnio() {

        cbAño.setModel(conducta.llenarAnio());

    }

    private void llenarGradoSeccion() {

        //Obteniendo parametro del año
        String anio = cbAño.getItemAt(cbAño.getSelectedIndex());
        as.setAnio(anio);

        //Seteando modelo del combo
        cbGradoSeccion.setModel(conducta.llenarGradoSeccion());
    }

    private void llenarEstudiante() {

        String gradoSeccion = cbGradoSeccion.getItemAt(cbGradoSeccion.getSelectedIndex());
        String[] parte = gradoSeccion.split("-");
        String grado = parte[0];
        String seccion = parte[1];

        //Obteniendo id del gradoSeccion
        idGS = conducta.obtenerIdGS(grado, seccion);
        as.setIdGradoSeccion(idGS);

        //Llenando el combobox
        cbEstudiante.setModel(conducta.llenarEstudiante());

    }

    public void centrarColumnas() {
        centrado.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < 5; i++) {
            tAsistencia.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }
    }

    private void mostrarTabla() {

        limpiarTabla();
        String gradoSeccion = cbGradoSeccion.getItemAt(cbGradoSeccion.getSelectedIndex());
        String grado = gradoSeccion.substring(0, 8);
        String seccion = gradoSeccion.substring(9);
        String anio = cbAño.getItemAt(cbAño.getSelectedIndex());
        String fecha = txtFecha.getText();
        Conexion con = new Conexion();
        Connection datos;
        try {
            datos = con.conectar();
            String sql = "SELECT c.id_asistencia, observacion, CONCAT(e.apellido,'-',e.nombre) as Estudiante, c.fecha,t.tipo_asistencia FROM control_asistencia c, estudiante e,tipo_asistencia t, grado_seccion gs, grado g, seccion s WHERE c.id_estudiante = e.id_estudiante and c.id_tipo_asistencia=t.id_tipo_asistencia and e.id_grado_seccion = gs.id_grado_seccion and gs.id_seccion = s.id_seccion and gs.id_grado = g.id_grado and g.grado = ? and s.seccion = ? and gs.anio_seccion = ? and c.fecha = ? ORDER BY e.apellido ASC";
            PreparedStatement dato = datos.prepareStatement(sql);
            dato.setString(1, grado);
            dato.setString(2, seccion);
            dato.setString(3, anio);
            dato.setString(4, fecha);
            ResultSet rs = dato.executeQuery();
            while (rs.next()) {
                Object fila[] = {String.valueOf(rs.getInt(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                modelo.addRow(fila);
            }
            tAsistencia.setModel(modelo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void limpiarTabla() {
        //Limpiar tabla
        int filas = tAsistencia.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
    }

    public void limpiar() {

        Calendar fechas = new GregorianCalendar();

        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente                                                     
        String año = String.valueOf(fechas.get(Calendar.YEAR));
        String mes = String.valueOf(fechas.get(Calendar.MONTH) + 1);
        String dia = String.valueOf(fechas.get(Calendar.DAY_OF_MONTH));

        txtObservacion.setText("");
        txtId.setText("");
        txtFecha.setText(mes + "-" + dia + "-" + año);
        txtBuscar.setText("");

        //Deshabilitando botones 
        btnActualizar.setEnabled(false);
        btnSuspender.setEnabled(false);
        btnAgregar.setEnabled(true);

    }

    public void resetBusqueda() {

        txtBuscar.setText("");
        String busqueda = txtBuscar.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        tAsistencia.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(busqueda));

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbAsistencia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAsistencia = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbEstudiante = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSuspender = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cbGradoSeccion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        jCalendario = new com.toedter.calendar.JDateChooser();
        cbAño = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 37, 41));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Controlar Asistencia ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 330, -1));

        cbAsistencia.setBackground(new java.awt.Color(33, 37, 41));
        cbAsistencia.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbAsistencia.setForeground(new java.awt.Color(254, 254, 254));
        cbAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAsistencia.setFocusable(false);
        cbAsistencia.setOpaque(false);
        cbAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAsistenciaActionPerformed(evt);
            }
        });
        cbAsistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbAsistenciaKeyPressed(evt);
            }
        });
        jPanel1.add(cbAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 320, 30));

        tAsistencia = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tAsistencia.setBackground(new java.awt.Color(33, 37, 41));
        tAsistencia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        tAsistencia.setModel(new javax.swing.table.DefaultTableModel(
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
        tAsistencia.setFocusable(false);
        tAsistencia.setGridColor(new java.awt.Color(64, 65, 65));
        tAsistencia.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tAsistencia.setRowHeight(30);
        tAsistencia.setSelectionBackground(new java.awt.Color(45, 252, 119));
        tAsistencia.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tAsistencia.setShowVerticalLines(false);
        tAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tAsistenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tAsistencia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 950, 250));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Año:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 330, -1));

        txtFecha.setBackground(new java.awt.Color(33, 37, 41));
        txtFecha.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(254, 254, 254));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 280, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estudiante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 330, -1));

        cbEstudiante.setBackground(new java.awt.Color(33, 37, 41));
        cbEstudiante.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbEstudiante.setForeground(new java.awt.Color(254, 254, 254));
        cbEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEstudiante.setFocusable(false);
        cbEstudiante.setOpaque(false);
        cbEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbEstudianteKeyPressed(evt);
            }
        });
        jPanel1.add(cbEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 330, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Motivo de inasistencia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 320, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Observación:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 320, -1));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_default.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setFocusable(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_rollover.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 140, 70));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnLimpiarDefault.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnLimpiarRollover.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 140, 70));

        btnSuspender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_default.png"))); // NOI18N
        btnSuspender.setBorder(null);
        btnSuspender.setContentAreaFilled(false);
        btnSuspender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSuspender.setFocusable(false);
        btnSuspender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSuspender_rollover.png"))); // NOI18N
        btnSuspender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspenderActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuspender, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 140, 70));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrarAsistencia_default.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.setFocusable(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrarAsistencia_rollover.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 140, 70));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Buscar...");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 580, -1));

        txtBuscar.setBackground(new java.awt.Color(33, 37, 41));
        txtBuscar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(254, 254, 254));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 73, 73), 1, true));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 580, 30));

        cbGradoSeccion.setBackground(new java.awt.Color(33, 37, 41));
        cbGradoSeccion.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbGradoSeccion.setForeground(new java.awt.Color(254, 254, 254));
        cbGradoSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGradoSeccion.setFocusable(false);
        cbGradoSeccion.setOpaque(false);
        cbGradoSeccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradoSeccionItemStateChanged(evt);
            }
        });
        cbGradoSeccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbGradoSeccionKeyPressed(evt);
            }
        });
        jPanel1.add(cbGradoSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 330, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Grado/Sección:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 330, -1));

        txtObservacion.setBackground(new java.awt.Color(33, 37, 41));
        txtObservacion.setColumns(20);
        txtObservacion.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        txtObservacion.setForeground(new java.awt.Color(255, 255, 255));
        txtObservacion.setLineWrap(true);
        txtObservacion.setRows(5);
        txtObservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 36, 36)));
        txtObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtObservacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtObservacionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtObservacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 320, 160));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_default.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setFocusable(false);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnActualizar_rollover.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 140, 70));

        jCalendario.setMinSelectableDate(new java.util.Date(1577862109000L));
        jCalendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarioPropertyChange(evt);
            }
        });
        jPanel1.add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 50, 29));

        cbAño.setBackground(new java.awt.Color(33, 37, 41));
        cbAño.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbAño.setForeground(new java.awt.Color(254, 254, 254));
        cbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAño.setFocusable(false);
        cbAño.setOpaque(false);
        cbAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAñoItemStateChanged(evt);
            }
        });
        cbAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAñoActionPerformed(evt);
            }
        });
        cbAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbAñoKeyPressed(evt);
            }
        });
        jPanel1.add(cbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAsistenciaActionPerformed

    private void txtObservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionKeyTyped
        // TODO add your handling code here:
        val.verificarAlfanumerico(evt);
    }//GEN-LAST:event_txtObservacionKeyTyped

    private void txtObservacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_txtObservacionKeyPressed

    private void cbAsistenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbAsistenciaKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_cbAsistenciaKeyPressed

    private void cbGradoSeccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbGradoSeccionKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_cbGradoSeccionKeyPressed

    private void cbEstudianteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbEstudianteKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_cbEstudianteKeyPressed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jCalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarioPropertyChange
        // TODO add your handling code here:
        try {
            String dia = Integer.toString(jCalendario.getCalendar().get(Calendar.DATE));
            String año = Integer.toString(jCalendario.getCalendar().get(Calendar.YEAR));
            int mesInt = jCalendario.getCalendar().get(Calendar.MONTH) + 1;
            String mes = Integer.toString(mesInt);
            String fecha = (mes + "-" + dia + "-" + año);
            txtFecha.setText(fecha);
            mostrarTabla();

        } catch (Exception ex) {
            System.out.println(ex.toString());

        }
    }//GEN-LAST:event_jCalendarioPropertyChange

    private void cbAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAñoActionPerformed

    private void cbAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbAñoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAñoKeyPressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        if (txtObservacion.getText().trim().isEmpty() || txtFecha.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Campos vacios.", "Rellene los campos faltantes.", JOptionPane.WARNING_MESSAGE);
        } else {

            //Dividiendo el apellido y el nombre
            String estudiante = cbEstudiante.getItemAt(cbEstudiante.getSelectedIndex());
            String[] parte = estudiante.split("-");
            String apellido = parte[0];
            String nombre = parte[1];

            String gSeccion = cbGradoSeccion.getItemAt(cbGradoSeccion.getSelectedIndex());
            String[] parte2 = gSeccion.split("-");
            String grado = parte2[0];
            String seccion = parte2[1];

            //Obteniendo id del estudiante
            IdEstudiante = conducta.obtenerIdEstudiante(apellido, nombre);

            int idConducta = conducta.obtenerUltimoIdAs() + 1;

            int tipoAsistencia = conducta.obtenerIdTipoAsistencia(String.valueOf(cbAsistencia.getItemAt(cbAsistencia.getSelectedIndex())));

            as.setApellido(apellido);
            as.setNombre(nombre);
            as.setGrado(grado);
            as.setSeccion(seccion);
            as.setFecha(txtFecha.getText());

            if (conducta.comprobarAsistencia()) {
                JOptionPane.showMessageDialog(null, "Ya ha agregado un registro con estas credenciales");
            } 
            else 
            {

                as.setIdConducta(idConducta);
                as.setIdEstudiante(IdEstudiante);
                as.setObservacion(txtObservacion.getText());
                as.setFecha(txtFecha.getText());
                as.setIdTipoAsistencia(tipoAsistencia);

                if (conducta.IngresarAsistencia()) {

                    JOptionPane.showMessageDialog(null, "Ha agregado los datos correctamente");
                    MtoBitacoras add = new MtoBitacoras();
                    int id = add.capturarIdBitacora() + 1;
                    mod.setId_usuario(mod.getId_usuario());
                    mod.setId_bitacora(id);
                    add.agregarBitacoraAgregarAsistencia(mod);
                    this.limpiarTabla();
                    this.mostrarTabla();
                    this.resetBusqueda();

                } else {

                    JOptionPane.showMessageDialog(null, "No se han agregado los datos correctamente");

                }

            }

        }

        this.limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAñoItemStateChanged
        // TODO add your handling code here:
        this.llenarGradoSeccion();
        mostrarTabla();
    }//GEN-LAST:event_cbAñoItemStateChanged

    private void cbGradoSeccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradoSeccionItemStateChanged
        // TODO add your handling code here:
        this.llenarEstudiante();
        mostrarTabla();
    }//GEN-LAST:event_cbGradoSeccionItemStateChanged

    private void tAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAsistenciaMouseClicked
        // TODO add your handling code here:

        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnSuspender.setEnabled(true);
        btnCerrar.setEnabled(false);
        int fila = tAsistencia.getSelectedRow();
        String observacion = String.valueOf(tAsistencia.getValueAt(fila, 1));
        String fecha = String.valueOf(tAsistencia.getValueAt(fila, 3));
        
        
        
        txtFecha.setText(fecha);
        txtObservacion.setText(observacion);

        String student = String.valueOf(tAsistencia.getValueAt(fila, 2));
        String[] parte = student.split("-");
        String apellido = parte[0];
        String nombre = parte[1];

        cbEstudiante.setSelectedItem(student);

        //Setetando combo de grado/seccion
        String itemGS = conducta.getItemConducta(apellido, nombre);
        cbGradoSeccion.setSelectedItem(itemGS);

        //Seteando el combo de anio
        String itemAnio = conducta.getItemAnio(apellido, nombre);
        cbAño.setSelectedItem(itemAnio);

        
        
        
        
        //obteniendo id de conducta 
        int id = Integer.parseInt(tAsistencia.getValueAt(fila, 0).toString());
        txtId.setText(String.valueOf(id));
    }//GEN-LAST:event_tAsistenciaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if (txtFecha.getText().trim().isEmpty() || txtObservacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios.", "Rellene los campos faltantes.", JOptionPane.WARNING_MESSAGE);

        } else {

            //Dividiendo el apellido y el nombre
            String estudiante = cbEstudiante.getItemAt(cbEstudiante.getSelectedIndex());
            String[] parte = estudiante.split("-");
            String apellido = parte[0];
            String nombre = parte[1];

            //Obteniendo id del estudiante
            IdEstudiante = conducta.obtenerIdEstudiante(apellido, nombre);

            int tipoAsistencia = conducta.obtenerIdTipoAsistencia(String.valueOf(cbAsistencia.getItemAt(cbAsistencia.getSelectedIndex())));

            as.setIdConducta(Integer.parseInt(txtId.getText()));
            as.setIdEstudiante(IdEstudiante);
            as.setObservacion(txtObservacion.getText());
            as.setFecha(txtFecha.getText());
            as.setIdTipoAsistencia(tipoAsistencia);

            if (conducta.actualizarAsistencia()) {

                JOptionPane.showMessageDialog(null, "Ha actualizado los datos correctamente");

                this.limpiarTabla();
                this.mostrarTabla();
                this.resetBusqueda();
                MtoBitacoras add = new MtoBitacoras();
                int id = add.capturarIdBitacora() + 1;
                mod.setId_usuario(mod.getId_usuario());
                mod.setId_bitacora(id);
                add.agregarBitacoraActualizaAsistencia(mod);
            } else {

                JOptionPane.showMessageDialog(null, "No se han actualizado los datos correctamente");

            }

        }

        this.limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSuspenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspenderActionPerformed
        // TODO add your handling code here:
        if (txtId.getText().trim().isEmpty() || txtObservacion.getText().trim().isEmpty() || txtFecha.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios.", "Rellene los campos faltantes.", JOptionPane.WARNING_MESSAGE);
        } else {

            as.setIdConducta(Integer.parseInt(txtId.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar este resgistro?",
                    "Atención", JOptionPane.YES_NO_OPTION);
            if (eliminar == 0) {

                if (conducta.eliminarAsistencia()) {
                    JOptionPane.showMessageDialog(null, "Ha eliminado los datos correctamente");

                    MtoBitacoras add = new MtoBitacoras();
                    int id = add.capturarIdBitacora() + 1;
                    mod.setId_usuario(mod.getId_usuario());
                    mod.setId_bitacora(id);
                    add.agregarBitacoraEliminarAsistencia(mod);

                } else {
                    JOptionPane.showMessageDialog(null, "No se han eliminado los datos correctamente");
                }
            }
        }

        this.limpiarTabla();
        this.mostrarTabla();
        this.resetBusqueda();
        this.limpiar();

    }//GEN-LAST:event_btnSuspenderActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:

        String busqueda = txtBuscar.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        tAsistencia.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(busqueda));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnSuspender;
    private javax.swing.JComboBox<String> cbAsistencia;
    private javax.swing.JComboBox<String> cbAño;
    private javax.swing.JComboBox<String> cbEstudiante;
    private javax.swing.JComboBox<String> cbGradoSeccion;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tAsistencia;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtObservacion;
    // End of variables declaration//GEN-END:variables
}
