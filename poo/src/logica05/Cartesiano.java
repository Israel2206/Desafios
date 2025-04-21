package logica05;
import java.util.Scanner;

public class Cartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 > 0) {
                System.out.println("primeiro");
            }else if (num1 < 0 && num2 >0) {
                System.out.println("segundo");
            }else if (num1 < 0 && num2 < 0) {
                System.out.println("terceiro");
            }else if (num1 > 0 && num2 <0) {
                System.out.println("quarto");
            }else{
                break;
            }
        }
        scanner.close();
    }
}
