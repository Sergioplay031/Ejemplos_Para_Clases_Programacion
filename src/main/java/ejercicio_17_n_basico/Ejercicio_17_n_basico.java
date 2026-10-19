/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package ejercicio_17_n_basico;

import java.util.Scanner;

/**
 * Ejercicio 17: Contar los números introducidos por teclado.
 *
 * Este ejercicio solicita números al usuario hasta que introduzca -1, que se
 * utiliza como valor de salida para finalizar el programa.
 *
 * Al terminar, muestra el número total de valores introducidos, sin contar el
 * -1, ya que únicamente sirve para finalizar el bucle.
 *
 * @author Sergio
 */
public class Ejercicio_17_n_basico {

    // Declaración de las variables estáticas utilizadas en el ejercicio.
    private static int numero;
    private static int contador = 0;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que solicita números por teclado y cuenta cuántos se han
     * introducido, excluyendo el valor -1.
     *
     * Pasos del método: 1. Solicitar un número al usuario. 2. Leer y almacenar
     * el número introducido por teclado. 3. Incrementar el contador para
     * registrar cada entrada. 4. Repetir el proceso mediante un bucle do-while
     * mientras el número introducido sea distinto de -1. 5. Restar una unidad
     * al contador para excluir el -1 del total. 6. Mostrar por consola el
     * número total de valores válidos.
     */
    private static void calcularNumerosIntroducidos() {
        do {
            System.out.println("Dime un numero si quieres salir introduce -1: ");
            numero = sc.nextInt();
            contador++;
        } while (numero != -1);

        System.out.println("El numero introducido totales son: " + --contador);
    }

    public static void main(String[] args) {

        calcularNumerosIntroducidos();
        sc.close();
    }

}
