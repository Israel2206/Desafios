package logica05;
import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int g = 0;
        int d = 0;

        while (true) {
            int numero = scanner.nextInt();
            if (numero == 1) {
                a++;
            }else if (numero == 2) {
                g++;
            }else if (numero==3) {
                d++;
            }else if (numero ==4) {
                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
    }
}