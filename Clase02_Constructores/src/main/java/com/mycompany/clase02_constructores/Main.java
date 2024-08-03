/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase02_constructores;

import javax.swing.JOptionPane;

/**
 *
 * @author DREP
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Se ha llamado el Constructor implicito el que esta por defecto"
                + "y toma valores por defecto");
        Persona p = new Persona();
        System.out.println("Datos de Persona 1");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido Paterno: " + p.getaPaterno());
        System.out.println("Apellido Materno: " + p.getaMaterno());
        System.out.println("Sexo: " + p.getSexo());
        System.out.println("Edad: " + p.getEdad());

        System.out.println("       ****      ");
        System.out.println("Ingresando Datos Utilizando Setter y Getter");
        System.out.println("Datos Persona 2");
        Persona p1 = new Persona();

        p1.setNombre(JOptionPane.showInputDialog("Ingresa Nombre"));
        p1.setaPaterno(JOptionPane.showInputDialog("Ingresa Apellido Paterno"));
        p1.setaMaterno(JOptionPane.showInputDialog("Ingresa Ingresa Apellido Materno"));
        p1.setSexo(JOptionPane.showInputDialog("Ingresa Sexo").charAt(0));
        p1.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Ingresa Edad")));

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellido Paterno: " + p1.getaPaterno());
        System.out.println("Apellido Materno: " + p1.getaMaterno());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Edad: " + p1.getEdad());
       
         System.out.println("***Persona 3***");
        //Ingresar Datos con Constructor Parametrizado
        String nombre = JOptionPane.showInputDialog("Ingresar Nombre");
        String aPaterno = JOptionPane.showInputDialog("Ingresar Apellido Paterno");
        String aMaterno = JOptionPane.showInputDialog("Ingresar Apellido Materno");
        char sexo = JOptionPane.showInputDialog("Ingresar Sexo").charAt(0);
        byte edad = Byte.parseByte(JOptionPane.showInputDialog("Ingresar Edad"));

        Persona p2 = new Persona(nombre, aPaterno, aMaterno, sexo, edad);
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Apellido Paterno: " + p2.getaPaterno());
        System.out.println("Apellido Materno: " + p2.getaMaterno());
        System.out.println("Sexo: " + p2.getSexo());
        System.out.println("Edad: " + p2.getEdad());

    }
}
