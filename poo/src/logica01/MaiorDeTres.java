package logica01;
//Leia três números e mostre o maior entre eles.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista_numeros = new ArrayList<>();

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        lista_numeros.add(num1);

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        lista_numeros.add(num2);

        System.out.print("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();
        lista_numeros.add(num3);

        Collections.sort(lista_numeros);
        
        System.out.println("O maior número é: "+lista_numeros.get(2));
        
        scanner.close();
    }
}
