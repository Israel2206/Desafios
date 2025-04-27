package logica.logica05;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha_real = 2002;

        while (true) {
            int senha = scanner.nextInt();
            if (senha == senha_real) {
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Senha Invalida");
            }
        }
        scanner.close();
    }
}
