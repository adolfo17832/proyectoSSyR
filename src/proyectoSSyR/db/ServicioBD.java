/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.db;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import proyectoSSyR.negocio.Servicio;
import proyectoSSyR.servicio.ConectarServicio;
import proyectoSSyR.servicio.Conexion;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ServicioBD {
  private Servicio serv;
  
    
    public ServicioBD(){
    }
    
    public ServicioBD(Servicio serv) {
    this.serv= serv;   
    }
    
   public int insertaServicioBD()throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
       java.math.BigDecimal idColVar =null;
         Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
         cdb.un_sql = "insert into tbl_Servicio values("+serv.getId_servicio()+",'"+serv.getFechaInicio()+"','"+serv.getFechaTerminada()+"'"
                 + ","+serv.getConstancia()+","+serv.getPresentacion()+","+serv.getAcepTrabajo()+","+serv.getFotos()+","+serv.getSolicitud()+
                 ","+serv.getCompromiso()+","+serv.getNumcontrol()+","+serv.getId_empresa()+");";
                 
           cdb.ps.executeUpdate(cdb.un_sql,Statement.RETURN_GENERATED_KEYS);            
        cdb.resultado = cdb.ps.getGeneratedKeys();         // Recupera los valores        2 
                                                           //generados automáticamente en un ResultSet.
                                                           //Se devuelve una sola fila.
                                                           //Crear ResultSet para consulta
        while ( cdb.resultado.next()) {
           idColVar =  cdb.resultado.getBigDecimal(1);     
                                      // Obtener valor de clave generada 
                                      // automáticamente
  System.out.println("valor de clave generada automáticamente = " + idColVar);
                                      
          
        }
        return idColVar.intValue();
   }

    public int ultimoRegistroBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
         Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{select * from ultimo_Insert;}";
      
            int respuesta = 0;
            while (cdb.resultado.next()) {respuesta = cdb.resultado.getInt(1);} 
            cdb.ps.executeUpdate();   
    return respuesta;
    }
    
}