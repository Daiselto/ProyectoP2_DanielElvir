/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

/**
 *
 * @author HP
 */
public class DatosDecision implements Serializable{
     private Color bgc;
    private Font fontf;
    private String inst;
    private int width, height;

    public DatosDecision(Color bgc, Font fontf, String inst, int width, int height) {
        this.bgc = bgc;
        this.fontf = fontf;
        this.inst = inst;
        this.width = width;
        this.height = height;
    }
    
    

    public Color getBgc() {
        return bgc;
    }

    public void setBgc(Color bgc) {
        this.bgc = bgc;
    }

    public Font getFontf() {
        return fontf;
    }

    public void setFontf(Font fontf) {
        this.fontf = fontf;
    }

    public String getInst() {
        return inst;
    }

    public void setInst(String inst) {
        this.inst = inst;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "DatosRombo{" + "bgc=" + bgc + ", fontf=" + fontf + ", inst=" + inst + ", width=" + width + ", height=" + height + '}';
    }
}
