package logica01;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mult = 1;
        System.out.print("Digite o numero pra fatorar: ");
        int fatorial = scanner.nextInt();

        for(int contador = 1; contador <=fatorial; contador++ ){
            mult = mult *contador;
        }
        System.out.println(mult);
        scanner.close();
    }
}
