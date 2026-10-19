/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package ejercicio_12_n_basico;

import java.util.Scanner;

/**
 * Ejercicio 12: Cálculo del importe total de varias ventas.
 *
 * Este ejercicio solicita al usuario el número de ventas que desea introducir.
 * A continuación, solicita el precio de cada venta y acumula sus importes para
 * calcular la suma total.
 *
 * Al finalizar, muestra por consola el número de ventas introducidas y el
 * importe total acumulado.
 *
 * @author Sergio
 */
public class Ejercicio_12_n_basico {

    // Variable que almacena el número total de ventas que se van a introducir.
    private static int numero_ventas;

    // Contador que identifica cada venta durante la introducción de datos.
    // Se inicializa en 1 para comenzar con la primera venta.
    private static int contador = 1;

    // Variable que almacena temporalmente el precio de cada venta.
    private static double precio_venta;

    // Acumulador que almacena la suma de los importes de todas las ventas.
    // Se inicializa en 0 porque todavía no se ha sumado ninguna venta.
    private static double suma_venta = 0;

    // Objeto Scanner utilizado para leer los datos introducidos por teclado.
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que solicita el precio de cada venta y calcula el importe total.
     *
     * Pasos del método: 1. Solicitar el precio de una venta mostrando su número
     * mediante la variable contador. 2. Leer el precio introducido por teclado.
     * 3. Acumular el precio en la variable suma_venta. 4. Incrementar el
     * contador para pasar a la siguiente venta. 5. Repetir el proceso mientras
     * el contador sea menor o igual que el número de ventas indicado por el
     * usuario. 6. Mostrar el número de ventas y la suma total de sus importes.
     *
     * Se utiliza un bucle do-while para ejecutar el bloque de instrucciones al
     * menos una vez antes de comprobar la condición de repetición.
     */
    private static void precioVenta() {
        do {
            System.out.println("Dime el precio de la venta " + contador + " : ");
            precio_venta = sc.nextDouble();
            suma_venta = suma_venta + precio_venta;
            contador++;
        } while (contador <= numero_ventas);

        System.out.println("Las ventas han sido: " + numero_ventas);
        System.out.println("La suma total de las ventas son: " + suma_venta);
    }

    /**
     * Método que solicita al usuario el número de ventas que desea introducir.
     *
     * Lee el valor introducido por teclado y lo almacena en la variable
     * numero_ventas, que posteriormente se utiliza como límite del bucle.
     */
    private static void solicitarVentas() {
        System.out.println("Dime cuantos numeros de ventas quieres introducir: ");
        numero_ventas = sc.nextInt();
    }

    public static void main(String[] args) {

        solicitarVentas();

        precioVenta();
        sc.close();
    }

}
