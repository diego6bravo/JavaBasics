package MiPaquete;

public class ShoppingCart {

        public static void main(String[] args) {

                String nombreSupermercado = "vengaCompre";
                String nombreCliente = "Diego Garcia";
                double precio = 12000;
                Boolean fueraStock = true;
                String producto1 = "Manzana";
                int cantidad = 10;
                double total = precio * cantidad;
                int cantidadComprada = 11;
                String msg;
                // String nombreCliente = "Diego", nombreProducto = "Piña", mensaje;
                if (cantidad > 10) {
                        producto1 = "Manzana";
                        if (cantidad > 1) {
                                producto1 = producto1 + "s";
                        } else {
                                producto1 = producto1;
                        }
                        msg = nombreCliente + " realizó compra de " + cantidad + " " + producto1;
                        System.out.println(msg);
                } else {
                        if (fueraStock == true) {
                                msg = "El ítem no está disponible";

                                System.out.println(msg);
                        } else {
                                System.out.println("El precio del ítem es de " + total);
                        }
                }
        }

}

/*
 * int contador = 1;
 * contador = contador + 1;
 * contador++; //3
 * contador--; //2
 * int c = 25 - 5 * 4 / 2 -10 + 4;
 * 
 * System.out.println(contador);
 * 
 * }
 * 
 * package myApp;
 * 
 * public class shoppingCart {
 * // SHOPPING CART
 * // public static void main(String[] args) {
 * // double precioUnidad = 1000;
 * // int cantidadComprada = 10;
 * // double total = 0;
 * // String nombreCliente = "Andres", nombreProducto = "Pera",
 * // mensaje;
 * // ;
 * // boolean inStock = true;
 * 
 * // if (inStock) {
 * // if (cantidadComprada > 1) {
 * // nombreProducto = nombreProducto + "s";
 * // }
 * // total = precioUnidad * cantidadComprada;
 * 
 * // mensaje = nombreCliente + " Compro " + cantidadComprada + " " +
 * nombreProducto + " Por un precio de : "
 * // + total;
 * // System.out.println(mensaje);
 * // } else {
 * // System.out.println("Este producto no esta disponible.");
 * // }
 * // }
 * }
 */