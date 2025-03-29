package com.laboratorio;
import javax.swing.JOptionPane;

public class vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public void registrarVehiculo() {
        marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricación:"));

        JOptionPane.showMessageDialog(null, "Vehículo registrado:\nMarca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio);
    }

    public static void main(String[] args) {
        vehiculo auto = new vehiculo();
        auto.registrarVehiculo();
    }
}
