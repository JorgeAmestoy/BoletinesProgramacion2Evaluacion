
package boletin18;

import javax.swing.JOptionPane;


public class Boletin18 {

   
    public static void main(String[] args) {
   
        
        ConversorTemperaturas obx = new ConversorTemperaturas();
        float gradoss = Float.parseFloat(JOptionPane.showInputDialog("Escribe grados"));
        
        
        try{
            
           obx.Farenheit(gradoss);
           obx.Reamur(gradoss);
            
        }catch(TemperaturaErradaExcepcion ex){
            
            System.out.println(ex.toString());
        }
        
        System.out.println("Fin del programa");
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
