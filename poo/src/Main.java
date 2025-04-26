import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][4];

        int soma = 0;

        for(int l =0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                matriz[l][c]=scanner.nextInt();

            }
        }
        for(int l =0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("[%d]", matriz[l][c]);
            }
            System.out.printf("%n");
        }

        System.out.println("A soma de cada linha: ");
        for(int l =0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                soma+=matriz[l][c];
            }
            System.out.printf("[%d] ", soma);
            soma = 0;
        }

        scanner.close();
    }
}
