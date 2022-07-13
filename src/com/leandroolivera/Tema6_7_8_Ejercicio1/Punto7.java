package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto7 {

    public static void punto7() {
        //Punto 7
        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        //con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList
        //final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        System.out.println("\nParte 7:");
        System.out.println("El ArrayList solicitado viene cargado por defecto. Presione ENTER para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
        System.out.println("El ArrayList inicial se presenta de la siguiente forma: ");
        System.out.println(list + " y su tamaño es: " + list.size());

        list.removeIf(i -> i % 2 == 0);

        /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        */

        System.out.println("Luego de eliminar los valores pares, el ArrayList queda con los siguientes valores: ");
        System.out.println(list + " y su tamaño es: " + list.size());

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
