package logica03;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        if (salario > 0 && salario <= 400) {
            double aumento = (salario * 15)/100;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n",salario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 15 %");
        }else  if (salario > 400 && salario <= 800) {
            double aumento = (salario * 12)/100;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n",salario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 12 %");
        }else  if (salario > 800 && salario <= 1200) {
            double aumento = (salario * 10)/100;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n",salario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 10 %");
        }else  if (salario > 1200 && salario <= 2000) {
            double aumento = (salario * 7)/100;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n",salario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 7 %");
        }else{
            double aumento = (salario * 4)/100;
            salario += aumento;
            System.out.printf("Novo salario: %.2f%n",salario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 4 %");
        }
        scanner.close();
    }
}
