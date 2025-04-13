package poo.livro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        biblioteca.add(new Livro("1984", "George Orwell", 1949));
        biblioteca.add(new Livro("Capitães da Areia", "Jorge Amado", 1937));
        biblioteca.add(new Livro("O Código Da Vinci", "Dan Brown", 2003));
        biblioteca.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        biblioteca.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997));
        biblioteca.add(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943));
        biblioteca.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945));

        for(Livro livro: biblioteca) {
            if(livro.ehAntigo()){
                livro.exibirInformacoes();
                System.out.println();
            }
        }
    }
}
