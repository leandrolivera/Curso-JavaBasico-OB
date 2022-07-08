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


public class SmartDevice {

    String marca;
    String modelo;
    String color;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
