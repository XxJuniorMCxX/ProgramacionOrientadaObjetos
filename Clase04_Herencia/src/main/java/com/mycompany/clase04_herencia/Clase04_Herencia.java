/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase04_herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author DREP
 */
public class Clase04_Herencia {

    public static void main(String[] args) {
//        //con constructor - Docente
//        Docente d = new Docente("U21222164", "Junior", "Castillo", "Yarleque", (byte) 38);
//        System.out.println(d.muestra());
//        d.setCod_Docente("O22112");
//        System.out.println(d.muestra());
//
//        //Sin Constructor - Docente 
//        d.setCod_Docente(JOptionPane.showInputDialog(null, "Ingrese Codigo De Docente", "Codigo", 1));
//        d.setNombre(JOptionPane.showInputDialog(null, "Ingrese Nombre De Docente", "Nombre", 1));
//        d.setaPaterno(JOptionPane.showInputDialog(null, "Ingrese Apellido Paterno", "Apellido Paterno", 1));
//        d.setaMaterno(JOptionPane.showInputDialog(null, "Ingrese Apellido Materno", "Apellido Materno", 1));
//        d.setEdad(Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese Edad Docente", "Edad Docente", 1)));
//        System.out.println(d.muestra());
        
        //Con constructor Alumno
        Alumno a = new Alumno("Programacion", 12, 15, "Junior", "Castillo", "Yarleque", (byte)29);
        System.out.println(a.muestra());
    }
}
