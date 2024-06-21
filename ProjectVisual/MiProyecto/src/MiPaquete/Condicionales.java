package MiPaquete;

public class Condicionales {

    
    public static void main(String[] args) {
        double precioUnidad = 10000;
        int cantidadComprada = 2;
        String nombreCliente = "Diego", nombreProducto ="Para",
               mensaje = nombreCliente + " Compro " + precioUnidad + nombreProducto;
        int numero = 10;
        Boolean outOfStock = false;
        int quantity = 10;
        
        if (numero > 1) {
            System.out.println("El número es mayor.");
        } else {
            System.out.println("El número no es mayor.");
        }
    }
}
