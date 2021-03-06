/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.CtrlEstudiante;
import controlador.CtrlResponsable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author katy0
 */
public class MtoEstudiante {
    
    //Llamando clase de controlador
    CtrlEstudiante estudianteCtrl = new CtrlEstudiante();
    
    //Declarando conexion
    private Connection cn;

    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public MtoEstudiante(){
        
        //Llamando conexion
        ClsConexion conectar = new ClsConexion();
        cn = conectar.conectar();
    }
    
    public void obteniendoResponsable(){
        
        //Llamando clase de responsable
        CtrlResponsable responsableCtrl = new CtrlResponsable();
        try{
            
            //Preparando sentencia
            String sql = "SELECT CONCAT(nombre,' ',apellido) as responsable, id_responsable FROM responsable WHERE dui = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, responsableCtrl.getDui());
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                estudianteCtrl.setResponsable(rs.getString(1));
                estudianteCtrl.setIdResponsable(rs.getInt(2));
            }
            
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    //<editor-fold defaultstate="collapsed" desc="Llenando Combobox">
    public DefaultComboBoxModel llenarAnio(){
        
        //Creando instancia del modelo
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            
            //Llamando procedimiento almacenado
            CallableStatement cmd = cn.prepareCall("{CALL cbAnio}");
            
            //Ejecutando sentencia
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                //Agregando elementos al combobox
                modelo.addElement(rs.getString(1));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
      return modelo;
    }
    
    public DefaultComboBoxModel llenarAño2(){
        
        //Creando instancia del modelo
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            
            //Preparando sentencia
            String sql = "SELECT anio_seccion FROM grado_seccion WHERE anio_seccion = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, estudianteCtrl.getAnioSeccion());
            
            //Ejecutando sentencia
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                //Agregando elementos al combobox
                modelo.addElement(rs.getString(1));

            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
      return modelo;
    }
    
     public DefaultComboBoxModel llenarGS2(){
        
        //Creando instancia del modelo
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            
            //Preparando sentencia
            String sql = "SELECT CONCAT(g.grado,'-',s.seccion) as grado_seccion FROM grado_seccion gs, seccion s, grado g WHERE gs.id_grado = g.id_grado AND gs.id_seccion = s.id_seccion AND gs.anio_seccion = ? AND g.grado = ? AND id_estado_gs = 1";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, estudianteCtrl.getAnioSeccion());
            cmd.setString(2, estudianteCtrl.getGrado());
            
            //Ejecutando sentencia
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                //Agregando elementos al combobox
                modelo.addElement(rs.getString(1));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
      return modelo;
    }
     
     public DefaultComboBoxModel llenarGS3(){
        
        //Creando instancia del modelo
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            
            //Preparando sentencia
            String sql = "SELECT CONCAT(g.grado,'-',s.seccion) as grado_seccion FROM grado_seccion gs, seccion s, grado g WHERE gs.id_grado = g.id_grado AND gs.id_seccion = s.id_seccion AND gs.anio_seccion = ? AND id_estado_gs = 1";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, estudianteCtrl.getAnioSeccion());
            
            //Ejecutando sentencia
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                //Agregando elementos al combobox
                modelo.addElement(rs.getString(1));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
      return modelo;
    }
    
    //Llenando combobox de grado_Seccion
    public DefaultComboBoxModel llenarGS(){
        
        //Creando instancia del modelo
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            
            //Llamando procedimiento almacenado
            CallableStatement cmd = cn.prepareCall("{CALL cbGradoSeccion(?)}");
            
            cmd.setString(1,estudianteCtrl.getAnioSeccion());
            
            cmd.execute();
            //Ejecutando sentencia
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                //Agregando elementos al combobox
                modelo.addElement(rs.getString(1));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
      return modelo;
    }
    
    public DefaultComboBoxModel llenarResponable(){
        
        //Creando instancia del modelo
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try
        {
            
            //Preparando sentencia
            String sql = "SELECT CONCAT(nombre, '-' , apellido) as responsable FROM responsable";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            //Ejecutando sentencia
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                //Agregando elementos al combobox
                modelo.addElement(rs.getString(1));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }       
      return modelo;
    }
    
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Obteniendo Ids">
    //Obteniendo id del estudiante
    public void obtenerUltimoId(){

        try{
            
            //Preparando sentencia sql
            String sql = "SELECT max(id_estudiante) FROM estudiante";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               estudianteCtrl.setIdEstudiante(rs.getInt(1) + 1);
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
    public void obtenerIdGS(String grado, String seccion){
        
        try{
            
            //Preparando sentencia sql
            String sql = "SELECT gs.id_grado_seccion FROM grado_seccion gs, seccion s, grado g where g.grado = ? AND s.seccion = ? AND g.id_grado = gs.id_grado AND s.id_seccion = gs.id_seccion AND gs.anio_seccion = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, grado);
            cmd.setString(2, seccion);
            cmd.setString(3, estudianteCtrl.getAnioSeccion());
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               estudianteCtrl.setIdGradoSeccion(rs.getInt(1));
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }

    }
    
    
    //Obteniendo id del grado_Seccion
    public void obtenerIdResponsable(String nombre, String apellido){

        try{
            
            //Preparando sentencia sql
            String sql = "SELECT id_responsable FROM responsable WHERE nombre = ? AND apellido = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, nombre);
            cmd.setString(2, apellido);
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               estudianteCtrl.setIdResponsable(rs.getInt(1));
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Agregando notas predeterminada">
    
    public void obtenerUltimoIdNota(){

        try{
            
            //Preparando sentencia sql
            String sql = "SELECT max(id_nota) FROM nota";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               estudianteCtrl.setIdNota(rs.getInt(1));
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
    public void obtenerCountIdIndicador(){

        try{
            
            //Preparando sentencia sql
            String sql = "SELECT count(id_indicador) FROM indicador_logro WHERE nivel_academico = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, estudianteCtrl.getNivelAcademico());
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               estudianteCtrl.setIdIndicadorCount(rs.getInt(1));
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
     
    public int[] obtenerIndicador(){
        int[] indicador = new int[1]; 
        try{
            
            //Preparando sentencia sql
            String sql = "SELECT id_indicador FROM indicador_logro WHERE nivel_academico = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, estudianteCtrl.getNivelAcademico());
            
            ResultSet rs = cmd.executeQuery();
            indicador = new int[estudianteCtrl.getIdIndicadorCount()];
            int j = 0;
            while(rs.next()){
                 indicador[j] = rs.getInt(j + 1);
                 //System.out.println(String.valueOf(indicador[j]));
                 int nota = estudianteCtrl.getIdNota() + 1;
                 estudianteCtrl.setIdNota(nota);
                 this.insertarNota(indicador[j], nota);
            }
            j++;
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
         
        return indicador;
    }
     
    public void insertarNota(int indicador, int idNota){
        try{
            
            //Preparando sentencia
            String sql = "INSERT INTO nota(id_nota, id_indicador, id_n_predeterminada, id_estudiante, id_trimestre) VALUES(?, ?, ?, ?, ?)";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, idNota);
            cmd.setInt(2, indicador);
            cmd.setInt(3, estudianteCtrl.getNotaPredeterminada());
            cmd.setInt(4, estudianteCtrl.getIdEstudiante());
            cmd.setInt(5, estudianteCtrl.getIdtrimestre());
            
            if (!cmd.execute()) {
                // JOptionPane.showMessageDialog(null, "Se ha agregado notas correctamente");
            } else {
                //JOptionPane.showMessageDialog(null, "No se ha agregado el estudiante correctamente");
            }
            
        
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    
    
     
    public int[] obtenerIndicador2(int id){
        int[] indicador = new int[1]; 
        try{
            
            //Preparando sentencia sql
            String sql = "SELECT id_indicador FROM indicador_logro WHERE nivel_academico = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, estudianteCtrl.getNivelAcademico());
            
            ResultSet rs = cmd.executeQuery();
            indicador = new int[estudianteCtrl.getIdIndicadorCount()];
            int j = 0;
            while(rs.next()){
                 indicador[j] = rs.getInt(j + 1);
                 //System.out.println(String.valueOf(indicador[j]));
                 int nota = estudianteCtrl.getIdNota() + 1;
                 estudianteCtrl.setIdNota(nota);
                 this.insertarNota2(indicador[j], nota, id);
            }
            j++;
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
         
        return indicador;
    }
     
    public void insertarNota2(int indicador, int idNota, int id){
        try{
            
            //Preparando sentencia
            String sql = "INSERT INTO nota(id_nota, id_indicador, id_n_predeterminada, id_estudiante, id_trimestre) VALUES(?, ?, ?, ?, ?)";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, idNota);
            cmd.setInt(2, indicador);
            cmd.setInt(3, estudianteCtrl.getNotaPredeterminada());
            cmd.setInt(4, id);
            cmd.setInt(5, estudianteCtrl.getIdtrimestre());
            
            if (!cmd.execute()) {
                // JOptionPane.showMessageDialog(null, "Se ha agregado notas correctamente");
            } else {
                //JOptionPane.showMessageDialog(null, "No se ha agregado el estudiante correctamente");
            }
            
        
        } catch(Exception ex){
            System.out.println(ex.toString());
        }

    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="translado de alumnos">
    public void verificarCupos(){

        try{
            
            //Preparando sentencia
            String sql = "SELECT count(e.id_estudiante) FROM estudiante e, responsable r, grado_seccion gs, grado g, seccion se WHERE  r.id_responsable = e.id_responsable AND gs.id_grado_seccion = e.id_grado_seccion AND g.id_grado = gs.id_grado AND se.id_seccion = gs.id_seccion AND gs.anio_seccion = ? AND g.grado = ? AND se.seccion = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, estudianteCtrl.getAnioSeccion());
            cmd.setString(2, estudianteCtrl.getGrado());
            cmd.setString(3, estudianteCtrl.getSeccion());
            
            //Ejecutando sentencia
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                estudianteCtrl.setIdEstudianteCount(rs.getInt(1));
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
    }
    
    public boolean graduarEstudiante(int id){
        boolean resp = false;
        try
        {
            String sql = "UPDATE estudiante set id_estado_estudiante = 4 WHERE id_estudiante = ?";
            PreparedStatement cmd = cn.prepareCall(sql);
            
            cmd.setInt(1, id);
            
            //Ejecutando consulta
            if (!cmd.execute()) {
                resp = true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return resp;
    }
    
    public boolean graduarSeccion(int id){
        boolean resp = false;
        try
        {
            String sql = "UPDATE grado_seccion set id_estado_gs = 3 WHERE id_grado_seccion = ?";
            PreparedStatement cmd = cn.prepareCall(sql);
            
            cmd.setInt(1, id);
            
            //Ejecutando consulta
            if (!cmd.execute()) {
                resp = true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return resp;
    }
    

    //</editor-fold>
    
    //Obteniendo id del grado_Seccion
    public void obtenerCampos(String apellido, String nombre, String genero, int idResponsable, int gs){

        try{
            
            //Preparando sentencia sql
            String sql = "SELECT id_estudiante, anio_ingreso, fecha_nacimiento, direccion, foto, id_estado_estudiante FROM estudiante WHERE apellido = ? AND nombre = ? AND genero = ? AND id_responsable = ? AND id_grado_seccion = ? AND id_estado_estudiante = 1";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, apellido);
            cmd.setString(2, nombre);
            cmd.setString(3, genero);
            cmd.setInt(4, idResponsable);
            cmd.setInt(5, gs);
            
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               estudianteCtrl.setIdEstudiante(rs.getInt(1));
               estudianteCtrl.setAnioIngreso(rs.getString(2));
               estudianteCtrl.setFechaNacimiento(rs.getString(3));
               estudianteCtrl.setDireccion(rs.getString(4));
               estudianteCtrl.setFoto(rs.getBytes(5));
               estudianteCtrl.setIdEstado(rs.getInt(6));
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
     public void obtenerCamposPrev(String apellido, String nombre, String genero, int idResponsable){

        try{
            
            //Preparando sentencia sql
            String sql = "SELECT gs.anio_seccion FROM grado_seccion gs, estudiante e WHERE e.apellido = ? AND e.nombre = ? AND e.genero = ? AND e.id_responsable = ? AND e.id_grado_seccion = gs.id_grado_seccion";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, apellido);
            cmd.setString(2, nombre);
            cmd.setString(3, genero);
            cmd.setInt(4, idResponsable);
            
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
               estudianteCtrl.setAnioSeccion(rs.getString(1));
            }
            
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
    public byte[] capturarFoto(int id){
        byte[] foto = null;
        try{
            String sql = "SELECT foto FROM estudiante WHERE id_estudiante = ?";
            PreparedStatement cmd = cn.prepareCall(sql);
            cmd.setInt(1,id);
            
            //Ejecutando consulta
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                foto = rs.getBytes(1); 
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return foto;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="CRUD">
    public boolean insertarEstudiante(){
        
        //Declarando valor de retorno
        boolean resp = false;
        
        try{
            
            //Preparando sentencia
            String sql = "INSERT INTO estudiante(id_estudiante, nombre, apellido, anio_ingreso, fecha_nacimiento, direccion, genero, "
                            + "id_estado_estudiante, id_responsable, id_grado_seccion, foto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, estudianteCtrl.getIdEstudiante());
            cmd.setString(2, estudianteCtrl.getNombre());
            cmd.setString(3, estudianteCtrl.getApellido());
            cmd.setString(4, estudianteCtrl.getAnioIngreso());
            cmd.setString(5, estudianteCtrl.getFechaNacimiento());
            cmd.setString(6, estudianteCtrl.getDireccion());
            cmd.setString(7, estudianteCtrl.getGenero());
            cmd.setInt(8, estudianteCtrl.getIdEstado());
            cmd.setInt(9, estudianteCtrl.getIdResponsable());
            cmd.setInt(10, estudianteCtrl.getIdGradoSeccion());
            cmd.setBytes(11, estudianteCtrl.getFoto());
            
            if (!cmd.execute()) {
                resp = true;
            }
            
        
        } catch(Exception ex){
            //JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.toString());
        }
        //Retornando valor
        return resp;
    }
    
    public boolean insertarEstudiante2(int id){
        
        //Declarando valor de retorno
        boolean resp = false;
        
        try{
            
            //Preparando sentencia
            String sql = "INSERT INTO estudiante(id_estudiante, nombre, apellido, anio_ingreso, fecha_nacimiento, direccion, genero, "
                            + "id_estado_estudiante, id_responsable, id_grado_seccion, foto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, id);
            cmd.setString(2, estudianteCtrl.getNombre());
            cmd.setString(3, estudianteCtrl.getApellido());
            cmd.setString(4, estudianteCtrl.getAnioIngreso());
            cmd.setString(5, estudianteCtrl.getFechaNacimiento());
            cmd.setString(6, estudianteCtrl.getDireccion());
            cmd.setString(7, estudianteCtrl.getGenero());
            cmd.setInt(8, estudianteCtrl.getIdEstado());
            cmd.setInt(9, estudianteCtrl.getIdResponsable());
            cmd.setInt(10, estudianteCtrl.getIdGradoSeccion());
            cmd.setBytes(11, estudianteCtrl.getFoto());
            
            if (!cmd.execute()) {
                resp = true;
            }
            
        
        } catch(Exception ex){
            //JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.toString());
        }
        //Retornando valor
        return resp;
    }
    
    public boolean actualizarEstudiante(){
        boolean resp = false;
        try
        {
            String sql = "UPDATE estudiante SET nombre = ?, apellido = ?, anio_ingreso = ?, fecha_nacimiento = ?, direccion = ?, genero = ?, id_estado_estudiante = ?, id_responsable = ?, id_grado_seccion = ?, foto = ? "
                    + "WHERE id_estudiante = ?";
            PreparedStatement cmd = cn.prepareCall(sql);
            
            cmd.setString(1, estudianteCtrl.getNombre());
            cmd.setString(2, estudianteCtrl.getApellido());
            cmd.setString(3, estudianteCtrl.getAnioIngreso());
            cmd.setString(4, estudianteCtrl.getFechaNacimiento());
            cmd.setString(5, estudianteCtrl.getDireccion());
            cmd.setString(6, estudianteCtrl.getGenero());
            cmd.setInt(7, estudianteCtrl.getIdEstado());
            cmd.setInt(8, estudianteCtrl.getIdResponsable());
            cmd.setInt(9, estudianteCtrl.getIdGradoSeccion());
            cmd.setBytes(10, estudianteCtrl.getFoto());
            cmd.setInt(11, estudianteCtrl.getIdEstudiante());
            
            //Ejecutando consulta
            if (!cmd.execute()) {
                resp = true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return resp;
    }
    
    public boolean suspenderEstudiante(){
        boolean resp = false;
        try
        {
            String sql = "UPDATE estudiante SET id_estado_estudiante = 3 WHERE id_estudiante = ?";
            PreparedStatement cmd = cn.prepareCall(sql);
            cmd.setInt(1, estudianteCtrl.getIdEstudiante());
            //Ejecutando consulta
            if (!cmd.execute()) {
                resp = true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return resp;
    }
    
    public boolean activarEstudiante(){
        boolean resp = false;
        try
        {
            String sql = "UPDATE estudiante SET id_estado_estudiante = 1 WHERE id_estudiante = ?";
            PreparedStatement cmd = cn.prepareCall(sql);
            cmd.setInt(1, estudianteCtrl.getIdEstudiante());
            //Ejecutando consulta
            if (!cmd.execute()) {
                resp = true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return resp;
    }
    
    public boolean retirarEstudiante(){
        boolean resp = false;
        try
        {
            String sql = "UPDATE estudiante SET id_estado_estudiante = 2 WHERE id_estudiante = ?";
            PreparedStatement cmd = cn.prepareCall(sql);
            cmd.setInt(1, estudianteCtrl.getIdEstudiante());
            //Ejecutando consulta
            if (!cmd.execute()) {
                resp = true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return resp;
    }
    // </editor-fold>
}
