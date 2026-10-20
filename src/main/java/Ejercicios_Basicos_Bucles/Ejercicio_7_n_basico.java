
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package Ejercicios_Basicos_Bucles;

import java.util.Scanner;

/**
 * Ejercicio 7: Conversión de un número a un carácter ASCII.
 *
 * Este ejercicio solicita un número por teclado y muestra por consola el
 * carácter correspondiente a dicho número en la tabla ASCII.
 *
 * Por ejemplo, si se introduce el número 51, se mostrará el carácter '3', ya
 * que ese es el carácter asociado al código ASCII 51.
 *
 * @author Sergio
 */
public class Ejercicio_7_n_basico {

    // Declaración de variables estáticas.
    private static int numero;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que solicita un número por teclado y muestra el carácter
     * correspondiente a su código ASCII.
     *
     * Para realizar la conversión, se utiliza un casting explícito,
     * convirtiendo el valor de tipo int a tipo char.
     *
     * Pasos del método: 1. Solicitar un número al usuario. 2. Leer el número
     * introducido por teclado. 3. Convertir el número entero a un carácter
     * mediante casting. 4. Mostrar por consola el carácter obtenido.
     */
    private static void caracterSegunNumeroAscii() {
        System.out.println("Dime un numero mayor de 1 para realizar la conversion en ASCII: ");
        numero = sc.nextInt();

        char caracter_ascii = (char) numero;

        System.out.println("El caracter es: " + caracter_ascii);
    }


    public static void main(String[] args) {
        caracterSegunNumeroAscii();
        sc.close();
    }

}
