/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase02_constructores;

/**
 *
 * @author DREP
 */
public class Persona {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private char sexo;
    private byte edad;
    
    public Persona(){
    this.nombre="Junior";
    this.aPaterno="Castillo";
    this.aMaterno="Yarleque";
    this.sexo='M';
    this.edad=36;
    
    }
    //constructor parametrizado

    public Persona(String nombre, String aPaterno, String aMaterno, char sexo, byte edad) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    
}
