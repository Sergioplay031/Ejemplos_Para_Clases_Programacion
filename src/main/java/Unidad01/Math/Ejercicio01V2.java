package Unidad01.Math;

import java.util.Scanner;

/**
 * Crea una función que devuelva un número entero aleatorio.
 * Dicha función admitirá dos parámetros enteros: el mínimo
 * y el máximo entre los que se encuentra el aleatorio a 
 * devolver.
 * 
 * Esta función se usará en el programa principal, que pedirá
 * al usuario el valor mínimo.
 * Después pedirá el valor máximo. Si este valor es inferior
 * al mínimo, volverá a pedirlo y así lo hará hasta que el
 * usuario introduzca un valor máximo que sea mayor que el
 * mínimo.
 * 
 * @author diego
 */
public class Ejercicio01V2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un valor mínimo: ");
        int minimo = teclado.nextInt();
        int maximo;
        
        do {
            System.out.println("Introduce un valor máximo: ");
            maximo = teclado.nextInt();
        } while(maximo < minimo);
        
        int random = generarAleatorio(minimo, maximo);
        System.out.println("El aleatorio entre "
                + minimo
                + " y "
                + maximo
                + " es "
                + random);
        
        
        teclado.close();
    }
    
    public static int generarAleatorio(int min, int max) {
        int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
        return aleatorio;
    }    
}
