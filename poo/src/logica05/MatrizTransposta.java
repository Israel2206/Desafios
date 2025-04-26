package logica05;
import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][2];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print("Digite o numero da matriz: ");
                matriz[l][c] = scanner.nextInt();
            }
        }

        System.out.println("Original: ");
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("[%d]",matriz[l][c]);
            }
            System.out.printf("%n");
        }

        System.out.println("Transposta:");
        for (int c = 0; c < matriz[0].length; c++) { // colunas viram linhas
            for (int l = 0; l < matriz.length; l++) { // linhas viram colunas
                System.out.printf("[%d]", matriz[l][c]);
            }
            System.out.printf("%n");
        }
        scanner.close();
    }
}
