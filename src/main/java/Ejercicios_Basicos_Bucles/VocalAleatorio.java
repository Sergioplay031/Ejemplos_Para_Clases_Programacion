/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Basicos_Bucles;

/**
 *
 * @author Sergio
 *
 * En este ejercicio se realiza lo siguiente se crea un metodo para conseguir
 * una letra aleatoria y el segundo metodo comprueba si la letra es diferente a
 * una vocal si es diferente se repite hasta conseguir una de las vocales de
 * manera aleatoria
 */
public class VocalAleatorio {

    private static char getLetra() {
        return (char) (Math.random() * 27 + 'a');
    }

    private static char vocalesAzar() {
        char resultado = getLetra();

        while (resultado != 'a' && resultado != 'e' && resultado != 'i'
                && resultado != 'o' && resultado != 'u') {
            resultado = getLetra();
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(vocalesAzar());
        System.out.println(vocalesAzar());
        System.out.println(vocalesAzar());
        System.out.println(vocalesAzar());
        System.out.println(vocalesAzar());
    }
}
