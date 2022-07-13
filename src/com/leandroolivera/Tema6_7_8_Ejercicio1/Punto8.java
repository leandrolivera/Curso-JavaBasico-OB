package com.leandroolivera.Tema6_7_8_Ejercicio1;

import java.util.Scanner;

public class Punto8 {

    public static void punto8(){
        //Punto 8
        //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        //ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la
        //excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso:
        //"Demo de código".

        System.out.println("\nParte 8:");
        System.out.println("A continuación debe escribir dos valores enteros para realizar una división: ");
        boolean valid = false;
        int valorA = 0;
        int valorB = 0;
        int resultado;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("VALOR A: ");
                valorA = scanner.nextInt();
                System.out.print("VALOR B: ");
                valorB = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Ingresó un dato inválido, por favor intente nuevamente:");
            }
        } while (!valid);

        try {
            resultado = dividePorCero(valorA, valorB);
            System.out.println("El resultado de dividir " + valorA + "/" + valorB + " es => " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static int dividePorCero(int valorA, int valorB) throws ArithmeticException {

        int resultado;
        try {
            resultado = valorA / valorB;
            return resultado;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

}
