/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.util.Enumeration;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author HP
 */
class AdminTreeFLujo {

    private DefaultMutableTreeNode node;

    public AdminTreeFLujo(DefaultMutableTreeNode node) {
        this.node = node;
    }

    public AdminTreeFLujo() {
    }

    public DefaultMutableTreeNode getNode() {
        return node;
    }

    public void setNode(DefaultMutableTreeNode node) {
        this.node = node;
    }

    public void translate(DefaultMutableTreeNode root, JTextArea a) {
        StringBuilder code = new StringBuilder();
        recorrer(root, code, "");
        //JOptionPane.showMessageDialog(null, code);
        a.setText(code.toString());
    }

    public void recorrer(DefaultMutableTreeNode node, StringBuilder code, String indent) {
        String nodeValue = node.toString();

        //si encuentra un primer bucle while
        if (nodeValue.startsWith("while ")) {

            code.append(indent).append(nodeValue).append("\n");

            Enumeration<?> hijos = node.children();

            while (hijos.hasMoreElements()) {

                DefaultMutableTreeNode condVer = (DefaultMutableTreeNode) hijos.nextElement();

                if (condVer.toString().equals("True")) {

                    recorrer(condVer, code, indent + "    ");
                }
            }
        } //si encuentra una condicional If
        else if (nodeValue.startsWith("if ")) {
            //JOptionPane.showMessageDialog(null, "Procesando nodo: " + nodeValue);
            code.append(indent).append(nodeValue).append("\n");
            Enumeration<?> hijos = node.children();

            while (hijos.hasMoreElements()) {
                DefaultMutableTreeNode condicion = (DefaultMutableTreeNode) hijos.nextElement();
                if (condicion.toString().equals("True")) {

                    recorrer(condicion, code, indent + "    ");
                } else if (condicion.toString().equals("False")) {
                    code.append(indent).append("else:\n");
                    recorrer(condicion, code, indent + "    ");
                }
            }
        } //en caso de encontrar un nodo que sea proceso o lectura de datos
        else if (nodeValue.startsWith("Proceso: ")) {
            String newNodeValue = nodeValue.replace("Proceso: ", "");
            //JOptionPane.showMessageDialog(null, "Procesando nodo: " + nodeValue);
            code.append(indent).append(newNodeValue).append("\n");
            Enumeration<?> hijos = node.children();

            while (hijos.hasMoreElements()) {
                DefaultMutableTreeNode condicion = (DefaultMutableTreeNode) hijos.nextElement();
                recorrer(condicion, code, indent);
            }
        } else if (nodeValue.startsWith("Datos: ")) {
            String newNodeValue = nodeValue.replace("Datos: ", "");
            code.append(indent).append(newNodeValue).append(": ").append("Input(\"Ingrese el valor de ").append(newNodeValue).append(": \")").append("\n");
            Enumeration<?> hijos = node.children();

            while (hijos.hasMoreElements()) {
                DefaultMutableTreeNode condicion = (DefaultMutableTreeNode) hijos.nextElement();
                recorrer(condicion, code, indent);
            }
        } else if (nodeValue.startsWith("#")) {

            code.append(indent).append(nodeValue).append("\n\n ");
            Enumeration<?> hijos = node.children();

            while (hijos.hasMoreElements()) {
                DefaultMutableTreeNode condicion = (DefaultMutableTreeNode) hijos.nextElement();
                recorrer(condicion, code, indent);
            }
        } else {

            //code.append(indent).append(nodeValue).append("\n");
            Enumeration<?> hijos = node.children();

            while (hijos.hasMoreElements()) {
                DefaultMutableTreeNode condicion = (DefaultMutableTreeNode) hijos.nextElement();
                recorrer(condicion, code, indent);
            }
        }
    }
}
