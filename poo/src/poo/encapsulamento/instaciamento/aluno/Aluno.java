package poo.testes.encapsulamento.instaciamento.aluno;
public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome,double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void media(){
        double media = (nota1+nota2)/2;
        System.out.println("Aluno: "+nome+"\nNota: "+media);
        System.out.println();
    }
}
