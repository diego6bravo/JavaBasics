package juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utils.Constantes;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;
    private int goles = 0, puntaje = 0;

    public Equipo() {
        jugadores = new ArrayList<Jugador>();
        Random rn = new Random();
        nombre = Constantes.EQUIPOS[rn.nextInt(Constantes.EQUIPOS.length)];
    }

    public Equipo(List<Jugador> jugadores) {
        Random rn = new Random();
        this.jugadores = jugadores;
        nombre = Constantes.EQUIPOS[rn.nextInt(Constantes.EQUIPOS.length)];


        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 1; i < 100; i++) {
            numeros.add(i);
        }

        for (Jugador jugador : jugadores) {
            int numeroRn = rn.nextInt(numeros.size());
            jugador.setNumero(numeros.get(numeroRn));
            numeros.remove(numeroRn);
        }

    }

    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void mostrarJugadores() {

        System.out.println(this.jugadores);
    }

    @Override
    public String toString() {
        return ("El nombre del equipo es: " + nombre);
    }

    /////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}
