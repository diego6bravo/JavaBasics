package juego;

import java.util.Random;

import utils.Constantes;

public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;


    public Jugador(){
        Random rn = new Random();
        this.nombre = Constantes.NOMBRES[rn.nextInt(Constantes.NOMBRES.length)];
        this.posicion = Constantes.POSICIONES[rn.nextInt(Constantes.POSICIONES.length)];
    }   

    public Jugador(String nombre){
        this.nombre = nombre;
        Random rn = new Random();
        this.posicion = Constantes.POSICIONES[rn.nextInt(Constantes.POSICIONES.length)];
    }

    @Override
    public String toString(){
        return ("El nombre del jugador es: " + nombre + ", el numero: "+ numero+ ", la posicion: "+ posicion+ ".");
    }

//////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    
}
