package logica03;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int converter1 = (h1 * 60) + m1;

        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int converter2 = (h2 * 60) + m2;

        int duracao = converter2 - converter1;
        if (duracao <= 0) {
            duracao += 1440;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        scanner.close();
    }
}
