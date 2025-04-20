package logica04;
import java.util.Scanner;

public class RestoDaDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int max = Math.max(x, y);
        int min = Math.min(x, y) + 1;

        while (min < max) {
            if (min %5 == 2 || min %5==3) {
                System.out.println(min);
            }
            min++;
        }
        scanner.close();
    }
}
