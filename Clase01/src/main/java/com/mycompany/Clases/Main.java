/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DREP
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        Persona p1,p2,p3;
        p1= new Persona();
        p2=new Persona();
        p3= new Persona();
        
        String nombre,direccion;
        char sexo;
        byte edad,op;
        System.out.println("Ingrese Opcion");
        op = sc.nextByte();
        switch (op) {
            case 1:
                    System.out.println("Datos Persona 01");
                    p1.setNombre("Junior");
                    p1.setDireccion("Piura");
                    p1.setSexo('f');
                    p1.setEdad((byte)36);
                    System.out.println("mi nombre es: " + p1.getNombre());  
                    System.out.println("mi apellido es: " + p1.getDireccion()); 
                    System.out.println("mi sexo es: " + p1.getSexo()); 
                    System.out.println("mi edad es: " + p1.getEdad()); 
                    
                    System.out.println("Ingrese Nombre: ");
                    nombre =sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ingrese Direccion: ");
                    direccion=sc.nextLine();
                    System.out.println("Ingrese Sexo: ");
                    sexo=sc.nextLine().charAt(0);
                    System.out.print("Ingrese Edad: ");
                    edad= sc.nextByte();
                    
                    p2.setDireccion("nombre");
                    p2.setDireccion("direccion");
                    p2.setSexo(sexo);
                    p2.setEdad(edad);
                    
                    System.out.println(p1.getNombre());
                    System.out.println(p1.getDireccion());
                    System.out.println(p1.getSexo());
                    System.out.println(p1.getEdad());
                    
                            
                break;
            case 2://ingresar datos de 2 personas pero con un 1 solo objeto
                for (int i = 0; i < 2; i++) {
                    System.out.println("Ingresar Datos persona " + i + ": ");
                    
                    p3.setNombre(JOptionPane.showInputDialog("Ingresa nombre"));
                    p3.setDireccion(JOptionPane.showInputDialog("Ingrese Apellido"));
                    p3.setSexo(JOptionPane.showInputDialog("Ingrese Sexo").charAt(0));
                    p3.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Ingresar Edad")));
                    
                    System.out.println("mi nombre es: " + p3.getNombre());  
                    System.out.println("mi apellido es: " + p3.getDireccion()); 
                    System.out.println("mi sexo es: " + p3.getSexo()); 
                    System.out.println("mi edad es: " + p3.getEdad()); 
                }
                
                break;    
            default:
                System.exit(0);
        }
        
    }
}
