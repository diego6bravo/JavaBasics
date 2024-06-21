import almacen.Camisa;
import almacen.Pantalon;
import almacen.Ropa;

public class App {
    public static void main(String[] args) throws Exception {
        Ropa camisa1 = new Camisa("a");
        Ropa pantalon = new Pantalon();
        Camisa camisa2 = new Camisa();
        camisa2.precio = 2;

        Ropa ropa1 = new Camisa();



        camisa1.setDescripcion("Esta es la descripcion de la camisa1");
        System.out.println(camisa1.getDescripcion());

        pantalon.setDescripcion("Esta es la descripcion del pantalon");
        System.out.println(pantalon.getDescripcion());
        ((Pantalon)pantalon).hacerOperacion();

        if (camisa2 instanceof Camisa){
        ((Camisa)camisa2).setTipoCamisa("B");
        System.out.println("el nuevo tipo es B");
        }
        else{
            System.out.println("lo que me pasaste no es una camisa");
        }
    }
}
