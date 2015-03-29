/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import java.sql.SQLException;
import proyectoSSyR.negocio.Alumno;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ControladorAlumno {
    /**
     *Inserta alumnos ala base de datos
     * 
     */
    public void addAlumno(int numcontrol,String nombre,String apellido,int semestre,char turno,String curricula,
        String carrera,String telefono,String celular,String email,int estado)
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        Alumno objAlumno = new Alumno(numcontrol,nombre,apellido,semestre,turno,curricula,carrera,telefono,celular,email, estado);
        objAlumno.insertarAlumno();
    }
    
     /**
     *Modificar registro de la tabla Alumno
     * 
     */
      public void updateAlumno(int numcontrol,String nombre,String apellido,int semestre,char turno,String curricula,
        String carrera,String telefono,String celular,String email,int estado)
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        Alumno objAlumno = new Alumno(numcontrol,nombre,apellido,semestre,turno,curricula,carrera,telefono,celular,email, estado);
        objAlumno.ModificarAlumno();
    }

    /**
     *Eliminacion logica registro de la tabla Alumno por numero de control
     * 
     */
      public void deletelogAlumno(int numcontrol,int estado)
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        Alumno objAlumno = new Alumno(numcontrol, estado);
        objAlumno.EliminarlogAlumno();
    }
}
