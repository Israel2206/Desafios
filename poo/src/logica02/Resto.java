package logica02;
import java.util.Scanner;

public class Resto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1;i<=10000;i++){
            if (i%num==2) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
