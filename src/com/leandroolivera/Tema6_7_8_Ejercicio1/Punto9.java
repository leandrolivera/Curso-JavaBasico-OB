package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Punto9 {

    public static void punto9() {
        //Punto 9
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        //La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        //dado en "fileOut".

        System.out.println("\nParte 9:");
        System.out.println("El fichero original es JavaBasicoEjercicios.iml y la copia se realiza dentro de la carpeta del proyecto...");
        System.out.println("Presione ENTER para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        try {
            InputStream fileIn = new FileInputStream("JavaBasicoEjercicios.iml");
            PrintStream fileOut = new PrintStream("myFileCopy.txt");

            copyFiles(fileIn, fileOut);
            fileIn.close();
            fileOut.close();
            System.out.println("Fichero copiado exitosamente!");
        } catch (IOException e ) {
            System.out.println("¡¡¡ERROR - FICHERO NO ENCONTRADO!!! El error es: " + e.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void copyFiles(InputStream fileIn, PrintStream fileOut) throws IOException {
        byte[] datos = fileIn.readAllBytes();
        fileOut.write(datos);
    }

}
