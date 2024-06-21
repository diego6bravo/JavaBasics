package myApp;

import java.util.ArrayList;


public class Lab114 {
        public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Camisa");
        items.add("Reloj");
        items.add("Medias");

        System.out.println(items);
        items.add(2, "Cinturón");
        System.out.println(items);

         // Check for the existence of a particular String element.  
         // Remove it, if it exists.
         if (items.contains ("Camisa")){
           items.remove("Camisa");
         }
         System.out.println(items);
    }
}


