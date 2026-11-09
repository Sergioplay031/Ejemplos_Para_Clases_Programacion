package Ejemplos_Unidad1_DAM_AyB;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EsPar3 {
    public static Scanner leerTeclado = new Scanner(System.in);
    
    public static void main(String[] args) {  
        System.out.println("Cómo te llamas?");
        
        String nomb = leerNombre();
        
        System.out.println("Hola, " + nomb);
        
        System.out.println("Introduce número: ");
        int num = leerNumero();
        
        System.out.println("El número es: " + num);
        
        leerTeclado.close();
    }
    
    public static int leerNumero() {
        int numero = leerTeclado.nextInt();
        return numero;
    }
    
    public static String leerNombre() {
        String nombre = leerTeclado.next();
        return nombre;
    }
}
