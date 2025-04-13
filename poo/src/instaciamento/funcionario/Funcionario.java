package instaciamento.funcionario;
public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    void exibirFuncionario(){
        System.out.println("Nome: "+nome+"\nSalário: R$"+salario);
        System.out.println();
    }
}
