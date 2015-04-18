/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import java.io.FileInputStream;
import java.util.Properties;
import javafx.scene.control.CheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * 
 */
public class Metodo {
 /**
 *
 * Inicia la conexion y carga los datos del archivo que contine la configuracion
 * de la base de datos
 * 
 */
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
    
 /**
 *Limpia le modelo de la la tabla de Alumnos
 * 
 */
        public void limpiar_tabla( DefaultTableModel modelo,JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);

        }
    }
 
 /**
 * Convertidor de tipo Booleano a Integer para los checkbox
 */
        public int Boolean_Int(boolean cxb){
        int val = (cxb)? 1 : 0;
        return val;
        }

  
        
}
