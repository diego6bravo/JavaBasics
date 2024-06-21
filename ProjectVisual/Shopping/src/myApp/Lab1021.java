package myApp;

public class Lab1021 {
    
    public static void main(String args[]){
        Order order = new Order("Diego garcia", 910.00, "VA", Order.NONPROFIT);
        System.out.println("Descuento de: "+ order.getDiscount());
    }
}
