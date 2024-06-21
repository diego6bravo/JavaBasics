package myApp;

public class shoppingCart {
    // SHOPPING CART 
    // public static void main(String[] args) {
    //     double precioUnidad = 1000;
    //     int cantidadComprada = 10;
    //     double total = 0;
    //     String nombreCliente = "Andres", nombreProducto = "Pera",
    //             mensaje;
    //     ;
    //     boolean inStock = true;

    //     if (inStock) {
    //         if (cantidadComprada > 1) {
    //             nombreProducto = nombreProducto + "s";
    //         }
    //         total = precioUnidad * cantidadComprada;

    //         mensaje = nombreCliente + " Compro " + cantidadComprada + " " + nombreProducto + " Por un precio de : "
    //                 + total;
    //         System.out.println(mensaje);
    //     } else {
    //         System.out.println("Este producto no esta disponible.");
    //     }
    // }
    

    public static void main (String[] args){
        String custName = "Diego Garcia";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");

	// Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
    }
}


