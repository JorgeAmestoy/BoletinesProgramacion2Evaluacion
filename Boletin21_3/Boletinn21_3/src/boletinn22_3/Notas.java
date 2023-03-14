package boletinn22_3;

import com.amestoy.libreria.PedirDatos;

public class Notas {

    int[] notas = new int[3];
    String[] alumnos = new String[3];

    public int[] crearArray() {

        for (int i = 0; i < notas.length; i++) {

            notas[i] = PedirDatos.pedirEntero("Escribe nota ");
            alumnos[i] = PedirDatos.pedirString("Escribe nombre de alumno");

        }

        return notas;

    }

    public void aprobados(int[] notas) {

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] >= 5) {
                System.out.println(alumnos[i] + " aprobou cun " + notas[i]);
            }

        }

    }

    public void ordenCrecente(int[] notas) {

        int aux;
        String auxNombre;

        for (int i = 0; i < notas.length; i++) {

            for (int j = i + 1; j < notas.length; j++) {

                if (notas[i] > notas[j]) {

                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;

                    auxNombre = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = auxNombre;

                }

            }

        }
        System.out.println("Array ordenado");

    }
    
    public void ordenDecrecente(int[] notas) {

        int aux;
        String auxNombre;

        for (int i = 0; i < notas.length; i++) {

            for (int j = i + 1; j < notas.length; j++) {

                if (notas[i] < notas[j]) {

                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;

                    auxNombre = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = auxNombre;

                }

            }

        }
        System.out.println("Array ordenado");

    }

    public void alumnoDeterminado(int[] nota) {

        String alum = PedirDatos.pedirString("Escribe nombre de alumno");

        for (int i = 0; i < nota.length; i++) {

            if (alumnos[i].equalsIgnoreCase(alum)) {
                System.out.println("A nota de " + alum + " es " + notas[i]);
            } else {
                System.out.println("Alumno on esta na lista");
            }

        }

    }

}
