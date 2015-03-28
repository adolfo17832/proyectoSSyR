/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.negocio;

import java.sql.SQLException;
import proyectoSSyR.db.UsuarioBD;


/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class Usuario {
    private String usuario;
    private String nombre;
    private String cargo;
    private String password;

   public Usuario(){}
   
   public Usuario(String usuario, String nombre, String cargo, String password){
   this.usuario=usuario;
   this.nombre=nombre;
   this.cargo=cargo;
   this.password=password;
   }
   
    public Usuario(String usuario, String password){
   this.usuario=usuario;
   this.password=password;
   }
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public void insertarAlumno() throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException {
      UsuarioBD usu = new UsuarioBD(this);
        usu.insertaUsuarioBD();    
    }

    public int sesionUsuario() throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException {
      UsuarioBD usu = new UsuarioBD(this);
        return usu.sesionUsuarioBD();    
    }
}
