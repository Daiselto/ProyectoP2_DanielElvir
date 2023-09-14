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

    public FiguraProceso() {
        super();
    }

    public FiguraProceso(Font fuente, int locx, int locy, int sizex, int sizey, JPanel MesaUML) {
        super(fuente, locx, locy, sizex, sizey, MesaUML);
        this.sizex=sizex;
        this.sizey=sizey;
        this.locx=locx;
        this.locy=locy;
        this.fuente=fuente;
        setBackground(new Color(33, 157, 229));
        setSize(new Dimension(200, 100));
        setLocation(locx / 2, locy / 2);    

        textField.setPreferredSize(new Dimension(20, 20));
        textField.setLocation(0, 0);
        add(textField);

        textArea.setPreferredSize(new Dimension(getWidth() - 20, 50));
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

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(33, 157, 229));
        g.fillRect(0, 0, 100, 60);
    }
}
