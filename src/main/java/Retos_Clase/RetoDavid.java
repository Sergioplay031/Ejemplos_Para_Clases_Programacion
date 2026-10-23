/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos_Clase;

import java.util.Scanner;

/**
 *
 * @author Sergio 
 * todo 💪 Reto de la semana El compañero David Gázquez propone
 * el siguiente reto:
 *
 * Una empresa de informática está buscando candidatos para una entrevista de
 * trabajo, sus criterios son poseer al menos dos títulos de los siguientes:
 * Doctorado, máster, grado o fp de grado superior relacionados con la
 * informática.
 *
 * ¡A programar!
 *
 */
public class RetoDavid {

    private static Scanner teclado = new Scanner(System.in);
    private static String titulo1;
    private static String titulo2;
    private static boolean encontroTitulo1 = false;
    private static boolean encontroTitulo2 = false;

    private static void mostrarPreseleccion() {
        compararTitulos();
        if (encontroTitulo1 != false && encontroTitulo2 != false) {
            System.out.println("A sido preseleccionado para la entrevista");
        } else {
            System.out.println("No a sido preseleccionado para la entrevista");
        }
    }

    private static void compararTitulos() {
        solicitarTitulos();
        String[] valoresDeTitulosValidos = {"Doctorado", "Master", "Grado",
            "SMR", "ASIR", "DAW", "DAM"};

        for (String titulos : valoresDeTitulosValidos) {
            if (titulos.equalsIgnoreCase(titulo1)) {
                encontroTitulo1 = true;
            }
            if (titulos.equalsIgnoreCase(titulo2)) {
                encontroTitulo2 = true;
            }
        }
    }

    private static void solicitarTitulos() {
        System.out.println("Dime que dos titulos tienes (Doctorado, máster, "
                + "grado, SMR, DAM, DAW, ADIR): ");
        titulo1 = teclado.next();
        titulo2 = teclado.next();
    }

    public static void main(String[] args) {

        mostrarPreseleccion();

        teclado.close();
    }

}
