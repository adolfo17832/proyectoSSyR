/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.servicio;
import proyectoSSyR.controlador.ControladorServicioSRequisito;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class InstanciaServicioSRequisito extends ControladorServicioSRequisito{
     protected InstanciaServicioSRequisito() {
    }
     // Clase estatica oculta. Tan solo se instanciara el singleton una vez
   private static class ControladorServicioSRequisito { 
  // El constructor de Singleton puede ser llamado desde aquí al ser protected
     private final static InstanciaServicioSRequisito INSTANCE = new InstanciaServicioSRequisito();
   }
   // Método para obtener la instancia de nuestra clase
   public static InstanciaServicioSRequisito getInstance() {
     return ControladorServicioSRequisito.INSTANCE;
   }  
   
}
