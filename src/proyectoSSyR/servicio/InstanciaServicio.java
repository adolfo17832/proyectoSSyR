/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.servicio;

import proyectoSSyR.controlador.ControladorServicio;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class InstanciaServicio extends ControladorServicio{
     protected InstanciaServicio() {
    }
     // Clase estatica oculta. Tan solo se instanciara el singleton una vez
   private static class ControladorServicio { 
  // El constructor de Singleton puede ser llamado desde aquí al ser protected
     private final static InstanciaServicio INSTANCE = new InstanciaServicio();
   }
   // Método para obtener la instancia de nuestra clase
   public static InstanciaServicio getInstance() {
     return ControladorServicio.INSTANCE;
   }  
   
}
