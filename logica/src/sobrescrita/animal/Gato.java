package sobrescrita.animal;
public class Gato extends Animal{
    
    public Gato(String nome){
        super(nome);
    }

    void emitirSom(){
        System.out.println(nome+" está miando");
    }
}
