package Frutaria;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Fruta fruta = new Fruta();
        fruta.nome = "Banana";
        fruta.preco = 5.99;

        
        System.out.println("Nome: " + fruta.nome + " valor = " + fruta.preco);
    }
}