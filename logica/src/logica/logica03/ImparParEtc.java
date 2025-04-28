package logica.logica03;
import java.util.Scanner;
import java.util.ArrayList;

public class ImparParEtc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int par = 0;
        int impar = 0;
        int negativo = 0;
        int positivo = 0;

        for(int i = 1; i <=5 ; i++){
            numeros.add(scanner.nextInt());
        }
        for(int num : numeros){
            if (num %2==0) {
                par++;
            }
            if (num %2!=0) {
                impar++;
            }
            if (num > 0) {
                positivo++;
            }
            if (num <0) {
                negativo++;
            }
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");

        scanner.close();
    }
}
