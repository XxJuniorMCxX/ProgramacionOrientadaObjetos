/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase04_herencia1;

/**
 *
 * @author DREP
 */
public class Tecnico extends Trabajador {

    private double bon_especial;

    public Tecnico() {
    }

    public Tecnico(double bon_especial, int codigo, String nombre, String apellido, double sueldo_base, double bonificacion, double descuento, String categoria) {
        super(codigo, nombre, apellido, sueldo_base, bonificacion, descuento, categoria);
        this.bon_especial = bon_especial;
    }

    public double getBon_especial() {
        return bon_especial;
    }

    public void setBon_especial(double bon_especial) {
        this.bon_especial = bon_especial;
    }

    @Override
    public double sueldoNeto() {
        return (getSueldo_base() + getBonificacion() + getBon_especial()) - getDescuento();
    }

    @Override
    public String toString() {
        return super.toString() + "Tecnico{" + "bon_especial=" + bon_especial + " Pago Total " + this.sueldoNeto() + '}';
    }

}
