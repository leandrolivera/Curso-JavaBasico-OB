package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.util.Scanner;

public class Punto3 {

    public static void punto3() {
        //Punto 3
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en
        //ambas dimensiones.

        System.out.println("\nParte 3:");
        System.out.println("A continuación debe escribir cantidad de filas y columnas para el array bidimensional: ");
        boolean valid = false;
        int cantFilas = 0;
        int cantColumnas = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("FILAS: ");
                cantFilas = scanner.nextInt();
                System.out.print("COLUMNAS: ");
                cantColumnas = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Ingresó un dato inválido, por favor intente nuevamente:");
            }
        } while (!valid);

        int[][] bidimensionalArray = new int[cantFilas][cantColumnas];

        //Creo un for anidado para rellenar el array bidimensional de forma aleatoria con enteros de 0 a 1000.
        for (int i=0; i < bidimensionalArray.length; i++) {
            for (int j=0; j < bidimensionalArray[i].length; j++) {
                bidimensionalArray[i][j] = (int) (Math.random()*999+1);
            }
        }

        System.out.println("\nEl array bidimensional quedó compuesto por " + cantFilas + " filas y " + cantColumnas + " columnas.");
        //Creo un for anidado para mostrar el array bidimensional con sus respectivas posiciones y valores.
        for (int i=0; i < bidimensionalArray.length; i++) {
            for (int j=0; j < bidimensionalArray[i].length; j++) {
                System.out.println("El valor en la posición [" + i + "][" + j + "] es: " + bidimensionalArray[i][j]);
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
