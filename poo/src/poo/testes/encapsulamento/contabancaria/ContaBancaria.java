package poo.testes.encapsulamento.contabancaria;
public class ContaBancaria {
    private String nomeDoTitular; 
    private  double saldo;

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }
    public void setNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor>=0) {
            saldo += valor;
        }else{
            System.out.println("Valor invalido!");
        }
    }
    public void sacar(double valor){
        if (saldo >= valor) {
            saldo-=valor;
            System.out.printf("Saque de %.2f realizado com sucesso!%n", valor);
        }else{
            System.out.println("O saque não pode ser maior que o saldo!");
        }
    }
}
