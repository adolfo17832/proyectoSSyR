/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.negocio;


import java.sql.SQLException;
import proyectoSSyR.db.ServicioRequisitoBD;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ServicioRequisito {
    private int id_servicio;
    private int constancia;
    private int presentacion;
    private int acepTrabajo;
    private int fotos;
    private int solicitud;
    private int compromiso;
    private String fechaInicio;
    private String fechaTerminada;

    public ServicioRequisito(){
    }
    public ServicioRequisito(int id_servicio,int constancia,int presentacion,int acepTrabajo,int fotos,int solicitud,int compromiso,String fechaInicio, String fechaTerminada){
        this.id_servicio = id_servicio;
        this.constancia = constancia;
        this.presentacion = presentacion;
        this.acepTrabajo = acepTrabajo;
        this.fotos = fotos;
        this.solicitud = solicitud;
        this.compromiso = compromiso;
        this.fechaInicio = fechaInicio;
        this.fechaTerminada = fechaTerminada;

    }
    /**
     * @return the id_servicio
     */
    public int getId_servicio() {
        return id_servicio;
    }

    /**
     * @param id_servicio the id_servicio to set
     */
    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    /**
     * @return the constancia
     */
    public int getConstancia() {
        return constancia;
    }

    /**
     * @param constancia the constancia to set
     */
    public void setConstancia(int constancia) {
        this.constancia = constancia;
    }

    /**
     * @return the presentacion
     */
    public int getPresentacion() {
        return presentacion;
    }

    /**
     * @param presentacion the presentacion to set
     */
    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * @return the acepTrabajo
     */
    public int getAcepTrabajo() {
        return acepTrabajo;
    }

    /**
     * @param acepTrabajo the acepTrabajo to set
     */
    public void setAcepTrabajo(int acepTrabajo) {
        this.acepTrabajo = acepTrabajo;
    }

    /**
     * @return the fotos
     */
    public int getFotos() {
        return fotos;
    }

    /**
     * @param fotos the fotos to set
     */
    public void setFotos(int fotos) {
        this.fotos = fotos;
    }

    /**
     * @return the solicitud
     */
    public int getSolicitud() {
        return solicitud;
    }

    /**
     * @param solicitud the solicitud to set
     */
    public void setSolicitud(int solicitud) {
        this.solicitud = solicitud;
    }

    /**
     * @return the compromiso
     */
    public int getCompromiso() {
        return compromiso;
    }

    /**
     * @param compromiso the compromiso to set
     */
    public void setCompromiso(int compromiso) {
        this.compromiso = compromiso;
    }

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaTerminada
     */
    public String getFechaTerminada() {
        return fechaTerminada;
    }

    /**
     * @param fechaTerminada the fechaTerminada to set
     */
    public void setFechaTerminada(String fechaTerminada) {
        this.fechaTerminada = fechaTerminada;
    }

    public void insertarservicioRequisito() throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException {
      ServicioRequisitoBD ssrequisito = new ServicioRequisitoBD(this);
        ssrequisito .insertaservicioRequisitoBD();    
       }
    
}
