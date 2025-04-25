package logica05;
import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numero = new int[3][3];

        int soma = 0;

        for(int l = 0 ; l < numero.length ; l++){
            for(int c = 0 ; c < numero[l].length ; c++){
                numero[l][c] = scanner.nextInt();
                soma += numero[l][c];
            }
            System.out.printf("A soma é: %d %n",soma);
            soma=0;
        }
    }
}