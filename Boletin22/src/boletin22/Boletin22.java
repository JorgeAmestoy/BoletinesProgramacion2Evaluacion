package boletin22;

public class Boletin22 {

    public static void main(String[] args) {

        Equipo celta = new Equipo("Celta");
        celta.setGoles(new int[]{3, 4, 2});


        Futbol obx = new Futbol();
        obx.setEquipos(new Equipo[]{celta,new Equipo("Bilbao", new int[]{1, 2, 3}),new Equipo("Málaga", new int[]{5, 0, 2}),});

        obx.listaOrdenada();
        obx.equipoGanadorJornada();
        obx.equipoGanador();
        obx.saberEquipoPorJornada();
    }

}
