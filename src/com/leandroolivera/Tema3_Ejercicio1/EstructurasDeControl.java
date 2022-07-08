package com.leandroolivera.Tema3_Ejercicio1;
import java.util.Scanner;


/**
 * @author Leandro Olivera
 * Java Básico - Open Bootcamp
 * Tema 3 - Ejercicio 1
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 *
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 *
 * String[] nombres = {"", "", "", ""}
 *
 */

public class EstructurasDeControl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de palabras a ingresar");
        int cantidad = scanner.nextInt();

        String[] textos = new String[cantidad];
        StringBuilder concatenada = new StringBuilder();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Por favor ingrese palabra nro " + i + ":");
            textos[i] = scanner.next();
        }

        for (int i = 0; i < cantidad; i++) {
            if (i==cantidad-1){
                concatenada.append(textos[i]);
            }   else {
                concatenada.append(textos[i]).append(", ");
            }
        }

        System.out.println(concatenada);


    }

}
