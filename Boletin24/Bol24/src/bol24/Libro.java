
package bol24;


public class Libro implements Comparable {
    
    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int numUnidades;

    public Libro(String titulo, String autor, String isbn, float prezo, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "Libro: " + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nisbn: " + isbn + "\nPrezo: " + prezo + "euros\n NumUnidades: " + numUnidades;
    }

    @Override
    public int compareTo(Object o) {
       
        Libro x = (Libro) o;
        if(this.titulo.compareToIgnoreCase(x.titulo)>0){
           return 1;
        }else if(this.titulo.compareToIgnoreCase(x.titulo)<0){
            return -1;
        }else{
            return 0;
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
