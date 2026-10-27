/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos_Clase;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Sergio
 *
 * El compañero Mecislovas Rivas propone el siguiente reto:
 *
 * Para tener mas completo el ejercicio del proyecto de KickStarter, podríamos
 * tener un menú de opciones para:
 *
 * Ver el importe total necesario para realizar el proyecto. Ver el número de
 * aportaciones que lleva el proyecto. Ver el total de aportaciones que se han
 * hecho. Ver cuánto queda para alcanzar el dinero necesario para el proyecto.
 * Realizar una aportación Salir del proyecto. ¡A programar!
 */
public class RetoMiscilovasRivas {

    private static double dineroProyecto;
    private static int aportaciones;
    private static final int SALIR = 0;
    private static int opcion;
    private static double sumaImporteAportaciones = 0;

    private static void solucionesDiferentesOpciones(Scanner leerTeclado) {
        do {
            menuPrograma(leerTeclado);

            switch (opcion) {
                case 1 -> {
                    System.out.println("Cuanto va a ser el importe total del proyecto: ");
                    dineroProyecto = leerTeclado.nextDouble();
                }
                case 2 -> {
                    System.out.println("El importe total del proyecto es de : "
                            + dineroProyecto);
                }
                case 3 -> {
                    System.out.println("El numero de aportaciones total es de : "
                            + aportaciones);
                }
                case 4 -> {
                    if (sumaImporteAportaciones < dineroProyecto) {
                        System.out.println("Queda este importe para "
                                + "finalizar el proyecto : "
                                + (dineroProyecto - sumaImporteAportaciones));
                    } else {
                        System.out.println("Ya hemos llegado al importe "
                                + "maximo del proyecto a sobrado "
                                + (sumaImporteAportaciones - dineroProyecto));
                    }
                }
                case 5 -> {
                    System.out.println("Cuanto quieres aportar: ");
                    double dineroAportado = leerTeclado.nextDouble();
                    if (dineroAportado < 0) {
                        System.out.println("Lo siento no se puede poner "
                                + "numeros negativos al proyecto ");
                    } else {
                        sumaImporteAportaciones += dineroAportado;
                        aportaciones += 1;
                    }
                }
                case 0 -> {
                    System.out.println("Salimos del programa");
                }
                default ->
                    System.out.println("Lo siento no tenemos "
                            + "la opcion que seleccionastes");

            }
        } while (opcion != SALIR);
    }

    private static void menuPrograma(Scanner leerTeclado) {
        System.out.println("1.Importe total del proyecto");
        System.out.println("2.Consulta del importe total del proyecto");
        System.out.println("3.Numero de aportaciones");
        System.out.println("4.Cuanto queda para llegar al importe total");
        System.out.println("5.Dinero a aportar");
        System.out.println("0.Salir");
        opcion = leerTeclado.nextInt();
    }

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);

        solucionesDiferentesOpciones(leerTeclado);

        leerTeclado.close();
    }

}
