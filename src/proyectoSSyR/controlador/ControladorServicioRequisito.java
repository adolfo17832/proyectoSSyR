/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import java.sql.SQLException;
import proyectoSSyR.negocio.ServicioRequisito;




/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ControladorServicioRequisito {
     /**
     *Inserta los avances requeridos para finalizar el Servicio Social
     * 
     */
    public void addServicioRequisito(int id_Requisito, int reporte1, int reporte2, int reporte3, int reporteOtro, int planTrabajo, int terminacion, int trabajoFinal, int liberacion, String observacion) 
                              throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        ServicioRequisito objservicioRequisito = new ServicioRequisito(id_Requisito, reporte1, reporte2, reporte3, reporteOtro, planTrabajo, terminacion, trabajoFinal, liberacion, observacion);
                objservicioRequisito.insertarservicioRequisito();
    }
    
    
}
