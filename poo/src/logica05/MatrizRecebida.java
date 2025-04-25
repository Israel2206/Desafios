package logica05;
import java.util.Scanner;

public class MatrizRecebida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 2;
        int colunas = 2;

        int[][] matriz = new int[linhas][colunas];

        for(int l = 0; l < matriz.length ; l++){
            for(int c = 0 ; c < matriz[l].length; c++){
                System.out.print("Digite um numero para a matriz: ");
                matriz[l][c] = scanner.nextInt();
            }
        }
        for(int l = 0; l < matriz.length ; l++){
            for(int c = 0 ; c < matriz[l].length; c++){
                System.out.printf("[%d]",matriz[l][c]);
            }
            System.out.printf("%n");
        }
        scanner.close();
    }
}
