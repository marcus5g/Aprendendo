package exemplo;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double galao;
        double litro;
        String resposta;

        do{
        System.out.println("Insira o numero de galões: ");
        galao = input.nextInt();

        litro = galao * 3.7854;
        System.out.println(galao + "Galões em Litros são: " + litro);

        System.out.println("Quer fazer uma nova conversão: Digite y/n para a resposta");
        resposta = input.toString();
        }

        while (resposta == y) {
            
        }
            
    

    }
}
