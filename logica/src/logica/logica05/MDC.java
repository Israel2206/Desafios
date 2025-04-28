package logica.logica05;
import java.util.Scanner;

public class MDC {
    // Função para calcular o MDC usando o algoritmo de Euclides
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            int resultado = mdc(n1, n2);
            System.out.println(resultado);
        }

        scanner.close();
    }
}
