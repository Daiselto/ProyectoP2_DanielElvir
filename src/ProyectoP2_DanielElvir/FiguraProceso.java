/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class FiguraProceso extends FiguraFlujo {

    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    private int sizex, sizey, locx, locy;
    private Font fuente = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
    Color color = new Color(33, 157, 229);

    public FiguraProceso() {
        super();
    }

    public FiguraProceso(Font fuente, int locx, int locy, int sizex, int sizey) {
        super(fuente, locx, locy, sizex, sizey);
        this.sizex=sizex;
        this.sizey=sizey;
        this.locx=locx;
        this.locy=locy;
        this.fuente=fuente;
        setLayout(null);
        setSize(200,60);
        setBackground(color);
        
        textArea = new JTextArea();
        textArea.setText("Aqui va el texto de instruccion");
        textArea.setBackground(Color.WHITE); // Establecer el fondo del JTextPane al color del panel
        textArea.setForeground(Color.BLACK); // Establecer el color del texto en blanco
        textArea.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textArea.getFont().getName(), Font.BOLD, textArea.getFont().getSize());
        textArea.setFont(boldFont);
        
        textArea.setBounds(20, (getHeight()/2)-10, 160, 20);

        
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

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }
    
    public void setColorBG(Color color) {
        this.color = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
       
}
