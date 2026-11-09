package Ejemplos_Unidad1_DAM_AyB;

public class OperadorIncremento {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1 + 1;
        
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        System.out.println("num1 antes de incrementarlo = " + num1);
        int num3 = num1++;
        
        System.out.println("num1 = " + num1);
        System.out.println("num3 = " + num3);
        
        System.out.println("num1 antes de incrementarlo = " + num1);
        num3 = ++num1;
        
        System.out.println("num1 = " + num1);
        System.out.println("num3 = " + num3);
    }
}
