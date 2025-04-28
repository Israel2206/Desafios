package logica.logica04;
import java.util.Scanner;

public class SomaPositiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        double soma = 0;

        for(int i = 1; i <= 6 ; i++){
            double num = scanner.nextDouble();
            if (num > 0) {
                positivos++;
                soma+=num;
            }
        }
        double media = soma/positivos;

        System.out.println(positivos+" valores positivos");
        System.out.printf("%.1f%n",media);
        scanner.close();
    }
}
