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
import java.awt.geom.Path2D;
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
    private boolean isLoop;
    private boolean isConditional;

    public FiguraDecision() {
    }

    public FiguraDecision(Font fuente, int locx, int locy, int sizex, int sizey) {
        super(fuente, locx, locy, sizex, sizey);
        this.sizex = sizex;
        this.sizey = sizey;
        this.locx = locx;
        this.locy = locy;
        this.fuente = fuente;

        setLayout(null);
        setSize(200, 100);
        setBackground(new Color(204, 204, 204));

        // Crear un JTextPane y agregarlo al centro del panel
        textArea = new JTextArea();
        textArea.setText("Aqui va el texto de instruccion");
        textArea.setBackground(Color.WHITE); // Establecer el fondo del JTextPane al color del panel
        textArea.setForeground(Color.BLACK); // Establecer el color del texto en blanco
        textArea.setBorder(null); // Eliminar el borde del JTextPane

        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textArea.getFont().getName(), Font.BOLD, textArea.getFont().getSize());
        textArea.setFont(boldFont);

        textArea.setBounds(30, (getHeight() / 2) - 10, 140, 20);

        add(textArea);
    }

    public boolean isIsLoop() {
        return isLoop;
    }

    public void setIsLoop(boolean isLoop) {
        this.isLoop = isLoop;
    }

    public boolean isIsConditional() {
        return isConditional;
    }

    public void setIsConditional(boolean isConditional) {
        this.isConditional = isConditional;
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
    
    public void setColorBG(Color color) {
        this.color = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Crear un rombo
        Path2D.Double rombo = new Path2D.Double();
        int width = getWidth();
        int height = getHeight();
        int midX = width / 2;
        int midY = height / 2;

        rombo.moveTo(midX, 0);          // Arriba
        rombo.lineTo(width, midY);      // Derecha
        rombo.lineTo(midX, height);      // Abajo
        rombo.lineTo(0, midY);          // Izquierda
        rombo.closePath();               // Conectar con el punto de inicio

        // Dibujar el rombo
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fill(rombo);
    }

}
