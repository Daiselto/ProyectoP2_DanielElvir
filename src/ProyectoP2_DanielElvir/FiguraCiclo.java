/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class FiguraCiclo extends FiguraFlujo{
   private Color color = new Color(255, 119, 171); // Color predeterminado
    private JTextArea textA;
    private JTextField num_proceso;
    
    public FiguraCiclo(Font fuente, int locx, int locy, int sizex, int sizey){
        super(fuente, locx, locy, sizex, sizey);
        
        setLayout(null);
        setSize(180,100);
        setBackground(new Color(204,204,204));
        
        
 
        textA = new JTextArea();
        textA.setText("Ingrese la instruccion aqui");
        textA.setBackground(Color.GRAY); // Establecer el fondo del JTextPane al color del panel
        textA.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textA.setBorder(null); // Eliminar el borde del JTextPane
        
        
        Font boldFont = new Font(textA.getFont().getName(), Font.BOLD, textA.getFont().getSize());
        textA.setFont(boldFont);
        
        textA.setBounds(40, (getHeight()/2)-10, 100, 20);

        
        add(textA);
        
        
    }
    
    public void setColorBG(Color color) {
        this.color = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Crear una elipse
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, width, height);

        // Rellenar la elipse con un color
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color); // Cambia el color como desees
        g2d.fill(ellipse);
    } 
}
