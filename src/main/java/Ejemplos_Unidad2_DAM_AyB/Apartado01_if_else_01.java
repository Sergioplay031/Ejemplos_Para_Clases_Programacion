package Ejemplos_Unidad2_DAM_AyB;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Apartado01_if_else_01 {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int edad = leerNumero(leerTeclado, "Dime tu edad: ");
        double estatura = leerNumeroReal(leerTeclado, "Dime tu estatura: ");
        double peso = leerNumeroReal(leerTeclado, "Dime tu peso: ");

        
        if (edad < 20) {
            System.out.println("El IMC se evalúa a partir de los 20 años.");
        }
        else {
            //double imc = peso / (estatura * estatura);
            double imc = peso / Math.pow(estatura, 2);
            
            System.out.println("El IMC es: " + imc);
            
            boolean imcBajoPeso = imc < 18.5;
            boolean imcNormal = !imcBajoPeso && imc <= 24.5;
            
            if (imcBajoPeso) {
                System.out.println("Necesitas ganar unos kilitos");
            }
            else if (imcNormal) {
                System.out.println("Estás en el peso saludable!!!");
            }
            else {
                System.out.println("Más lechuga y menos tocino!!!");
            }
            
        }

        System.out.println("Fin del programa");

        leerTeclado.close();
    }

    public static int leerNumero(Scanner lector, String mensaje) {
        System.out.println(mensaje);
        int numero = lector.nextInt();

        return numero;

    }

    public static double leerNumeroReal(Scanner lector, String mensaje) {
        System.out.println(mensaje);
        double numero = lector.nextDouble();

        return numero;

    }

}
