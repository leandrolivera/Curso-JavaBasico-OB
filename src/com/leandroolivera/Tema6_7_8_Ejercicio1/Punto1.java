package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.util.Scanner;

public class Punto1 {

    public static void punto1(){
        // Punto 1:
        //Escribe el código que devuelva una cadena al revés.
        System.out.println("Parte 1:");
        System.out.println("Ingrese un texto para poder invertirlo: ");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        System.out.println("Su texto invertido queda de la siguiente manera: ");
        System.out.println(reverse(texto));
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static String reverse(String texto) {
        StringBuilder reverse = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverse.append(texto.charAt(i));
        }

        return reverse.toString();

    }
}
