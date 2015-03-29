/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;


/**
 *
 * @author A Angel
 */
public class Metodo {
    public void ConexionBD(){
        try {
            FileInputStream fis = new FileInputStream("src/proyectoSSyR/principal/configurardb.txt");
            Properties prop = new Properties(System.getProperties());
            prop.load(fis);
            System.setProperties(prop);
            if (System.getProperties().getProperty("mostrarproperties").compareTo("si") == 0) {
                // System.getProperties().list(System.out);
            }
        } catch (java.io.FileNotFoundException ex) {
            JOptionPane.showInputDialog(null, "no se encuentra el archivo de configuracion " + ex);
            System.exit(-1);
        } catch (java.io.IOException e) {
            JOptionPane.showInputDialog(null, "ocurrio un error de I/O " + e);
            
        }
    
    }
}
