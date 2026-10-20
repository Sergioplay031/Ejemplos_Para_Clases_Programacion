
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
 * Ejercicio 18: Operaciones con una serie de números.
 *
 * Este ejercicio solicita números al usuario hasta que introduzca -1, valor que
 * se utiliza para finalizar el programa y que no debe contar en ninguna de las
 * operaciones.
 *
 * Al finalizar, se muestran los siguientes resultados: - El mayor número
 * introducido. - El menor número introducido. - La suma de todos los números. -
 * La suma de los números positivos. - La suma de los números negativos. - La
 * media de los números introducidos.
 *
 * @author Sergio
 */
public class Ejercicio_18_n_basico {

    // Declaración de las variables utilizadas para realizar los cálculos.
    private static int numero;
    private static int numero_mayor = 0;
    private static int numero_menor = 0;
    private static int suma_total = 0;
    private static int suma_positivos = 0;
    private static int suma_negativos = 0;
    private static int media_suma = 0;
    private static int contador = 0;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que muestra por consola los resultados de las operaciones.
     *
     * Se muestran el número mayor, el número menor, la suma total, la suma de
     * los positivos, la suma de los negativos y la media.
     */
    private static void mostrarResultados() {
        System.out.println(numero_mayor);
        System.out.println(numero_menor);
        System.out.println(suma_total);
        System.out.println(suma_positivos);
        System.out.println(suma_negativos);
        System.out.println(media_suma);
    }

    /**
     * Método que solicita números al usuario y realiza las operaciones.
     *
     * Pasos del método: 1. Solicitar números por teclado mediante un bucle
     * do-while. 2. Finalizar el bucle cuando el usuario introduzca -1. 3.
     * Comprobar el mayor y el menor de los números válidos. 4. Calcular la suma
     * total de los números introducidos. 5. Acumular por separado los números
     * positivos y negativos. 6. Contar los números válidos para calcular la
     * media. 7. Excluir el -1 de todas las operaciones, ya que solo sirve como
     * valor de salida del programa.
     */
    private static void operacionesCondicionesEjercicio() {
        do {
            System.out.println("Dime un numero si quieres salir introduce -1: ");
            numero = sc.nextInt();

            if (numero != -1) {

                if (contador == 0) {
                    numero_mayor = numero;
                    numero_menor = numero;
                }

                if (numero_menor > numero) {
                    numero_menor = numero;
                }

                if (numero_mayor < numero) {
                    numero_mayor = numero;
                }

                suma_total = suma_total + numero;

                if (numero > 0) {
                    suma_positivos = suma_positivos + numero;
                }

                if (numero < 0) {
                    suma_negativos = suma_negativos + numero;
                }

                contador++;
                media_suma = suma_total / contador;
            }

        } while (numero != -1);
    }

    public static void main(String[] args) {

        operacionesCondicionesEjercicio();

        mostrarResultados();
    }
}
