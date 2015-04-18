/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.servicio;

import proyectoSSyR.controlador.ControladorAlumno;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class InstanciaAlumno extends ControladorAlumno{
     protected InstanciaAlumno() {
    }
     // Clase estatica oculta. Tan solo se instanciara el singleton una vez
   private static class ControladorAlumno { 
  // El constructor de Singleton puede ser llamado desde aquí al ser protected
     private final static InstanciaAlumno INSTANCE = new InstanciaAlumno();
   }
   // Método para obtener la instancia de nuestra clase
   public static InstanciaAlumno getInstance() {
     return ControladorAlumno.INSTANCE;
   }  
   
}
