package poo.testes.encapsulamento.instaciamento.pessoa;
public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    void apresentar(Pessoa outraPessoa) {
        System.out.println("Olá, eu sou " + this.nome + " e esta é " + outraPessoa.nome + ".");
    }
}
