package poo.testes.encapsulamento.funcionario;
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(1412);
        System.out.printf("Salário Atual: R$%.2f%n",funcionario.getSalario());

        funcionario.aumentarSalario(25);
        System.out.printf("Salátio Após aumento: R$%.2f%n",funcionario.getSalario());

    }
}
