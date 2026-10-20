
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
 * Ejercicio 6: Suma de los números desde 1 hasta el número indicado.
 *
 * Este ejercicio solicita al usuario un número mayor que 1 y calcula la suma de
 * todos los números enteros desde 1 hasta el número introducido.
 *
 * Si el usuario introduce un número menor o igual que 1, deberá introducir otro
 * número hasta cumplir la condición solicitada.
 *
 * @author Sergio
 */
public class Ejercicio_6_n_basico {

    // Declaración e inicialización de las variables estáticas.
    private static double suma = 0;
    private static double numero;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que solicita un número mayor que 1 y calcula la suma de los
     * números comprendidos entre 1 y el número introducido.
     *
     * Pasos del método: 1. Solicitar un número al usuario. 2. Utilizar un bucle
     * do-while para comprobar que el número introducido sea mayor que 1. 3. Si
     * el número es menor o igual que 1, volver a solicitarlo hasta que se
     * cumpla la condición. 4. Utilizar un bucle for para recorrer los números
     * desde 1 hasta el número indicado y acumular su suma en la variable suma.
     * 5. Mostrar por consola el resultado de la suma.
     */
    private static void sumaNumeroMayorUno() {
        System.out.println("Dime un numero mayor de 1 para realizar la suma: ");
        do {
            numero = sc.nextDouble();
            if (numero <= 1) {
                System.out.println("Dime un numero mayor de 1 para realizar la suma: ");
            }
        } while (numero <= 1);

        for (double contador = 1; contador <= numero; contador++) {
            suma = suma + contador;
        }

        System.out.println("El resultado de la suma es: " + suma);
    }


    public static void main(String[] args) {
        sumaNumeroMayorUno();
        sc.close();
    }

}
