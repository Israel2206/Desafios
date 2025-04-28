package poo.testes.heranca.jogador;
public class Atacante extends Jogador{
    
    public Atacante(String nome, String posicao) {
        super(nome, posicao);
    }

    public void chutarAoGol(){
        System.out.println(posicao+" "+nome+" Chutou ao gol!");
    }
}
