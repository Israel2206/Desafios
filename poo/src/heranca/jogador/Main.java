package heranca.jogador;
public class Main {
    public static void main(String[] args) {
        Atacante atacante = new Atacante("Breno", "Atacante");
        Defensor defensor = new Defensor("Bastos", "Defensor");

        atacante.chutarAoGol();
        defensor.bloquear();
    }
}
