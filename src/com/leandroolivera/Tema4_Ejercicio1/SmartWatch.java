package com.leandroolivera.Tema4_Ejercicio1;

/**
 * @author Leandro Olivera
 * Java Básico - Open Bootcamp
 * Tema 4 - Ejercicio 1
 *
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 *
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 *
 * Crear constructor vacío y con todos los parámetros para cada clase.
 *
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 *
 */


public class SmartWatch extends SmartDevice {
    double pulgadas;
    String conectividad;

    public SmartWatch(){

    }

    public SmartWatch(double pulgadas, String conectividad) {
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
    }

    public SmartWatch(String marca, String modelo, String color, double pulgadas, String conectividad) {
        super(marca, modelo, color);
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas=" + pulgadas +
                ", conectividad='" + conectividad + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
