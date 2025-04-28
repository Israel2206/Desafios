package logica.logica04;
import java.util.Scanner;

public class QuadradoPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i <= N ; i++){
            if (i%2==0) {
                System.out.println(i+"^"+"2"+" = "+(i*i));
            }
        }
        scanner.close();
    }
}
