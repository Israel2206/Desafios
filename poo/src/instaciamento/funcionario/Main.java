package instaciamento.funcionario;
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Breno Israel", 4200.00);
        Funcionario funcionario2 = new Funcionario("Lucas", 3250);
    
        funcionario1.exibirFuncionario();
        funcionario2.exibirFuncionario();
    }
}
