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
    
    public void addServicio(int id_servicio,int constancia,int presentacion,int acepTrabajo,int fotos,int solicitud,int compromiso,String fechaInicio, String fechaTerminada)
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        ServicioRequisito objservicioRequisito = new ServicioRequisito(id_servicio, constancia, presentacion, acepTrabajo, fotos, solicitud, compromiso, fechaInicio, fechaTerminada);
        objservicioRequisito.insertarservicioRequisito();
    }
    
}
