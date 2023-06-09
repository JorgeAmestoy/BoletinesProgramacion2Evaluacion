package boletin22;

import com.amestoy.libreria.PedirDatos;
import java.util.Arrays;

public class Equipo {

    private String nombreEquipo;
    private int[] goles = new int[36];
    private int totalGoles;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Equipo(String nombreEquipo, int[] goles) {
        this.nombreEquipo = nombreEquipo;
        this.goles = goles;
        setGoles(goles);
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int[] getGoles() {
        return goles;
    }

    public void setGoles(int[] goles) {
        this.goles = goles;
        int acumulador = 0;
        for (int i = 0; i < goles.length; i++) {
            acumulador = acumulador + goles[i];
        }
        totalGoles = acumulador;
    }

    public int getGolesTotal() {
        return totalGoles;
    }

    @Override
    public String toString() {
        return "Nombre del equipo: " + nombreEquipo + "\n Goles: " + Arrays.toString(goles);
    }

}
