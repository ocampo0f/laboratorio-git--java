package com.laboratorio;

import javax.swing.JOptionPane;

public class ropa {
    private String tipo;
    private String talla;
    private String color;

    public void ingresarDatos() {
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de prenda (Ej: Camisa, Pantalón):");
        talla = JOptionPane.showInputDialog("Ingrese la talla (Ej: S, M, L):");
        color = JOptionPane.showInputDialog("Ingrese el color:");

        JOptionPane.showMessageDialog(null, "Prenda registrada:\nTipo: " + tipo + "\nTalla: " + talla + "\nColor: " + color);
    }

public static void main(String[] args) {
	 ropa prenda = new ropa();
	    prenda.ingresarDatos();}}