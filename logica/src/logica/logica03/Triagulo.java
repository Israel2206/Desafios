package logica.logica03;
import java.util.Scanner;

public class Triagulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            double perimetro = A + B + C;
            System.out.println("Perimetro = "+perimetro);
        }else{
            double area = ((A + B) * C) / 2;
            System.out.println("Area = "+area);
        }
        scanner.close();
    }
}
