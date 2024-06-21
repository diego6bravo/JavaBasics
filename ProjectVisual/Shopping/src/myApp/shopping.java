package myApp;

public class shopping {
    

    public static void main(String[] args) {
        // local variables
        String custName = "Diego Garcia";
        String message;
                
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
       
        String items[];
        items = new String[4];
        items[0] = "Camisa";
        items[1] = "Cinturon";
        items[2] = "Bufanda";
        items[3] = "Medias";
        
        message = custName + " quiere comprar "+items.length+" items.";
        System.out.println(message);
        
        // Iterate through and print out the items from the items array
        System.out.println("Items comprados: ");
        
        for (String item : items ){
           System.out.print(item + ", ");
        }
    }    
}
