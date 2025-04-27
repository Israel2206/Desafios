package poo.testes.heranca.conta;
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("472", 1200);
        ContaPoupanca contaPoupanca = new ContaPoupanca("736", 600.50);

        contaCorrente.depositar(200);
        contaCorrente.sacar(150);
        System.out.println("Saldo: "+contaCorrente.saldo);

        contaPoupanca.depositar(30);
        contaPoupanca.sacar(300);

        System.out.println("Saldo: "+contaPoupanca.saldo);
    }
}
