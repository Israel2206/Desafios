// Verifique se um número é primo (sem laço)
import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 2) {
            System.out.println("O número não é primo");
        } else if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
            System.out.println("O número é primo!");
        } else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
            System.out.println("O número não é primo");
        } else {
            System.out.println("O número é primo!");
        }

        scanner.close();
    }
}
