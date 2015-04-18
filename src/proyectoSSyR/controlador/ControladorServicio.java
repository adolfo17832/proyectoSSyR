/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import java.sql.SQLException;
import proyectoSSyR.negocio.Servicio;


/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ControladorServicio {
 /**
 *Inserta a un alumno la documentacion y el la empresa donde realizara su Servicio Social
 */
    public int addServicio(int id_servicio,int constancia,int presentacion,int acepTrabajo,int fotos,int solicitud,int compromiso,String fechaInicio, String fechaTerminada,int numcontrol,int id_empresa)
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        Servicio objServicio = new Servicio(id_servicio, constancia, presentacion, acepTrabajo, fotos, solicitud, compromiso, fechaInicio, fechaTerminada,numcontrol,id_empresa);
        return objServicio.insertarServicio();
    }
    
 /**
 *
 * Retorna el valor del insert
 */
    public int LastInsert()
                               throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
       Servicio objServicio = new Servicio();
        return objServicio.ultimoRegistro();
    }
    
}
