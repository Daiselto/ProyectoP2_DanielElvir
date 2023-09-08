/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class ClaseHeredada extends ClaseNormal {
    
    private JPanel extend = new JPanel();
    private JLabel nomExtends = new JLabel();
    
    
    public ClaseHeredada(Font fuente, int locx, int locy, String label) {
        super(fuente, locx, locy, label);
        
    }

    public ClaseHeredada() {
    }
    
    
}
