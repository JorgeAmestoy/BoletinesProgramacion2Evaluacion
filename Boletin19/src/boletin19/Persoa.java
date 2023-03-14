
package boletin19;


public class Persoa implements IPodeCantar{
    private String tipo;
    
    public Persoa(String tipo){
        this.tipo=tipo;
    }
    
    public String getPersoa(){
        return tipo;
    }

    @Override
    public void cantar() {
        
        System.out.println("lksnfsf");
       

    }
    
    
    
    
    
    
    
}
