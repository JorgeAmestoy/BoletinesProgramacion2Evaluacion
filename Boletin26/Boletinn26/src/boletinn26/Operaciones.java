package boletinn26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Operaciones<T> {

  

    public <T> void engadir(T elemento, ArrayList<T> list) {

        list.add(elemento);

    }

    public <T> void amosarFor(ArrayList<T> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public <T> void amosarForEach(ArrayList<T> list) {

        for (T ele : list) {
            System.out.println(ele);
        }

    }

    public <T> void minimo(ArrayList<T> list) {

        System.out.println("Elemento minimo: " + Collections.min(list, null));

    }

    public <T> void maximo(ArrayList<T> list) {
        System.out.println("Elemento maximo: " + Collections.max(list, null));
    }

    public <T> void buscar(T elemento, ArrayList<T> list) {

        if (list.indexOf(elemento) >= 0) {
            System.out.println("Esta en la lista");
        } else {
            System.out.println("-1");
        }

    }

    public void eliminar(T elemento, ArrayList<T> list) {

        if (list.indexOf(elemento) >= 0) {
            list.remove(elemento);
            System.out.println("Elemento " + elemento + "se ha borrado");

        } else {
            System.out.println("Null");
        }

    }

    public <T> void ordenar(ArrayList<T> lista) {
        lista.sort((Comparator<? super T>) Comparator.naturalOrder());

        for (T ele : lista) {
            System.out.println(ele);
        }
    }

}
