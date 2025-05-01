package logica.logica05;

import java.util.Scanner;

public class IdadeDeCamila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int soma = a + b + c;
        int maior = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));

        int meio = soma - maior - menor;

        System.out.println(meio);

        sc.close();
    }
}
