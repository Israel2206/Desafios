package logica03;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutos = scanner.nextInt();
        int n = minutos*60;
        int s = 0;
        int m = 0;
        int h = 0;
        if (n>=3600) {
            h = n/3600;
            n=n%3600;
        }if (n>=60) {
            m = n/60;
            n=n%60;
        }if (n<60) {
            s=n;
        }
        System.out.println(h+":"+m+":"+s);
        scanner.close();
    }
}