package poo.produto;

public class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double Aumento_Porcentagem(double aumento){
        return salario + (salario*aumento/100);
    }
}
