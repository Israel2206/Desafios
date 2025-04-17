package logica02;
import java.util.Scanner;

public class Dividindo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i = 1; i<=N; i++){
            double x = scanner.nextInt();
            double y = scanner.nextInt();
            if (y == 0) {
                System.out.println("divisao impossivel");
            }else{
                double m = x/y;
                System.out.printf("%.1f%n",m);
            }
        }
        scanner.close();
    }
}
