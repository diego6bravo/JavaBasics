package juego;

import java.util.Random;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private String resultado;

    public Partido(Equipo equipo1, Equipo equipo2) {
        // System.out.println("Los equipos que se enfrentan son: " + equipo1.getNombre()
        // + " con : " + equipo2.getNombre() );
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;

    }

    public String jugar() {
        Random rn = new Random();
        equipo1.setGoles(rn.nextInt(5));
        equipo2.setGoles(rn.nextInt(5));

        if (equipo1.getGoles() > equipo2.getGoles()) {
            equipo1.setPuntaje(equipo1.getPuntaje() + 3);
            this.resultado = "Ganó el equipo " + equipo1.getNombre();
        } else if (equipo1.getGoles() < equipo2.getGoles()) {
            equipo2.setPuntaje(equipo2.getPuntaje() + 3);
            this.resultado = "Ganó el equipo " + equipo2.getNombre();
        } else {
            equipo1.setPuntaje(equipo1.getPuntaje() + 1);
            equipo2.setPuntaje(equipo2.getPuntaje() + 1);
            this.resultado = "Empataron";
        }

        return this.resultado;

    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
