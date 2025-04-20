package logica.logica02;
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int soma = 0;

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        scanner.close();
    }
}
