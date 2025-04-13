package instaciamento.contabancaria;
public class ContaBancaria {
    String nome;
    double saldo;

    public ContaBancaria(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;

    }
    void conta(){
        System.out.println("Nome: "+nome+"\nSaldo: "+saldo);
        System.out.println();
    }
}
