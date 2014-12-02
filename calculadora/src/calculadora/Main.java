/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// esto es para  que te visualizara el otro formulario esto funciona cuando tienes 2 formularios
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new vista().setVisible(true);
            }
        });
        // TODO code application logic here
    }

}
