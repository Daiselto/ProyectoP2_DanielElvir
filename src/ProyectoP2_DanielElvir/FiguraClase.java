/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class FiguraClase extends JPanel implements MouseListener, MouseMotionListener {
    
    private Point startPoint;
    private Font fuente = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
    private javax.swing.JPopupMenu MenuClases = new JPopupMenu();
    private javax.swing.JMenuItem CrearHijo = new JMenuItem();
    private javax.swing.JMenuItem CrearHijoAbstracto = new JMenuItem();
    private javax.swing.JMenuItem Eliminar = new JMenuItem();
    private static FiguraClase lastClick;
    private boolean selec = false;
    private int locx;
    private int locy;
    String label;
    private JPanel MesaUML;
    
    public FiguraClase(Font fuente, int locx, int locy, String label, JPanel MesaUML) {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.fuente = fuente;
        this.locx = locx;
        this.locy = locy;
        this.label = label;
        this.MesaUML = MesaUML;
        CrearHijo.setText("Crear clase hija");
        CrearHijoAbstracto.setText("Crear un hijo abstracto");
        Eliminar.setText("Eliminar clase");
        MenuClases.add(CrearHijo);
        MenuClases.add(CrearHijoAbstracto);
        MenuClases.add(Eliminar);
        
        CrearHijo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FiguraClase.this instanceof ClaseNormal) {
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija");
                    ClaseHeredada Heredero = new ClaseHeredada(fuente, locx, locy, label, MesaUML, nLabel);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                } else if (FiguraClase.this instanceof Interfaz) {
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija");
                    InterfazHeredada Heredero = new InterfazHeredada(fuente, locx, locy, label, MesaUML, nLabel);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                }else if (FiguraClase.this instanceof ClaseAbstracta) {
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija");
                    ClaseHeredada Heredero = new ClaseHeredada(fuente, locx, locy, label, MesaUML, nLabel);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                }
                
            }
        });
        
        CrearHijoAbstracto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija abstracta");
                AbstractaHeredada Heredero = new AbstractaHeredada(fuente, locx, locy, label, MesaUML, nLabel);
                MesaUML.add(Heredero);
                MesaUML.revalidate();
                MesaUML.repaint();
            }
        });
        
        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MesaUML.remove(FiguraClase.this);
                MesaUML.revalidate();
                MesaUML.repaint();
            }
        });
    }
    
    public FiguraClase() {
    }
    
    public static FiguraClase getUltimoclickeado() {
        return lastClick;
    }
    
    public static void setUltimoclickeado(FiguraClase lastClick) {
        FiguraClase.lastClick = lastClick;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        lastClick = FiguraClase.this;
        selec = !selec;
        
        repaint();
        if (e.isMetaDown()) {
            MenuClases.show(this, e.getX(), e.getY());
            
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        startPoint = SwingUtilities.convertPoint(this, e.getPoint(), this.getParent());
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        startPoint = null;
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        Point location = SwingUtilities.convertPoint(this, e.getPoint(), this.getParent());
        if (this.getParent().getBounds().contains(location)) {
            Point newLocation = this.getLocation();
            newLocation.translate(location.x - startPoint.x, location.y - startPoint.y);
            newLocation.x = Math.max(newLocation.x, 0);
            newLocation.y = Math.max(newLocation.y, 0);
            newLocation.x = Math.min(newLocation.x, this.getParent().getWidth() - this.getWidth());
            newLocation.y = Math.min(newLocation.y, this.getParent().getHeight() - this.getHeight());
            this.setLocation(newLocation);
            startPoint = location;
        }
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    protected void pintar(Graphics g) {
        super.paintComponent(g);
        if (selec) {
            Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);
            setBorder(borde);
        } else {
            setBorder(null);
        }
    }
    
}
