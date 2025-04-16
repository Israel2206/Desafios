package logica02;
import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = 0;
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i<=n;i++){
            String B = scanner.nextLine();
            if (B.equals("X++") || B.equals("++X")) {
                X++;;
            }else if (B.equals("X--") || B.equals("--X")) {
                X--;
            }
        }
        System.out.println(X);
        scanner.close();
    }
}
