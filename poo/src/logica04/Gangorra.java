package logica04;
import java.util.Scanner;

public class Gangorra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        int p2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        int pc1 = p1*c1;
        int pc2 = p2*c2;

        if (pc1 == pc2) {
            System.out.println("0");
        }else if (pc1 < pc2) {
            System.out.println("1");
        }else if (pc1>pc2) {
            System.out.println("-1");
        }
        scanner.close();
    }
}
