/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package ejercicio_14_n_basico;

import java.util.Scanner;

/**
 * Ejercicio 14: Comprobación de una contraseña con tres intentos.
 *
 * Este ejercicio solicita al usuario que establezca una contraseña y,
 * posteriormente, le permite intentar introducirla correctamente un máximo de
 * tres veces.
 *
 * El programa deja de solicitar la contraseña cuando se cumple alguna de las
 * siguientes condiciones: - El usuario introduce la contraseña correcta. - El
 * usuario alcanza el límite de tres intentos.
 *
 * Si el usuario acierta, se muestra el mensaje "Enhorabuena". Si agota los tres
 * intentos sin acertar, se muestra un mensaje indicando que puede volver a
 * intentarlo en otra ocasión.
 *
 * @author Sergio
 */
public class Ejercicio_14_n_basico {

    // Almacena la contraseña establecida inicialmente por el usuario.
    private static String contraseña;

    // Almacena la contraseña introducida por el usuario en cada intento.
    private static String contraseñaux = "";

    // Indica si el usuario ha acertado la contraseña.
    // Inicialmente es false porque todavía no se ha acertado.
    private static boolean acierto = false;

    // Cuenta los intentos realizados.
    // Se inicializa en 1 para comenzar con el primer intento.
    private static int intentos = 1;

    // Objeto Scanner utilizado para leer los datos introducidos por teclado.
    private static Scanner sc = new Scanner(System.in);

    /**
     * Método que muestra el mensaje final según el resultado obtenido.
     *
     * Comprueba el valor de la variable booleana acierto: - Si es true,
     * significa que la contraseña se ha introducido correctamente y se muestra
     * el mensaje "Enhorabuena". - Si es false, significa que no se ha acertado
     * dentro de los tres intentos disponibles.
     */
    private static void mensajeCondicion() {
        if (acierto) {
            System.out.println("Enhorabuena");
        } else {
            System.out.println("Suerte para la proxima");
        }
    }

    /**
     * Método que solicita la contraseña al usuario hasta que la acierte o
     * alcance el límite máximo de tres intentos.
     *
     * Pasos del método: 1. Comprobar que el contador de intentos sea menor o
     * igual que 3 y que la contraseña todavía no se haya acertado. 2. Solicitar
     * al usuario que introduzca la contraseña. 3. Comparar la contraseña
     * introducida con la contraseña establecida utilizando el método equals().
     * 4. Si ambas contraseñas coinciden, cambiar acierto a true. 5. Si no
     * coinciden, incrementar el contador de intentos. 6. Repetir el proceso
     * mientras se cumplan las condiciones del while.
     *
     * La condición !acierto permite salir del bucle inmediatamente cuando el
     * usuario introduce la contraseña correcta, aunque todavía le queden
     * intentos disponibles.
     */
    private static void intentosContraseña() {
        while (intentos <= 3 && !acierto) {
            System.out.println("Digame su contraseña: ");
            contraseñaux = sc.nextLine();

            if (contraseña.equals(contraseñaux)) {
                acierto = true;
            } else {
                intentos++;
            }
        }
    }

    /**
     * Método que solicita al usuario que establezca la contraseña.
     *
     * Lee la contraseña introducida por teclado y la almacena en la variable
     * contraseña para utilizarla posteriormente durante la comprobación de los
     * intentos.
     */
    private static void solicitarContraseña() {
        System.out.println("Dime que contraseña quieres tener: ");
        contraseña = sc.nextLine();
    }

    public static void main(String[] args) {

        solicitarContraseña();

        intentosContraseña();

        mensajeCondicion();

        sc.close();
    }

}
