package poo.Livro;
public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Diario de um banana", "Jeff Kinney", 2007);
        Livro livro2 = new Livro("Capitães da areia", " Jorge Amado", 1937);

        livro1.exibirInformacoes();
        System.out.println(livro1.ehAntigo());

        livro2.exibirInformacoes();
        System.out.println(livro2.ehAntigo());
    }
}
