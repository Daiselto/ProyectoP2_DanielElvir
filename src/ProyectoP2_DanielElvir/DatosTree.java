/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.io.Serializable;
import javax.swing.JTree;

/**
 *
 * @author HP
 */
public class DatosTree implements Serializable{
      private JTree diag;

    public DatosTree(JTree diag) {
        this.diag = diag;
    }

    public JTree getDiag() {
        return diag;
    }

    public void setDiag(JTree diag) {
        this.diag = diag;
    }

    @Override
    public String toString() {
        return "TreeFlu{" + "diag=" + diag + '}';
    }
    
}
