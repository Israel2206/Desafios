package logica.logica05;
import java.util.Scanner;

public class NotasValidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quant = 0;
        double soma = 0;
        while (true) {
            double nota = scanner.nextDouble();
            if (nota >=0 && nota <=10) {
                soma += nota;
                quant++;
                if (quant ==2) {
                    break;
                }
            }else{
                System.out.println("nota invalida");
            }
        }
        double media = soma/2;
        System.out.printf("media = %.2f%n",media);
        scanner.close();
    }
}
