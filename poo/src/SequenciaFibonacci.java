//Mostre os N primeiros termos da sequência de Fibonacci.
import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int proximo = 0;
        System.out.print("digite um numero: ");
        int numero = scanner.nextInt();
        int inicio = 0;

        while (inicio <numero) {
            System.out.println(a);
            proximo = a+b;
            a = b;
            b = proximo;
            inicio++;

        }
        scanner.close();
    }    
}
