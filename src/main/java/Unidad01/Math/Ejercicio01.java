package Unidad01.Math;

import java.util.Scanner;

/**
 * Crea una función que devuelva un número entero aleatorio.
 * Dicha función admitirá dos parámetros enteros: el mínimo
 * y el máximo entre los que se encuentra el aleatorio a 
 * devolver.
 * 
 * Esta función se usará en el programa principal, que pedirá
 * al usuario dos números (mínimo y máximo). En caso de que el
 * mínimo sea mayor que el máximo, deben intercambiarse los 
 * valores para que el mínimo sea menor siempre.
 * 
 * @author diego
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un valor mínimo: ");
        int minimo = teclado.nextInt();
        
        System.out.println("Introduce un valor máximo: ");
        int maximo = teclado.nextInt();
        
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        
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
