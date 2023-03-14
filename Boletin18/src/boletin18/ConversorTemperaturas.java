package boletin18;

import javax.swing.JOptionPane;

public class ConversorTemperaturas {

    private final float gradosC = 80;

    public float Farenheit(float gradoss) throws TemperaturaErradaExcepcion {

        if (gradoss < this.gradosC) {

            throw new TemperaturaErradaExcepcion("Errrrrrrrrror");

        } else {
            float resultado = gradosC * 1.8f + 32;
            System.out.println(resultado);

            return resultado;

        }

    }
    
     public float Farenheit2() throws TemperaturaErradaExcepcion {
         
        float gradoss = Float.parseFloat(JOptionPane.showInputDialog("Escribe grados"));

        if (gradoss < this.gradosC) {

            throw new TemperaturaErradaExcepcion("Errrrrrrrrror");

        } else {
            float resultado = gradosC * 1.8f + 32;
            System.out.println(resultado);

            return resultado;

        }

    }


    public void Reamur(float gradoss) throws TemperaturaErradaExcepcion{
    
        
         if (gradoss < this.gradosC) {

            throw new TemperaturaErradaExcepcion("Errrrrrrrrror");

        } else {
           float resultado = 4.0f/5.0f*gradosC;
            System.out.println(resultado);

          

        }
        
      

    }

}
