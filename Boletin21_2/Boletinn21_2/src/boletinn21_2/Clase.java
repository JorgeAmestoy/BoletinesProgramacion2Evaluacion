package boletinn21_2;

import com.amestoy.libreria.PedirDatos;

public class Clase {

    int[] notas = new int[3];

    public int[] crearArray() {

        for (int i = 0; i < notas.length; i++) {

            notas[i] = PedirDatos.pedirEntero("Escribe nota: ");
        }

        return notas;

    }

    public void amosarNotas(int[] not) {

        int numA = 0;
        int numS = 0;

        for (int i = 0; i < not.length; i++) {

            if (not[i] >= 5) {

                numA = numA + 1;
            } else {

                numS = numS + 1;
            }

        }

        System.out.println("Numero de aprobados: " + numA);
        System.out.println("Numero de suspensos: " + numS);

    }

    public void notaMedia(int[] not) {

        int acuA = 0;
        int acuS = 0;

        for (int i = 0; i < notas.length; i++) {

            if (not[i] >= 5) {
                acuA = acuA + not[i];
            } else {
                acuS = acuS + not[i];
            }

        }

        int media = (acuA + acuS) / notas.length;
        System.out.println("Media da clase es: " + media);

    }

    public void notaAlta(int[] nota) {

        int notaAlta = 0;
        for (int i = 0; i < nota.length; i++) {

            if (nota[i] > notaAlta) {
                notaAlta = nota[i];

            }

        }
        System.out.println("Nota mas alta es: " + notaAlta);

    }

}
