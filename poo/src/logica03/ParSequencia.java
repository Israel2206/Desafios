package logica03;
import java.util.Scanner;

public class ParSequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int impar = 0;
        int num = scanner.nextInt();
        
        while (true) {
            if(num%2!=0){
                impar++;
                System.out.println(num);
            }
            if (impar==6) {
                break;
            }
            num++;
        }
        scanner.close();
    }
}
