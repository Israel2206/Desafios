package poo.testes.pessoa;
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Agora o método recebe apenas uma outra pessoa
    public void compararIdade(Pessoa outraPessoa){
        if (this.idade > outraPessoa.idade) {
            System.out.println(this.nome + " é mais velho(a).");
        } else if (this.idade < outraPessoa.idade) {
            System.out.println(outraPessoa.nome + " é mais velho(a).");
        } else {
            System.out.println("Ambos têm a mesma idade.");
        }
    }
}
