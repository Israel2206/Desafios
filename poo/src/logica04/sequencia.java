package logica04;
import java.util.Scanner;

public class sequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int j = 60;
        int i = 1;
        while (j >=0) {
            System.out.println("I="+i+" J="+j);
            i +=3;
            j-=5;
        }
        scanner.close();
    }
}
