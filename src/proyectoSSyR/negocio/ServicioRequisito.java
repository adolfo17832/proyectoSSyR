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
   private int id_Requisito;
    private int reporte1;
    private int reporte2;
    private int reporte3;
    private int reporteOtro;
    private int planTrabajo;
    private int terminacion;
    private int trabajoFinal;
    private int liberacion;
    private String observacion;

    public ServicioRequisito() {
    }

    public ServicioRequisito(int id_Requisito, int reporte1, int reporte2, int reporte3, int reporteOtro, int planTrabajo, int terminacion, int trabajoFinal, int liberacion, String observacion) {
        this.id_Requisito = id_Requisito;
        this.reporte1 = reporte1;
        this.reporte2 = reporte2;
        this.reporte3 = reporte3;
        this.reporteOtro = reporteOtro;
        this.planTrabajo = planTrabajo;
        this.terminacion = terminacion;
        this.trabajoFinal = trabajoFinal;
        this.liberacion = liberacion;
        this.observacion = observacion;
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
     * @return the reporte1
     */
    public int getReporte1() {
        return reporte1;
    }

    /**
     * @param reporte1 the reporte1 to set
     */
    public void setReporte1(int reporte1) {
        this.reporte1 = reporte1;
    }

    /**
     * @return the reporte2
     */
    public int getReporte2() {
        return reporte2;
    }

    /**
     * @param reporte2 the reporte2 to set
     */
    public void setReporte2(int reporte2) {
        this.reporte2 = reporte2;
    }

    /**
     * @return the reporte3
     */
    public int getReporte3() {
        return reporte3;
    }

    /**
     * @param reporte3 the reporte3 to set
     */
    public void setReporte3(int reporte3) {
        this.reporte3 = reporte3;
    }

    /**
     * @return the reporteOtro
     */
    public int getReporteOtro() {
        return reporteOtro;
    }

    /**
     * @param reporteOtro the reporteOtro to set
     */
    public void setReporteOtro(int reporteOtro) {
        this.reporteOtro = reporteOtro;
    }

    /**
     * @return the planTrabajo
     */
    public int getPlanTrabajo() {
        return planTrabajo;
    }

    /**
     * @param planTrabajo the planTrabajo to set
     */
    public void setPlanTrabajo(int planTrabajo) {
        this.planTrabajo = planTrabajo;
    }

    /**
     * @return the terminacion
     */
    public int getTerminacion() {
        return terminacion;
    }

    /**
     * @param terminacion the terminacion to set
     */
    public void setTerminacion(int terminacion) {
        this.terminacion = terminacion;
    }

    /**
     * @return the trabajoFinal
     */
    public int getTrabajoFinal() {
        return trabajoFinal;
    }

    /**
     * @param trabajoFinal the trabajoFinal to set
     */
    public void setTrabajoFinal(int trabajoFinal) {
        this.trabajoFinal = trabajoFinal;
    }

    /**
     * @return the liberacion
     */
    public int getLiberacion() {
        return liberacion;
    }

    /**
     * @param liberacion the liberacion to set
     */
    public void setLiberacion(int liberacion) {
        this.liberacion = liberacion;
    }

    /**
     * @return the observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * @param observacion the observacion to set
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void insertarservicioRequisito()throws ClassNotFoundException,
                                   InstantiationException,
                                   IllegalAccessException,
                                   SQLException {
      ServicioRequisitoBD ssrequisito = new ServicioRequisitoBD(this);
        ssrequisito .insertaservicioRequisitoBD();    
       }
}
