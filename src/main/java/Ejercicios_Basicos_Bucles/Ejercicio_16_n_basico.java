/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package Ejercicios_Basicos_Bucles;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Ejercicio 16: Calculadora mediante ventanas de diálogo.
 *
 * Este ejercicio crea una calculadora que solicita dos números enteros y un
 * signo aritmético para determinar qué operación se debe realizar.
 *
 * Las operaciones disponibles son: - Suma (+): suma los dos operandos. - Resta
 * (-): resta el segundo operando al primero. - Multiplicación (*): multiplica
 * los dos operandos. - División (/): divide el primer operando entre el
 * segundo. - Módulo (%): obtiene el resto de la división.
 *
 * Los datos se solicitan mediante ventanas de diálogo y el resultado se muestra
 * en otra ventana utilizando JOptionPane.
 *
 * ¿Qué es JOptionPane?
 *
 * JOptionPane es una clase de la biblioteca Swing de Java que permite mostrar
 * ventanas de diálogo para interactuar con el usuario.
 *
 * Se utiliza principalmente para: - showInputDialog(): mostrar una ventana que
 * permite introducir datos. - showMessageDialog(): mostrar una ventana con un
 * mensaje o resultado.
 *
 * A diferencia de Scanner, que permite leer datos desde la consola, JOptionPane
 * permite realizar estas operaciones mediante ventanas gráficas.
 *
 * @author Sergio
 */
public class Ejercicio_16_n_basico {

    /**
     * Método que solicita los operandos y el signo aritmético mediante ventanas
     * de diálogo y realiza la operación seleccionada.
     *
     * Pasos del método: 1. Solicitar el primer número mediante
     * showInputDialog(). 2. Convertir el texto introducido a un número entero
     * utilizando Integer.parseInt(). 3. Solicitar el segundo número y
     * convertirlo también a entero. 4. Solicitar el signo aritmético que indica
     * la operación deseada. 5. Utilizar una estructura switch para seleccionar
     * la operación. 6. Realizar el cálculo correspondiente según el signo
     * introducido. 7. Mostrar el resultado mediante showMessageDialog().
     *
     * Las excepciones declaradas indican que el método puede propagar errores
     * relacionados con la ausencia de un entorno gráfico o con la conversión de
     * texto a número.
     */
    private static void centanasOperaciones() throws HeadlessException, NumberFormatException {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Dime el segundo numero:"));
        String signo = JOptionPane.showInputDialog("Dime que operacion quieres realizar (+,-,*,/,%): ");

        switch (signo) {
            case "+":
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (numero1 + numero2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (numero1 - numero2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + (numero1 * numero2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, "El resultado de la division es: " + (numero1 / numero2));
                break;
            case "%":
                JOptionPane.showMessageDialog(null, "El resultado de la resto es: " + (numero1 % numero2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "El error");
        }
    }

    public static void main(String[] args) {
        centanasOperaciones();

    }
}
