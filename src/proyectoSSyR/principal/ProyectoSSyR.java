/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.principal;


import proyectoSSyR.ui.SplashScream;

/**
 *
 * @author A Angel
 */
public class ProyectoSSyR {
   public static void main(String args[]) {
       new Thread(new SplashScream()).start(); 
    }
                        
   
}
