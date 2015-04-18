/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoSSyR.db.AlumnoBD;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class Alumno {
private int numcontrol;
private String nombre;
private String apellido;
private int semestre;
private char turno;
private String curricula;
private String carrera;
private String telefono;
private String celular;
private String email;
private int estado;

public Alumno(){

}
public Alumno(int numcontrol,String nombre,String apellido,int semestre,char turno,String curricula,
        String carrera,String telefono,String celular,String email,int estado){

this.numcontrol=numcontrol;
this.nombre=nombre;
this.apellido=apellido;
this.semestre=semestre;
this.turno=turno;
this.curricula=curricula;
this.carrera=carrera;
this.telefono=telefono;
this.celular=celular;
this.email=email;
this.estado=estado;
}

public Alumno(int numcontrol,int estado){

this.numcontrol=numcontrol;
this.estado=estado;
}
    /**
     * @return the numcontrol
     */
    public int getNumcontrol() {
        return numcontrol;
    }

    /**
     * @param numcontrol the numcontrol to set
     */
    public void setNumcontrol(int numcontrol) {
        this.numcontrol = numcontrol;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the turno
     */
    public char getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(char turno) {
        this.turno = turno;
    }

    /**
     * @return the curricula
     */
    public String getCurricula() {
        return curricula;
    }

    /**
     * @param curricula the curricula to set
     */
    public void setCurricula(String curricula) {
        this.curricula = curricula;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void insertarAlumno() throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException {
      AlumnoBD alum = new AlumnoBD(this);
        alum.insertaAlumnoBD();    
    }

    public void ModificarAlumno() throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException {
      AlumnoBD alum = new AlumnoBD(this);
        alum.modificarAlumnoBD();    
    }

    public void EliminarlogAlumno() throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException {
      AlumnoBD alum = new AlumnoBD(this);
        alum.EliminarlogAlumno();    
    }

    public ArrayList<Alumno> obtenerAlumnos()  throws ClassNotFoundException, 
                                                InstantiationException,
                                                IllegalAccessException,
                                                SQLException{
        
        AlumnoBD alum = new AlumnoBD();
        return alum.obtenerAlumnosBD();
    }

    public String obtenerNoAlumnos() throws ClassNotFoundException, 
                                                InstantiationException,
                                                IllegalAccessException,
                                                SQLException{
        
        AlumnoBD alum = new AlumnoBD();
        return alum.obtenerNoAlumnosBD();
    }

}


