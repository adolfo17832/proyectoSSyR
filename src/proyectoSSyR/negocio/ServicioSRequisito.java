/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import proyectoSSyR.db.ServicioSRequisitoBD;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ServicioSRequisito {
    private int id_ServicoRequisito;
    private int numcontrol;
    private int id_Servicio;
    private int id_Requisito;
    private int estado;
    
    private String nombreCompleto;
    private String carrera;
    

    public ServicioSRequisito() {
    }

    public ServicioSRequisito(int id_ServicoRequisito, int numcontrol, int id_Servicio, int id_Requisito, int estado) {
        this.id_ServicoRequisito = id_ServicoRequisito;
        this.numcontrol = numcontrol;
        this.id_Servicio = id_Servicio;
        this.id_Requisito = id_Requisito;
        this.estado = estado;
    }

    
    
    
    /**
     * @return the id_ServicoRequisito
     */
    public int getId_ServicoRequisito() {
        return id_ServicoRequisito;
    }

    /**
     * @param id_ServicoRequisito the id_ServicoRequisito to set
     */
    public void setId_ServicoRequisito(int id_ServicoRequisito) {
        this.id_ServicoRequisito = id_ServicoRequisito;
    }

    /**
     * @return the numcontrol
     */
    public int getNumcontrol() {
        return numcontrol;
    }

    /**
     * @param numcontrol the numcontrol to set
     */
    public void setNumcontrol(int numcontrol) {
        this.numcontrol = numcontrol;
    }

    /**
     * @return the id_Servicio
     */
    public int getId_Servicio() {
        return id_Servicio;
    }

    /**
     * @param id_Servicio the id_Servicio to set
     */
    public void setId_Servicio(int id_Servicio) {
        this.id_Servicio = id_Servicio;
    }

    /**
     * @return the id_Requisito
     */
    public int getId_Requisito() {
        return id_Requisito;
    }

    /**
     * @param id_Requisito the id_Requisito to set
     */
    public void setId_Requisito(int id_Requisito) {
        this.id_Requisito = id_Requisito;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void insertarservicioSRequisito() 
                                        throws ClassNotFoundException, 
                                                InstantiationException,
                                                IllegalAccessException,
                                                SQLException{  
     ServicioSRequisitoBD ssrequisito = new ServicioSRequisitoBD(this);
        ssrequisito .insertaservicioSRequisitoBD();    
    }

    public ArrayList<ServicioSRequisito> AlumnosServicio() throws ClassNotFoundException, 
                                                InstantiationException,
                                                IllegalAccessException,
                                                SQLException{
        
         ServicioSRequisitoBD ssrequisito = new  ServicioSRequisitoBD();
        return ssrequisito.AlumnosServicioBD();
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
