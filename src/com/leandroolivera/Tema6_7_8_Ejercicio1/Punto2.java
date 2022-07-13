package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.util.Scanner;

public class Punto2 {

    public static void punto2() {
        //Punto 2:
        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        System.out.println("\nParte 2:");
        System.out.println("¿Cuantas cadenas de texto desea escribir? Ingrese un valor entero:");
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int cantCadenas = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                cantCadenas = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("No ingresó un número entero, por favor intente nuevamente:");
            }
        } while (!valid);

        String[] unidimensionalArray = new String[cantCadenas];
        for (int i = 0; i < cantCadenas; i++) {
            System.out.println("Ingrese la palabra número: " + (i+1));
            unidimensionalArray[i] = scanner.next();
        }

        System.out.println("Sus cadenas de texto fueron: ");
        for (String cadena : unidimensionalArray){
            System.out.print(cadena+" ");
        }

        System.out.println("\n-----------------------------------------------------------------------------------------");
    }

}
