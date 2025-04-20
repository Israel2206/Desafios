package heranca.jogador;
public class Defensor extends Jogador{

    public Defensor(String nome, String posicao) {
        super(nome, posicao);
    }

    public void bloquear(){
        System.out.println(posicao+" "+nome+" bloqueou o ataque!");
    }
}
