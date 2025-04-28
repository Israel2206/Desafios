package logica.logica02;
import java.util.Scanner;

public class SomaAlternada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int numero = scanner.nextInt();
        for(int contador = 0; contador < numero; contador++){
            int valor = scanner.nextInt();
            if (contador%2==0) {
                soma+=valor;
            }else{
                soma-=valor;
            }
        }
        System.out.println(soma);
        scanner.close();
    }
}
