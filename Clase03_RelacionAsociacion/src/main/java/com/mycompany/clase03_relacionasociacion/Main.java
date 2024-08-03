/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase03_relacionasociacion;

import javax.swing.JOptionPane;

/**
 *
 * @author DREP
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Relacion de Asociación");
        Persona p = new Persona();
        Mascota m = new Mascota();
        //
        //Una Mascota Para Una Solo Persona
        p.setNombre("Junior");
        m.setNombre("Mimi");
        m.setTipo("Gatita");
        p.setMascota(m);
        p.mostrar();

        //Varias Mascotas Para Varias Personas
        byte cantidad = Byte.parseByte(JOptionPane.showInputDialog("Ingrese Cantidad De Personas"));
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("*********Persona " + i + "***********");
            String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre ", "Nombre Dueño", 1);
            String nombreMascota = JOptionPane.showInputDialog(null, "Ingrese Nombre Mascota", "Nombre Mascota", 1);
            String tipoMascota = JOptionPane.showInputDialog(null, "Ingrese Tipo Felino-Canino", "Tipo Mascota", 1);
            p.setNombre(nombre);
            m.setNombre(nombreMascota);
            m.setTipo(tipoMascota);
            p.setMascota(m);
            p.mostrar();
        }
    }
}
