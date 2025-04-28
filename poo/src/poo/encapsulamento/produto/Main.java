package poo.testes.encapsulamento.produto;
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("caneta");
        produto1.setPreco(2.50);
        produto1.setQuantidade(100);

        System.out.println("Produto: "+produto1.getNome());
        System.out.printf("Preço: R$%.2f%n",produto1.getPreco());
        System.out.println("Quantidade: "+produto1.getQuantidade());
    }
}