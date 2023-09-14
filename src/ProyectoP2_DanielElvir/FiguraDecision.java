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
public class FiguraDecision extends FiguraFlujo {

    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    private int sizex, sizey, locx, locy;
    Color color = new Color(223, 0, 111);
    private Font fuente = null;

    public FiguraDecision() {
    }

    public FiguraDecision(Font fuente, int locx, int locy, int sizex, int sizey, JPanel MesaUML) {
        super(fuente, locx, locy, sizex, sizey, MesaUML);
        this.sizex = sizex;
        this.sizey = sizey;
        this.locx = locx;
        this.locy = locy;
        this.fuente = fuente;
        
        setLayout(null);
        setBackground(Color.WHITE);
        setSize(sizex, sizey);
        setLocation(locx / 2, locy / 2);

        textField.setPreferredSize(new Dimension(20, 20));
        add(textField);

        textArea.setPreferredSize(new Dimension(getWidth() - 10, 20));
        add(textArea);
        
        repaint();
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        int x = getWidth()/2;
        int y = getHeight()/2;
        int w = 200;
        int h = 110;
        
        int[] xPoints = {x, x+w/2, x, x-w/2};
        int[] yPoints = {y-h/2, y, y+h/2, y};
        
        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 4);
    }

}
