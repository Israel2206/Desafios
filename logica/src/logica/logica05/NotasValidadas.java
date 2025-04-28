package logica.logica05;
import java.util.Scanner;

public class NotasValidadas {
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
                    double media = soma/2;
                    System.out.printf("media = %.2f%n",media);
                    int escolha = 0;
                    while (true) {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        escolha = scanner.nextInt();
                        if (escolha == 1 || escolha == 2) {
                            break;
                        }
                    }
                    quant = 0;
                    soma = 0;
                    if (escolha==1) {
                        continue;
                    }else{
                        break;
                    }
                }
            }else{
                System.out.println("nota invalida");
            }
        }
        scanner.close();
    }
}
