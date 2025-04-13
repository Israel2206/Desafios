public class Cachorro {
    String nome;
    String raca;
    int idade;

    public Cachorro(String nome, String raca, int idade){
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
    }
    void exibirCachorro(){
        System.out.println("Nome: "+nome+"\nRaça: "+raca+"\nIdade: "+idade);
    }
}
