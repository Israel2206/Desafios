package sobrescrita.animal;
public class Cachorro extends Animal {
    
    public Cachorro(String nome) {
        super(nome);
    }

    void emitirSom() {
        System.out.println(nome+" está latindo");
    }
}
