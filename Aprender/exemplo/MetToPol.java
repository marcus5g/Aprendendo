package exemplo;

public class MetToPol {
    public static void main(String[] args){
      double polegadas;
      double metros;
      int contador;

      contador=0;
      
      for(polegadas = 1;polegadas<=120;polegadas++){
        metros = polegadas * 39.37;
        System.out.println(polegadas + " Polegadas em Metros é: " + metros);
        contador++;
        
        if(contador == 12){
            System.out.println();
            contador = 0;
        }
      }
    }
}
