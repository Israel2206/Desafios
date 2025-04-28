package logica.logica02;
import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int quantidade = palavra.length();

        System.out.println("A palavra tem " + quantidade + " letras.");
        
        scanner.close();
    }
}
