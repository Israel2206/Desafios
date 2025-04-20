package logica.logica02;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int contador = 1;contador<=10;contador++){
            System.out.println(contador+" x  "+N+" = "+(contador*N));
        }
        scanner.close();
    }
}
