package Unidad01.Math;

/**
 *
 * @author diego
 */
public class Ejemplo01 {

    public static void main(String[] args) {

        // Valor aleatorio entre 0 y 0.999999...
        System.out.println(Math.random());

        // Valor aleatorio entre 0 y 9...
        System.out.println((int) (Math.random() * 10));

        // Valor aleatorio entre 0 y 14...
        System.out.println((int) (Math.random() * 15));

        // Valor aleatorio entre 0 y 10...
        System.out.println((int) (Math.random() * (10 + 1)));

        // Valor aleatorio entre 0 y 15...
        System.out.println((int) (Math.random() * (15 + 1)));

        int max = 10;
        int min = 2;
        // Valor aleatorio entre min y max (ambos incluidos):
        int aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(aleatorio);
    }
}
