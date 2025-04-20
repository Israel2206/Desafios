package logica04;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 1 ; i <= n ; i++){
            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            double n3 = scanner.nextDouble();

            double media = (n1 *2 + n2 *3 + n3 *5)/10;
            System.out.printf("%.1f%n",media);
        }
        scanner.close();
    }
}
