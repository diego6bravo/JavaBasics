package Persona;

public class main {
    public static void main(String[] args) {
        // Objeto estudiante
        estudiante estudiante = new estudiante("Diego Garcia", 30, "11366388", "Oct-2023", "Ingeniería");

        // Salida
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("DNI: " + estudiante.getDni());
        System.out.println("Matrícula: " + estudiante.getMatricula());
        System.out.println("Carrera: " + estudiante.getCarrera());

        // Modificar matrícula
        estudiante.setMatricula("03-10-2023");
        System.out.println("Nueva matrícula: " + estudiante.getMatricula());
    }
}
