/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DatosInterfaz extends DatosUML implements Serializable{
    public DatosInterfaz() {
        super();
    }

    public DatosInterfaz(int sizeX, int sizeY, int locX, int locY, String titulo, Color color) {
        super(sizeX, sizeY, locX, locY, titulo, color);
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<String> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<String> metodos) {
        this.metodos = metodos;
    }
}
