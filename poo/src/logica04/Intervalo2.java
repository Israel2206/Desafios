package logica04;
import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in = 0;
        int out = 0;

        int n = scanner.nextInt();
        for(int i = 1; i <= n ; i++){
            int N = scanner.nextInt();
            if (N >= 10 && N <=20) {
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
        scanner.close();
    }
}
