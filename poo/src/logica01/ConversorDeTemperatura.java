package logica01;
// Converta uma temperatura de Celsius para Fahrenheit
import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos Celsiu você quer converter para Fahrenheit: ");
        double celsiu = scanner.nextDouble();

        double conversor = (celsiu * 1.8 + 32);

        System.out.println("°F = "+conversor);

        scanner.close();
    }
}
