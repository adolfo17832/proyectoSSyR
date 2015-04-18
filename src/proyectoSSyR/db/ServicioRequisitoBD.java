/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.db;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import proyectoSSyR.negocio.ServicioRequisito;
import proyectoSSyR.servicio.ConectarServicio;
import proyectoSSyR.servicio.Conexion;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ServicioRequisitoBD {
    private ServicioRequisito ssrequisito;
  
    
    public  ServicioRequisitoBD(){
    }
    
    public  ServicioRequisitoBD(ServicioRequisito ssrequisito) {
    this.ssrequisito= ssrequisito;   
    }

    public void insertaservicioRequisitoBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
            Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{call add_ServicioRequisito(?,?,?,?,?,?,?,?,?,?)}";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setInt(1,ssrequisito.getId_Requisito());
            cdb.ps.setInt(2, ssrequisito.getReporte1());
            cdb.ps.setInt(3, ssrequisito.getReporte2());
            cdb.ps.setInt(4, ssrequisito.getReporte3());
            cdb.ps.setInt(5, ssrequisito.getReporteOtro());
            cdb.ps.setInt(6, ssrequisito.getPlanTrabajo());
            cdb.ps.setInt(7, ssrequisito.getTerminacion());
            cdb.ps.setInt(8, ssrequisito.getTrabajoFinal());
            cdb.ps.setInt(9, ssrequisito.getLiberacion());
            cdb.ps.setString(10, ssrequisito.getObservacion());
            cdb.resultado = cdb.ps.executeQuery();
            String respuesta = "";
//            while (cdb.resultado.next()) {respuesta = cdb.resultado.getString(1).toString();} 
//            cdb.ps.executeUpdate();            
//            if (respuesta.equals("1")) {
            showMessageDialog(null,"SERVICIO SOCIAL se inserto correctamente", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
//        }
    }
    
    
    
}
