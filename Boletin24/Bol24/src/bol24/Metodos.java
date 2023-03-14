package bol24;

import com.amestoy.libreria.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Metodos {

    public ArrayList<Libro> engadirLibros(ArrayList<Libro> libre) {
        Libro lib = new Libro(PedirDatos.pedirString("Escribe titulo: "), PedirDatos.pedirString("Escribe autor"), PedirDatos.pedirString("Escribe isbn: "), PedirDatos.pedirEntero("Escribe precio: "), PedirDatos.pedirEntero("Escribe numero de unidades: "));

        libre.add(lib);
        return libre;

    }

    public void amosarLibro(ArrayList<Libro> libre) {

        System.out.println(libre);

    }

    public void amosarLibroFor(ArrayList<Libro> libre) {

        for (int i = 0; i < libre.size(); i++) {

            System.out.println(libre.get(i));

        }

    }

    public void amosarLibroForEach(ArrayList<Libro> libre) {

        for (Libro ele : libre) {

            System.out.println(ele);

        }

    }

    public void borrarLibro(ArrayList<Libro> libre) {
        String isbn = PedirDatos.pedirString("Escribe isbn");
        Iterator it = libre.iterator();
        Libro libro;

        while (it.hasNext()) {//mientras haya algo que leeer

            libro = (Libro) it.next();//lo que lea guardalo en la variable libro, la cual es de tipo libro
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                it.remove();
            }

        }

    }

    public void ordenarLibros(ArrayList<Libro> ordenado) {

        Collections.sort(ordenado);

        System.out.println("Libros ordenados");

    }

    public void borrarPorUnidades(ArrayList<Libro> libro) {

        Iterator it = libro.iterator();
        Libro lib;

        while (it.hasNext()) {

            lib = (Libro) it.next();
            if (lib.getNumUnidades() == 0) {
                it.remove();

            }

        }

    }

    public void consultarLibro(ArrayList<Libro> libro) {

        Iterator it = libro.iterator();

        String titulo;
        titulo = PedirDatos.pedirString("Escribe titulo ");
        Libro lib;
        while (it.hasNext()) {

            lib = (Libro) it.next();
            if (lib.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: \n" + lib.toString());

            } else {
                System.out.println("Libro no encontrado");
            }

        }

    }

}
