package logica;
// Tabuada.java
// Leia um número inteiro e mostre a tabuada dele de 1 a 10.
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para a tabuada: ");
        int numero = scanner.nextInt();
        for(int contador = 1; contador <=10; contador++){
            System.out.println(numero+" X "+contador+" = "+(numero*contador));
        }
        scanner.close();
    }
}
