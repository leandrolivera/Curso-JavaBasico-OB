package com.leandroolivera.Tema6_7_8_Ejercicio1;

import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto1.punto1;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto2.punto2;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto3.punto3;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto4.punto4;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto5.punto5;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto6.punto6;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto7.punto7;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto8.punto8;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto9.punto9;
import static com.leandroolivera.Tema6_7_8_Ejercicio1.Punto10.punto10;

/**
 * @author Leandro Olivera
 * Java Básico - Open Bootcamp
 * Tema 6, 7 y 8 - Ejercicio 1
 *
 * Dada la función:
 *
 * public static String reverse(String texto) { }
 *
 *         1- Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar
 *         "odnum aloh".
 *
 *         2- Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 *
 *         3- Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en
 *         ambas dimensiones.
 *
 *         4- Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y
 *         muestra el resultado final.
 *
 *         5- Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos
 *         para ser añadidos al mismo.
 *
 *         6- Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
 *         únicamente el valor de cada elemento.
 *
 *         7- Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
 *         con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList
 *         final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 *
 *         8- Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
 *         ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la
 *         excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso:
 *         "Demo de código".
 *
 *         9- Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 *         La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
 *         dado en "fileOut".
 *
 *         10- Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap
 *         y un ArrayList, LinkedList o array.
 */



public class Main {

    public static void main(String[] args) {

        punto1();
        punto2();
        punto3();
        punto4();
        punto5();
        punto6();
        punto7();
        punto8();
        punto9();
        punto10();

    }
}
