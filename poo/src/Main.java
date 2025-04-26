import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[2][3];

        for(int l =0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                matriz[l][c]=scanner.nextInt();

            }
        }
        System.out.println("Original: ");
        for(int l =0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.printf("[%d]", matriz[l][c]);
            }
            System.out.printf("%n");
        }

        System.out.println("\nTransposta: ");
        for(int c = 0; c < matriz[0].length; c++){
            for(int l = 0; l < matriz.length; l++){
                System.out.printf("[%d]", matriz[l][c]);
            }
            System.out.printf("%n");
        }
        scanner.close();
    }
}
