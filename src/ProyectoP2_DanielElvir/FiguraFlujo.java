/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class FiguraFlujo extends JPanel implements MouseListener, MouseMotionListener {

    private static FiguraFlujo lastClick;
    private Point startPoint;
    private boolean selec = false;
    private Font fuente = null;
    private int locx;
    private int locy;
    private int sizex, sizey;
    private String label;
    protected JPopupMenu menuop = new JPopupMenu();
    protected JMenuItem eliminar = new JMenuItem();
    private boolean borrado = false;
    
    JPanel currentSel=null;
    //private JPanel MesaTrabajo;

    public FiguraFlujo(Font fuente, int locx, int locy, int sizex, int sizey /*JPanel MesaTrabajo*/) {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.fuente = fuente;
        this.locx = locx;
        this.locy = locy;
        //this.MesaTrabajo = MesaTrabajo;
        
        eliminar.setText("Eliminar");
        menuop.add(eliminar);
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrado = true;
                JPanel xf = (JPanel) lastClick.getParent();
                xf.remove(lastClick);
                xf.repaint();
            }
        });
        

    }

    public FiguraFlujo() {
    }

    public static FiguraFlujo getUltimoclickeado() {
        return lastClick;
    }

    public static void setUltimoclickeado(FiguraFlujo lastClick) {
        FiguraFlujo.lastClick = lastClick;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lastClick = FiguraFlujo.this;
        selec = !selec;

        repaint();
        if (e.isMetaDown()) {
            menuop.show(e.getComponent(), e.getX(), e.getY());
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
