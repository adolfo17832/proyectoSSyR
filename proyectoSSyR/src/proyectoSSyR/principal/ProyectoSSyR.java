/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.principal;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectoSSyR.controlador.ControladorAlumno;
import proyectoSSyR.db.AlumnoBD;
import proyectoSSyR.controlador.Metodo;

/**
 *
 * @author A Angel
 */
public class ProyectoSSyR {

 
 ControladorAlumno objcontAlumno=new ControladorAlumno();
    public static void main(String[] args) {
           ProyectoSSyR obj=new ProyectoSSyR();
           obj.insertar();
      }
        
    public void insertar (){
     try {
         Metodo objMetodo=new Metodo();
         objMetodo.ConexionBD();
         objcontAlumno.deletelogAlumno(1, 0);
        // objcontAlumno.updateAlumno(3, "Bonifacio", null, 8, 'V', null, null, null, null, null, 1);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(ProyectoSSyR.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
         Logger.getLogger(ProyectoSSyR.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
         Logger.getLogger(ProyectoSSyR.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(ProyectoSSyR.class.getName()).log(Level.SEVERE, null, ex);
     }

    }
                
                
    
 
}
