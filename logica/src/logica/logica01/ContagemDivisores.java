package logica.logica01;
// Conte quantos divisores um número inteiro possui.
import java.util.Scanner;

public class ContagemDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        int contardivisores = 0;
        for(int contador = 1; contador <=numero; contador++ ){
            if (numero %contador==0) {
                System.out.println(contador);
                contardivisores++;
            }
        }
        System.out.println("O numero "+numero+" tem o total de "+contardivisores+" divisores");
        scanner.close();
    }
}
