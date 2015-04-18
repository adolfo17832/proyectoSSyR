/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSSyR.controlador;

import javax.swing.JProgressBar;

/**
 *
 * @author robert
 */
public class Hilo extends Thread {

    private int num = 0;
    private JProgressBar Barra;

    public Hilo(JProgressBar Barra) {
           this.Barra = Barra;
    }

    private void llenarBarra() {

        if (Barra.getValue() <= 100) {
            num += 3;
            Barra.setValue(num);
            Barra.setStringPainted(true);
        } else {
            Barra.setValue(0);
        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(120);
                llenarBarra();
            } catch (InterruptedException ex) {
            }
        }
    }
}