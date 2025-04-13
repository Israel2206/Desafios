package instaciamento.carro.cachorro;
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Hulk", "vira lata", 3);
        Cachorro cachorro2 = new Cachorro("Bella", "Pastor Alemão", 1);

        cachorro1.exibirCachorro();
        cachorro2.exibirCachorro();
    }
}
