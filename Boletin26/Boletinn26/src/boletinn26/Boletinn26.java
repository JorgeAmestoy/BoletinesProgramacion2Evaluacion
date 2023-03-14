package boletinn26;

import java.util.ArrayList;

public class Boletinn26 {
    
    public static void main(String[] args) {
        
        Operaciones ope = new Operaciones();
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        ope.engadir(7, lista);
        ope.engadir(9, lista);
        ope.engadir(1, lista);
        ope.engadir(4, lista);
        
        ope.amosarForEach(lista);
        ope.amosarFor(lista);
        ope.minimo(lista);
        ope.maximo(lista);
        ope.buscar(4, lista);
        ope.ordenar(lista);
        ope.amosarFor(lista);
        ope.engadir(5, lista);
        
    }
}
