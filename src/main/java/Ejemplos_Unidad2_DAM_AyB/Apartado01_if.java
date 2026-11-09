package Ejemplos_Unidad2_DAM_AyB;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Apartado01_if {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int edad = leerNumero(leerTeclado, "Dime tu edad: ");

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            System.out.println("Puedes conducir");
            System.out.println("Puedes beber alcohol");
            System.out.println("Puedes fumar");
        }

        System.out.println("Fin del programa");
        
        leerTeclado.close();
    }

    public static int leerNumero(Scanner lector, String mensaje) {
        System.out.println(mensaje);
        int numero = lector.nextInt();

        return numero;

    }

}
