/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marriage_calculator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Prabesh
 */
public class Marriage_calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String playernum = JOptionPane.showInputDialog("Enter the number of players");
        marriage_gui app = new marriage_gui(Integer.parseInt(playernum));
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(540,300);
        app.setVisible(true);
    }
}
