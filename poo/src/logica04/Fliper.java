package logica04;
import java.util.Scanner;

public class Fliper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        if (p==0) {
            System.out.println("C");
        }else if (p == 1) {
            int r = scanner.nextInt();
            if (r == 0) {
                System.out.println("B");
            }else if (r == 1) {
                System.out.println("A");
            }
        }
        scanner.close();
    }
}
