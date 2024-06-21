import administracion.Cliente;
import administracion.Producto;

public class App {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("andres");
        Cliente cliente3 = new Cliente("maria", 7);
        Cliente cliente4 = new Cliente("pablito");

        Cliente.setNombreEmpresa("El cubo");
        System.out.println(Cliente.getNombreEmpresa());

    }

}
