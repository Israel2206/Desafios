package logica03;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        media = Math.round(media * 10.0) / 10.0;
        System.out.printf("Media: %.1f%n", media);
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Aluno em exame.");
            double media2 = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", media2);
            
            double fim = (media + media2) / 2;
            fim = Math.round(fim * 10.0) / 10.0;

            if (fim >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", fim);
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
