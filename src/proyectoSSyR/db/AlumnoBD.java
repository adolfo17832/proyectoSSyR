/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.db;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import proyectoSSyR.negocio.Alumno;
import proyectoSSyR.servicio.ConectarServicio;
import proyectoSSyR.servicio.Conexion;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class AlumnoBD {
    private Alumno alum; 
    
    public AlumnoBD(){
    }
    
    public AlumnoBD(Alumno alum) {
    this.alum=alum;   
    }
    
    public void insertaAlumnoBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{call add_Alumno(?,?,?,?,?,?,?,?,?,?,?)}";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setInt(1,alum.getNumcontrol());
            cdb.ps.setString(2, alum.getNombre());
            cdb.ps.setString(3, alum.getApellido());
            cdb.ps.setInt(4, alum.getSemestre());
            cdb.ps.setString(5, String.valueOf(alum.getTurno()));
            cdb.ps.setString(6, alum.getCurricula());
            cdb.ps.setString(7, alum.getCarrera());
            cdb.ps.setString(8, alum.getTelefono());
            cdb.ps.setString(9, alum.getCelular());
            cdb.ps.setString(10, alum.getEmail());
            cdb.ps.setInt(11,alum.getEstado());
            cdb.resultado = cdb.ps.executeQuery();
            String respuesta = "";
            while (cdb.resultado.next()) {respuesta = cdb.resultado.getString(1).toString();} 
            cdb.ps.executeUpdate();            
            if (respuesta.equals("0")) {
            showMessageDialog(null,"El Alumno se inserto correctamente", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }else{
             showMessageDialog(null, "El Alumno ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }    
    }

    public void modificarAlumnoBD()throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
          
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{call update_Alumno(?,?,?,?,?,?,?,?,?,?,?)}";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setInt(1,alum.getNumcontrol());
            cdb.ps.setString(2, alum.getNombre());
            cdb.ps.setString(3, alum.getApellido());
            cdb.ps.setInt(4, alum.getSemestre());
            cdb.ps.setString(5, String.valueOf(alum.getTurno()));
            cdb.ps.setString(6, alum.getCurricula());
            cdb.ps.setString(7, alum.getCarrera());
            cdb.ps.setString(8, alum.getTelefono());
            cdb.ps.setString(9, alum.getCelular());
            cdb.ps.setString(10, alum.getEmail());
            cdb.ps.setInt(11,alum.getEstado());
            cdb.resultado = cdb.ps.executeQuery();
                        String respuesta = "";
                while (cdb.resultado.next()) {
                        respuesta = cdb.resultado.getString(1).toString();
                } 
            cdb.ps.executeUpdate();            
           
            if (respuesta.equals("1")) {
            showMessageDialog(null,"Se Actualizo correctamente", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }else{
             showMessageDialog(null, "No se encontro algun registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
    }

    public void EliminarlogAlumno() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
          
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{call deletelog_Alumno(?,?)}";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setInt(1,alum.getNumcontrol());
            cdb.ps.setInt(2,alum.getEstado());
            cdb.resultado = cdb.ps.executeQuery();
                        String respuesta = "";
                while (cdb.resultado.next()) {
                        respuesta = cdb.resultado.getString(1).toString();
                } 
            cdb.ps.executeUpdate();            
           
            if (respuesta.equals("1")) {
            showMessageDialog(null,"Se elimino correctamente", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }else{
             showMessageDialog(null, "No se encontro algun registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
    
    }
    
     public void VistaAlumno() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
          
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = " select *from alumnos;";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setInt(1,alum.getNumcontrol());
            cdb.ps.setInt(2,alum.getEstado());
            cdb.resultado = cdb.ps.executeQuery();
                        String respuesta = "";
                while (cdb.resultado.next()) {
                        respuesta = cdb.resultado.getString(1).toString();
                } 
            cdb.ps.executeUpdate();            

    }

    public ArrayList<Alumno> obtenerAlumnosBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT * FROM alumnos";
        cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            while (cdb.resultado.next()) {
                alum = new Alumno();
                alum.setNumcontrol(cdb.resultado.getInt(1));
                alum.setNombre(cdb.resultado.getString(2));
                alum.setApellido(cdb.resultado.getString(3));
                alum.setCarrera(cdb.resultado.getString(4));
                alum.setCurricula(cdb.resultado.getString(5));
                alum.setSemestre(cdb.resultado.getInt(6));
                alum.setTurno(cdb.resultado.getString(7).charAt(0));
                alum.setTelefono(cdb.resultado.getString(8));
                alum.setCelular(cdb.resultado.getString(9));
                alum.setEmail(cdb.resultado.getString(10));
        
               Alumnos.add(alum);
            }
        }

        return Alumnos;
    }

    public String obtenerNoAlumnosBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
