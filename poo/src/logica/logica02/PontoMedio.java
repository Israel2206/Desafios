package logica.logica02;
import java.util.Scanner;

public class PontoMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double xm = (x1 + x2) / 2.0;
        double ym = (y1 + y2) / 2.0;

        System.out.printf("%.2f %.2f", xm, ym);

        scanner.close();
    }
}
