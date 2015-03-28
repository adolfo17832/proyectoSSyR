/*

* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoSSyR.servicio;
import java.sql.*;
/**
 *
 * @author skangel
 */
public class Conexion_mySQL extends Conexion{
    
    
    private String opciones;
    
    
    public Conexion_mySQL()throws java.lang.ClassNotFoundException,
                             java.lang.InstantiationException,
                             java.lang.IllegalAccessException,
                             java.sql.SQLException {
opciones = System.getProperty("options");
iniciardb();

} 


    
public void iniciardb()throws java.lang.ClassNotFoundException,
                             java.lang.InstantiationException,
                             java.lang.IllegalAccessException,
                             java.sql.SQLException {
    s_conexion=jdbc+host+"/"+database+"?";
   // s_conexion=jdbc+"/"+database+"?";
   //s_conexion = "jdbc:mysql://localhost/madrugador?";
    Class.forName(driver).newInstance();
    conexion=DriverManager.getConnection(s_conexion,username,password);
    dbmt=conexion.getMetaData();
    us_st=conexion.createStatement();
    
    }

}
