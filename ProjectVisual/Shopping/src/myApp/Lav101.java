package myApp;

public class Lav101 {
    public static void main(String args[]) {
        int x = 4, y = 9;

        // Usando un if-else para realizar operaciones en x
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);

        // Usando un operador ternario para realizar la misma lógica
        x = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println("After ternary op, x = " + x);
    }
}



