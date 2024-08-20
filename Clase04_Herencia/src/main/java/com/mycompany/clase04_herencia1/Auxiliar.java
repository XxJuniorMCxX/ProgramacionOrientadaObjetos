/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase04_herencia1;

/**
 *
 * @author DREP
 */
public class Auxiliar extends Trabajador {

    private double bonificacion_riesgo;

    public Auxiliar() {
    }

    public Auxiliar(double bonificacion_riesgo, int codigo, String nombre, String apellido, double sueldo_base, double bonificacion, double descuento, String categoria) {
        super(codigo, nombre, apellido, sueldo_base, bonificacion, descuento, categoria);
        this.bonificacion_riesgo = bonificacion_riesgo;
    }

    public double getBonificacion_riesgo() {
        return bonificacion_riesgo;
    }

    public void setBonificacion_riesgo(double bonificacion_riesgo) {
        this.bonificacion_riesgo = bonificacion_riesgo;
    }

    @Override
    public double sueldoNeto() {
        return (getSueldo_base() + getBonificacion() + getBonificacion_riesgo()) - getDescuento();
    }

    @Override
    public String toString() {
        return super.toString() + "Auxiliar{" + "bonificacion_riesgo=" + bonificacion_riesgo + '}';
    }

}
