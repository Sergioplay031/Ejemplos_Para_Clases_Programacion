/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package ejercicio_19_n_basico;

import java.util.Scanner;

/**
 * Ejercicio 19: Cálculo del factorial de un número.
 *
 * Este ejercicio solicita un número por teclado y calcula su factorial
 * mediante un bucle do-while.
 *
 * El factorial de un número entero positivo se obtiene multiplicando
 * dicho número por todos los números enteros positivos anteriores hasta
 * llegar a 1.
 *
 * Por ejemplo:
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 *
 * @author Sergio
 */
public class Ejercicio_19_n_basico {

    // Declaración de las variables estáticas utilizadas en el ejercicio.
    private static double numero_solicitado;
    private static double factorial;
    private static double numero = 0;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que solicita un número por teclado y calcula su factorial.
     *
     * Pasos del método:
     * 1. Solicitar al usuario el número del que desea calcular el factorial.
     * 2. Leer y almacenar el número introducido por teclado.
     * 3. Inicializar la variable factorial con el número solicitado.
     * 4. Utilizar el operador de decremento para obtener el número anterior
     *    y almacenarlo en la variable numero.
     * 5. Utilizar un bucle do-while para multiplicar el resultado acumulado
     *    por los números anteriores.
     * 6. Decrementar la variable numero en cada iteración.
     * 7. Mostrar por consola el resultado acumulado en cada iteración.
     * 8. Repetir el proceso mientras el valor de numero sea distinto de 1.
     */
    private static void calcularFactorial() {
        System.out.println("Dime un numero para sacar el fectorial de dicho numero: ");
        numero_solicitado = sc.nextDouble();

        factorial = numero_solicitado;
        numero = --numero_solicitado;

        do {
            factorial = factorial * numero;
            numero--;
            System.out.println("El resultado factorial del numero es el siguiente: " + factorial);
        } while (numero != 1);
    }

    public static void main(String[] args) {

        calcularFactorial();
        sc.close();
    }

}