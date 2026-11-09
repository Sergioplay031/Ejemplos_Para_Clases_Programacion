package Ejemplos_Unidad1_DAM_AyB;

public class PrioridadOperadores {

    public static void main(String[] args) {
        final double PI = 3.141592;

        int a = 2;
        int b = 5;
        int c = 8;
        
        System.out.println(4 / 2 * 3 / 6 + 6 / 2 / 1 / 4 * 2);
        
        System.out.println("-------------------------------------");
        
        System.out.println("Valor absoluto: " + Math.abs(-99));
        System.out.println("Redondeo: " + Math.round(5.7));
        System.out.println("Redondeo: " + Math.round(5.4));
        System.out.println("Potencia de base 2 elevado a 6: " + Math.pow(2, 6));
        double raizCuadrada  = Math.sqrt(64);
        System.out.println("Raiz cuadrada: " + raizCuadrada);
        System.out.println("Raiz cuadrada: " + Math.sqrt(64));
        System.out.println("Valor de Pi: " + Math.PI);
        
        
        
        System.out.println("Longitud de una circunferencia de radio 3" + 2 * Math.PI * 3);
        System.out.println("Longitud de una circunferencia de radio 3" + 2 * PI * 3);
        
    }
}
