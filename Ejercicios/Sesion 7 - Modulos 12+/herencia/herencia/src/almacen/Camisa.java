package almacen;

public class Camisa extends Ropa {
    protected String tipoCamisa;

    public void hacerOperacion(){
        
    }

    public void setTipoCamisa(String tipoCamisa) {
        this.tipoCamisa = tipoCamisa;
    }

    public Camisa() {
        super("A");
        System.out.println("constrcutor camisa");
    }

    public Camisa(String A) {
        super("A");
        System.out.println("constrcutor camisa sobrecargado");
    }

    public String getDescripcion() {
        return ( " Descripcion de camisa: " + descripcion);
    }
}
