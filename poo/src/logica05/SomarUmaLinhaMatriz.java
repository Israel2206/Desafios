package logica05;
import java.util.Scanner;

public class SomarUmaLinhaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        int soma = 0;

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                System.out.printf("Digite o número da posição [%d][%d]: ", l, c);
                matriz[l][c] = scanner.nextInt();
            }
        }
        System.out.println("um número de linha (de 0 a 3): ");
        int linhaEscolhida = scanner.nextInt();

        for(int c = 0; c < matriz[linhaEscolhida].length ; c++){
            soma+=matriz[linhaEscolhida][c];
        }
        System.out.println(soma);
        scanner.close();
    }
}
