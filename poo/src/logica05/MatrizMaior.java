package logica05;
import java.util.Scanner;

public class MatrizMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int numero_maior = 0;

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                System.out.print("Digite numeros para a matriz: ");
                matriz[l][c] = scanner.nextInt();
            }
        }
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                if (matriz[l][c] > 10) {
                    numero_maior++;
                }
            }
        }
        System.out.println("Quantidade de números maior que 10: "+numero_maior);
        scanner.close();
    }
}
