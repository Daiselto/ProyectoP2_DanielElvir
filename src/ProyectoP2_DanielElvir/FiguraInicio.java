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
public class FiguraInicio extends FiguraFlujo{
    Color color = new Color(223, 0, 111);
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    private int sizex, sizey, locx, locy;
    
    private Font fuente = null;

    public FiguraInicio() {
    }

    public FiguraInicio(Font fuente, int locx, int locy, int sizex, int sizey, JPanel MesaUML) {
        super(fuente, locx, locy, sizex, sizey, MesaUML);
        this.sizex = sizex;
        this.sizey = sizey;
        this.locx = locx;
        this.locy = locy;
        this.fuente = fuente;
        
        setLayout(null);
        setBackground(new Color(223, 0, 111));
        setSize(sizex, sizey);
        setLocation(locx / 2, locy / 2);

        textField.setPreferredSize(new Dimension(20, 20));
        add(textField);

        textArea.setPreferredSize(new Dimension(getWidth() - 10, 20));
        add(textArea);
        
        repaint();
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
    
    
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = 20;
        int y = 0;
        int w = getWidth()-70;
        int h = getHeight();
        
        
        
        g.setColor(color);
        g.fillRect(x, y, w+30, h);
        g.fillArc(0, 0, h, h, 90, 180);
        g.fillArc(w+30, 0, h, h, 270, 180);
    }
}
