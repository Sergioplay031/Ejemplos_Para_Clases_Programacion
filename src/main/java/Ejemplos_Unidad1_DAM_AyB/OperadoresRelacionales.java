package Ejemplos_Unidad1_DAM_AyB;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        int a = 1000;
        int b = 1000;
        
        boolean aMayorQueb = a > b;
        boolean aMayorIgualQueb = a >= b;
        boolean aMenorQueb = a < b;
        boolean aIgualQueb = a == b;
        boolean aDistintoDeb = a != b;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("a es mayor que b? " + aMayorQueb);
        System.out.println("a es mayor o igual que b? " + aMayorIgualQueb);
        System.out.println("a es menor que b? " + aMenorQueb);
        System.out.println("a es igual que b? " + aIgualQueb);
        System.out.println("a es distinto de b? " + aDistintoDeb);
        
    }
}
