//Leia três números e mostre o maior entre eles.
import java.util.Scanner;

public class MaiorDeTresIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("O maior número é: "+maior);

        scanner.close();
    }
}
