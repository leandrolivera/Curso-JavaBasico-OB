package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Punto10 {

    public static void punto10() {
        //Punto 10
        //Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap
        //y un ArrayList, LinkedList o array.

        System.out.println("\nParte 10:");
        try {
            InputStream in = new FileInputStream("JavaBasicoEjercicios.iml");
            byte[] datos = in.readAllBytes();
            int eleccion;

            do {
                eleccion = menu();
                switch (eleccion) {
                    case 1 -> ficheroEnMayusculas(datos);
                    case 2 -> ficheroEnMinusculas(datos);
                    case 3 -> ficheroInvertirMayusMinus(datos);
                    case 4 -> ficheroArrayList(datos);
                    case 5 -> ficheroContarVocales(datos);
                }
                if (eleccion != 0) {
                    System.out.println("Fichero generado exitosamente! Podrá verlo cuando cierre el programa...\n");
                } else {
                    System.out.println("Gracias por utilizar mi programa!");
                }

            } while (eleccion != 0);
            in.close();


        } catch (IOException e) {
            System.out.println("¡¡¡ERROR - FICHERO NO ENCONTRADO!!! El error es: " + e.getMessage());
        }
    }

    private static void ficheroEnMayusculas(byte[] datos) throws IOException {

        try {
            PrintStream fileOut = new PrintStream("myFileCopyMayus.txt");

            StringBuilder letterMayus = new StringBuilder();
            for (byte dato : datos) {
                char letter = (char) dato;
                letterMayus.append(Character.toString(letter).toUpperCase());
            }
            fileOut.print(letterMayus);
            fileOut.close();


        } catch (IOException e) {
            System.out.println("FICHERO NO ENCONTRADO!!! El error es: " + e.getMessage());
        }

    }

    private static void ficheroEnMinusculas(byte[] datos) throws IOException {

        try {
            PrintStream fileOut = new PrintStream("myFileCopyMinus.txt");

            StringBuilder letterMinus = new StringBuilder();
            for (byte dato : datos) {
                char letter = (char) dato;
                letterMinus.append(Character.toString(letter).toLowerCase());
            }
            fileOut.print(letterMinus);
            fileOut.close();


        } catch (IOException e) {
            System.out.println("FICHERO NO ENCONTRADO!!! El error es: " + e.getMessage());
        }

    }

    private static void ficheroInvertirMayusMinus(byte[] datos) throws IOException{

        try {
            PrintStream fileOut = new PrintStream("myFileCopyMinusMayus.txt");

            StringBuilder letterString = new StringBuilder();
            for (byte dato : datos) {
                char letter = (char) dato;

                if (letter >= 'a' && letter <= 'z') {
                    letterString.append(Character.toString(letter).toUpperCase());
                } else {
                    letterString.append(Character.toString(letter).toLowerCase());
                }

            }
            fileOut.print(letterString);
            fileOut.close();


        } catch (IOException e) {
            System.out.println("FICHERO NO ENCONTRADO!!! El error es: " + e.getMessage());
        }

    }

    private static void ficheroArrayList(byte[] datos) throws IOException{

        try {
            PrintStream fileOut = new PrintStream("myFileCopyInverted.txt");
            ArrayList<Character> letterList = new ArrayList<>(5000);
            for (byte dato : datos) {
                char letter = (char) dato;
                letterList.add(letter);
            }

            fileOut.print(letterList);
            fileOut.close();

        } catch (IOException e) {
            System.out.println("FICHERO NO ENCONTRADO!!! El error es: " + e.getMessage());
        }

    }

    private static void ficheroContarVocales(byte[] datos) throws IOException{

        try {
            PrintStream fileOut = new PrintStream("myFileVowelCounter.txt");
            HashMap<Character,Integer> letterMap = new HashMap<>();
            StringBuilder letterMinus = new StringBuilder();
            int contadorA = 0;
            int contadorE = 0;
            int contadorI = 0;
            int contadorO = 0;
            int contadorU = 0;
            int contadorOtro = 0;

            for (byte dato : datos) {
                char letter = (char) dato;
                letterMinus.append(Character.toString(letter).toLowerCase());
            }

            for (int i = 0; i < letterMinus.length(); i++) {
                if (letterMinus.charAt(i) == 'a'){
                    contadorA++;
                    letterMap.put('a', contadorA);
                } else if (letterMinus.charAt(i) == 'e'){
                    contadorE++;
                    letterMap.put('e', contadorE);
                } else if (letterMinus.charAt(i) == 'i'){
                    contadorI++;
                    letterMap.put('i', contadorI);
                } else if (letterMinus.charAt(i) == 'o'){
                    contadorO++;
                    letterMap.put('o', contadorO);
                } else if (letterMinus.charAt(i) == 'u'){
                    contadorU++;
                    letterMap.put('u', contadorU);
                } else {
                    contadorOtro++;
                    letterMap.put('?', contadorOtro);
                }
            }

            fileOut.print(letterMap);
            fileOut.close();

        } catch (IOException e) {
            System.out.println("FICHERO NO ENCONTRADO!!! El error es: " + e.getMessage());
        }
    }

    private static int menu() {
        System.out.println("A continuación seleccione una opción para definir que hacer con la copia del archivo:");
        System.out.println("    1 - Convertir todos los caracteres a mayúsculas.");
        System.out.println("    2 - Convertir todos los caracteres a minúsculas.");
        System.out.println("    3 - Invertir caracteres de mayúsculas a minúsculas y viceversa.");
        System.out.println("    4 - Invertir por completo el archivo.");
        System.out.println("    5 - Contar vocales del archivo y poner estos valores en uno nuevo.");
        System.out.println("\n    0 - Salir.\n");

        int opcion;
        boolean valid = false;
        do {
            System.out.println("Elija una opción entre 1 y 5 (0 para finalizar): ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            if (opcion < 0 || opcion > 5){
                System.out.println("Ingresó una opción invalida, por favor intente nuevamente.");
            } else {
                valid = true;
            }
        } while (!valid);

        return opcion;
    }

}
