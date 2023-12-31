/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

/**
 *
 * @author HP
 */
public class ClaseHeredada extends ClaseNormal {

    private StyledDocument doctpatri;
    private Style estilotpatri;
            
    private StyledDocument doctpmeto;
    private Style estilotpmeto;
            
            
            
    
    private Font boldFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
    private Font boldFontext = new Font(getFont().getName(), Font.BOLD, 9);
    
    protected JPanel jp_extension = new JPanel();
    protected JLabel extension = new JLabel("extends");
    
    protected JPanel jp_nomclase = new JPanel();
    protected JLabel nomclase = new JLabel("NombreClase");
    
    protected JPanel jp_atributos = new JPanel();
    protected JLabel jl_tributos = new JLabel("Atributos");
    
    protected JTextArea tp_atributos = new JTextArea();
    protected JScrollPane sp_tpatributos = new JScrollPane(tp_atributos);
    
    protected JPanel jp_metodos = new JPanel();
    protected JLabel jl_metodos = new JLabel("Metodos");
    
    protected JTextArea tp_metodos = new JTextArea();
    protected JScrollPane sp_tpmetodos = new JScrollPane(tp_metodos);
    
    private FiguraClase padre;
    
    private ArrayList <FiguraClase> hijos = new ArrayList();            
    
    
    public ClaseHeredada(Font fuente, int locx, int locy, String label, JPanel titulo, FiguraClase padre){
        super(fuente, locx, locy, label, titulo);
        this.padre = padre;
        
        setBackground(new Color(100, 149, 237));
        setSize (200,215);
        //setLocation(10,10);
        
        jp_extension.setBackground(getBackground());
        jp_extension.setPreferredSize(new Dimension(getWidth()-10,20));
        
        extension.setPreferredSize(new Dimension(getWidth()-10,20));
        extension.setBackground(new Color(0,0,0));
        extension.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        extension.setForeground(Color.white);
        extension.setFont(boldFontext);
        jp_extension.add(extension);
        
        
        
        jp_nomclase.setBackground(getBackground());
        jp_nomclase.setPreferredSize(new Dimension(getWidth()-10,25));
        
        nomclase.setPreferredSize(new Dimension(getWidth()-10,25));
        nomclase.setBackground(new Color(0,0,0));
        nomclase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomclase.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        nomclase.setForeground(Color.white);
        nomclase.setFont(boldFont);
        jp_nomclase.add(nomclase);
        
        
        
        jp_atributos.setBackground(getBackground());
        jp_atributos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        jl_tributos.setPreferredSize(new Dimension(getWidth()-10,25));
        jl_tributos.setBackground(new Color(0,0,0));
        jl_tributos.setForeground(Color.white);
        jl_tributos.setFont(boldFont);
        jp_atributos.add(jl_tributos);
        
        sp_tpatributos.setPreferredSize(new Dimension (getWidth()-20, 40));
        tp_atributos.setBackground(new Color(175,175,175));
        sp_tpatributos.setForeground(new Color(175,175,175));
        
        
        
        jp_metodos.setBackground(getBackground());
        jp_metodos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        jl_metodos.setPreferredSize(new Dimension(getWidth()-10,25));
        jl_metodos.setBackground(new Color(0,0,0));
        jl_metodos.setForeground(Color.white);
        jl_metodos.setFont(boldFont);
        jp_metodos.add(jl_metodos);
        
        sp_tpmetodos.setPreferredSize(new Dimension (getWidth()-20, 40));
        tp_metodos.setBackground(new Color(175,175,175));
        sp_tpmetodos.setForeground(new Color(175,175,175));
        
        
        add(jp_extension);
        add(jp_nomclase);
        add(jp_atributos);
        add(sp_tpatributos);
        add(jp_metodos);
        add(sp_tpmetodos);
        
       
        
    }

    public Font getBoldFontext() {
        return boldFontext;
    }

    public void setBoldFontext(Font boldFontext) {
        this.boldFontext = boldFontext;
    }   
        
    public Font getBoldFont() {
        return boldFont;
    }

    public void setBoldFont(Font boldFont) {
        this.boldFont = boldFont;
    }

    public JPanel getJp_extension() {
        return jp_extension;
    }

    public void setJp_extension(JPanel jp_extension) {
        this.jp_extension = jp_extension;
    }

    public JLabel getExtension() {
        return extension;
    }

    public void setExtension(JLabel extension) {
        this.extension = extension;
    }

    public JPanel getJp_nomclase() {
        return jp_nomclase;
    }

    public void setJp_nomclase(JPanel jp_nomclase) {
        this.jp_nomclase = jp_nomclase;
    }

    public JLabel getNomclase() {
        return nomclase;
    }

    public void setNomclase(JLabel nomclase) {
        this.nomclase = nomclase;
    }

    public JPanel getJp_atributos() {
        return jp_atributos;
    }

    public void setJp_atributos(JPanel jp_atributos) {
        this.jp_atributos = jp_atributos;
    }

    

    

    public JScrollPane getSp_tpatributos() {
        return sp_tpatributos;
    }

    public void setSp_tpatributos(JScrollPane sp_tpatributos) {
        this.sp_tpatributos = sp_tpatributos;
    }

    public JPanel getJp_metodos() {
        return jp_metodos;
    }

    public void setJp_metodos(JPanel jp_metodos) {
        this.jp_metodos = jp_metodos;
    }

    

    public JTextArea getTp_atributos() {
        return tp_atributos;
    }

    public void setTp_atributos(JTextArea tp_atributos) {
        this.tp_atributos = tp_atributos;
    }

    public JTextArea getTp_metodos() {
        return tp_metodos;
    }

    public void setTp_metodos(JTextArea tp_metodos) {
        this.tp_metodos = tp_metodos;
    }

    

    public JScrollPane getSp_tpmetodos() {
        return sp_tpmetodos;
    }

    public void setSp_tpmetodos(JScrollPane sp_tpmetodos) {
        this.sp_tpmetodos = sp_tpmetodos;
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

    public StyledDocument getDoctpatri() {
        return doctpatri;
    }

    public void setDoctpatri(StyledDocument doctpatri) {
        this.doctpatri = doctpatri;
    }

    public Style getEstilotpatri() {
        return estilotpatri;
    }

    public void setEstilotpatri(Style estilotpatri) {
        this.estilotpatri = estilotpatri;
    }

    public StyledDocument getDoctpmeto() {
        return doctpmeto;
    }

    public void setDoctpmeto(StyledDocument doctpmeto) {
        this.doctpmeto = doctpmeto;
    }

    public Style getEstilotpmeto() {
        return estilotpmeto;
    }

    public void setEstilotpmeto(Style estilotpmeto) {
        this.estilotpmeto = estilotpmeto;
    }

    public FiguraClase getPadre() {
        return padre;
    }

    public void setPadre(FiguraClase padre) {
        this.padre = padre;
    }

    public ArrayList<FiguraClase> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<FiguraClase> hijos) {
        this.hijos = hijos;
    }
    
    
    

    @Override
    public String toString() {
        return nomclase.getText();
    }
}
