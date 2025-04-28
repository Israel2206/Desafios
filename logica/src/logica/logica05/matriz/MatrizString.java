package logica.logica05.matriz;
import java.util.Scanner;

public class MatrizString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] matriz = new String[3][3];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                matriz[l][c] = scanner.nextLine();
            }
        }
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length ; c++){
                System.out.printf("[%s]",matriz[l][c]);
            }
            System.out.printf("%n");
        }
        scanner.close();
    }
}
