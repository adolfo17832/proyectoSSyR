/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.servicio;
import proyectoSSyR.controlador.ControladorServicioRequisito;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class InstanciaServicioRequisito extends ControladorServicioRequisito{
     protected InstanciaServicioRequisito() {
    }
     // Clase estatica oculta. Tan solo se instanciara el singleton una vez
   private static class ControladorServicioRequisito { 
  // El constructor de Singleton puede ser llamado desde aquí al ser protected
     private final static InstanciaServicioRequisito INSTANCE = new InstanciaServicioRequisito();
   }
   // Método para obtener la instancia de nuestra clase
   public static InstanciaServicioRequisito getInstance() {
     return ControladorServicioRequisito.INSTANCE;
   }  
   
}
