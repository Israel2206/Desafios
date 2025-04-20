package logica.logica01;
// ProdutoEntreDois.java
// Leia dois números e calcule o produto entre eles.
import java.util.Scanner;

public class ProdutoEntreDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = scanner.nextInt();

        Produto(num1, num2);
        scanner.close();
    }
    public static void Produto(int numero1, int numero2){
        System.out.println("O produtos do Numero "+ numero1 +" e "+numero2+" é: "+(numero1*numero2));
    }
}
