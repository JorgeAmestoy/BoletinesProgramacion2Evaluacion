package boletinn21_2;

import com.amestoy.libreria.PedirDatos;

public class Boletinn21_2 {

    public static void main(String[] args) {

        Clase cla = new Clase();
        int opcion;
        int[] aux = null;
        do {

            opcion = PedirDatos.pedirEntero("Escribe opcion deseada");

            switch (opcion) {

                case 1:
                    aux = cla.crearArray();
                    break;
                case 2:
                    cla.amosarNotas(aux);
                    break;
                case 3:
                    cla.notaMedia(aux);
                    break;
                case 4:
                    cla.notaAlta(aux);
                    break;
                default:
                    System.out.println("Escribe otra vez opcion");

            }

        } while (opcion < 5);

    }

}
