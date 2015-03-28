/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.servicio;
import proyectoSSyR.controlador.Metodo;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class InstanciaMetodo extends Metodo{
       protected InstanciaMetodo() {
    }
     // Clase estatica oculta. Tan solo se instanciara el singleton una vez
   private static class Metodos { 
  // El constructor de Singleton puede ser llamado desde aquí al ser protected
     private final static InstanciaMetodo INSTANCE = new InstanciaMetodo();
   }
   // Método para obtener la instancia de nuestra clase
   public static InstanciaMetodo getInstance() {
     return Metodos.INSTANCE;
   } 
}
