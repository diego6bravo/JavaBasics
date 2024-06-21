package myApp;

public class Lab113 {
    private int id;
    private String desc;
    private double price;
    private boolean isBackOrdered;
    private static int nextId = 1;

    public void Item(String desc, double price) {
        setId();
        this.desc = desc;
        this.price = price;
        checkStock();
    }

    private void checkStock(){ // Typically you would query a database
        
        // Negative random numbers will result in isBackOrdered = true
        double num = Math.random() * 1000;
        if ((int)num % 2 == 1 ){  
            this.isBackOrdered = true;
            System.out.println(getDesc() +" is back ordered.");
        }
        else this.isBackOrdered();
    }


    private void setId() {
        id = Item.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBackOrdered() {
        return isBackOrdered;
    }
}

