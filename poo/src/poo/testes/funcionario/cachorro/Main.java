package poo.testes.funcionario.cachorro;
public class Main {
    public static void main(String[] args) {
        
        Cachorro meuCachorro = new Cachorro("Moana", 2);
        Cachorro cachorroVizinho = new Cachorro("tex", 5);

        meuCachorro.Latir();
        cachorroVizinho.Latir();
    }
}
