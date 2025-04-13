package poo.Livro;
public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    void exibirInformacoes(){
        System.out.println("Titulo: "+titulo+"\nAutor(a): "+autor+"\nAno de Publicação: "+anoPublicacao);
    }
    boolean ehAntigo() {
        return anoPublicacao < 2000;
    }
    
} 
