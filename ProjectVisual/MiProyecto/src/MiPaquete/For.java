package MiPaquete;

public class For {
    public static void main(String[] args) {  
        String[] myStringArray = {"Huevos", "Pan", "Chocolate", "Leche"};
        boolean[] myBoolean = new boolean[3];
        
        System.out.println(myStringArray[2]);
        System.out.println(myBoolean[1]);
        
        for (String frase : myStringArray){
            System.out.println("Mi lista de compras " + frase);
        }
}
}
