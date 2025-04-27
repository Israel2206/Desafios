package sobrescrita.animal;
public abstract class Animal {
    public String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    abstract void emitirSom();
}
