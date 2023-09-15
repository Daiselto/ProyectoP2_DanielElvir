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
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author HP
 */
public class ClaseAbstracta extends FiguraClase {

    protected int sizex, sizey, locx, locy;
    protected JLabel newLabel = new JLabel();
    protected JLabel nomAtributo = new JLabel();
    protected JLabel nomMetodo = new JLabel();
    protected Font fuente;
    protected JPanel titulo = new JPanel();
    protected JPanel atributo = new JPanel();
    protected JPanel metodo = new JPanel();
    protected JTextArea textPane = new JTextArea();
    protected JTextArea textPane1 = new JTextArea();
    protected JScrollPane scroll = new JScrollPane(textPane);
    protected JScrollPane scroll1 = new JScrollPane(textPane1);

    public ClaseAbstracta(Font fuente, int locx, int locy, String label, JPanel MesaUML) {
        super(fuente, locx, locy, label, MesaUML);
        setBackground(new Color(100, 149, 237));
        setSize(200, 225);
        setLocation(locx / 2, locy / 2);

        titulo.setBackground(new Color(100, 149, 237));
        titulo.setPreferredSize(new Dimension(getWidth(), 20));

        newLabel.setForeground(Color.BLACK); 
        newLabel.setFont(new Font("Arial", Font.BOLD, 12));
        newLabel.setText("abstract " + label);
        titulo.add(newLabel);
        add(titulo);

        atributo.setBackground(new Color(100, 149, 237));
        atributo.setPreferredSize(new Dimension(getWidth(), 25));

        nomAtributo.setText("Atributos");
        atributo.add(nomAtributo);
        add(atributo);

        scroll.setPreferredSize(new Dimension(getWidth() - 20, 40));
        //textPane.setPreferredSize(new Dimension(getWidth() - 10, 20));
        scroll.setForeground(new Color(175, 175, 175));
        add(scroll);

        metodo.setBackground(new Color(100, 149, 237));
        metodo.setPreferredSize(new Dimension(getWidth(), 25));

        nomMetodo.setText("Metodos");
        metodo.add(nomMetodo);
        add(metodo);

        scroll1.setPreferredSize(new Dimension(getWidth() - 20, 40));
        //textPane1.setPreferredSize(new Dimension(getWidth() - 10, 20));
        scroll1.setForeground(new Color(175, 175, 175));
        add(scroll1);
        //setLabel(label);
    }

    public ClaseAbstracta() {
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

    public JLabel getNomAtributo() {
        return nomAtributo;
    }

    public void setNomAtributo(JLabel nomAtributo) {
        this.nomAtributo = nomAtributo;
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

    public JPanel getAtributo() {
        return atributo;
    }

    public void setAtributo(JPanel atributo) {
        this.atributo = atributo;
    }

    public JPanel getMetodo() {
        return metodo;
    }

    public void setMetodo(JPanel metodo) {
        this.metodo = metodo;
    }

    public JTextArea getTextPane() {
        return textPane;
    }

    public void setTextPane(JTextArea textPane) {
        this.textPane = textPane;
    }

    public JTextArea getTextPane1() {
        return textPane1;
    }

    public void setTextPane1(JTextArea textPane1) {
        this.textPane1 = textPane1;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JScrollPane getScroll1() {
        return scroll1;
    }

    public void setScroll1(JScrollPane scroll1) {
        this.scroll1 = scroll1;
    }

    public void setLabel(String label) {
        newLabel.setText(label);
        this.label = label;
    }

}
