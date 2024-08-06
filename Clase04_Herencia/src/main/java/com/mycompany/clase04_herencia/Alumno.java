/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase04_herencia;

/**
 *
 * @author DREP
 */
public class Alumno extends Persona {

    private String curso;
    private float nota1;
    private float nota2;

    public Alumno() {
    }

    public Alumno(String curso, float nota1, float nota2, String nombre, String aPaterno, String aMaterno, byte edad) {
        super(nombre, aPaterno, aMaterno, edad);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float promedio() {
        return (getNota1() + getNota2()) / 2;
    }

    public String muestra() {
        return "El Alumno " + getNombre() + " " + getaPaterno() + " " + getaMaterno()
                + " obtuvo un primer puntaje de " + getNota1() + " y un segundo puntaje de "
                + getNota2() + " Resultando como promedio final " + promedio();
    }
}
