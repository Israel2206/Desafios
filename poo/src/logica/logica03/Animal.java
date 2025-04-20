package logica.logica03;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipo1 = scanner.nextLine();
        if (tipo1.equals("vertebrado")) {
            String tipo2 = scanner.nextLine();
            if (tipo2.equals("ave")) {
                String tipo3 = scanner.nextLine();
                if (tipo3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (tipo3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (tipo2.equals("mamifero")) {
                String tipo3 = scanner.nextLine();
                if (tipo3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (tipo3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (tipo1.equals("invertebrado")) {
            String tipo2 = scanner.nextLine();
            if (tipo2.equals("inseto")) {
                String tipo3 = scanner.nextLine();
                if (tipo3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (tipo3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (tipo2.equals("anelideo")) {
                String tipo3 = scanner.nextLine();
                if (tipo3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (tipo3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
        scanner.close();
    }
}
