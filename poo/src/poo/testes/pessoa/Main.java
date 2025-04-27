package poo.testes.pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pessoa 1: ");
        String nome = scanner.nextLine();

        System.out.print("Idade 1: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        System.out.print("Pessoa 2: ");
        String nome2 = scanner.nextLine();

        System.out.print("Idade 2: ");
        int idade2 = scanner.nextInt();

        Pessoa pessoa1 = new Pessoa(nome, idade);
        Pessoa pessoa2 = new Pessoa(nome2, idade2);

        // Chamada mais elegante e clara
        pessoa1.compararIdade(pessoa2);

        scanner.close();
    }
}
