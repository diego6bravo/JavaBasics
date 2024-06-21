
package myApp;

public class Lab82 {
    // ... (resto del código)

    public static void main(String[] args) {
        Lab82 item = new Lab82();

        // Usar el método setItemFields con 3 argumentos
        item.setItemFields("Example Item", 10, 25.5);

        // Usar el método setItemDisplay con 4 argumentos
        int result = item.setItemFields("New Item", 5, 12.75);

        if (result == 1) {
            System.out.println("Item set successfully!");
        } else {
            System.out.println("Invalid color code. Item not set.");
        }

        // Mostrar la información del item
        item.displayItem();
    }

    private void displayItem() {
    }

    private int setItemFields(String string, int i, double d) {
        return i;
    }
}


