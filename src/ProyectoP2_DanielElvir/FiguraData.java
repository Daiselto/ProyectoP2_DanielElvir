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
public class FiguraData extends FiguraFlujo {
    Color color = new Color(235, 152, 10);
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    private int sizex, sizey, locx, locy;
    private Font fuente=null;
    public FiguraData() {
    }

    public FiguraData(Font fuente, int locx, int locy, int sizex, int sizey, JPanel MesaUML) {
        super(fuente, locx, locy, sizex, sizey, MesaUML);
        this.sizex = sizex;
        this.sizey = sizey;
        this.locx = locx;
        this.locy = locy;
        this.fuente = fuente;
        
        setLayout(null);
        setBackground(new Color(235, 152, 10));
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
    
    
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = getWidth()/2-50;
        int y = getHeight()/2-35;
        int w = 100;
        int h = 70;
        int inclinacion = 30;
        
        g.setColor(color);
        
        int[] xPoints = {x+inclinacion-20, x+w+inclinacion-20, x+w-20, x-20};
        int[] yPoints = {y, y, y+h, y+h};
        
        
        g.fillPolygon(xPoints, yPoints, 4);
    }
}
