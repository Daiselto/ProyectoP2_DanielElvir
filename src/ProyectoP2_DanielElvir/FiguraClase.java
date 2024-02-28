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
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
    private javax.swing.JMenuItem Modificar = new JMenuItem();
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
        Modificar.setText("Modificar el nombre de la clase");
        MenuClases.add(CrearHijo);
        MenuClases.add(Eliminar);
        MenuClases.add(Modificar);

        CrearHijo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FiguraClase.this instanceof ClaseNormal t) {
                    FiguraClase ult = FiguraClase.getUltimoclickeado();
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija");
                    String padre = "";
                    ClaseHeredada Heredero = new ClaseHeredada(fuente, locx, locy, label, MesaUML, t);
                    padre = ((ClaseNormal) t).getTitulo().getText();
                    FiguraClase temppadre = (FiguraClase) t;
                    Heredero.setPadre(temppadre);
                    if (temppadre instanceof ClaseNormal) {
                        ((ClaseNormal) temppadre).getHijos().add(Heredero);
                    }
                    Heredero.getTitulo().setText(nLabel);
                    Heredero.getExtension().setText("extends " + padre);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                    Menu.clasesUML.add(Heredero);
                }  else if (FiguraClase.this instanceof ClaseAbstracta t) {
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija");
                    String padre = "";
                    ClaseHeredada Heredero = new ClaseHeredada(fuente, locx, locy, label, MesaUML, t);
                    padre = ((ClaseAbstracta) t).getNewLabel().getText();
                    FiguraClase temppadre = (FiguraClase) t;
                    Heredero.setPadre(temppadre);
                    if (temppadre instanceof ClaseAbstracta) {
                        ((ClaseAbstracta) temppadre).getHijos().add(Heredero);
                    }
                    Heredero.getTitulo().setText(nLabel);
                    Heredero.getExtension().setText("extends " + padre);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                    Menu.clasesUML.add(Heredero);
                } else if (FiguraClase.this instanceof ClaseHeredada t) {
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija");
                    String padre = "";
                    ClaseHeredada Heredero = new ClaseHeredada(fuente, locx, locy, label, MesaUML, t);
                    padre = ((ClaseHeredada) t).getTitulo().getText();
                    FiguraClase temppadre = (FiguraClase) t;
                    Heredero.setPadre(temppadre);
                    if (temppadre instanceof ClaseHeredada) {
                        ((ClaseHeredada) temppadre).getHijos().add(Heredero);
                    }
                    Heredero.getTitulo().setText(nLabel);
                    Heredero.getExtension().setText("extends " + padre);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                    Menu.clasesUML.add(Heredero);
                }  else{
                    JOptionPane.showMessageDialog(FiguraClase.this, "No puede hacer herencia de esto");
                }

            }
        });

        CrearHijoAbstracto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FiguraClase.this instanceof ClaseNormal t) {
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija abstracta");
                    String padre = "";
                    ClaseHeredada Heredero = new ClaseHeredada(fuente, locx, locy, label, MesaUML, t);
                    padre = ((ClaseNormal) t).getTitulo().getText();
                    FiguraClase temppadre = (FiguraClase) t;
                    Heredero.setPadre(temppadre);
                    if (temppadre instanceof ClaseNormal) {
                        ((ClaseNormal) temppadre).getHijos().add(Heredero);
                    }
                    Heredero.getNomclase().setText("abstract" + nLabel);
                    Heredero.getExtension().setText("extends " + padre);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                    Menu.clasesUML.add(Heredero);
                } else if (FiguraClase.this instanceof ClaseAbstracta t) {
                    String nLabel = JOptionPane.showInputDialog("Diga el nombre de la clase hija abstracta");
                    String padre = "";
                    ClaseHeredada Heredero = new ClaseHeredada(fuente, locx, locy, label, MesaUML, t);
                    padre = ((ClaseAbstracta) t).getNewLabel().getText();
                    FiguraClase temppadre = (FiguraClase) t;
                    Heredero.setPadre(temppadre);
                    if (temppadre instanceof ClaseAbstracta) {
                        ((ClaseAbstracta) temppadre).getHijos().add(Heredero);
                    }
                    Heredero.getNomclase().setText("abstract Clase " + nLabel);
                    Heredero.getExtension().setText("extends " + padre);
                    MesaUML.add(Heredero);
                    MesaUML.add(Heredero);
                    MesaUML.revalidate();
                    MesaUML.repaint();
                    Menu.clasesUML.add(Heredero);
                } else if (FiguraClase.this instanceof Interfaz) {
                    JOptionPane.showMessageDialog(FiguraClase.this, "No se puede crear un abstracto de una interfaz");
                }else{
                    JOptionPane.showMessageDialog(FiguraClase.this, "No se puede crear un abstracto");
                }
            }
        });

        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MesaUML.remove(FiguraClase.this);
                MesaUML.revalidate();
                MesaUML.repaint();
                Menu.clasesUML.remove(FiguraClase.this);
            }
        });

        Modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FiguraClase ultclk = FiguraClase.getUltimoclickeado();
                String mod = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la clase\n"
                        + "Esto podria afectar a las clases hijas ya existentes");
                if (ultclk instanceof ClaseNormal) {
                    ((ClaseNormal) ultclk).getTitulo().setText(mod);
                }

                if (ultclk instanceof ClaseHeredada) {
                    ((ClaseHeredada) ultclk).getTitulo().setText(mod);
                }

                if (ultclk instanceof ClaseAbstracta) {
                    ((ClaseAbstracta) ultclk).getNewLabel().setText(mod);
                }

                if (ultclk instanceof Interfaz) {
                    ((Interfaz) ultclk).getNominter().setText(mod);
                }
                
            }
        });
    }

    public FiguraClase() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public JPopupMenu getMenuClases() {
        return MenuClases;
    }

    public void setMenuClases(JPopupMenu MenuClases) {
        this.MenuClases = MenuClases;
    }

    public JMenuItem getCrearHijo() {
        return CrearHijo;
    }

    public void setCrearHijo(JMenuItem CrearHijo) {
        this.CrearHijo = CrearHijo;
    }

    public JMenuItem getCrearHijoAbstracto() {
        return CrearHijoAbstracto;
    }

    public void setCrearHijoAbstracto(JMenuItem CrearHijoAbstracto) {
        this.CrearHijoAbstracto = CrearHijoAbstracto;
    }

    public JMenuItem getEliminar() {
        return Eliminar;
    }

    public void setEliminar(JMenuItem Eliminar) {
        this.Eliminar = Eliminar;
    }

    public static FiguraClase getLastClick() {
        return lastClick;
    }

    public static void setLastClick(FiguraClase lastClick) {
        FiguraClase.lastClick = lastClick;
    }

    public boolean isSelec() {
        return selec;
    }

    public void setSelec(boolean selec) {
        this.selec = selec;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public JPanel getMesaUML() {
        return MesaUML;
    }

    public void setMesaUML(JPanel MesaUML) {
        this.MesaUML = MesaUML;
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
