
package boletin21_4;

import com.amestoy.libreria.PedirDatos;


public class Boletin21_4 {

  
    public static void main(String[] args) {
        
    
        
            
            
        int numDni= PedirDatos.pedirInt("Intoduce número del DNI: ");
        Dni dni=new Dni(numDni);
        System.out.println("La letra del DNI es: "+dni.calcularLetraDni());
        
    }
    }
    

