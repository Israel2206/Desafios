package poo.testes.heranca.conta;
public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, double saldo){
        super(numero, saldo);
    }

    public void sacar(double valor){
        saldo = saldo-valor+1.20;
    }
}
