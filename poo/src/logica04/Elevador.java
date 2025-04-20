package logica04;
import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int C = scanner.nextInt();
        int atual = 0;
        String exedeu = "N";

        for(int i =1 ; i <= N ; i++){
            int S = scanner.nextInt();
            atual -= S;
            int E = scanner.nextInt();
            atual += E;

            if (atual >= C) {
                exedeu = "S";
            }
        }
        System.out.println(exedeu);
        scanner.close();
    }
}
