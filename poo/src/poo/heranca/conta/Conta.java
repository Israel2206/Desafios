package poo.testes.heranca.conta;
public class Conta {
    String numero;
    double saldo;

    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        saldo-=valor;
    }
}
