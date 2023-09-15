/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author HP
 */
public class Interfaz extends FiguraClase{
    protected int sizex, sizey, locx, locy;
    protected JLabel newLabel = new JLabel();
    protected JLabel nomMetodo = new JLabel();
    protected Font fuente;
    protected JPanel titulo = new JPanel();
    protected JPanel metodo = new JPanel();
    protected JTextPane textPane = new JTextPane();
    protected JScrollPane scroll = new JScrollPane(textPane);
    protected String label;
    
    public Interfaz(Font fuente, int locx, int locy, String label, JPanel MesaUML) {
        super(fuente, locx, locy, label, MesaUML);
        this.label = label;
        setBackground(new Color(100, 149, 237));
        setSize(200, 150);
        setLocation(locx / 2, locy / 2);

        titulo.setBackground(new Color(100, 149, 237));
        titulo.setPreferredSize(new Dimension(getWidth(), 20));

        newLabel.setText(label);
        titulo.add(newLabel);
        add(titulo);

        metodo.setBackground(new Color(100, 149, 237));
        metodo.setPreferredSize(new Dimension(getWidth(), 25));

        nomMetodo.setText("Metodos");
        metodo.add(nomMetodo);
        add(metodo);

        scroll.setPreferredSize(new Dimension(getWidth() - 20, 40));
        //textPane.setPreferredSize(new Dimension(getWidth() - 10, 20));        
        scroll.setForeground(new Color(175, 175, 175));       
        add(scroll);

        
        setLabel(label);
    }

    public Interfaz(String label) {
        setLabel(label);
    }

    public Interfaz() {
        super();
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

    public JLabel getNewLabel() {
        return newLabel;
    }

    public void setNewLabel(JLabel newLabel) {
        this.newLabel = newLabel;
    }
 

    public JLabel getNomMetodo() {
        return nomMetodo;
    }

    public void setNomMetodo(JLabel nomMetodo) {
        this.nomMetodo = nomMetodo;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public JPanel getTitulo() {
        return titulo;
    }

    public void setTitulo(JPanel titulo) {
        this.titulo = titulo;
    }    

    public JPanel getMetodo() {
        return metodo;
    }

    public void setMetodo(JPanel metodo) {
        this.metodo = metodo;
    }

    public JTextPane getTextPane() {
        return textPane;
    }

    public void setTextPane(JTextPane textPane) {
        this.textPane = textPane;
    }    

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public void setNombreClase(String nuevoNombre) {
        newLabel.setText(nuevoNombre);
        label = nuevoNombre;
    }
}
