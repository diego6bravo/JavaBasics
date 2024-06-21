package myApp;

public class Shopping3 {
    
    public static void main(String[] args) {
        // Declarar e inicializar variables
        String custName = "Diego Garcia Bravo";
        String firstName;
        int spaceIdx;
        StringBuilder sb;

        // Encontrar el índice del espacio en el nombre del cliente
        spaceIdx = custName.indexOf(" ");
        
        // Extraer el primer nombre usando el método substring
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);

        // Instanciar e inicializar sb con firstName
        sb = new StringBuilder(firstName);

        // Reconstruir el nombre completo usando el método append de StringBuilder
        //sb.append(" Garcia");

        // Desafío alternativo: Descomenta la línea siguiente para agregar dinámicamente el apellido
        sb.append(custName.substring(spaceIdx));

        // Imprimir el nombre completo
        System.out.println(sb);
    }    
}