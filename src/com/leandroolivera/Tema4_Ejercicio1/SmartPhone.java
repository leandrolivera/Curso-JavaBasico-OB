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


public class SmartPhone extends SmartDevice {
    int ram;
    int storage;
    String sistema;

    public SmartPhone(){

    }

    public SmartPhone(int ram, int storage, String sistema) {
        this.ram = ram;
        this.storage = storage;
        this.sistema = sistema;
    }

    public SmartPhone(String marca, String modelo, String color, int ram, int storage, String sistema) {
        super(marca, modelo, color);
        this.ram = ram;
        this.storage = storage;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", sistema='" + sistema + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
