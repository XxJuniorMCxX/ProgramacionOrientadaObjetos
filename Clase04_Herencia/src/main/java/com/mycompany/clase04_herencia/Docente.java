/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase04_herencia;

/**
 *
 * @author DREP
 */
public class Docente extends Persona {

    private String cod_Docente;

    public Docente() {
    }

    public Docente(String cod_Docente, String nombre, String aPaterno, String aMaterno, byte edad) {
        super(nombre, aPaterno, aMaterno, edad);
        this.cod_Docente = cod_Docente;
    }

    public String getCod_Docente() {
        return cod_Docente;
    }

    public void setCod_Docente(String cod_Docente) {
        this.cod_Docente = cod_Docente;
    }

    public String muestra() {
        return "El Codigo del Docente Es " + this.cod_Docente + " Y Se Llama " + getNombre() + " "
                + getaPaterno() + " " + getaMaterno() + " Tiene " + getEdad() + " Anios";
    }

}
