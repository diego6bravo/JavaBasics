package almacen;

public abstract class Ropa {
    protected int id;
    protected String descripcion;
    public double precio;

    protected abstract void hacerOperacion();

    public Ropa() {
        this("A");
    }

    public Ropa(String A) {
        System.out.println("Constructor de ropa");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    protected void mostrarDatos() {
        System.out.println(id + " " + descripcion + " " + precio);
    }

}
