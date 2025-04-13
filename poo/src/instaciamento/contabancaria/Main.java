package instaciamento.contabancaria;
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Breno", 1450);
        ContaBancaria contaBancaria2 = new ContaBancaria("Lucas", 2003.8);
        ContaBancaria contaBancaria3 = new ContaBancaria("Teo", 654.23);

        contaBancaria1.conta();
        contaBancaria2.conta();
        contaBancaria3.conta();
    }
}
