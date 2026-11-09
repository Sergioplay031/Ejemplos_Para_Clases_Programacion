package Ejemplos_Unidad2_DAM_AyB;

/**
 *
 * @author diego
 */
public class Apartado04For01 {
    public static void main(String[] args) {
        System.out.println("Contar con bucle FOR:"
                + "");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("Contar con bucle FOR (2):");
        int contador = 2;
        for(contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }
        System.out.println("El contador se ha quedado en: " + contador);        
    }
}
