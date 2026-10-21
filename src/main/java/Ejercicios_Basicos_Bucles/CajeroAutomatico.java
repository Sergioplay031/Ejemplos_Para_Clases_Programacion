/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Basicos_Bucles;

import java.util.Scanner;

/**
 *
 * @author Sergio
 *
 * Ejercicio A: El Cajero Automático (Menú con do-while y Saldo Acumulado)
 * Escribe un programa que simule un cajero automático sencillo.
 *
 * El saldo inicial de la cuenta es de 1000.00 €.
 *
 * El programa debe mostrar un menú repetitivo con las siguientes opciones:
 *
 * Consultar saldo.
 *
 * Ingresar dinero (pide la cantidad a sumar al saldo; si es negativa o cero,
 * muestra error).
 *
 * Retirar dinero (pide la cantidad a restar; si supera el saldo actual, muestra
 * un aviso de fondos insuficientes).
 *
 * Salir.
 *
 * El programa debe seguir repitiéndose hasta que el usuario pulse la opción 4.
 */
public class CajeroAutomatico {

    private static final int SALIR = 0;
    private static double saldoActual = 1000.00;
    private static Scanner teclado = new Scanner(System.in);
    private static int opcion;

    /**
     * Método que controla las operaciones del cajero automático. Muestra el
     * menú y ejecuta la opción elegida por el usuario. Se repite hasta que el
     * usuario selecciona salir.
     */
    private static void operacionesCajero() {
        do {
            leerOpcion();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Su saldo es de: " + saldoActual);
                }
                case 2 -> {
                    System.out.println("Cuanto dinero quieres ingresar: ");
                    double ingreso = teclado.nextDouble();
                    if (ingreso >= 1) {
                        saldoActual = saldoActual + ingreso;
                        System.out.println("Su saldo es de: " + saldoActual);
                    } else {
                        System.out.println("Error");
                    }
                }
                case 3 -> {
                    System.out.println("Cuanto dinero quieres ingresar: ");
                    double retiro = teclado.nextDouble();
                    if (retiro >= 1 && retiro <= saldoActual) {
                        saldoActual = saldoActual - retiro;
                        System.out.println("Su saldo es de: " + saldoActual);
                    } else {
                        System.out.println("fondos insuficientes");
                    }
                }
            }
        } while (opcion != SALIR);
    }

    private static void leerOpcion() {
        System.out.println("1.Comprobrar Saldo Actual");
        System.out.println("2.Ingresar dinero");
        System.out.println("3.Retirar Dinero");
        System.out.println("0.Salir");
        opcion = teclado.nextInt();
    }

    public static void main(String[] args) {
        operacionesCajero();
        teclado.close();
    }

}
