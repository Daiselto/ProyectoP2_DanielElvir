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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
    private FiguraClase lastClick;
    private boolean selec = false;

    public FiguraClase() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lastClick=FiguraClase.this;
        selec=!selec;
        repaint();
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
    
    protected void pintar(Graphics g){
        super.paintComponent(g);
        if (selec) {
            Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);
            setBorder(borde);
        }else{
            setBorder(null);
        }
    }

}
