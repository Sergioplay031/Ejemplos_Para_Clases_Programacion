package Ejemplos_Unidad1_DAM_AyB;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int numeroInt1 = 73;
        int numeroInt2 = 13;
        double numeroDouble1 = 72.34;
        double numeroDouble2 = 33.3;

        int sumaEnteros = numeroInt1 + numeroInt2;
        int resta = numeroInt1 - numeroInt2;

        System.out.println("Suma de dos enteros: " + sumaEnteros);
        System.out.println("Resta de dos enteros: " + resta);

        resta = numeroInt2 - numeroInt1;
        System.out.println("Resta de dos enteros: " + resta);

        // 
        sumaEnteros = (int) (numeroInt1 + numeroDouble1);
        System.out.println("Suma de entero y double: " + sumaEnteros);

        System.out.println("Multiplicación de dos enteros: ");
        System.out.println(numeroInt1 * numeroInt2);

        System.out.println("Multiplicación de dos reales: ");
        System.out.println(numeroDouble1 * numeroDouble2);

        System.out.println("Multiplicación de entero por real: ");
        System.out.println(numeroInt1 * numeroDouble2);

        
        double division = numeroDouble1 / numeroDouble2;
        System.out.println("Division de doubles = " + division);
        
        division = numeroInt1 / numeroInt2;
        System.out.println("Division de enteros = " + division);
        
        int divisionEnteros = numeroInt1 / numeroInt2;
        System.out.println("Division de enteros = " + divisionEnteros);
        
        int restoEnteros = numeroInt1 % numeroInt2;
        System.out.println("Resto de enteros = " + restoEnteros);
        
        byte numeroByte = (byte)128135325;
        System.out.println("numeroByte = " + numeroByte);
        
        System.out.println(128135325 / 256);
        System.out.println(128135325 % 256);
        System.out.println((byte)(128135325 % 256));
        
        // Autoincremento
        int num = 0;
        System.out.println("num = " + num);
        
        num = num + 1;  // 0 + 1
        System.out.println("num = " + num);
        
        num = num + 1;  // 1 + 1
        System.out.println("num = " + num);
        
        num = num + 1;  // 2 + 1
        System.out.println("num = " + num);
        
        System.out.println("Lo mismo con autoincremento");
        num = 0;
        System.out.println("num = " + num);
        
        System.out.println("Con el operador incremento ++");
        num++;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);
        
        System.out.println("ASIGNACIONES COMPUESTAS");
        System.out.println("Con el operador += incrementando en 3");
        num = 0;
        System.out.println("num = " + num);
        
        num+=3;  // num = num + 3
        System.out.println("num = " + num);

        num+=3;
        System.out.println("num = " + num);


        System.out.println("Con el operador -= decrementando en 3");
        num = 10;
        System.out.println("num = " + num);
        
        num-=3; // num = num - 3
        System.out.println("num = " + num);

        num-=3; // num = num - 3
        System.out.println("num = " + num);
        
        num = 9;
        System.out.println("num = " + num);
        
        num *= 6;  // num = num * 6;
        System.out.println("num = " + num);
    }
}
