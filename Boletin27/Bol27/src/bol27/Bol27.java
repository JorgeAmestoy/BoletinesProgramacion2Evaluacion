package bol27;

import com.amestoy.libreria.PedirDatos;
import java.io.File;
import java.util.ArrayList;

public class Bol27 {

    public static void main(String[] args) {

        Metodoss met = new Metodoss();
        File f = new File("libreria4.txt");
        ArrayList<Libros> lista = met.leerObjeto(f);
        int opcion;

        do {
            opcion = PedirDatos.pedirEntero("Escribe numero opcion");
            switch (opcion) {
                case 1:
                    met.añadirPalabras(f);
                    met.leerObjeto(f);
                    break;

                case 2:
                    met.añadirPalabras(f);
                    break;
                case 3:
                    met.amosar(lista);
                    break;
                case 4:
                    ArrayList<Libros> filtrada = met.actuliazarBorrando(lista);
                    met.reemplazarFichero(f, filtrada);
                    lista = met.leerObjeto(f);
                case 5:
                    met.cambiarPrecio(lista);
                    met.reemplazarFichero(f, lista);
                    lista = met.leerObjeto(f);
                default:
                    break;

            }

        } while (opcion < 10);

    }

}
