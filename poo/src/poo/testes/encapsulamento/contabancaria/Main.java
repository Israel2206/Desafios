package poo.testes.encapsulamento.contabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria();

        pessoa1.setNomeDoTitular("Breno");
        pessoa1.depositar(1000.50);

        System.out.println("Nome: "+pessoa1.getNomeDoTitular());
        System.out.printf("Saldo: %.2f%n",pessoa1.getSaldo());

        System.out.println();
        pessoa1.sacar(300.50);


    }
}
