/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
/**
 *
 * @author HP
 */
public class ClasePrueba extends FiguraClase {
    private Font boldFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
    
    protected JTextPane atributos = new JTextPane();
    protected JScrollPane pnatributos = new JScrollPane(atributos);
    
    protected JTextPane metodos = new JTextPane();
    protected JScrollPane pnmetodos = new JScrollPane(metodos);
     
    protected JPanel pn_nomclase = new JPanel();
    protected JLabel titulo = new JLabel("NombreClase");
    protected JPanel pn_lblatributos = new JPanel();
    protected JLabel titulo2 = new JLabel("Atributos");
    protected JPanel pn_lblmetodos = new JPanel();
    protected JLabel titulo3 = new JLabel("Metodos");
    
    private Font f = null;
    
    public ClasePrueba(){
        super();
    }
    
    public ClasePrueba(Font f){
        setBackground(Color.blue);
        setSize (200,210);
        setLocation(0,0);
        
        pn_nomclase.setBackground(getBackground());
        pn_nomclase.setPreferredSize(new Dimension(getWidth()-10,25));
        
        
        titulo.setPreferredSize(new Dimension(getWidth()-10,25));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setBackground(new Color(0,0,0));
        titulo.setForeground(Color.white);
        titulo.setFont(boldFont);
        pn_nomclase.add(titulo);
        
        pn_lblatributos.setBackground(getBackground());
        pn_lblatributos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        titulo2.setPreferredSize(new Dimension(getWidth()-10,25));
        titulo2.setBackground(new Color(0,0,0));
        titulo2.setForeground(Color.white);
        titulo2.setFont(boldFont);
        pn_lblatributos.add(titulo2);
        
        pn_lblmetodos.setBackground(getBackground());
        pn_lblmetodos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        titulo3.setPreferredSize(new Dimension(getWidth()-10,25));
        titulo3.setBackground(new Color(0,0,0));
        titulo3.setForeground(Color.white);
        titulo3.setFont(boldFont);
        pn_lblmetodos.add(titulo3);
        
        
        pnatributos.setPreferredSize(new Dimension (getWidth()-20, 40));
        atributos.setBackground(new Color(175,175,175));
        pnatributos.setForeground(new Color(175,175,175));
        
        pnmetodos.setPreferredSize(new Dimension (getWidth()-20, 40));
        metodos.setBackground(new Color(175,175,175));
        pnmetodos.setForeground(new Color(175,175,175));
        
        
        add(pn_nomclase);
        add(pn_lblatributos);
        add(pnatributos);
        add(pn_lblmetodos);
        add(pnmetodos);
    }

    public JPanel getPn_nomclase() {
        return pn_nomclase;
    }

    public void setPn_nomclase(JPanel pn_nomclase) {
        this.pn_nomclase = pn_nomclase;
    }

    
    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JPanel getPn_lblatributos() {
        return pn_lblatributos;
    }

    public void setPn_lblatributos(JPanel pn_lblatributos) {
        this.pn_lblatributos = pn_lblatributos;
    }

    

    public JLabel getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(JLabel titulo2) {
        this.titulo2 = titulo2;
    }

    public JPanel getPn_lblmetodos() {
        return pn_lblmetodos;
    }

    public void setPn_lblmetodos(JPanel pn_lblmetodos) {
        this.pn_lblmetodos = pn_lblmetodos;
    }

    

    public JLabel getTitulo3() {
        return titulo3;
    }

    public void setTitulo3(JLabel titulo3) {
        this.titulo3 = titulo3;
    }

    public Font getF() {
        return f;
    }

    public void setF(Font f) {
        this.f = f;
    }

    public Font getBoldFont() {
        return boldFont;
    }

    public void setBoldFont(Font boldFont) {
        this.boldFont = boldFont;
    }

    public JTextPane getAtributos() {
        return atributos;
    }

    public void setAtributos(JTextPane atributos) {
        this.atributos = atributos;
    }

    public JScrollPane getPnatributos() {
        return pnatributos;
    }

    public void setPnatributos(JScrollPane pnatributos) {
        this.pnatributos = pnatributos;
    }

    public JTextPane getMetodos() {
        return metodos;
    }

    public void setMetodos(JTextPane metodos) {
        this.metodos = metodos;
    }

    public JScrollPane getPnmetodos() {
        return pnmetodos;
    }

    public void setPnmetodos(JScrollPane pnmetodos) {
        this.pnmetodos = pnmetodos;
    }

    

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
}