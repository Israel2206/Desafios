package logica;
// SomaAteZero.java
// Leia números até que o usuário digite 0. Exiba a soma total.
import java.util.Scanner;

public class SomaAteZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.print("Digite um numero: ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                System.out.println(soma);
                break;
            }else{
                soma += numero;
            }
        }
        scanner.close();
    }
}
