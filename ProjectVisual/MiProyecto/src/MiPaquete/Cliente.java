package MiPaquete;

public class Cliente {
    public String Nombre = "Diego";
    public String Apellido = "Garcia";
    public int Edad;
    public int CC;
    public String Direccion;
    public Double NuOrden;
    public Double price;
    public int quantity;

    public void mostrarCliente() {
        System.out.println(Nombre + " " + Apellido);
    }
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.Nombre = "Fulanito";
        cliente1.Apellido = "de Tal";
        cliente1.Edad = 30;
        cliente1.mostrarCliente();

        Cliente cliente2 = new Cliente();
        cliente2.Nombre = "Zutano";
        cliente2.Apellido = "Mengano";
        cliente2.Edad = 25;
        cliente2.mostrarCliente();
    }

}
