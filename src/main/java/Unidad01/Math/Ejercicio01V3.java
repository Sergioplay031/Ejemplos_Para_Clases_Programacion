package Unidad01.Math;

import java.util.Scanner;

/**
 * Crea una función que devuelva un número entero aleatorio. Dicha función
 * admitirá dos parámetros enteros: el mínimo y el máximo entre los que se
 * encuentra el aleatorio a devolver.
 *
 * Esta función se usará en el programa principal, que pedirá al usuario el
 * valor mínimo. Después pedirá el valor máximo. Si este valor es inferior al
 * mínimo, volverá a pedirlo y así lo hará hasta que el usuario introduzca un
 * valor máximo que sea mayor que el mínimo.
 *
 * Como añadidura, se ha creado la función pedirConfirmacion, que preguntará
 * al usuario si quiere volver a ejecutar el programa.
 * 
 * @author noah
 */
public class Ejercicio01V3 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        do {

            System.out.println("Introduce un valor mínimo: ");
            int minimo = teclado.nextInt();
            int maximo;

            do {
                System.out.println("Introduce un valor máximo: ");
                maximo = teclado.nextInt();
            } while (maximo < minimo);

            int random = generarAleatorio(minimo, maximo);
            System.out.println("El aleatorio entre "
                    + minimo
                    + " y "
                    + maximo
                    + " es "
                    + random);
        } while (pedirConfirmacion());
        teclado.close();
    }

    public static int generarAleatorio(int min, int max) {
        int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        return aleatorio;
    }

    public static boolean pedirConfirmacion() {
        System.out.println("Quieres repetir la tirada?(s/n)");
        boolean repetir = true;
        do {
            String confRepetir = teclado.next();
            if (confRepetir.equalsIgnoreCase("s")) {
                return true;
            } else if (confRepetir.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Te has equivocado de letra,"
                        + " cambia la repuesta: ");
                repetir = true;
            }
        } while (repetir);
        return false;
    }
}
