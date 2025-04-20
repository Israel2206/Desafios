package heranca.conta;
public class ContaCorrente extends Conta{
    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    public void sacar(double valor){
        saldo = saldo - valor + 0.50;
    }
}
