
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Java 2
 */
public class Parqueadero extends JPanel {

    JButton celdas;

    public Parqueadero(int fila, int columna) {

        int cont = 1;
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                celdas = new JButton();
                celdas.setText(cont + "");
                cont++;               
                celdas.setBackground(Color.CYAN);
                celdas.setBounds(i*50 , j*50 , 50, 50);
                this.add(celdas);
            }

        }
 
       
}
}