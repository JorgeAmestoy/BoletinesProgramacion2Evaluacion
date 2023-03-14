
package bol27;


public class Libros {
    
    private String titulo;
    private String autor;
    private int precio;
    private int unidades;

    public Libros(String titulo, String autor,int precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public Libros() {
    }

    public String gettitulo() {
        return titulo;
    }

    public void setNtitulo(String ntitulo) {
        this.titulo = ntitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libros{" + "ntitulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
