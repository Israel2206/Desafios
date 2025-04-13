package instaciamento.aluno;
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Israel", 10, 9);
        Aluno aluno2 = new Aluno("Lucas", 7, 6);
        Aluno aluno3 = new Aluno("Matheus", 3.5, 10);
        Aluno aluno4 = new Aluno("Mariane", 9.9, 7.8);
        
        aluno1.media();
        aluno2.media();
        aluno3.media();
        aluno4.media(); 
    }
}
