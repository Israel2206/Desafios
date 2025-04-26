import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];

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
        scanner.close();
    }
}
