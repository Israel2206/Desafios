package logica03;
import java.util.Scanner;
import java.util.ArrayList;


public class SortSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numero = new ArrayList<>();
        

        for(int i = 1;i<=3;i++){
            int num = scanner.nextInt();
            numeros.add(num);
            numero.add(num);
        }
        numeros.sort(null);
        for(int j : numeros){
            System.out.println(j);
        }
        System.out.println();

        for(int j : numero){
            System.out.println(j);
        }

        scanner.close();
    }
}
