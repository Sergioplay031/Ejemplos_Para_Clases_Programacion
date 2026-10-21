/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Basicos_Bucles;

/**
 *
 * @author Sergio
 */
public class DibujoArbol {
        private static int altura = 5;
        private static int tronco = 2;
    public static void main(String[] args) {
        hojasArbol();
        
        troncoArbol();
    }

    private static void troncoArbol() {
        for ( int fila = 1; fila <= tronco; fila++){
            for(int espacio = 1; espacio < altura; espacio++ ) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    private static void hojasArbol() {
        for ( int fila = 1; fila <= altura; fila++) {
            for(int espacio = 1; espacio <= altura - fila; espacio++){
                System.out.print(" ");
            }
            
            for(int marca = 1; marca <= 2 * fila - 1; marca++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
