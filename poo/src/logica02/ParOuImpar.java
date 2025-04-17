package logica02;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i = 1; i<=N;i++){
            int num = scanner.nextInt();
            if (num %2==0 && num > 0) {
                System.out.println("EVEN POSITIVE");
            }else if (num %2==0 && num <0) {
                System.out.println("EVEN NEGATIVE");
            }else if (num %2!=0 && num > 0) {
                System.out.println("ODD POSITIVE");
            }else if (num %2!=0 && num < 0) {
                System.out.println("ODD NEGATIVE");
            }else{
                System.out.println("NULL");
            }
        }
        scanner.close();
    }
}
