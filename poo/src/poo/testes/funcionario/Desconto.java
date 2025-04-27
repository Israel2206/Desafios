package poo.testes.funcionario;
import java.util.Scanner;


public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        int preco = scanner.nextInt();

        System.out.print("digite o desconto: ");
        int desconto = scanner.nextInt();

        Produto produto = new Produto(preco);

        int precoFinal = produto.calcular_desconto(desconto);

        System.out.println("Preço final com desconto: " + precoFinal);

        scanner.close();

    }

}
