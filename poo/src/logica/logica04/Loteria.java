package logica.logica04;
import java.util.Scanner;
import java.util.ArrayList;

public class Loteria {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> sorteados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int acertos = 0;

        for(int i = 1; i <= 6 ; i++){
            numeros.add(scanner.nextInt());
        }
        for(int i = 1; i <= 6 ; i++){
            sorteados.add(scanner.nextInt());
        }
        for(int num : sorteados){
            if (numeros.contains(num)) {
                acertos+=1;
            }
        }
        if (acertos <3) {
            System.out.println("azar");
        }else if (acertos == 3) {
            System.out.println("terno");
        }else if (acertos == 4) {
            System.out.println("quadra");
        }else if (acertos == 5) {
            System.out.println("quina");
        }else if (acertos == 6) {
            System.out.println("sena");
        }
        scanner.close();
    }
}
