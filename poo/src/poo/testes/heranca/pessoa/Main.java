package poo.testes.heranca.pessoa;
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaFisica.nome = "breno";
        pessoaFisica.endereco= "vere";
        pessoaFisica.cpf = "123.456.789-00";

        pessoaJuridica.nome = "isra";
        pessoaJuridica.endereco = "aveidade";
        pessoaJuridica.cnpj = "12.345.678/0001-99";

        System.out.println("pessoa fisica: ");
        System.out.println("Nome: "+pessoaFisica.nome);
        System.out.println("Endereço: "+pessoaFisica.endereco);
        System.out.println("CPF: "+pessoaFisica.cpf);

        System.out.println("pessoa juridica: ");
        System.out.println("Nome: "+pessoaJuridica.nome);
        System.out.println("Endereço: "+pessoaJuridica.endereco);
        System.out.println("CNPJ: "+pessoaJuridica.cnpj);
    }
}
