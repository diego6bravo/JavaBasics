import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import juego.Equipo;
import juego.Jugador;
import juego.Partido;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroEquipos = 0;
        List<Equipo> equipos = new ArrayList<Equipo>();
        List<Jugador> jugadores = new ArrayList<Jugador>();
        List<Partido> partidos = new ArrayList<Partido>();
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos equipos quieres que juegen en la liga?");
        numeroEquipos = sc.nextInt();

        for (int i = 0; i < numeroEquipos; i++) {
            jugadores.clear();
            for (int j = 0; j < 11; j++) {
                jugadores.add(new Jugador());
            }
            equipos.add(new Equipo(jugadores));
        }

        int contador = 0;

        for (int i = 0; i < equipos.size(); i++) {

            for (int j = contador; j < equipos.size(); j++) {
                if (!(equipos.get(i) == equipos.get(j))) {
                    partidos.add(new Partido(equipos.get(i), equipos.get(j)));
                }
            }
            contador++;
        }

        for (Partido partido : partidos) {
            System.out.println(partido.jugar());
        }


    }
}
