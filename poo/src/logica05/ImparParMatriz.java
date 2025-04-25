package logica05;
import java.util.Scanner;

public class ImparParMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        int par = 0;
        int impar = 0;

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                matriz[l][c] = scanner.nextInt();
                if (matriz[l][c] %2==0) {
                    par++;
                }else{
                    impar++;
                }
            }
        }
        System.out.println("Existem "+par+" números pares!");
        System.out.println("Existem "+impar+" números impares!");
        scanner.close();
    }
}
