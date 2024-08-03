/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03_relacionasociacion;

/**
 *
 * @author DREP
 */
public class Persona {
    private String nombre;
    private Mascota mascota;

    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public void mostrar(){
        System.out.println(this.nombre + " tiene una mascota de tipo " + mascota.getTipo()
        + " y se llama " + mascota.getNombre());
    }
            
            
}
