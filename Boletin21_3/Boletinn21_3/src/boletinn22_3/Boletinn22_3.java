package boletinn22_3;

import com.amestoy.libreria.PedirDatos;

public class Boletinn22_3 {

    public static void main(String[] args) {

        Notas not = new Notas();
        int opcion;
        int[] aux = null;

        do {
            opcion = PedirDatos.pedirEntero("Escribe opcion deseada");
            switch (opcion) {

                case 1:
                    aux = not.crearArray();
                    break;
                case 2:
                    not.aprobados(aux);
                    break;
                case 3:
                    not.alumnoDeterminado(aux);
                    break;
                case 4:
                    not.ordenCrecente(aux);
                    break;
                case 5:
                    not.ordenDecrecente(aux);
                    break;
                default:
                    System.out.println("Escribe de nuevo la opcion");

            }

        } while (opcion < 10);

    }

}
