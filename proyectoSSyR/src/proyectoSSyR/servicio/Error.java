/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoSSyR.servicio;

/**
 *
 * @author skangel
 */
public class Error extends Exception{
    
    private int codigo;
    private String mensaje;
    
    public Error(int codigo,String Mensage){
    this.codigo=codigo;
    this.mensaje=mensaje;
    }
    
    public int codigo(){return codigo;}
    public String mensaje(){return mensaje;}
    
    
}
