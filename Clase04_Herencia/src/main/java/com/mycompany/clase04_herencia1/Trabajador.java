/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase04_herencia1;

/**
 *
 * @author DREP
 */
public class Trabajador {

    private int codigo;
    private String nombre;
    private String apellido;
    private double sueldo_base;
    private double bonificacion;
    private double descuento;
    private String categoria;

    public Trabajador() {
    }

    public Trabajador(int codigo, String nombre, String apellido, double sueldo_base, double bonificacion, double descuento, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo_base = sueldo_base;
        this.bonificacion = bonificacion;
        this.descuento = descuento;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double sueldoNeto() {
        return (getSueldo_base() + getBonificacion()) - getDescuento();
    }

    @Override
    public String toString() {
        return "Trabajador{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo_base=" + sueldo_base + ", bonificacion=" + bonificacion + ", descuento=" + descuento + ", categoria=" + categoria + '}';
    }

}
