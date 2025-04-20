package logica04;
import java.util.Scanner;

public class Par5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int par = 0;

        for(int i = 1; i<=5 ; i++){
            int num = scanner.nextInt();
            if (num %2==0) {
                par++;
            }
        }
        System.out.println(par+" valores pares");
        scanner.close();
    }
}
