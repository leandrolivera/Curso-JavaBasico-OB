package com.leandroolivera.Tema1_Ejercicio1;

/**
 * @author Leandro Olivera
 * Java Básico - Open Bootcamp
 * Tema 1 - Ejercicio 1
 *
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 *
 * Crea un proyecto de Java desde 0
 *
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 *
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 *
 * Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */
public class TiposDeDatos {
    public static void main(String[] args) {

        // 1. numericos
        // 1.1 enteros
        byte numeroByte = 4;
        short numeroShort = 10;
        int numeroInt = 30;
        long numeroLong = 1234567890L;
        long numeroTelefono = 123456789;

        // 1.2 decimales
        float numeroFloat = 5.5f;
        double numeroDouble = 10.5d;
        double precioSilla = 49.99;

        // 2. booleano
        boolean falsoBoolean = false;
        boolean verdaderoBoolean = true;

        // 3. texto
        char caracter = 'a';
        String cadenaDeTexto = "Esta es una cadena de texto";

        System.out.println("Los datos vistos hasta ahora fueron, numéricos, booleanos y de texto.");
        System.out.println("Tipo de dato byte: " + numeroByte);
        System.out.println("Tipo de dato short: " + numeroShort);
        System.out.println("Tipo de dato int: " + numeroInt);
        System.out.println("Tipo de dato long: " + numeroLong + " - también definimos un numero telefonico: " + numeroTelefono);
        System.out.println("Tipo de dato float: " + numeroFloat);
        System.out.println("Tipo de dato numeroDouble: " + numeroDouble + " - se puede utilizar para precios: ");
        System.out.println("Por ejemplo, el precio de una silla es: $" + precioSilla);
        System.out.println("Tipo de dato boolean:");
        System.out.println("   Falso --> " + falsoBoolean);
        System.out.println("   Verdadero --> " + verdaderoBoolean);
        System.out.println("Tipo de dato char: " + caracter);
        System.out.println("Tipo de dato String: " + cadenaDeTexto);

    }
}
