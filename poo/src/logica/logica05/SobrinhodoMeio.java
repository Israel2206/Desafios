package logica.logica05;
import java.util.Scanner;

public class SobrinhodoMeio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int z = scanner.nextInt();
        int l = scanner.nextInt();

        if ((h > z && h < l) || (h < z && h > l)) {
            System.out.println("huguinho");
        } else if ((z > h && z < l) || (z < h && z > l)) {
            System.out.println("zezinho");
        } else {
            System.out.println("luisinho");
        }
    }
}
