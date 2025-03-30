package com.laboratorio;

import javax.swing.JOptionPane;

public class televisor {
    public televisor() {
        System.out.println("esta es la clase  de sebas garcia y sofia ");
    }
    private String marca;
    private String pulgadas;
    private int anio;

    public void registrartelevisor() {
        marca = JOptionPane.showInputDialog("Ingrese la marca del televisor:");
        pulgadas = JOptionPane.showInputDialog("Ingrese las pulgadas del televisor:");
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricación:"));

        JOptionPane.showMessageDialog(null, "Televisor registrado:\nMarca: " + marca + "\nPulgadas: " + pulgadas + "\nAño: " + anio);
    }

    public static void main(String[] args) {
        televisor tv = new televisor();
        tv.registrartelevisor();
    }
}
