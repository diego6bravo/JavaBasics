package administracion;

import java.util.Scanner;
import java.math.BigDecimal;

public class Cliente {

    private static String nombreEmpresa = "Nestle";
    public String nombre = "Juan";
    public int edad;

    
    public double ran = Math.random();

    public String obtenerNombre() {
        return nombre;
    }

    public Cliente(){
        ////
    }

    public Cliente(String nombreCliente) {
        this();
        setNombre(nombreCliente);
        System.out.println("Usted acaba de añadir un nuevo cliente llamado: " + nombre);
    }

    public Cliente(String nombreCliente, int edadCliente) {
        this(nombreCliente);
        setEdad(edadCliente);
        System.out.println("Usted acaba de añadir un nuevo cliente llamado: " + getNombre() + " y su edad es : " + getEdad());
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public static void setNombreEmpresa(String nombreNuevo) {

        if (nombreNuevo != "Campanario") {
            nombreEmpresa = nombreNuevo;
            return;
        } else {
            System.out.println("Usted esta tratando de establecer un nombre registrado.");
        }

    }

    public static String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public static void establecerEmpresa(String nuevoNombre) {
        nombreEmpresa = nuevoNombre;
    }

    public String asignarNombre(String nombreNuevo) {
        nombre = nombreNuevo;
        return nombre;
    }

    public String asignarNombre(String nombreNuevo, String apellido) {
        nombre = nombreNuevo + " " + apellido;
        return nombre;
    }

    public String asignarNombre(String nombreNuevo, int multiplicador) {
        nombre = nombreNuevo;
        for (int i = 0; i <= multiplicador; i++) {
            nombre = nombre + nombreNuevo;
        }
        return nombre;
    }

    public String asignarNombre(int multiplicador, String nombreNuevo) {

        return nombre;
    }

    public String asignarEdad(int multiplicador) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la nueva edad");
        edad = sc.nextInt() * multiplicador;
        String datosDevuelta = "La nueva edad es: " + edad;
        return datosDevuelta;
    }

}
