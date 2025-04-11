package logica;
// ParOuImpar.java
// Leia um número inteiro e diga se ele é par ou ímpar.
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero %2==0 && numero != 0) {
            System.out.println("O numero "+numero+" é Par");
        }else if (numero==0) {
            System.out.println("O numero "+numero+" é Neutro");
        }else{
            System.out.println("O numero "+numero+" é Impar");
        }
        scanner.close();
    }
}
