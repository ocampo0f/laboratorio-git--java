package com.laboratorio;

import javax.swing.JOptionPane;

public class saludo {
    public void saludar() {
        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "! Bienvenido a nuestro proyecto");
    }

    public static void main(String[] args) {
        saludo saludo = new saludo();
        saludo.saludar();
    }
}
