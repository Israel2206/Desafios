package logica.logica03;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolhas = scanner.nextInt();
        if (escolhas == 1) {
            int quant = scanner.nextInt();
            double fim = quant*4.0;
            System.out.printf("Total: R$ %.2f%n",fim);
        }else if (escolhas == 2) {
            int quant = scanner.nextInt();
            double fim = quant*4.5;
            System.out.printf("Total: R$ %.2f%n",fim);
        }else if (escolhas == 3) {
            int quant = scanner.nextInt();
            double fim = quant*5.0;
            System.out.printf("Total: R$ %.2f%n",fim);
        }else if (escolhas == 4) {
            int quant = scanner.nextInt();
            double fim = quant*2.0;
            System.out.printf("Total: R$ %.2f%n",fim);
        }else if (escolhas == 5) {
            int quant = scanner.nextInt();
            double fim = quant*1.5;
            System.out.printf("Total: R$ %.2f%n",fim);
        }
        scanner.close();
    }
}