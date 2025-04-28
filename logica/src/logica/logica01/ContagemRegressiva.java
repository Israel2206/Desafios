package logica.logica01;
// Imprima os números de 10 a 1.
import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for(int i = 0; i<numero; numero--){
            System.out.println(numero);
        }
        scanner.close();
    }
}
