/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos_Clase;

import java.util.Scanner;

/**
 *
 * @author Sergio
 * 
 * todo 💪 Reto de la semana El compañero David Gázquez propone
 * el siguiente reto:
 *
 * Una empresa de informática está buscando candidatos para una entrevista de
 * trabajo, sus criterios son poseer al menos dos títulos de los siguientes:
 * Doctorado, máster, grado o fp de grado superior relacionados con la
 * informática.
 *
 * ¡A programar!
 */
public class RetoDavid2 {

    private static Scanner teclado = new Scanner(System.in);

    private static void comparacionDosTitulos() {
        int contador = 0;
        contador = titulosObtenidos(contador);

        if (contador >= 2) {
            System.out.println("Enhorabuena, cumples los requisitos para la entrevista.");
        } else {
            System.out.println("Lo sentimos, no cumples los requisitos para la entrevista.");
        }
    }

    private static int titulosObtenidos(int contador) {
        String respuesta;
        System.out.println("¿Tienes un doctorado en informática? (S/N)");
        respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("S")) {
            contador++;
        }
        System.out.println("¿Tienes un máster en informática? (S/N)");
        respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("S")) {
            contador++;
        }
        System.out.println("¿Tienes un grado universitario en informática? (S/N)");
        respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("S")) {
            contador++;
        }
        System.out.println("¿Tienes una FP de Grado Superior en informática? (S/N)");
        respuesta = teclado.next();
        if (respuesta.equalsIgnoreCase("S")) {
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {

        comparacionDosTitulos();

        teclado.close();
    }

}
