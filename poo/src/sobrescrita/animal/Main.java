package sobrescrita.animal;
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Dezo");

        gato.emitirSom();
        cachorro.emitirSom();
    }
}
