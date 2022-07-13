package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Punto6 {

    public static void punto6(){
        //Punto 6
        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
        //únicamente el valor de cada elemento.

        System.out.println("\nParte 6:");
        System.out.println("El ArrayList solicitado viene cargado por defecto. Presione ENTER para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");
        list.add("Elemento 4");

        LinkedList<String> link = new LinkedList<>(list);

        System.out.println("Valores del ArrayList:");
        System.out.println(list);
        System.out.println("Valores del LinkedList:");
        System.out.println(link);
        System.out.println("-----------------------------------------------------------------------------------------");

    }

}
