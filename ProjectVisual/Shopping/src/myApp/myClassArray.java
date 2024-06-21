package myApp;

public class myClassArray {
    public static void main(String[] args) {
        //Declarando un array:

        String[] myStringArray = new String[10];
        int[] myIntArray = { 0, 1, 2, 3, 4 };
        boolean[] myBooleanArray = new boolean[5];
        int myNumber = 1;
        int contador = 0;

        // for (String myString : myStringArray) {
        // contador++;
        // System.out.println(contador);
        // }

        
        // LLenando un array:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            myStringArray[i] = "my string";
        }



        // Mostrando un array en consola:
        for (String myString : myStringArray) {
            System.out.println(myString);
        }

        // System.out.println("mi array: " + myIntArray[0]);
        // System.out.println(myStringArray[0]);
        // System.out.println(myStringArray[2]);
        // System.out.println(myBooleanArray[2]);

    }
}
