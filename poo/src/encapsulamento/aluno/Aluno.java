package encapsulamento.ealuno;
public class Aluno {
    private String nome;
    private double nota;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Double getNota(){
        return nota;
    }
    public void setNota(double nota){
        if (nota<0 || nota >10) {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }else{
            this.nota = nota;
        }
    }
    public void mostrarDados(){
        System.out.println("Nome: "+this.nome+"\nNota: "+this.nota);
    }
}
