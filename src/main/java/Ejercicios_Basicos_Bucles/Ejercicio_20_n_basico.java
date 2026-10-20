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
 * Ejercicio 20: Suma de números pares e impares.
 *
 * Este ejercicio solicita un número por teclado y calcula por separado
 * la suma de los números pares y la suma de los números impares desde
 * el valor inicial del contador hasta el número introducido.
 *
 * Al finalizar, muestra por consola el resultado de ambas sumas.
 *
 * @author Sergio
 */
public class Ejercicio_20_n_basico {

    // Declaración de las variables estáticas utilizadas en el ejercicio.
    private static int numero_solicitado;
    private static int suma_pares = 0;
    private static int suma_impares = 0;
    private static int contador = 0;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que solicita un número por teclado y calcula las sumas
     * de los números pares e impares hasta alcanzar el límite indicado.
     *
     * Pasos del método:
     * 1. Solicitar un número al usuario y almacenarlo en una variable.
     * 2. Inicializar las variables de suma de pares e impares con el
     *    valor actual del contador.
     * 3. Utilizar un bucle do-while para recorrer los números hasta
     *    alcanzar el número solicitado.
     * 4. Comprobar si el contador es par mediante el operador módulo (%).
     * 5. Si el contador es par, acumular su valor en suma_pares.
     * 6. Si no es par, acumular su valor en suma_impares.
     * 7. Incrementar el contador para continuar con el siguiente número.
     * 8. Mostrar por consola las sumas totales de pares e impares.
     */
    private static void sumaParesImpares() {
        System.out.println("Dime un numero para multiplicar los numeros pares e impares: ");
        numero_solicitado = sc.nextInt();

        suma_pares = contador;
        suma_impares = contador;

        do {
            if (contador % 2 == 0) {
                suma_pares = suma_pares + contador;
            } else if (contador % 1 == 0) {
                suma_impares = suma_impares + contador;
            }
            contador++;
        } while (contador <= numero_solicitado);

        System.out.println("Total suma de pares: " + suma_pares);
        System.out.println("Total suma de impares: " + suma_impares);
    }


    public static void main(String[] args) {

        sumaParesImpares();
        sc.close();
    }

}