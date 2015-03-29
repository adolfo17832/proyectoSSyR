/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoSSyR.servicio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class ConectarServicio {
    
    private  Conexion cdb;
    private  static ConectarServicio instancia;

        
    public static synchronized ConectarServicio getInstancia(){ 
    if(instancia ==null){
    instancia=new ConectarServicio();
    }
    return instancia;

    }
    
    
  public Conexion getConexionDB() throws ClassNotFoundException, 
                                         InstantiationException,
                                         IllegalAccessException
  {
    if(cdb==null){
      
          String nombreClase=System.getProperty("databaseclass");
          cdb=(Conexion)Class.forName(nombreClase).newInstance();
         
      
  }
  return cdb;
  }
}
