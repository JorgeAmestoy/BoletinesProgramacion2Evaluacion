package bol27;

import com.amestoy.libreria.PedirDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Metodoss {

    FileWriter out = null;
    PrintWriter fich = null;
    Scanner sc;
    

    public void escribir(File fichero) {

        try {
            out = new FileWriter(fichero);
            fich = new PrintWriter(out);
            fich.print(new Libros(PedirDatos.pedirString("Escribe titulo: "), PedirDatos.pedirString("Escribe autor: "), PedirDatos.pedirInt("Escribe precio: "), PedirDatos.pedirInt("Escribe numero de unidades: ")));

        } catch (IOException ex) {
            System.out.println("Error");
        } finally {
            fich.close();
        }
    }

    public void añadirPalabras(File fichero) {

        try {
            out = new FileWriter(fichero, true);
            fich = new PrintWriter(out);
            fich.print(new Libros(PedirDatos.pedirString("Escribe titulo: "), PedirDatos.pedirString("Escribe autor: "), PedirDatos.pedirInt("Escribe precio: "), PedirDatos.pedirInt("Escribe numero de unidades: ")));

        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            fich.close();
        }

    }

    public ArrayList<Libros> leerObjeto(File fichero) {

        ArrayList<Libros> lista = new ArrayList<>();
        String[] aux = new String[4];

        try {

            sc = new Scanner(fichero);

            while (sc.hasNextLine()) {

                aux = sc.nextLine().split(", ");
                lista.add(new Libros(aux[0], aux[1], Integer.parseInt(aux[2]), Integer.parseInt(aux[3])));

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error" + ex.getMessage());

        } finally {
            sc.close();

        }
        
        return lista;
    }

    public void buscarTitulo(ArrayList<Libros> libro) {

        String libroBuscar = PedirDatos.pedirString("Escribe titulo del libro a buscar");

        for (int i = 0; i < libro.size(); i++) {

            if (libroBuscar.equalsIgnoreCase(libro.get(i).gettitulo())) {

                System.out.println(libro.get(i).getPrecio());

            } else {
                System.out.println("Non esta o libro");
            }

        }

    }

    public void amosar(ArrayList<Libros> libro) {

        for (Libros ele : libro) {
            System.out.println(ele);
        }

    }

    public void eliminar(ArrayList<Libros> libro) {

        Iterator it = libro.iterator();
        Libros lib;
        while (it.hasNext()) {
            lib = (Libros) it.next();
            if (lib.getUnidades() == 0) {
                it.remove();
            }

        }
        System.out.println("Libro borrado por ter cero unidades");

    }

    public ArrayList<Libros> actuliazarBorrando(ArrayList<Libros> lib) {

        ArrayList<Libros> actualizada = new ArrayList<>();
        for (Libros ele : lib) {

            if (ele.getUnidades() > 0) {
                actualizada.add(ele);
            }

        }

        return actualizada;

    }

    public void reemplazarFichero(File fichero, ArrayList<Libros> lista) {

        try {

            out = new FileWriter(fichero);
            fich = new PrintWriter(out);

            for (int i = 0; i < lista.size(); i++) {

                fich.print(lista.get(i));

            }

        } catch (IOException ex) {
            System.out.println("Error " + ex.getMessage());
        } finally {
            fich.close();
        }

    }

    public void cambiarPrecio(ArrayList<Libros> lista) {

        String titulo = PedirDatos.pedirString("Escribe titulo del libro que quieres cambiar precio");
        Libros lib = null;
        for (int i = 0; i < lista.size(); i++) {

            if (titulo.equalsIgnoreCase(lista.get(i).gettitulo())) {

               int precioNuevo = PedirDatos.pedirInt("Escribe nuevo precio");
                lista.get(i).setPrecio(precioNuevo);

            } else {
                System.out.println("Libro no existe");
            }

        }

    }

}
