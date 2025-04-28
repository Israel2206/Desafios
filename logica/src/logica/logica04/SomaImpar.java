package logica.logica04;
import java.util.Scanner;

public class SomaImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        
        for(int i = 1; i <= num; i++){
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            int max = Math.max(X, Y);
            int min = Math.min(X, Y) +1;
            int soma = 0;
            while (min < max) {
                if (min %2!=0) {
                    soma+=min;
                }
                min++;
            }
            System.out.println(soma);
        }
        scanner.close();
    }
}
