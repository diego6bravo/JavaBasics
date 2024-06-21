
/*public class IndexOf {
    public static void main(String[] args) {
        String nombre = "Diego Garcia Bravo";
        int index = nombre.indexOf("8");
        System.out.println("El texto 8 es");

    }
}

*/
package MiPaquete;
public class IndexOf {
    public static void main(String[] args) {

        String nombre = "Diego Garcia";

        int buscandoEspacio = nombre.indexOf(" ");
        String primerNombre = nombre.substring(0, buscandoEspacio);
        System.out.println(primerNombre);
    }
}


/*
 * if (index != -1) {
 * System.out.println("La posición de '8' en la cadena es: " + index);
 * } else {
 * System.out.println("'8' no se encuentra en la cadena.");
 * }
 * }
 * }
 */