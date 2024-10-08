/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase03_relacionasociacion1;

/**
 *
 * @author DREP
 */
public class Renta {

    private float costo;
    private int duracion;
    private Inquilino inquilino;
    private Inmueble inmueble;

    public Renta() {
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public String muestra() {
        return "El Inquilino se Llama " + inquilino.getNombre() + " "
                + " y Tiene Un Inmueble en la Calle " + inmueble.getCalle() + " numero "
                + inmueble.getNumero() + " paga S/." + costo + " Durante " + duracion + " dias";
    }
}
