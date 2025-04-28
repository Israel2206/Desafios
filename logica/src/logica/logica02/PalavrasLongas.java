package logica.logica02;
import java.util.Scanner;

public class PalavrasLongas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1;i<=num;i++){
            String n = scanner.nextLine();
            if (n.length() > 10) {
                int l = n.length();
                System.out.println(n.charAt(0)+String.valueOf(l-2)+n.charAt(l-1));
            }else{
                System.out.println(n);
            }
        }
        scanner.close();
    }
}
