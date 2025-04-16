package logica02;
import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int num = scanner.nextInt();
        String tarefa = "EASY";
    
        for(int i = 1; i<=num;i++){
            int pergunta = scanner.nextInt();
            if (pergunta == 1) {
                tarefa = "HARD";
            }
        }
        System.out.println(tarefa);
        scanner.close();
    }
}
