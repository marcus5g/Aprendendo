package exemplo;

public class GradeCursos {
 private String nomeCurso;

 public void setNomeCurso(String nome){
    nomeCurso = nome;
 }

 public String getNomeCurso(){
    return nomeCurso;
 }

 public void displayMensagem(){
    System.out.printf("Bem vindo a Grade de cursos para %s!", getNomeCurso());
 }
}
