package poo.testes.encapsulamento.instaciamento.carro;
public class Carro {
    String nome;
    int modelo; 
    String cor;
    int velocidade;

    public Carro(String nome,int modelo,String cor,int velocidade){
        this.cor = cor;
        this.modelo = modelo;
        this.nome = nome;
        this.velocidade = velocidade;
    }

    void exibirCarro(){
        System.out.println("nome: "+nome+"\nModelo: "+modelo+"\nCor: "+cor+"\nVelocidade Máxima: "+velocidade+" km/h");
    }
}
