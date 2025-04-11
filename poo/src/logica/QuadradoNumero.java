package logica;
import java.util.Scanner;

public class QuadradoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        for(int contador = 1; contador <=numero; contador++){
            System.out.println("O quadrado de "+contador+" é "+contador*contador);
        }
        scanner.close();
    }
}
