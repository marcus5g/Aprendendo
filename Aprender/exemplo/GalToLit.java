package exemplo;

public class GalToLit {
    public static void main(String[] args) {
        double galao;
        double litro;
        int contador;

        contador = 0;
        for(galao = 1.0; galao<=100.0; galao++){
            litro = galao * 3.7854;
            System.out.println(galao + " Galao em litros é : " + litro);
        
            contador++;
            if(contador ==  10){
                System.out.println();
                contador = 0;
            }
        }
    }
}
