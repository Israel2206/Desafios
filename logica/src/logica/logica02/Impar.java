package logica.logica02;
import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for(int i = 1; i<=num;i++){
            if (i %2==0) {
                continue;
            }else{
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
