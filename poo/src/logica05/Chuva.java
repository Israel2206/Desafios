package logica05;
import java.util.Scanner;

public class Chuva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int colunas = scanner.nextInt();
        scanner.nextLine();

        String[][] matriz = new String[linhas][colunas];

        for(int l = 0; l < matriz.length ; l++){
            for(int c = 0; c < matriz[l].length; c++){
                matriz[l][c] = scanner.next();
            }
        }
        for(int l = 0; l < matriz.length ; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if (l > 0) {
                    if (matriz[l-1][c].equals(".")) {
                        matriz[l][c]="o";
                    }
                }
                if (c > 0 && l > 0 && l < linhas-1) {
                    if (matriz[l][c-1].equals(".") && matriz[l+1][c-1].equals("#")) {
                        matriz[l][c]="o";
                    }
                }
                if (c > 0 && c < colunas -1 && l > 0  && l < linhas-1) {
                    if (matriz[l][c+1].equals(".") && matriz[l+1][c+1].equals("#")) {
                        matriz[l][c]="o";
                    }
                }
            }
        }

        for(int l = 0; l < matriz.length ; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("%s",matriz[l][c]);
            }
            System.out.printf("%n");
        }
    }
}
