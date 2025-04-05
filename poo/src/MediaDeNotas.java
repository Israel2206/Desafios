// MediaDeNotas.java
// Leia N notas e calcule a média delas.
import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println(Media(nota1, nota2, nota3));
        
        scanner.close();
    }
    public static double Media(double nota1,double nota2,double nota3){
        return (nota1+nota2+nota3)/3;
    }
    
}
