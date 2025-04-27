package poo.testes.encapsulamento.instaciamento.pessoa;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Israel");
        Pessoa pessoa2 = new Pessoa("Leleo");
        Pessoa pessoa3 = new Pessoa("Mari");

        pessoa1.apresentar(pessoa2);
        pessoa2.apresentar(pessoa3);
    }
}
