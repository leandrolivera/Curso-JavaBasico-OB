package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.util.Scanner;
import java.util.Vector;

public class Punto4 {

    public static void punto4() {
        //Punto 4
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y
        //muestra el resultado final.

        System.out.println("\nParte 4:");
        System.out.println("El vector solicitado viene cargado por defecto. Presione ENTER para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Vector<String> vector = new Vector<>();
        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");
        vector.add("Elemento 4");
        vector.add("Elemento 5");

        System.out.println("Valores del vector antes de eliminar el 2do y 3er elemento:");
        for (String element : vector) {
            System.out.println("Vector<" + element + ">");
        }
        vector.remove(1);
        vector.remove(1);

        System.out.println("\nValores del vector después de eliminar el 2do y 3er elemento:");
        for (String element : vector) {
            System.out.println("Vector<" + element + ">");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
