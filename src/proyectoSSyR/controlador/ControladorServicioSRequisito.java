/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoSSyR.negocio.ServicioSRequisito;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ControladorServicioSRequisito {
     /**
     *Inserta la relacion de servicio a los requisitos del servicio 
     * 
     */
    public void addServicioSRequisito(int id_ServicoRequisito, int numcontrol, int id_Servicio, int id_Requisito, int estado)
                              throws ClassNotFoundException, 
                               InstantiationException, 
                               IllegalAccessException, 
                               SQLException
    {
        
        ServicioSRequisito objservicioRequisito = new ServicioSRequisito(id_ServicoRequisito, numcontrol, id_Servicio, id_Requisito, estado);
                objservicioRequisito.insertarservicioSRequisito();
    }
    
    
     /**
     *Agergar la tabla los alumnos que estan realizando servio Social 
     * 
     */
    
       public ArrayList<ServicioSRequisito> AlumnosServicio()  throws ClassNotFoundException, 
                                                InstantiationException,
                                                IllegalAccessException,
                                                SQLException{
        ServicioSRequisito objservicioRequisito = new ServicioSRequisito(); 
        return objservicioRequisito.AlumnosServicio();
    }
}
