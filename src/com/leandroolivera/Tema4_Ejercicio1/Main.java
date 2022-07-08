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


public class Main {

    public static void main(String[] args) {
        SmartPhone miSmartPhone = new SmartPhone("Motorola", "G8 Power", "Gris", 4, 64, "Android");

        SmartWatch miSmartWatch = new SmartWatch("Sony", "SmartWatch 3", "Negro",1.6, "Bluetooth/WiFi");

        System.out.println("El smartphone es: " + miSmartPhone + "\nEl smartwatch es: " + miSmartWatch);
    }

}
