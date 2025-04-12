package poo.funcionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Aumento: ");
        double aumento = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(salario);

        double salarioFinal = funcionario.Aumento_Porcentagem(aumento);

        System.out.println("Salario Atual: "+salarioFinal);

        scanner.close();
    }
}
