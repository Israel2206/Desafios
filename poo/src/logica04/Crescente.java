package logica04;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(;;){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x>y) {
                System.out.println("Decrescente");
            }else if(x<y){
                System.out.println("Crescente");
            }else{
                break;
            }
        }
        scanner.close();
    }
}
