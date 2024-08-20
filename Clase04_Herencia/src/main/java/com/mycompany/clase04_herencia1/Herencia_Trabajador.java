/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase04_herencia1;

/**
 *
 * @author DREP
 */
public class Herencia_Trabajador {

    public static void main(String[] args) {
        /*Desarrolla una aplicacion que ingrese los datos de un trabajador: codigo
        nombre,apellido,sueldo base, bonificacion,descuento,categoria,bonificacion especial si es (tecnico),bonificacion
        riesgo si es (auxiliar)calcular y mostrar el sueldo neto del trabajador*/
        Tecnico tecnico = new Tecnico(200.00, 1, "Junior", "Castillo", 500.00, 100.00, 150.00, "Tecnico");
        System.out.println(tecnico + " Su Salario Neto Es De: " + tecnico.sueldoNeto());
    }

}
