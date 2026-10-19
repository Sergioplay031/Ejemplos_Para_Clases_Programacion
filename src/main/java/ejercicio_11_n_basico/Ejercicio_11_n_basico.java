/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_11_n_basico;

/**
 * Ejercicio 11 - Nivel básico.
 *
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
 * Utiliza el bucle que quieras.
 *
 * @author Sergio
 */
public class Ejercicio_11_n_basico {

    // Variable que utilizaremos para recorrer los números del 1 al 100.
    private static int contador = 1;

    /**
     * Comprueba los números del 1 al 100 y muestra aquellos que son divisibles
     * entre 2 o entre 3.
     *
     * Se utiliza un bucle do-while para repetir el proceso hasta llegar al 100.
     */
    private static void numerosDivisibles() {

        // El bucle comienza comprobando el valor actual de contador.
        do {

            // Comprueba si el número es divisible entre 2.
            if (contador % 2 == 0) {
                System.out.println("El numero es divisible entre 2: " + contador);

                // Si no es divisible entre 2, comprueba si es divisible entre 3.
            } else if (contador % 3 == 0) {
                System.out.println("El numero es divisible entre 3: " + contador);
            }

            // Incrementa el contador para comprobar el siguiente número.
            contador++;

            // Repite el bucle mientras contador sea menor o igual que 100.
        } while (contador <= 100);
    }

    public static void main(String[] args) {

        // Ejecuta el método que comprueba los números del 1 al 100.
        numerosDivisibles();
    }

}
