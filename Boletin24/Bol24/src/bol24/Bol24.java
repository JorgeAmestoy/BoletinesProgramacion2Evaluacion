package bol24;

import com.amestoy.libreria.PedirDatos;
import java.util.ArrayList;

public class Bol24 {

    static final int CREAR =1;
    static final int AMOSAR = 2;
    static final int ORDENAR = 3;
    static final int BORRAR =4;
    static final int BORRAR_POR_UNIDADES=5;
    static final int CONSULTAR_LIBRO =6;
    
    
    
    public static void main(String[] args) {
        ArrayList<Libro> libreria = new ArrayList<>();

        Metodos met = new Metodos();

        int opcion;

        do {
            
            opcion = PedirDatos.pedirEntero("Escribe la opcion que quieras: ");
            
            
            switch (opcion) {

                case CREAR:
                    met.engadirLibros(libreria);
                    break;

                case AMOSAR:
                    met.amosarLibro(libreria);
                    break;
                    
                case ORDENAR:
                     met.ordenarLibros(libreria);
                    break;
                case BORRAR:
                    met.borrarLibro(libreria);
                    break;
                case BORRAR_POR_UNIDADES:
                    met.borrarPorUnidades(libreria);
                    break;
                    
                case CONSULTAR_LIBRO:
                    met.consultarLibro(libreria);
                    break;
                    
            
                default:
                    System.out.println("Volve a intentarlo");

            }

        } while (opcion < 7);

    }

}
