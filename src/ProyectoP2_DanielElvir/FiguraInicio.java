/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author HP
 */
public class FiguraInicio extends FiguraFlujo{
   private int sizeX, sizeY, locX, locY;
    
    protected JTextArea text = new JTextArea();
    protected JTextField field = new JTextField();
    Color color = new Color(223, 0, 111);    
    private Font font = null;
    
    private ArrayList<JTextArea> miembros = new ArrayList();
    
    public FiguraInicio(Font font, int locX, int locY, int sizeX, int sizeY) {
        super(font, locX, locY, sizeX, sizeY);
        // Constructor: Configurar el panel y agregar componentes
        setLayout(null);
        setSize(180,80);
        setBackground(new Color(204,204,204));

        // Crear un JTextPane y agregarlo al centro del panel
        text = new JTextArea();
        text.setText("Inicio/Fin");
        text.setBackground(Color.WHITE); // Establecer el fondo del JTextPane al color del panel
        text.setForeground(Color.BLACK); // Establecer el color del texto en blanco
        text.setBorder(null); // Eliminar el borde del JTextPane
        
        field = new JTextField();
        field.setText("Indice");
        field.setBackground(Color.WHITE); // Establecer el fondo del JTextPane al color del panel
        field.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        field.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(text.getFont().getName(), Font.BOLD, text.getFont().getSize());
        text.setFont(boldFont);
        
        text.setBounds(40, (getHeight()/2)-10, 100, 20);
        
        field.setFont(font);
        

        
        add(text);
        
    }
    
    public FiguraInicio(JPanel c) {
        super();
        this.copy(c);
    }

    public JTextField getField() {
        return field;
    }

    public void setField(JTextField field) {
        this.field = field;
    }
    
     
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
    }
    
    public int getSizeX() {
        return sizeX;
    }
    
    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }
    
    public int getSizeY() {
        return sizeY;
    }
    
    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    
    public int getLocX() {
        return locX;
    }
    
    public void setLocX(int locX) {
        this.locX = locX;
    }
    
    public int getLocY() {
        return locY;
    }
    
    public void setLocY(int locY) {
        this.locY = locY;
    }
    
    public JTextArea getText() {
        return text;
    }
    
    public void setText(JTextArea text) {
        this.text = text;
    }
    
    public Font getFont() {
        return font;
    }
    
    public void setFont(Font font) {
        this.font = font;
    }
    
    public ArrayList<JTextArea> getMiembros() {
        return miembros;
    }
    
    public void setMiembros(ArrayList<JTextArea> miembros) {
        this.miembros = miembros;
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
    
    public void setColorBG(Color color) {
        this.color = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        Graphics2D g2d = (Graphics2D) g;
        
        // Crear una forma de cápsula horizontal
        Shape capsuleShape = new RoundRectangle2D.Double(0, height / 4, width, height / 2, height / 2, height / 2);
        
        // Rellenar la forma con un color
        g2d.setColor(color); // Cambia el color como desees
        g2d.fill(capsuleShape);
    }
    
    public void copy(JPanel c) {
        
        FiguraInicio newC = (FiguraInicio) c;
        this.setBackground(newC.getBackground());
        this.setSize(newC.getSize());
        this.setLocation(newC.getLocation());

        this.text = new JTextArea();
        this.text.setText(newC.getText().getText());

        this.add(this.text);

    }
}
