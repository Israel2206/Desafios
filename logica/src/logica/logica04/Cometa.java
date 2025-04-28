package logica.logica04;
import java.util.Scanner;

public class Cometa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int anoBase = 1986;
        int periodo = 76;
        while (anoBase <=n) {
            anoBase += periodo;
        }
        anoBase -= n;
        n+=anoBase;
        System.out.println(n);
        scanner.close();
    }
}
