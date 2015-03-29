/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.db;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyectoSSyR.negocio.Usuario;
import proyectoSSyR.servicio.ConectarServicio;
import proyectoSSyR.servicio.Conexion;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class UsuarioBD {
    private Usuario usu; 
    
    public UsuarioBD(){
    }
    
    public UsuarioBD(Usuario usu) {
    this.usu=usu;   
    }

    public void insertaUsuarioBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{call add_Usuario(?,?,?,?)}";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setString(1,usu.getUsuario());
            cdb.ps.setString(2,usu.getNombre());
            cdb.ps.setString(3,usu.getCargo());
            cdb.ps.setString(4, usu.getPassword());
          
            cdb.resultado = cdb.ps.executeQuery();
            String respuesta = "";
            while (cdb.resultado.next()) {respuesta = cdb.resultado.getString(1).toString();} 
            cdb.ps.executeUpdate();            
            if (respuesta.equals("0")) {
            showMessageDialog(null,"Bienvenido", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }else{
             showMessageDialog(null, "No pudo inciar sesion", "Error", JOptionPane.ERROR_MESSAGE);
            }    
    }

    public int sesionUsuarioBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{call sesion(?,?)}";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setString(1,usu.getUsuario());
            cdb.ps.setString(2, usu.getPassword());          
            cdb.resultado = cdb.ps.executeQuery();
            String respuesta = "";
            while (cdb.resultado.next()) {respuesta = cdb.resultado.getString(1).toString();} 
            cdb.ps.executeUpdate();            
            if (respuesta.equals("1")) {
            showMessageDialog(null,"Bienvenido", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }else{
             showMessageDialog(null, "No pudo inciar sesion", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            
            return Integer.parseInt(respuesta);
    
    }
    
    
}
