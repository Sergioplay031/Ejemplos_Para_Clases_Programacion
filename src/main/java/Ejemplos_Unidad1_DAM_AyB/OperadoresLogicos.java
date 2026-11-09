package Ejemplos_Unidad1_DAM_AyB;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // && = AND --> true si los dos son true
        // || = OR  --> true si al menos uno es true
        // !  = NOT --> contrario
        // ^  = XOR --> solo si las expresiones lógicas son distintas. 
        
        /*
        Vamos a identifica si la edad indicada de los aspirantes
        está dentro del rango de infantiles: entre 10 y 15 años
        */

        final int EDAD_MINIMA = 10;
        final int EDAD_MAXIMA = 15;
        int edadAspirante = 2;

        System.out.println("Puede entrar? ");
        System.out.println( (edadAspirante >= EDAD_MINIMA)
                && (edadAspirante <= EDAD_MAXIMA) );
        
        System.out.println("******************************************");
        /*
        Los alumnos salen de marcha y van a beber.
        Este programa comprobará si un alumno puede conducir. Para eso
        debe cumplir dos condiciones:
        1. Ir sobria/o
        2. Saber conducir
        */
        boolean estaSobrio = true;
        boolean sabeConducir = false;
        boolean tieneCarnet = true;
        
        System.out.println("Esta persona puede conducir?");
        System.out.println(estaSobrio && sabeConducir && tieneCarnet);
        
        System.out.println("******************************************");
        
        /*
        Haced lo mismo con el OR ( || )
        Por ejemplo, si se puede acceder a este ciclo o no dependiendo de
        si viene: de otro grado superior, bachillerato, grado medio, universidad.
        */
        boolean deGradoSuperior = true;
        boolean deBachillerato = false;
        
        System.out.println("******************************************");
        
        /*
        Operador NOT ( ! ) es unario (solo necesita un operando)
        Va a negar el valor lógico de dicho operando
        */
        
        System.out.println(true);
        System.out.println(false);
        
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
        
        boolean esDeDia = true;
        boolean esDeNoche = !esDeDia;
        
        System.out.println("Es de día? " + esDeDia);
        System.out.println("Es de noche? " + esDeNoche);
        
        System.out.println("******************************************");
        
        /*
        XOR ( ^ )
        Veamos cómo podemos llegar a clase hoy
        */
        boolean enCoche = false;
        boolean enMoto = true;
        
        System.out.println("Puedo ir a clase hoy con lo que tengo?");
        System.out.println(enCoche ^ enMoto);
        
    }

}
