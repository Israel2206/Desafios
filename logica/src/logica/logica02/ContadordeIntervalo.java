package logica.logica02;
import java.util.Scanner;

public class ContadordeIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fim = scanner.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int contador = 0; contador<fim; contador++){
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 20) {
                dentro ++;
            }else{
                fora++;
            }
        }
        System.out.println(dentro+" dentro\n"+fora+" fora");
        scanner.close();
    }
}
