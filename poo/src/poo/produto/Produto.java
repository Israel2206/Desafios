package poo.produto;
public class Produto {
    private int preco;
   
    public Produto(int preco){
        this.preco = preco;
    }

    public int calcular_desconto(int desconto){
        return preco - desconto;
    }

}
