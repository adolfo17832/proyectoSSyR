/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import com.sun.awt.AWTUtilities;
import javax.swing.JFrame;

/**
 *
 * @author robert
 */
public class Trasparencia {

    public void TransCompFrame(JFrame frm) {
        frm.setUndecorated(true);
        AWTUtilities.setWindowOpaque(frm, false);
    }
}
