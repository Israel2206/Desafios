package logica03;
import java.util.Scanner;
import java.util.ArrayList;

public class Positivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        int soma = 0;
        for(int i = 1; i <=6 ; i++){
            numeros.add(scanner.nextDouble());
        }
        for(double positivos : numeros){
            if (positivos > 0) {
                soma++;
            }
        }
        System.out.println(soma+" valores positivos");
        scanner.close();
    }
}