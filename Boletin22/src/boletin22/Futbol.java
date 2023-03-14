package boletin22;

import com.amestoy.libreria.PedirDatos;
import java.util.Arrays;

public class Futbol {

    private Equipo[] equipos = new Equipo[20];

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Equipos: " + Arrays.toString(equipos) + '}';
    }

    public void mostrarTabla() {
        System.out.print("Equipo/jornada		");
        for (int i = 0; i < equipos[0].getGoles().length; i++) {
            System.out.print("X" + (i + 1) + "	");

        }
        System.out.print("Total Goles");
        System.out.println();
        for (int i = 0; i < equipos.length; i++) {
            System.out.print(equipos[i].getNombreEquipo());
            System.out.print("		");
            for (int j = 0; j < equipos[i].getGoles().length; j++) {
                System.out.print(equipos[i].getGoles()[j]);
                System.out.print("	");
            }
            System.out.print(equipos[i].getGolesTotal());
            System.out.println();
        }
    }

    public void listaOrdenada() {
        System.out.println("Equipos con respectivos goles: ");
        for (int i = 0; i < equipos.length - 1; i++) {
            for (int j = i + 1; j < equipos.length; j++) {
                if (equipos[i].getGolesTotal() > equipos[j].getGolesTotal()) {
                    Equipo auxiliarTemporal = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = auxiliarTemporal;
                }

            }
        }
        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i].getNombreEquipo() + "	" + equipos[i].getGolesTotal());
        }
    }

    public void equipoGanadorJornada() {
        int cantidadJornadas = equipos[0].getGoles().length;
        for (int i = 0; i < cantidadJornadas; i++) {
            String equipoGoleador = null;
            int golMasAlto = -1;
            for (int j = 0; j < equipos.length; j++) {
                int[] golesEquipo = equipos[j].getGoles();
                int golesJornada = golesEquipo[i];
                if (golesJornada > golMasAlto) {
                    golMasAlto = golesJornada;
                    equipoGoleador = equipos[j].getNombreEquipo();
                }
            }
            System.out.println(equipoGoleador + " gano en la jornada " + (i + 1) + " con numero de goles: " + golMasAlto);
        }
    }

    public void equipoGanador() {
        int numeroJornadas = equipos[0].getGoles().length;
        String equipoGoleador = null;
        int golAlto = -1;
        int jornadaAlta = -1;
        for (int i = 0; i < numeroJornadas; i++) {
            for (int j = 0; j < equipos.length; j++) {
                int[] golesDelEquipo = equipos[j].getGoles();
                int golesJornada = golesDelEquipo[i];
                if (golesJornada > golAlto) {
                    golAlto = golesJornada;
                    equipoGoleador = equipos[j].getNombreEquipo();
                    jornadaAlta = i + 1;
                }
            }
        }
        System.out.println(equipoGoleador + " ha hecho " + golAlto + " goles en la jornada " + jornadaAlta);
    }

    public void saberEquipoPorJornada() {
        String nombreEquipo = PedirDatos.pedirString("Escribe equipo");
        int jornada = PedirDatos.pedirEntero("Escribe jornada");
        for (int i = 0; i < equipos.length; i++) {
            if (equipos[i].getNombreEquipo().equalsIgnoreCase(nombreEquipo)) {
                int[] jornadas = equipos[i].getGoles();
                System.out.println(nombreEquipo + " en la jornada " + jornada + " metio: " + jornadas[jornada - 1]+" goles");
            }

        }

    }

}
