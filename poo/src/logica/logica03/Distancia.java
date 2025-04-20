package logica.logica03;
import java.util.Scanner;

public class Distancia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

        System.out.printf("%.4f%n",distancia);
        scanner.close();
    }
}
