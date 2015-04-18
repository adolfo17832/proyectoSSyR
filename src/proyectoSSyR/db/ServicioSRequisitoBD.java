/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.db;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import proyectoSSyR.negocio.ServicioSRequisito;
import proyectoSSyR.servicio.ConectarServicio;
import proyectoSSyR.servicio.Conexion;

/**
 *
 * @author adolfoangelliboriobonifacio
 */
public class ServicioSRequisitoBD {
     private ServicioSRequisito ssrequisito;

    public ServicioSRequisitoBD() {
    }

    public ServicioSRequisitoBD(ServicioSRequisito ssrequisito) {
        this.ssrequisito = ssrequisito;
    }

    public void insertaservicioSRequisitoBD()throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
            Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = "{call add_RelacionSR (?,?,?,?,?)}";
            cdb.ps = cdb.conexion.prepareStatement(cdb.un_sql);            
            cdb.ps.setInt(1,ssrequisito.getId_ServicoRequisito());
            cdb.ps.setInt(2, ssrequisito.getNumcontrol());
            cdb.ps.setInt(3, ssrequisito.getId_Servicio());
            cdb.ps.setInt(4, ssrequisito.getId_Requisito());
            cdb.ps.setInt(5, ssrequisito.getEstado()); 
           
            cdb.resultado = cdb.ps.executeQuery();
//           String respuesta = "";
//            while (cdb.resultado.next()) {respuesta = cdb.resultado.getString(1).toString();} 
//            cdb.ps.executeUpdate();            
//            if (respuesta.equals("1")) {
            showMessageDialog(null,"SERVICIO SOCIAL se inserto correctamente", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
//        }
    }

    public ArrayList<ServicioSRequisito> AlumnosServicioBD() throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            SQLException {
           ArrayList<ServicioSRequisito> servicio = new ArrayList<ServicioSRequisito>();  
        Conexion cdb = ConectarServicio.getInstancia().getConexionDB();
            cdb.un_sql = " select *from RelacionServicioAlumnos;";
          cdb.resultado = cdb.us_st.executeQuery(cdb.un_sql);
        if (cdb.resultado != null) {
            while (cdb.resultado.next()) {
                ssrequisito = new ServicioSRequisito();
                ssrequisito.setNumcontrol(cdb.resultado.getInt(1));
                ssrequisito.setNombreCompleto(cdb.resultado.getString(2)+" "+cdb.resultado.getString(3));
                ssrequisito.setCarrera(cdb.resultado.getString(4));
                
        
               servicio.add(ssrequisito);
            }
        }

        return servicio;
    }
     
     
}
