/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DatosHerencia extends DatosUML{
    private String tA;

    public DatosHerencia() {
        super();
    }

    public DatosHerencia(int sizeX, int sizeY, int locX, int locY, String titulo, String tA, Color color) {
        super(sizeX, sizeY, locX, locY, titulo, color);
        this.tA = tA;
    }

    public String gettA() {
        return tA;
    }

    public void settA(String tA) {
        this.tA = tA;
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
