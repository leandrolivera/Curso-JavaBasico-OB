package com.leandroolivera.Tema2_Ejercicio1;
import java.util.Scanner;


/**
 * @author Leandro Olivera
 * Java Básico - Open Bootcamp
 * Tema 2 - Ejercicio 1
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 *
 * IVA en Argentina:
 * Existen 3 tasas de IVA en 2022 en Argentina (también llamadas alícuotas):
 * 21% : es la tasa general, la más común.
 * 10,5%: para ciertos productos, como los electrónicos y las frutas y verduras
 * 27%: para ciertas actividades, como telecomunicaciones y energía eléctrica
 *
 */

public class CalculoDeIVA {

    public static void main(String[] args) {


        System.out.println("Ingrese el valor al que aplicaremos IVA:");
        Scanner scanner = new Scanner(System.in);
        double precio = scanner.nextDouble();
        System.out.println("El IVA es de 21% y el resultado con el precio ingresado es de: ");
        System.out.println("$ "+calculoDeIVA(precio));
    }

    private static double calculoDeIVA(double precio) {
        double iva = 0.21d;
        return precio+(iva*precio);
    }

}
