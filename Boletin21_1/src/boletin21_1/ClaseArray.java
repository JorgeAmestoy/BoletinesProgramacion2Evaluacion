
package boletin21_1;

import java.util.Arrays;


public class ClaseArray {
    
    
    public int[] metodoNumeros(){
        
     int i;
        int[] numeros = new int[7];
        
       
        for (i=0;i< numeros.length;i++){
            
             numeros[i] = (int)(Math.random()*50);
        }
        
          return numeros;   
          
        
    }
    
    public void amosarMetodo(int[] numeross){
        
        for(int i=0;i< numeross.length;i++){
            
            System.out.println(i+1+ "--->" +numeross[i]);
            
        } 
       
        
    }
    
    
    
    public void amosarArrayAlReves (int[] numeros) {
        Arrays.sort(numeros);
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println("posición " + (i+1) + "--> " + numeros[i]);
        }
    }
   
 
    
    
   
    
    
    
}
