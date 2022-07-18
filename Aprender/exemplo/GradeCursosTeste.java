package exemplo;

import java.util.Scanner;

public class GradeCursosTeste{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GradeCursos minhaGradeCursos = new GradeCursos();

        System.out.printf("O nome do curso inicial é: %s\n\n", 
        minhaGradeCursos.getNomeCurso());

        System.out.printf("Por Favor insira o nome do curso: ");
        String oNome = input.nextLine();
        minhaGradeCursos.setNomeCurso(oNome);
        System.out.println();
        minhaGradeCursos.displayMensagem();
    }
}