/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import java.sql.SQLException;
import proyectoSSyR.negocio.Usuario;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ControladorUsuario {
   
     /**
     *Inserta alumnos ala base de datos
     * 
     */
    public void addUsario(String usuario, String nombre, String cargo, String password)
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        Usuario objUsuario = new Usuario(usuario, nombre, cargo, password);
        objUsuario.insertarAlumno();
    }
    
     /**
     *Inicio de sesion de usuario 
     * 
     */
    public int sessionUsuario(String usuario, String password)
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        Usuario objUsuario = new Usuario(usuario, password);
        return objUsuario.sesionUsuario();
    }
    
}
