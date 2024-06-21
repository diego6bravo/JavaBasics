package MiPaquete;

public class archivo {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.emitirSonido();

        Gato miGato = new Gato();
        miGato.emitirSonido();
    }
}

class Animal {
    String nombre;
    
    public void emitirSonido() {
        // Implementación genérica de emitirSonido
    }
}

class Perro extends Animal {
    public void emitirSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    public void emitirSonido() {
        System.out.println("El gato maulla");
    }
}