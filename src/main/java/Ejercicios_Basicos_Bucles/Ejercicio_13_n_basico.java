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
 * Ejercicio 13: Comprobación de un número mayor o igual que cero.
 *
 * Este ejercicio solicita un número por teclado y comprueba que sea mayor o
 * igual que cero.
 *
 * Si el número introducido es negativo, se vuelve a solicitar mediante un bucle
 * do-while hasta que se cumpla la condición establecida.
 *
 * Una vez introducido un número válido, se muestra por consola si es igual a
 * cero o mayor que cero.
 *
 * @author Sergio
 */
public class Ejercicio_13_n_basico {

    // Variable que almacena el número introducido por el usuario.
    private static double numero;

    // Objeto Scanner utilizado para leer los datos introducidos por teclado.
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que solicita un número y comprueba si es mayor o igual que cero.
     *
     * Pasos del método: 1. Solicitar un número al usuario. 2. Leer el número
     * introducido mediante Scanner. 3. Comprobar la condición del bucle
     * do-while. 4. Si el número es negativo, volver a solicitarlo. 5. Cuando se
     * introduce un número válido, comprobar si es igual a cero o mayor que
     * cero. 6. Mostrar por consola el mensaje correspondiente.
     *
     * El bucle do-while ejecuta su bloque de instrucciones al menos una vez, ya
     * que la condición se comprueba al finalizar cada iteración.
     */
    private static void numeroIgualMayorCero() {
        do {
            System.out.println("Dime un numero mayor o igual que 0: ");
            numero = sc.nextDouble();
        } while (numero <= 0);

        if (numero == 0) {
            System.out.println("El numero " + numero + " es igual a 0");
        } else if (numero > 0) {
            System.out.println("El numero " + numero + " es mayor que 0");
        }
    }

    public static void main(String[] args) {

        numeroIgualMayorCero();
    }

}
