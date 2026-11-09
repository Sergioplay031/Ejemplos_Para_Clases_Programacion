package Ejemplos_Unidad1_DAM_AyB;

public class Funciones {
    public static int numeroDeLaBestia = 666;
    
            
    public static void main(String[] args) {
        int numero = 12;
        
        saludar();
        saludar2("Diego");

        String nombreAlumno = "Anselmo";
        saludar2(nombreAlumno);

        saludar3("Federica", "López Sánchez");

        double suma = sumar(3, 5);
        System.out.println("5 + 3 = " + suma);
        
        System.out.println("Otra suma = " + sumar(numero, numero));
        
        System.out.println(sumar2(3, 4, 5, 6));
        
        System.out.println(8 / (2 * 4));
    }

    public static void saludar() {
        System.out.println("Hola a todo el mundo!! " + numeroDeLaBestia);
    }

    public static void saludar2(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void saludar3(String nombre, String apellidos) {
        System.out.println("Hola, " + nombre + " " + apellidos);
    }

    public static double sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static int sumar2(int a, int b, int c, int d) {
        int suma = a + b + c + d;
        return suma;
    }
}
