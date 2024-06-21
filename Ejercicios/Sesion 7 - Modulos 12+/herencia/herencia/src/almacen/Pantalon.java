package almacen;

public class Pantalon extends Ropa {
    protected String tipoPantalon;

    public void hacerOperacion(){
        System.out.println("public");
    }

    public String getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }

    public String getDescripcion() {
        return ( " Descripcion de pantalon: " + descripcion);
    }
}
