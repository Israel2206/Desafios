package poo.testes.encapsulamento.funcionario;
public class Funcionario {
    private double salario;

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        if (salario>0) {
            this.salario = salario;
        }else{
            System.out.println("Valor inválido!");
        }
    }
    public void aumentarSalario(double percentual){
        if (percentual > 0) {
            salario += salario * (percentual / 100);
        } else {
            System.out.println("Percentual inválido.");
        }
    }
}
