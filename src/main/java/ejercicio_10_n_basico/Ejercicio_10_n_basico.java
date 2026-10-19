/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package ejercicio_10_n_basico;

/**
 * Ejercicio 10: Mostrar los números del 1 al 100.
 *
 * Este ejercicio muestra por consola los números comprendidos entre
 * el 1 y el 100, ambos incluidos, utilizando dos estructuras repetitivas:
 * el bucle while y el bucle for.
 *
 * El objetivo es aprender a utilizar ambos bucles para recorrer una
 * secuencia de números y observar las diferencias entre sus estructuras.
 *
 * @author Sergio
 */
public class Ejercicio_10_n_basico {

    // Variable estática que se utiliza como contador del bucle while.
    // Se inicializa en 1 para comenzar a mostrar los números desde ese valor.
    private static int contador = 1;

    /**
     * Método que muestra los números del 1 al 100 utilizando un bucle for.
     *
     * El bucle for reúne en su estructura la inicialización del contador,
     * la condición de repetición y el incremento que se realiza en cada vuelta.
     *
     * Pasos del método:
     * 1. Inicializar la variable contador_for en 1.
     * 2. Comprobar que el contador sea menor o igual que 100.
     * 3. Mostrar el valor del contador por consola.
     * 4. Incrementar el contador en una unidad.
     * 5. Repetir el proceso hasta que se supere el número 100.
     */
    private static void mostrarNumerosFor() {
        for (int contador_for = 1; contador_for <= 100; contador_for++) {
            System.out.println("Mostrando numeros con for: " + contador_for);
        }
    }

    /**
     * Método que muestra los números del 1 al 100 utilizando un bucle while.
     *
     * El bucle while comprueba una condición antes de ejecutar las
     * instrucciones que contiene. Mientras la condición sea verdadera,
     * seguirá repitiendo el bloque de código.
     *
     * Pasos del método:
     * 1. Comprobar que la variable contador sea menor o igual que 100.
     * 2. Mostrar el valor actual del contador por consola.
     * 3. Incrementar el contador en una unidad.
     * 4. Volver a comprobar la condición para decidir si continúa el bucle.
     * 5. Finalizar cuando el contador sea mayor que 100.
     */
    private static void mostrarNumerosWhile() {
        while (contador <= 100) {
            System.out.println("Mostrando numeros con while: " + contador);
            contador++;
        }
    }

    public static void main(String[] args) {

        mostrarNumerosWhile();

        System.out.println("----------------------------------------------");

        mostrarNumerosFor();
        
    }

}