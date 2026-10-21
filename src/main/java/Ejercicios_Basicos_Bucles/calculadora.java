/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Basicos_Bucles;

import java.util.Scanner;

/**
 * Calculadora básica utilizando un menú de opciones y una estructura switch.
 *
 * Permite realizar las siguientes operaciones: 1. Sumar dos números. 2. Restar
 * dos números. 3. Multiplicar dos números. 4. Dividir dos números. 0. Salir del
 * programa.
 *
 * @author Sergio
 */
public class calculadora {

    // Objeto Scanner para leer los datos introducidos por teclado.
    private static Scanner teclado = new Scanner(System.in);

    // Valor que indica que el usuario quiere salir del programa.
    private static final int SALIR = 0;

    // Opción seleccionada por el usuario en el menú.
    private static int opcion;

    // Variables que almacenan los dos números introducidos.
    private static double numero1;
    private static double numero2;

    // Variable que almacena el resultado de la operación.
    private static double resultado;

    /**
     * Ejecuta la calculadora y permite realizar operaciones hasta que el
     * usuario seleccione la opción de salir.
     */
    private static void calculadora() {

        // Repite el menú y las operaciones mientras el usuario no quiera salir.
        do {

            // Muestra el menú y lee la opción seleccionada.
            leerOpcionTeclado();

            

            // Ejecuta la operación correspondiente a la opción seleccionada.
            switch (opcion) {
                case 1 -> {
                    soilicitudNumeros();
                    resultado = numero1 + numero2;
                    System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                    System.out.println("");
                }
                case 2 -> {
                    soilicitudNumeros();
                    resultado = numero1 - numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                    System.out.println("");
                }
                case 3 -> {
                    resultado = numero1 * numero2;
                    System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                    System.out.println("");
                }
                case 4 -> {
                    soilicitudNumeros();
                    // Comprueba que al menos uno de los números sea distinto de cero.
                    if (numero1 != 0 || numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                        System.out.println("");

                        // Muestra un mensaje si ambos números son cero.
                    } else {
                        System.out.println("Error");
                    }
                }
                case 0 -> {
                    System.out.println("Salimos del programa");
                }
                default ->
                    System.out.println("La opcion no esta disponible");
            }
            // Repite el proceso mientras la opción seleccionada no sea 0.
        } while (opcion != SALIR);
    }

    private static void soilicitudNumeros() {
        // Solicita el primer número.
        System.out.println("Dime el primer numero: ");
        numero1 = teclado.nextInt();
        
        // Solicita el segundo número.
        System.out.println("Dime el segundo nnumero: ");
        numero2 = teclado.nextInt();
    }

    /**
     * Muestra el menú de la calculadora y lee la opción elegida por el usuario.
     */
    private static void leerOpcionTeclado() {

        // Muestra las operaciones disponibles.
        System.out.println("Opcion de la calculadora");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("0.Salir");

        // Guarda la opción introducida por teclado.
        opcion = teclado.nextInt();
    }

    public static void main(String[] args) {

        // Ejecuta el método principal de la calculadora.
        calculadora();

        // Cierra el Scanner cuando termina el programa.
        teclado.close();
    }

}
