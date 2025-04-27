package poo.testes.encapsulamento.instaciamento.carro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do carro: ");
        String nome1 = sc.nextLine();
        System.out.print("Modelo: ");
        int modelo1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Cor: ");
        String cor1 = sc.nextLine();
        System.out.print("Velocidade Máxima: ");
        int velocidade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do carro: ");
        String nome2 = sc.nextLine();
        System.out.print("Modelo: ");
        int modelo2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Cor: ");
        String cor2 = sc.nextLine();
        System.out.print("Velocidade Máxima: ");
        int velocidade2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do carro: ");
        String nome3 = sc.nextLine();
        System.out.print("Modelo: ");
        int modelo3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Cor: ");
        String cor3 = sc.nextLine();
        System.out.print("Velocidade Máxima: ");
        int velocidade3 = sc.nextInt();
        sc.nextLine();

        Carro carro1 = new Carro(nome1, modelo1, cor1, velocidade1);
        Carro carro2 = new Carro(nome2, modelo2, cor2, velocidade2);
        Carro carro3 = new Carro(nome3, modelo3, cor3, velocidade3);

        carro1.exibirCarro();
        carro2.exibirCarro();
        carro3.exibirCarro();

        sc.close();
    }
}
