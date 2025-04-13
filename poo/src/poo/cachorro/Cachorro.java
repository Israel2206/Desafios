package poo.cachorro;
public class Cachorro {
    String nome;
    int idade;

    public Cachorro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void Latir(){
        System.out.println(nome + " Está latindo");
    }
}
