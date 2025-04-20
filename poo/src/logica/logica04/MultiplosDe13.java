package logica.logica04;
import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int max = Math.max(X, Y);
        int min = Math.min(X, Y);
        while (min<=max) {
            if (min%13!=0) {
                soma+=min;
            }
            min++;
        }
    
        System.out.println(soma);
        scanner.close();
    }
}
