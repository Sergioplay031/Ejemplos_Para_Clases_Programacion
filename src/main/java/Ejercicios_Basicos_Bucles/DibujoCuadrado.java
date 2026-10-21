/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Basicos_Bucles;

/**
 *
 * @author Sergio
 *
 * Escribe un programa que pida al usuario un número entero n que represente el
 * tamaño del lado de un cuadrado (por ejemplo, n = 5). Utilizando bucles
 * anidados (for dentro de otro for), dibuja por consola un cuadrado hueco
 * formado por asteriscos (*) y espacios. Para n = 5, el resultado esperado
 * sería un cuadrado: (Pista: Piensa en cuándo debes imprimir un asterisco y
 * cuándo un espacio basándote en las variables de control i y j, es decir, si
 * estás en la primera fila, última fila, primera columna o última columna)
 */
public class DibujoCuadrado {

    public static void main(String[] args) {
        int tamano = 5;
        for ( int fila = 1; fila <= tamano; fila++) {
            for(int columna = 1; columna <= tamano; columna++){
                if ( fila == 1 || columna == 1 || fila == tamano || columna == tamano) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
