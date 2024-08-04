/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03_relacionasociacion1;

import java.util.Scanner;

/**
 *
 * @author DREP
 */
public class Main {

    public static void main(String[] args) {
        String nombre,calle;
        int numero,duracion;
        float costo;
        
        
        Scanner sc = new Scanner(System.in);
        Inquilino inquilino = new Inquilino();
        System.out.println("Ingrese Nombre");
        nombre = sc.nextLine();
        inquilino.setNombre(nombre);
        
        Inmueble inmueble = new Inmueble();
        System.out.println("Ingrese Calle");
        calle = sc.nextLine();
        System.out.println("Ingrese Numero");
        numero = sc.nextInt();
        inmueble.setCalle(calle);
        inmueble.setNumero(numero);
                      
        Renta renta = new Renta();
        System.out.println("Ingrese Duracion de Estadia");
        duracion = sc.nextInt();
        System.out.println("Ingrese Costo De Estadia");
        costo = sc.nextFloat();
        renta.setCosto(costo);
        renta.setDuracion(duracion);
        renta.setInmueble(inmueble);
        renta.setInquilino(inquilino);
        
        renta.muestra();
        
        
    }

}
