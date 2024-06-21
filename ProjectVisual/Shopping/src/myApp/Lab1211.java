    package myApp;

public class Lab1211 {

    public static void main(String[] args) {
        // Crear una instancia usando el constructor por defecto
        Lab1211 item1 = new Lab1211();
        // Mostrar la información
        item1.display();

        // Crear una instancia usando el constructor con parámetros
        Lab1211 item2 = new Lab1211("Descripción", 20.99);
        // Mostrar la información
        item2.display();
    }
    
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
    // Constructor por defecto
    public Lab1211() {
        // set default values
        setId();
        setDesc("No hay descripción asignada.");
        setPrice(0.00);
    }
    
    // Constructor con parámetros
    public Lab1211(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }
    
    public void display(){
        System.out.println("Descripción Item: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
    }

    private void setId() {
        id = Lab1211.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }    
    
    public class Camisa extends Lab1211{
        private char size;
        private char colorCode;
        
        public Camisa(double price, char size, char colorCode){
            super ("Shirt", price);
            this.size = size;
            this.colorCode = colorCode;
        } 
    }

}

    
