package heranca.funcionario;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Operario operario = new Operario();

        gerente.nome = "Carlos";
        gerente.salario = 8500.0;
        gerente.setor = "Financeiro";

        operario.nome = "João";
        operario.salario = 3500.0;
        operario.turno = "Noturno";

        System.out.println("Nome: "+gerente.nome+", Salário: "+gerente.salario+", Setor: "+gerente.setor);
        System.out.println("Nome: "+operario.nome+", Salário: "+operario.salario+", Turno: "+operario.turno);
    }
}
