package vistas;

import controlador.CtrlEstudiante;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.MtoEstudiante;
import modelo.ClsValidaciones;

/**
 *
 * @author EDUARDO
 */
public class FrmMatricula extends javax.swing.JInternalFrame {

    //Llamando clases 
    ClsValidaciones val = new ClsValidaciones();
    CtrlEstudiante estudianteCtrl = new CtrlEstudiante();
    MtoEstudiante estudiante = new MtoEstudiante();
    
    //Declarando variables
    String filename = null;
    byte[] person_image = null;
    
    public FrmMatricula() throws ParseException {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        //llenando combobox 
        this.llenarAnio();
        this.llenarGradoSeccion();
        jDireccion.setLineWrap(true);
        String fecha = "2016/01/1";
        java.util.Date fechaParseada= new SimpleDateFormat("yyyy/MM/dd").parse(fecha);
        jCalendario.setDate(fechaParseada);
        
        
        //Mostrando responsable
        estudiante.obteniendoResponsable();  
        jResponsable.setText(estudianteCtrl.getResponsable());
  
        jCalendario.getJCalendar().setForeground(new Color(254,254,254));
        jCalendario.getJCalendar().setSundayForeground(Color.WHITE);
        jCalendario.getJCalendar().setWeekdayForeground(Color.WHITE);
        jCalendario.getJCalendar().setDecorationBackgroundVisible(false);
        jCalendario.getJCalendar().setWeekOfYearVisible(false);
        jCalendario.getJCalendar().setBackground(Color.WHITE);
        jCalendario.getJCalendar().setPreferredSize(new Dimension(450, 450));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCargarFoto = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        cbGS = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jResponsable = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDireccion = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFecha = new javax.swing.JTextField();
        jCalendario = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cbAño = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 37, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Una vez ingresados los datos del responsable, se procedera a la matricula del nuevo estudiante.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(61, 66, 72));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 180, 220));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_default.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAgregar_rollover.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 180, 80));

        btnCargarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_default.png"))); // NOI18N
        btnCargarFoto.setBorder(null);
        btnCargarFoto.setContentAreaFilled(false);
        btnCargarFoto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCargarFoto_rollover.png"))); // NOI18N
        btnCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 180, 80));

        jLayeredPane2.setNextFocusableComponent(jLayeredPane1);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbGS.setBackground(new java.awt.Color(33, 37, 41));
        cbGS.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbGS.setForeground(new java.awt.Color(255, 255, 255));
        cbGS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jLayeredPane2.add(cbGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Grado/Sección:");
        jLayeredPane2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, 20));

        jResponsable.setEditable(false);
        jResponsable.setBackground(new java.awt.Color(33, 37, 41));
        jResponsable.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jResponsable.setForeground(new java.awt.Color(255, 255, 255));
        jResponsable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jResponsable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        jResponsable.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jResponsable.setEnabled(false);
        jResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jResponsableKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jResponsableKeyTyped(evt);
            }
        });
        jLayeredPane2.add(jResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Responsable:");
        jLayeredPane2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dirección:");
        jLayeredPane2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 280, -1));

        jDireccion.setBackground(new java.awt.Color(33, 37, 41));
        jDireccion.setColumns(20);
        jDireccion.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jDireccion.setRows(5);
        jDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        jDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDireccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jDireccion);

        jLayeredPane2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, 160));

        jPanel1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 310, 360));

        jLayeredPane1.setNextFocusableComponent(jLayeredPane2);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 20));

        jNombre.setBackground(new java.awt.Color(33, 37, 41));
        jNombre.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });
        jLayeredPane1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellido:");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, -1));

        jApellido.setBackground(new java.awt.Color(33, 37, 41));
        jApellido.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jApellido.setForeground(new java.awt.Color(255, 255, 255));
        jApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        jApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jApellidoKeyTyped(evt);
            }
        });
        jLayeredPane1.add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha de nacimiento:");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, -1));

        jFecha.setEditable(false);
        jFecha.setBackground(new java.awt.Color(33, 37, 41));
        jFecha.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        jFecha.setForeground(new java.awt.Color(255, 255, 255));
        jFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(119, 119, 119)));
        jLayeredPane1.add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 30));

        jCalendario.setMaxSelectableDate(new java.util.Date(1483254087000L));
        jCalendario.setMinSelectableDate(new java.util.Date(1325401287000L));
        jCalendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarioPropertyChange(evt);
            }
        });
        jLayeredPane1.add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 50, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Año:");
        jLayeredPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, -1));

        cbAño.setBackground(new java.awt.Color(33, 37, 41));
        cbAño.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        cbAño.setForeground(new java.awt.Color(254, 254, 254));
        cbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAño.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAñoItemStateChanged(evt);
            }
        });
        cbAño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbAñoMouseClicked(evt);
            }
        });
        cbAño.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbAñoPropertyChange(evt);
            }
        });
        cbAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbAñoKeyPressed(evt);
            }
        });
        jLayeredPane1.add(cbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Género:");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        rbM.setBackground(new java.awt.Color(33, 37, 41));
        rbGenero.add(rbM);
        rbM.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rbM.setForeground(new java.awt.Color(255, 255, 255));
        rbM.setText("Masculino");
        jLayeredPane1.add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        rbF.setBackground(new java.awt.Color(33, 37, 41));
        rbGenero.add(rbF);
        rbF.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rbF.setForeground(new java.awt.Color(255, 255, 255));
        rbF.setText("Femenino");
        jLayeredPane1.add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 300, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1080, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        //Validando campos vacios 
        if ((jNombre.getText().trim().isEmpty()) || (jApellido.getText().trim().isEmpty()) || (jFecha.getText().trim().isEmpty())
                || (rbM.isSelected() == false) && (rbF.isSelected() == false) || (jResponsable.getText().trim().isEmpty()) || (jDireccion.getText().trim().isEmpty())
                || (lblFoto.getIcon()==null)) {
            JOptionPane.showMessageDialog(null, "Campos vacios.","Rellene los campos faltantes.",JOptionPane.WARNING_MESSAGE);
        } else {
            
            //Verificando cupos disponibles
            estudianteCtrl.setAnioSeccion(String.valueOf(cbAño.getItemAt(cbAño.getSelectedIndex())));

            //Dividiendo el grado y la seccion
            String gradoSeccion2 = cbGS.getItemAt(cbGS.getSelectedIndex());
            String[] parte2 = gradoSeccion2.split("-");
            String grado2 = parte2[0];
            String seccion2 = parte2[1];

            //Dividiendo el grado y la seccion
            estudianteCtrl.setGrado(grado2);
            estudianteCtrl.setSeccion(seccion2);

            estudiante.verificarCupos();
            if (estudianteCtrl.getIdEstudianteCount() >= 45) {
                JOptionPane.showMessageDialog(null, "Esta sección ya no tiene cupos disponibles");
            } else {
                //Mandando datos a la clase
                estudiante.obtenerUltimoId();
                estudianteCtrl.setNombre(jNombre.getText());
                estudianteCtrl.setApellido(jApellido.getText());
                estudianteCtrl.setFechaNacimiento(jFecha.getText());
                estudianteCtrl.setAnioIngreso(String.valueOf(cbAño.getItemAt(cbAño.getSelectedIndex())));
                estudianteCtrl.setDireccion(jDireccion.getText());
                if (rbF.isSelected()) {
                    estudianteCtrl.setGenero("F");
                } else if (rbM.isSelected()) {
                    estudianteCtrl.setGenero("M");
                }     
                estudianteCtrl.setIdEstado(1);
                //Dividiendo el grado y la seccion
                String gradoSeccion = cbGS.getItemAt(cbGS.getSelectedIndex());
                String[] parte = gradoSeccion.split("-");
                String grado = parte[0];
                String seccion = parte[1];

                estudiante.obtenerIdGS(grado, seccion);
                estudianteCtrl.setFoto(person_image);

                if (estudiante.insertarEstudiante()) {
                    JOptionPane.showMessageDialog(null, "Se ha agregado el estudiante correctamente");
                    this.limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha agregado el estudiante correctamente");
                }

                estudiante.obtenerUltimoIdNota();
                String nivelSubstring = gradoSeccion.substring(7,8);
                int nivel = Integer.parseInt(nivelSubstring);
                estudianteCtrl.setNivelAcademico(nivel);
                estudiante.obtenerCountIdIndicador();
                for (int i = 0; i <3; i++) {
                    estudianteCtrl.setIdtrimestre(i + 1);
                    estudiante.obtenerIndicador();
                }
           
            }   
        
            
            
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

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
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCargarFotoActionPerformed

    private void jCalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarioPropertyChange
        try{
             String dia = Integer.toString(jCalendario.getCalendar().get(Calendar.DATE));
            String año = Integer.toString(jCalendario.getCalendar().get(Calendar.YEAR));
            int mesInt = jCalendario.getCalendar().get(Calendar.MONTH) + 1;
            String mes = Integer.toString(mesInt);
            String fecha = (mes+"-"+dia+"-"+año);
            jFecha.setText(fecha);
      
        }catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jCalendarioPropertyChange

    private void jNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyPressed
        // TODO add your handling code here:
        String Caracteres = jNombre.getText();
        if(Caracteres.length()>=30){
            jNombre.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_jNombreKeyPressed

    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
        // TODO add your handling code here:
        val.verificarLetras(evt);
    }//GEN-LAST:event_jNombreKeyTyped

    private void jApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyPressed
        // TODO add your handling code here:
        String Caracteres = jApellido.getText();
        if(Caracteres.length()>=30){
            jApellido.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_jApellidoKeyPressed

    private void jApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyTyped
        // TODO add your handling code here:
        val.verificarLetras(evt);
    }//GEN-LAST:event_jApellidoKeyTyped

    private void jDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDireccionKeyPressed
        // TODO add your handling code here:
       String Caracteres = jDireccion.getText();
        if(Caracteres.length()>=200){
            jDireccion.setText("");
            JOptionPane.showMessageDialog(null, "Limite de carácteres alcanzado.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        val.verificarPegar(evt);
    }//GEN-LAST:event_jDireccionKeyPressed

    private void jDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDireccionKeyTyped
        // TODO add your handling code here:
        val.verificarAlfanumerico(evt);
    }//GEN-LAST:event_jDireccionKeyTyped

    private void jResponsableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jResponsableKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_jResponsableKeyPressed

    private void jResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jResponsableKeyTyped
        // TODO add your handling code here:
        val.verificarLetras(evt);
    }//GEN-LAST:event_jResponsableKeyTyped

    private void cbAñoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAñoItemStateChanged
        this.llenarGradoSeccion();
    }//GEN-LAST:event_cbAñoItemStateChanged

    private void cbAñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbAñoMouseClicked

    }//GEN-LAST:event_cbAñoMouseClicked

    private void cbAñoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbAñoPropertyChange

    }//GEN-LAST:event_cbAñoPropertyChange

    private void cbAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbAñoKeyPressed
        // TODO add your handling code here:
        val.verificarPegar(evt);
    }//GEN-LAST:event_cbAñoKeyPressed

    //Método para combobox del año
    public void llenarAnio() {

        //Seteando modelo del combo
        cbAño.setModel(estudiante.llenarAnio());
    }
    

    //Método para combobox de grado/seccion
    public void llenarGradoSeccion() {

        //Obteniendo parametro del año
        String anio = cbAño.getItemAt(cbAño.getSelectedIndex());
        estudianteCtrl.setAnioSeccion(anio);

        //Seteando modelo del combo
        cbGS.setModel(estudiante.llenarGS());
        
    }
    
    public void limpiarCampos(){
    
        //limpiando campos
        jNombre.setText("");
        jApellido.setText("");
        jFecha.setText("");
        rbF.setSelected(false);
        rbM.setSelected(false);
        jDireccion.setText("");
        lblFoto.setIcon(null);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargarFoto;
    private javax.swing.JComboBox<String> cbAño;
    private javax.swing.JComboBox<String> cbGS;
    private javax.swing.JTextField jApellido;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JTextArea jDireccion;
    private javax.swing.JTextField jFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jResponsable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JRadioButton rbF;
    private javax.swing.ButtonGroup rbGenero;
    private javax.swing.JRadioButton rbM;
    // End of variables declaration//GEN-END:variables
}
