/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class InterfazHeredada extends Interfaz {
    private JLayeredPane layeredPane = new JLayeredPane();
    private JPanel extend = new JPanel();
    private JLabel nomExtends = new JLabel();
    private String nLabel;
    private JLabel nueLabel = new JLabel();
    

    public InterfazHeredada(Font fuente, int locx, int locy, String label, JPanel MesaUML, String nLabel) {
        super(fuente, locx, locy, label, MesaUML);
        this.nLabel=nLabel;
        extend.setBackground(new Color(100, 149, 237));
        extend.setPreferredSize(new Dimension(getWidth(), 25));

        nomExtends.setText("extends " + label);
        extend.add(nomExtends);                               
        
        setNombreClase(nLabel);

        add(extend);
       
    }
    
    public InterfazHeredada() {
        super();
    }

    public JLayeredPane getLayeredPane() {
        return layeredPane;
    }

    public void setLayeredPane(JLayeredPane layeredPane) {
        this.layeredPane = layeredPane;
    }

    public JPanel getExtend() {
        return extend;
    }

    public void setExtend(JPanel extend) {
        this.extend = extend;
    }

    public JLabel getNomExtends() {
        return nomExtends;
    }

    public void setNomExtends(JLabel nomExtends) {
        this.nomExtends = nomExtends;
    }

    public String getnLabel() {
        return nLabel;
    }

    public void setnLabel(String nLabel) {
        this.nLabel = nLabel;
    }

    public JLabel getNueLabel() {
        return nueLabel;
    }

    public void setNueLabel(JLabel nueLabel) {
        this.nueLabel = nueLabel;
    }

    
}
