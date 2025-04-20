package logica04;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lugar = 0;
        int x = 0;
        for(int i = 1; i <= 100 ; i++){
            int num1 = scanner.nextInt();
            if (num1 >= x) {
                x = num1;
                lugar = i;
            }
        }
        System.out.println(x);
        System.out.println(lugar);
        scanner.close();
    }
}
