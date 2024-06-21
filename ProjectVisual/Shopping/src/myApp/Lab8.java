package myApp;

public class Lab8 {
    // Declarar la variable de instancia color
    private char color;

    // Método para establecer el color
    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        } else {
            this.color = colorCode;
            return true;
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Crear una instancia de Lab8
        Lab8 labInstance = new Lab8();

        // Llamar al método setColor para establecer el color
        boolean success = labInstance.setColor('R');

        // Imprimir el resultado
        System.out.println(success); // Imprime true si se establece correctamente

        // Intentar establecer el color en un espacio
        success = labInstance.setColor(' ');

        // Imprimir el resultado
        System.out.println(success); // Imprime false porque es un espacio
    }
}
