package MiPaquete;

import java.util.Scanner;

public class CLiente2 {
    public String nombre, apellido, direccion;
    public int edad, NuOrder;

    public void showCostumer() {
        System.out.println("El nombre del cliente es " + nombre + " " + apellido);
    }

    public static void main(String[] args) {
        CLiente2 cliente1 = new CLiente2();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su noombre: ");
        cliente1.nombre = scan.nextLine();
        System.out.println("Ingrese su apellido: ");
        cliente1.apellido = scan.nextLine();
        cliente1.edad = 23;
        cliente1.showCostumer();
    }

}
