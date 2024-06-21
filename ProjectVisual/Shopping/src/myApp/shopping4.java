package myApp;

public class shopping4 {

    public static void main(String[] args) {
        int int1;
        
        // Declarar e inicializar variables de tipo long, float, y char.
        long long1 = 99_000_000_000L; // La 'L' indica que es un valor de tipo long
        float flt1 = 13.5F; // La 'F' indica que es un valor de tipo float
        char ch1 = 'U';
        
        // Imprimir la variable de tipo long.
        System.out.println("long1: " + long1);

        // Asignar el valor de long a la variable int y luego imprimir la variable int.
        int1 = (int) long1; // Se realiza una conversión explícita de long a int
        System.out.println("Long asignado a variable int: " + int1);
    }
}
