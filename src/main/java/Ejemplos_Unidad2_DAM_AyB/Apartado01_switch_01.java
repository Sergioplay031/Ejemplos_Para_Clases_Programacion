package Ejemplos_Unidad2_DAM_AyB;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Apartado01_switch_01 {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);

        System.out.println("En qué puesto te has quedado?");
        int puesto = leerTeclado.nextInt();

        if (puesto == 1) {
            System.out.println("Medalla de oro");
        } else if (puesto == 2) {
            System.out.println("Medalla de plata");
        } else if (puesto == 3) {
            System.out.println("Medalla de bronce");
        } else {
            System.out.println("Eres un paquete!");
        }

        if (puesto == 1 || puesto == 2 || puesto == 3) {
            System.out.println("Tienes medalla!");
        } else {
            System.out.println("Eres un paquete!");
        }

        // Evaluamos menos condiciones
        if (puesto >= 1 && puesto <= 3) {
            System.out.println("Tienes medalla!");
        } else {
            System.out.println("Eres un paquete!");
        }

        // Hacemos lo mismo con el switch
        System.out.println("Hacemos lo mismo con el switch");
        switch (puesto) {
            case 1:
                System.out.println("Medalla de oro");
                break;
            case 2:
                System.out.println("Medalla de plata");
                break;
            case 3:
                System.out.println("Medalla de bronce");
                break;
            default:
                System.out.println("Eres un paquete!!");
        }

        switch (puesto) {
            case 1, 2, 3:
                System.out.println("Tienes medalla!");
                break;
            default:
                System.out.println("Eres un paquete!!");
        }
        
        switch (puesto) {
            case 1:
            case 2:
            case 3:
                System.out.println("Tienes medalla!");
                break;
            default:
                System.out.println("Eres un paquete!!");
        }
        
        switch (puesto) {
            case 1 -> {
                System.out.println("Medalla de oro");
            }
            case 2 -> {
                System.out.println("Medalla de plata");
            }
            case 3 -> System.out.println("Medalla de bronce");
            default -> {
                System.out.println("Eres un paquete!!");
            }
        }
        
        switch (puesto) {
            case 1, 2, 3 -> {
                System.out.println("Tienes medalla!");
            }
            default -> {
                System.out.println("Eres un loser!!");
            }
        }
        

        leerTeclado.close();
    }
}
