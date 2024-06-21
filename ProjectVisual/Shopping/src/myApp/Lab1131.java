package myApp;

import myApp.Lab111.ShoppingCart;

public class Lab1131 {
        Item[] items = {new Item("Camisa",25.60), 
                    new Item("Reloj",1.00), 
                    new Item("Medias",35.99)};
    
    public static void main(String[] args){   
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx].isBackOrdered()) 
		continue;
            total += items[idx].getPrice();
        }
        System.out.println("Total en carrito: "+total);
    }
}


