package logica.logica05.matriz;
import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                System.out.printf("Digite o número da posição [%d][%d]: ", l, c);
                matriz[l][c] = scanner.nextInt();
            }
        }
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                if (l == c) {
                    System.out.printf("[%d]",matriz[l][c]);
                }
            }
        }
        scanner.close();
    }
}
