package logica05;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int soma = 0;

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                System.out.printf("Digite o número da posição [%d][%d]: ", l, c);
                matriz[l][c] = scanner.nextInt();
            }
        }
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                    linha = l;
                    coluna = c;
                }
            }
        }
        System.out.printf("[%d]%n",maior);
        System.out.println("linha: "+linha+" \ncoluna: "+coluna);
    }
}
