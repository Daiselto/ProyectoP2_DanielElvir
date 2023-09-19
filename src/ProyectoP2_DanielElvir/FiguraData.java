/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class FiguraData extends FiguraFlujo {
    Color color = new Color(235, 152, 10);
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    private int sizex, sizey, locx, locy;
    private Font fuente=null;
    public FiguraData() {
    }

    public FiguraData(Font fuente, int locx, int locy, int sizex, int sizey) {
        super(fuente, locx, locy, sizex, sizey);
        this.sizex = sizex;
        this.sizey = sizey;
        this.locx = locx;
        this.locy = locy;
        this.fuente = fuente;
        
        // Constructor: Configurar el panel y agregar componentes
        setLayout(null);
        setSize(260,60);
        setBackground(new Color(204,204,204));

        // Crear un JTextPane y agregarlo al centro del panel
        textArea = new JTextArea();
        textArea.setText("Aqui va el texto de instruccion");
        textArea.setBackground(Color.WHITE); // Establecer el fondo del JTextPane al color del panel
        textArea.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textArea.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textArea.getFont().getName(), Font.BOLD, textArea.getFont().getSize());
        textArea.setFont(boldFont);
        
        textArea.setBounds(40, (getHeight()/2)-10, 180, 20);

        
        add(textArea);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public int getSizex() {
        return sizex;
    }

    public void setSizex(int sizex) {
        this.sizex = sizex;
    }

    public int getSizey() {
        return sizey;
    }

    public void setSizey(int sizey) {
        this.sizey = sizey;
    }

    public int getLocx() {
        return locx;
    }

    public void setLocx(int locx) {
        this.locx = locx;
    }

    public int getLocy() {
        return locy;
    }

    public void setLocy(int locy) {
        this.locy = locy;
    }
    
    
    
    public void setColorBG(Color color) {
        this.color = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Crear un paralelogramo
        Path2D.Double parallelogram = new Path2D.Double();
        int slant = 50; // Ajusta el ángulo de inclinación del paralelogramo

        parallelogram.moveTo(0, 0);
        parallelogram.lineTo(width - slant, 0);
        parallelogram.lineTo(width, height);
        parallelogram.lineTo(slant, height);
        parallelogram.closePath();

        // Rellenar el paralelogramo con un color
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color); // Cambia el color como desees
        g2d.fill(parallelogram);
    }
}
