package MiPaquete;
// clase es un etiquetador para un objeto
// Los métodos son comportamientos
public class MiClase {
    String nombre, nombreRecibo = "Diego";
    String apellido="Garcia";
    Double precio = 12000.500;
    boolean fueraStock = true;
    int cantidad = 2;
    double total = precio * cantidad;
    String nombreCompleto = nombre + " " + apellido;
    public static void main(String[] args) {
        System.out.println("Nombres " + nombre + apellido);
    }
}